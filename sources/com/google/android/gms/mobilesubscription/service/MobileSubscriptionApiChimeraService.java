package com.google.android.gms.mobilesubscription.service;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MobileSubscriptionApiChimeraService extends zzx {

    /* renamed from: a */
    private static final bnic f80339a = bnic.m109490a("android.permission-group.PHONE", "android.permission-group.STORAGE");

    /* renamed from: b */
    private static final srn f80340b = srn.m36126a("MobileSubscription", sgj.MOBILE_SUBSCRIPTION);

    public MobileSubscriptionApiChimeraService() {
        super((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, "com.google.android.gms.mobilesubscription.service.START", f80339a, 1, 10);
        ((bnsl) f80340b.mo68390d()).mo68405a("Service is created.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new ahab(this, aaag.m21013a()));
    }

    public final void onDestroy() {
    }
}
