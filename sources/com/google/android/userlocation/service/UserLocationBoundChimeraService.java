package com.google.android.userlocation.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserLocationBoundChimeraService extends zzx {

    /* renamed from: a */
    private final bqgj f151720a;

    public UserLocationBoundChimeraService() {
        super(163, "com.google.android.gms.userlocation.service.START", Collections.singleton("android.permission-group.LOCATION"), 1, 10);
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        bqgj a = snp.m35702a(10);
        this.f151720a = a;
        if (a instanceof soc) {
            ((soc) a).setRejectedExecutionHandler(discardPolicy);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaag aaag = new aaag(this, this.f56354e, this.f56355f);
        aaac.mo16652a(new bjdj(new bidx(2), new bidi(this, getServiceRequest.f30230d), aaag, new bhpt(getApplicationContext(), new qws(getApplicationContext(), "LE", null), 1, this.f151720a)));
    }
}
