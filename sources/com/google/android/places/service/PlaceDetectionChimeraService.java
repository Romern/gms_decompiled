package com.google.android.places.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceDetectionChimeraService extends zzx {

    /* renamed from: a */
    private final bqgj f151370a;

    public PlaceDetectionChimeraService() {
        super(67, "com.google.android.gms.location.places.PlaceDetectionApi", Collections.singleton("android.permission-group.LOCATION"), 3, 10);
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        bqgj a = snp.m35702a(10);
        this.f151370a = a;
        if (a instanceof soc) {
            ((soc) a).setRejectedExecutionHandler(discardPolicy);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaag aaag = new aaag(this, this.f56354e, this.f56355f);
        aaac.mo16652a(new bidw(new bidx(2), new bidi(this, getServiceRequest.f30230d), aaag, new bhpt(getApplicationContext(), new qws(getApplicationContext(), "LE", null), 1, this.f151370a)));
    }

    public final void onDestroy() {
        this.f151370a.shutdown();
    }
}
