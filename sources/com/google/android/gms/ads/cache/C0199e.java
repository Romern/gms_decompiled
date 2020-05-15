package com.google.android.gms.ads.cache;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.ads.cache.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0199e extends rzu {

    /* renamed from: a */
    final /* synthetic */ CacheBrokerChimeraService f7852a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C0199e(CacheBrokerChimeraService cacheBrokerChimeraService, Context context) {
        super(context, 123, new int[0]);
        this.f7852a = cacheBrokerChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        sbj.mo16678a(0, new C0203i(this.f7852a.getApplicationContext()), (Bundle) null);
    }
}
