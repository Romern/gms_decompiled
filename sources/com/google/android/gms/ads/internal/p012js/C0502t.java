package com.google.android.gms.ads.internal.p012js;

/* renamed from: com.google.android.gms.ads.internal.js.t */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0502t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f8500a;

    /* renamed from: b */
    final /* synthetic */ C0505w f8501b;

    public C0502t(C0505w wVar, String str) {
        this.f8501b = wVar;
        this.f8500a = str;
    }

    public final void run() {
        this.f8501b.f8506a.loadData(this.f8500a, "text/html", "UTF-8");
    }
}
