package com.google.android.gms.phenotype.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeChimeraService extends zzx {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public PhenotypeChimeraService() {
        super(new int[]{51}, new String[]{"com.google.android.gms.phenotype.service.START"}, Collections.emptySet(), 3, sne.m35694a((int) cgbz.f186551a.mo6606a().mo83486a(), 9), null);
        this.f56353d = Collections.singletonList(angt.f76813a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new angs(new aaag(this, this.f56354e, this.f56355f), getServiceRequest.f30230d));
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }
}
