package com.google.android.gms.scheduler;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SchedulerChimeraBoundService extends zzx {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new aphp(new aaag(this, this.f56354e, this.f56355f)));
    }

    public SchedulerChimeraBoundService() {
        super((int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, "com.google.android.gms.scheduler.ACTION_PROXY_SCHEDULE", bnon.f131923a, 0, 10);
    }
}
