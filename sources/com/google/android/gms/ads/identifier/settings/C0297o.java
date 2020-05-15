package com.google.android.gms.ads.identifier.settings;

/* renamed from: com.google.android.gms.ads.identifier.settings.o */
final /* synthetic */ class C0297o implements Runnable {

    /* renamed from: a */
    private final bqgy f8037a;

    /* renamed from: b */
    private final sia f8038b;

    public C0297o(bqgy bqgy, sia sia) {
        this.f8037a = bqgy;
        this.f8038b = sia;
    }

    public final void run() {
        bqgy bqgy = this.f8037a;
        sia sia = this.f8038b;
        if (bqgy.isCancelled()) {
            sia.cancel();
        }
    }
}
