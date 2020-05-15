package p000;

import com.google.android.gms.cast.CastDevice;
import java.net.InetSocketAddress;

/* renamed from: pne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pne {

    /* renamed from: a */
    final /* synthetic */ pmz f39788a;

    public pne() {
    }

    /* renamed from: a */
    public final void mo23472a() {
        pmy pmy;
        pmz pmz = this.f39788a;
        int i = pmz.f39769i;
        synchronized (pmz.f39772b) {
            if (!pmz.f39772b.isEmpty()) {
                pmy = (pmy) pmz.f39772b.poll();
            } else {
                pmy = null;
            }
        }
        if (pmy != null) {
            pmz.mo23467a(pmy.f39765a, pmy.f39766b, pmy.f39768d);
        }
    }

    public pne(pmz pmz) {
        this.f39788a = pmz;
    }

    /* renamed from: a */
    public final void mo23473a(InetSocketAddress inetSocketAddress, int i, String str, String str2, bpfn bpfn) {
        pmz pmz = this.f39788a;
        int i2 = pmz.f39769i;
        pmz.f39771a.mo23858a("notifyProberError IP: %s, wifiBssid: %s, error: %s", inetSocketAddress, str2, str);
        bpes a = bpes.m111843a(i);
        CastDevice castDevice = (CastDevice) this.f39788a.f39774d.get(inetSocketAddress);
        if (castDevice != null) {
            this.f39788a.f39774d.remove(inetSocketAddress);
            if (a != null) {
                this.f39788a.f39775e.mo23125a(castDevice, bpfn, a);
            }
        }
        pmz pmz2 = this.f39788a;
        poj poj = pmz2.f39776f;
        sqv sqv = pmz2.f39777g;
        new pot(poj.f39918b, poj.f39919c, inetSocketAddress, str2, i, System.currentTimeMillis()).mo23522a();
        this.f39788a.f39775e.mo23128a(inetSocketAddress, a);
    }
}
