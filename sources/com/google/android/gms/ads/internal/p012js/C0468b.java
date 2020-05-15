package com.google.android.gms.ads.internal.p012js;

/* renamed from: com.google.android.gms.ads.internal.js.b */
final /* synthetic */ class C0468b implements Runnable {

    /* renamed from: a */
    private final C0489g f8453a;

    /* renamed from: b */
    private final String f8454b;

    public C0468b(C0489g gVar, String str) {
        this.f8453a = gVar;
        this.f8454b = str;
    }

    public final void run() {
        C0489g gVar = this.f8453a;
        gVar.f8485a.loadData(this.f8454b, "text/html", "UTF-8");
    }
}
