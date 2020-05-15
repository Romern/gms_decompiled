package p000;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Set;

/* renamed from: pnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pnh extends plz {

    /* renamed from: a */
    public final pmz f39817a;

    /* renamed from: b */
    private final qav f39818b = new qav("TcpProbingWorker");

    /* renamed from: c */
    private final qat f39819c;

    /* renamed from: d */
    private final pnl f39820d;

    /* renamed from: e */
    private final phy f39821e;

    /* renamed from: f */
    private final byte[] f39822f;

    public pnh(pma pma, Context context, pkj pkj, phy phy, poj poj, qat qat, pnl pnl, pmx pmx) {
        super(pma);
        this.f39817a = new pmz(context, pes.m30266a(), phy, poj, pes.m30268b(), qat, pmx);
        this.f39820d = pnl;
        this.f39819c = qat;
        this.f39822f = qat.mo23851c();
        this.f39821e = phy;
    }

    /* renamed from: a */
    public final void mo23476a(InetSocketAddress inetSocketAddress, bpfn bpfn, boolean z, boolean z2) {
        Object[] objArr = {inetSocketAddress, bpfn};
        String a = this.f39819c.mo23848a();
        if (!cdas.f180389a.mo6606a().mo77174b() && a == null) {
            this.f39818b.mo23675c("Failed to get the BSSID of current network. Skip probing IP %s", inetSocketAddress);
            return;
        }
        pns a2 = this.f39820d.mo23483a(inetSocketAddress);
        if (a2 == null) {
            a2 = this.f39820d.mo23488b(inetSocketAddress);
        }
        pno a3 = a2.mo23508a(a);
        if (a3 == null) {
            a3 = new pno(a);
            a2.mo23509a(a3);
        }
        if (!z && a3.f39861e >= 3) {
            pic pic = this.f39821e.f39161f;
            if (pic != null) {
                pic.mo23161b(inetSocketAddress);
            }
            new Object[1][0] = inetSocketAddress;
            return;
        }
        pes.m30266a().execute(new png(this, inetSocketAddress, bpfn, z2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23374b() {
        pmz pmz;
        if (cdas.f180389a.mo6606a().mo77175c() && (pmz = this.f39817a) != null) {
            pmz.f39772b.clear();
        }
    }

    /* renamed from: e */
    public final void mo23395e() {
        pmz pmz = this.f39817a;
        Set set = this.f39646g.f39652f;
        pmz.f39773c.clear();
        if (set != null) {
            pmz.f39773c.addAll(set);
        }
    }

    /* renamed from: f */
    public final void mo23396f() {
    }

    /* renamed from: a */
    public final void mo23477a(pnm pnm, bpfn bpfn, boolean z, boolean z2) {
        byte[] bArr;
        if (pnm.f39844a.mo17498c() && !cczx.m132361b()) {
            return;
        }
        if (!cdas.f180389a.mo6606a().mo77173a() || (!pnm.f39844a.mo17496a(32) && !pnm.f39844a.mo17496a(64))) {
            CastDevice castDevice = pnm.f39844a;
            InetAddress inetAddress = castDevice.f29715c;
            InetSocketAddress inetSocketAddress = null;
            if (inetAddress != null) {
                inetSocketAddress = new InetSocketAddress(inetAddress, castDevice.f29719g);
            } else {
                byte[] bArr2 = castDevice.f29726n;
                if (!(bArr2 == null || (bArr = this.f39822f) == null)) {
                    try {
                        InetAddress byAddress = InetAddress.getByAddress(new byte[]{bArr[0], bArr[1], bArr2[0], bArr2[1]});
                        if (byAddress != null) {
                            inetSocketAddress = new InetSocketAddress(byAddress, castDevice.f29719g);
                        }
                    } catch (UnknownHostException e) {
                        this.f39818b.mo23677d("Failed to create InetAddress for %s", pnm);
                        return;
                    }
                }
            }
            if (inetSocketAddress != null) {
                mo23476a(inetSocketAddress, bpfn, z, z2);
            }
        }
    }
}
