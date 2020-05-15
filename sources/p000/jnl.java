package p000;

import android.content.Context;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: jnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jnl implements jih {

    /* renamed from: d */
    private static final sek f22883d = jsy.m17256a("ResponderAuthenticator");

    /* renamed from: a */
    public final byqx f22884a;

    /* renamed from: b */
    RemoteDevice f22885b;

    /* renamed from: c */
    public byte[] f22886c;

    /* renamed from: e */
    private final List f22887e;

    /* renamed from: f */
    private final adyd f22888f;

    /* renamed from: g */
    private final ios f22889g;

    public jnl(Context context, List list) {
        byqx byqx = new byqx();
        adyd a = adyd.m51363a(context);
        ios a2 = inl.m15759a(context);
        sdo.m34959a(byqx);
        this.f22884a = byqx;
        sdo.m34959a(list);
        this.f22887e = list;
        this.f22888f = a;
        this.f22889g = a2;
    }

    /* renamed from: a */
    private final RemoteDevice m16971a(byte[] bArr) {
        boolean z;
        if (!this.f22887e.isEmpty()) {
            try {
                byqx byqx = this.f22884a;
                ArrayList arrayList = new ArrayList(this.f22887e.size());
                Iterator it = this.f22887e.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    RemoteDevice remoteDevice = (RemoteDevice) it.next();
                    jmd.m16916a();
                    byte[] a = jme.m16917a(rpr.m34216b(), remoteDevice.f11141e);
                    if (a == null) {
                        f22883d.mo25418e("Skipping secret key for %s since key is null.", remoteDevice.f11138b);
                    } else {
                        arrayList.add(byrr.m125225a(a));
                    }
                }
                if (bArr.length <= 0) {
                    z = false;
                }
                sdo.m34974b(z);
                int a2 = byqx.mo74473a(bArr, arrayList, jnk.m16970a(this.f22888f, this.f22889g, bArr));
                if (a2 >= 0) {
                    return (RemoteDevice) this.f22887e.get(a2);
                }
                f22883d.mo25418e("No authorized devices can be found for current connection.", new Object[0]);
                return null;
            } catch (byrq | NoSuchAlgorithmException | SignatureException e) {
                throw new jmm("Error when initializing the secure channel.", e);
            }
        } else {
            throw new jmm("No authorized devices were found.");
        }
    }

    /* renamed from: a */
    public final RemoteDevice mo13757a() {
        return this.f22885b;
    }

    /* renamed from: b */
    public final jnz mo13910b(jnz jnz) {
        boolean z = false;
        f22883d.mo25414c("Handling [Initiator Hello] from remote device.", new Object[0]);
        m16972a(byqw.NOT_STARTED);
        this.f22885b = m16971a(jnz.f22915a);
        byqx byqx = this.f22884a;
        if (byqx.f167441a == byqw.HANDSHAKE_INITIATED) {
            z = true;
        }
        bmxy.m108605b(z, "wrong state: %s", byqx.f167441a);
        byte[] bArr = byqx.f167443c;
        this.f22886c = bArr;
        return new jnz(bArr, "auth");
    }

    /* renamed from: b */
    public final byte[] mo13760b() {
        return this.f22886c;
    }

    /* renamed from: c */
    public final void mo13911c(jnz jnz) {
        f22883d.mo25414c("Handling [Initiator Auth] from remote device.", new Object[0]);
        m16972a(byqw.HANDSHAKE_INITIATED);
        try {
            this.f22884a.mo74474a(jnz.f22915a);
        } catch (byrq | SignatureException e) {
            throw new jmm("Error when finishing initialization of the secure channel.", e);
        }
    }

    /* renamed from: a */
    private final void m16972a(byqw byqw) {
        byqw byqw2 = this.f22884a.f167441a;
        if (byqw2 != byqw) {
            throw new jmm(String.format("Expected state %s, but in current state %s", byqw, byqw2));
        }
    }

    /* renamed from: a */
    public final jnz mo13758a(byte[] bArr, String str) {
        m16972a(byqw.COMPLETE);
        boolean z = true;
        f22883d.mo25414c("Encrypting %s bytes to send to remote device.", Integer.valueOf(bArr.length));
        byqx byqx = this.f22884a;
        bmxy.m108581a(bArr);
        if (byqx.f167441a != byqw.COMPLETE) {
            z = false;
        }
        bmxy.m108605b(z, "wrong state: %s", byqx.f167441a);
        return new jnz(byqx.f167442b.mo74476a(bArr), str);
    }

    /* renamed from: a */
    public final byte[] mo13759a(jnz jnz) {
        boolean z = true;
        f22883d.mo25414c("Decrypting %s bytes received from remote device.", Integer.valueOf(jnz.f22915a.length));
        m16972a(byqw.COMPLETE);
        try {
            byqx byqx = this.f22884a;
            byte[] bArr = jnz.f22915a;
            bmxy.m108581a(bArr);
            if (byqx.f167441a != byqw.COMPLETE) {
                z = false;
            }
            bmxy.m108605b(z, "wrong state: %s", byqx.f167441a);
            return byqx.f167442b.mo74478b(bArr);
        } catch (SignatureException e) {
            throw new jmm("Error when decoding the message.", e);
        }
    }
}
