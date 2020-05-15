package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.as */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0810as implements cayy {

    /* renamed from: a */
    private final C0808aq f9261a;

    public C0810as(C0808aq aqVar) {
        this.f9261a = aqVar;
    }

    /* renamed from: a */
    public static ApplicationInfo m5994a(C0808aq aqVar) {
        ApplicationInfo applicationInfo = aqVar.f9258a.f8694c;
        cazf.m127593a(applicationInfo, "Cannot return null from a non-@Nullable @Provides method");
        return applicationInfo;
    }

    /* renamed from: b */
    public final ApplicationInfo mo6445a() {
        return m5994a(this.f9261a);
    }
}
