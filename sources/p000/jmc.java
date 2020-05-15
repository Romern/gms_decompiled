package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import javax.crypto.SecretKey;

/* renamed from: jmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jmc implements jih {

    /* renamed from: c */
    private static final sek f22809c = jsy.m17256a("InitiatorAuthenticator");

    /* renamed from: a */
    public final byqv f22810a;

    /* renamed from: b */
    byte[] f22811b;

    /* renamed from: d */
    private final RemoteDevice f22812d;

    public jmc(RemoteDevice remoteDevice) {
        byqv byqv = new byqv();
        this.f22812d = remoteDevice;
        sdo.m34959a(byqv);
        this.f22810a = byqv;
    }

    /* renamed from: a */
    private final void m16909a(byqu byqu) {
        byqu byqu2 = this.f22810a.f167430a;
        if (byqu2 != byqu) {
            throw new jmm(String.format("Expected state %s, but in current state %s", byqu, byqu2));
        }
    }

    /* renamed from: a */
    public final RemoteDevice mo13757a() {
        return this.f22812d;
    }

    /* renamed from: b */
    public final jnz mo13874b(jnz jnz) {
        f22809c.mo25414c("Handling [Responder Auth] message.", new Object[0]);
        m16909a(byqu.HANDSHAKE_INITIATED);
        try {
            byte[] b = this.f22810a.mo74472b(this.f22810a.mo74471a(jnz.f22915a));
            this.f22811b = jnz.f22915a;
            return new jnz(b, "auth");
        } catch (byrq | SignatureException e) {
            throw new jmm("Error handling [Responder Auth] message.", e);
        }
    }

    /* renamed from: b */
    public final byte[] mo13760b() {
        return this.f22811b;
    }

    /* renamed from: c */
    public final jnz mo13875c() {
        boolean z;
        f22809c.mo25414c("Generating [Initiator Hello] message.", new Object[0]);
        m16909a(byqu.NOT_STARTED);
        try {
            byqv byqv = this.f22810a;
            jmd.m16916a();
            SecretKey a = byrr.m125225a(jme.m16917a(rpr.m34216b(), this.f22812d.f11141e));
            bmxy.m108581a(a);
            if (byqv.f167430a == byqu.NOT_STARTED) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            byqv.f167432c = a;
            byqv.f167431b = byrd.m125180a();
            byte[] d = byqv.f167431b.mo74488d();
            bysv bysv = new bysv();
            bysv.mo74501b(d);
            byqv.f167433d = bysv.mo74499a(a, byss.HMAC_SHA256, new byte[0]).mo73642k();
            byqv.f167430a = byqu.HANDSHAKE_INITIATED;
            return new jnz(byqv.f167433d, "auth");
        } catch (byrq | InvalidKeyException | NoSuchAlgorithmException e) {
            throw new jmm("Error generating [Initializer Hello] message.", e);
        }
    }

    /* renamed from: a */
    public final jnz mo13758a(byte[] bArr, String str) {
        m16909a(byqu.COMPLETE);
        boolean z = true;
        f22809c.mo25414c("Encrypting %s bytes to send to remote device.", Integer.valueOf(bArr.length));
        byqv byqv = this.f22810a;
        if (byqv.f167430a != byqu.COMPLETE) {
            z = false;
        }
        bmxy.m108605b(z, "wrong state: %s", byqv.f167430a);
        return new jnz(byqv.f167434e.mo74476a(bArr), str);
    }

    /* renamed from: a */
    public final byte[] mo13759a(jnz jnz) {
        boolean z = true;
        f22809c.mo25414c("Decrypting %s bytes received from remote device.", Integer.valueOf(jnz.f22915a.length));
        m16909a(byqu.COMPLETE);
        try {
            byqv byqv = this.f22810a;
            byte[] bArr = jnz.f22915a;
            if (byqv.f167430a != byqu.COMPLETE) {
                z = false;
            }
            bmxy.m108605b(z, "wrong state: %s", byqv.f167430a);
            return byqv.f167434e.mo74478b(bArr);
        } catch (SignatureException e) {
            throw new jmm("Error when decoding the message.", e);
        }
    }
}
