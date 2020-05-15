package com.google.android.gms.fonts.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FontsChimeraService extends zzx {
    public FontsChimeraService() {
        super(132, "com.google.android.gms.fonts.service.START", Collections.emptySet(), 3, 10);
        zyh.m46683c("FontsChimeraService", "ctor", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        zyh.m46683c("FontsChimeraService", "onGetService (from %s)", str);
        aaac.mo16652a(new zza(this, aaag.m21013a(), str));
    }

    public final void onCreate() {
        zyh.m46683c("FontsChimeraService", "onCreate::begin", new Object[0]);
        zzi.f56267a.mo31623a(getApplicationContext(), new zyz());
        zyh.m46682b("FontsChimeraService", "onCreate::success", new Object[0]);
    }
}
