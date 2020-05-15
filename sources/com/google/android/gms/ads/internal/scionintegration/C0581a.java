package com.google.android.gms.ads.internal.scionintegration;

import com.google.android.gms.ads.measurement.C0739b;

/* renamed from: com.google.android.gms.ads.internal.scionintegration.a */
final /* synthetic */ class C0581a implements Runnable {

    /* renamed from: a */
    private final C0590j f8872a;

    /* renamed from: b */
    private final String f8873b;

    public C0581a(C0590j jVar, String str) {
        this.f8872a = jVar;
        this.f8873b = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, android.content.Context):java.lang.Object
      com.google.android.gms.ads.internal.scionintegration.j.a(android.content.Context, java.lang.String):void
      com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, boolean):void */
    public final void run() {
        C0590j jVar = this.f8872a;
        String str = this.f8873b;
        if (((C0739b) jVar.f8885d.get()) != null) {
            try {
                ((C0739b) jVar.f8885d.get()).mo7038d();
            } catch (Exception e) {
                jVar.mo6772a(str, false);
            }
        }
    }
}
