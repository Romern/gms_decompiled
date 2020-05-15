package com.google.android.gms.icing.mdh.service;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MobileDataHubChimeraService extends zzx {

    /* renamed from: a */
    public final acjx f79068a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public MobileDataHubChimeraService() {
        this(new acix(r0.f59926a));
        acii acii = new acii();
        acbt a = acbt.m48836a();
        cazf.m127594a(a);
        acii.f59926a = a;
        cazf.m127595a(acii.f59926a, acjz.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (acbm.m48831a()) {
            aaac.mo16652a(new acjy(this, getServiceRequest.f30230d, aaag.m21014a(this, this.f56354e, this.f56355f)));
        } else {
            aaac.mo16650a(16, (Bundle) null);
        }
    }

    private MobileDataHubChimeraService(acjx acjx) {
        super(127, "com.google.android.mdh.service.START", Collections.emptySet(), 1, 9);
        this.f79068a = acjx;
    }
}
