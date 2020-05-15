package com.google.android.gms.icing.mdh.service;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MobileDataHubListenerChimeraService extends zzx {

    /* renamed from: a */
    public final ackj f79069a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public MobileDataHubListenerChimeraService() {
        this(new acjc(r0.f59958a));
        aciy aciy = new aciy();
        acbt a = acbt.m48836a();
        cazf.m127594a(a);
        aciy.f59958a = a;
        cazf.m127595a(aciy.f59958a, ackl.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (acbm.m48831a()) {
            aaac.mo16652a(new ackk(this, getServiceRequest.f30230d, aaag.m21014a(this, this.f56354e, this.f56355f)));
        } else {
            aaac.mo16650a(16, (Bundle) null);
        }
    }

    private MobileDataHubListenerChimeraService(ackj ackj) {
        super(164, "com.google.android.mdh.service.listener.START", Collections.emptySet(), 1, 9);
        this.f79069a = ackj;
    }
}
