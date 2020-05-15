package p000;

import android.net.nsd.NsdServiceInfo;

/* renamed from: ahpl */
public final /* synthetic */ class ahpl implements Runnable {

    /* renamed from: a */
    private final ahpm f67729a;

    /* renamed from: b */
    private final NsdServiceInfo f67730b;

    public ahpl(ahpm ahpm, NsdServiceInfo nsdServiceInfo) {
        this.f67729a = ahpm;
        this.f67730b = nsdServiceInfo;
    }

    public final void run() {
        ahpm ahpm = this.f67729a;
        NsdServiceInfo nsdServiceInfo = this.f67730b;
        if (!ahpm.f67731a.mo36728k()) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Ignoring lost NsdServiceInfo %s because we are no longer discovering.", nsdServiceInfo.getServiceName());
            return;
        }
        ahro a = ahro.m56437a(nsdServiceInfo);
        nsdServiceInfo.getServiceName();
        if (ahpm.mo36950a(a)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Lost WifiLanServiceInfo %s (with EndpointId %s and EndpointInfo %s)", nsdServiceInfo.getServiceName(), a.f67890c, ahkm.m55981a(a.f67892e));
            ahpm.f67734d.mo36854c(ahpm.f67731a, new ahmm(nsdServiceInfo, a.f67890c, a.f67892e, ahpm.f67732b));
        }
    }
}
