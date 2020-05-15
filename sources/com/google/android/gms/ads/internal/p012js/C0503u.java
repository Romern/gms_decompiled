package com.google.android.gms.ads.internal.p012js;

/* renamed from: com.google.android.gms.ads.internal.js.u */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0503u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f8502a;

    /* renamed from: b */
    final /* synthetic */ C0505w f8503b;

    public C0503u(C0505w wVar, String str) {
        this.f8503b = wVar;
        this.f8502a = str;
    }

    public final void run() {
        this.f8503b.f8506a.loadUrl(this.f8502a);
    }
}
