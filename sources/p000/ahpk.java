package p000;

import android.net.nsd.NsdServiceInfo;

/* renamed from: ahpk */
public final /* synthetic */ class ahpk implements Runnable {

    /* renamed from: a */
    private final ahpm f67727a;

    /* renamed from: b */
    private final NsdServiceInfo f67728b;

    public ahpk(ahpm ahpm, NsdServiceInfo nsdServiceInfo) {
        this.f67727a = ahpm;
        this.f67728b = nsdServiceInfo;
    }

    public final void run() {
        ahpm ahpm = this.f67727a;
        NsdServiceInfo nsdServiceInfo = this.f67728b;
        if (!ahpm.f67731a.mo36728k()) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Skipping discovery of NsdServiceInfo %s because we are no longer discovering.", nsdServiceInfo.getServiceName());
            return;
        }
        ahro a = ahro.m56437a(nsdServiceInfo);
        nsdServiceInfo.getServiceName();
        if (ahpm.mo36950a(a)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Found WifiLanServiceInfo %s (with EndpointId %s and EndpointInfo %s)", nsdServiceInfo.getServiceName(), a.f67890c, ahkm.m55981a(a.f67892e));
            ahpm.f67734d.mo36851b(ahpm.f67731a, new ahmm(nsdServiceInfo, a.f67890c, a.f67892e, ahpm.f67732b));
            ahpm.f67734d.mo36845a(ahpm.f67731a, a.f67890c, bvif.WIFI_LAN, 1);
        }
    }
}
