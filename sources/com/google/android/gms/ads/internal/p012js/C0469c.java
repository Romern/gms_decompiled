package com.google.android.gms.ads.internal.p012js;

/* renamed from: com.google.android.gms.ads.internal.js.c */
final /* synthetic */ class C0469c implements Runnable {

    /* renamed from: a */
    private final C0489g f8455a;

    /* renamed from: b */
    private final String f8456b;

    public C0469c(C0489g gVar, String str) {
        this.f8455a = gVar;
        this.f8456b = str;
    }

    public final void run() {
        C0489g gVar = this.f8455a;
        gVar.f8485a.loadUrl(this.f8456b);
    }
}
