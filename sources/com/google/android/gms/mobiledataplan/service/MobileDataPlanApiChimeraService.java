package com.google.android.gms.mobiledataplan.service;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MobileDataPlanApiChimeraService extends zzx {

    /* renamed from: a */
    private static final bnic f80315a = bnic.m109490a("android.permission-group.PHONE", "android.permission-group.STORAGE");

    /* renamed from: b */
    private static final srn f80316b = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    public MobileDataPlanApiChimeraService() {
        super((int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, "com.google.android.gms.mobiledataplan.service.START", f80315a, 1, 10);
        f80316b.mo26019b(agyt.m55307c()).mo68405a("Service is created.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (agqg.m54860o().booleanValue()) {
            agqz.m54893a().mo35966a(this);
        }
        aaac.mo16652a(new agsa(this, aaag.m21013a()));
    }

    public final void onDestroy() {
        f80316b.mo26019b(agyt.m55307c()).mo68405a("Service is being destroyed.");
        agpk a = agpk.m54726a();
        synchronized (agpk.f66240c) {
            agpl agpl = a.f66242a;
            synchronized (agpl.f66245b) {
                agpl.f66244a.getDatabaseName();
                agpl.f66244a.close();
            }
            agpk.f66239b = null;
        }
    }
}
