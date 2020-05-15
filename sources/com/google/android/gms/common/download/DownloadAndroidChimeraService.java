package com.google.android.gms.common.download;

import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DownloadAndroidChimeraService extends zzx {

    /* renamed from: a */
    public static final srn f30172a = srn.m36126a("DownloadACService", sgj.DOWNLOAD);

    /* renamed from: b */
    private rxs f30173b;

    public static DownloadAndroidChimeraService provideInstance() {
        rxh rxh = new rxh();
        rzq a = rzq.m34710a();
        cazf.m127594a(a);
        rxh.f43809a = a;
        if (rxh.f43810b == null) {
            rxh.f43810b = new rzm(null);
        }
        cazf.m127595a(rxh.f43809a, rzq.class);
        return (DownloadAndroidChimeraService) new rxj().f43813a.mo6445a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        rxi a = this.f30173b.mo25240a(new rzo(getServiceRequest));
        aaac.mo16652a(new rxn((aaag) a.f43812b.f43814b.mo6445a(), (GetServiceRequest) a.f43811a.mo6445a()));
    }

    public DownloadAndroidChimeraService(rxs rxs) {
        super(43, "com.google.android.gms.common.download.START", bnon.f131923a, 2, 10);
        this.f30173b = rxs;
    }
}
