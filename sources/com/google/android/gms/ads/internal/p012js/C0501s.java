package com.google.android.gms.ads.internal.p012js;

/* renamed from: com.google.android.gms.ads.internal.js.s */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0501s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f8498a;

    /* renamed from: b */
    final /* synthetic */ C0505w f8499b;

    public C0501s(C0505w wVar, String str) {
        this.f8499b = wVar;
        this.f8498a = str;
    }

    public final void run() {
        this.f8499b.f8506a.loadData(this.f8498a, "text/html", "UTF-8");
    }
}
