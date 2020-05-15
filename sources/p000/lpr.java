package p000;

import android.content.Intent;

/* renamed from: lpr */
final /* synthetic */ class lpr implements Runnable {

    /* renamed from: a */
    private final lpy f26557a;

    public lpr(lpy lpy) {
        this.f26557a = lpy;
    }

    public final void run() {
        lpy lpy = this.f26557a;
        Intent a = lio.m19197a(lpy.f26159a, lpy.f26554k);
        if (a != null) {
            lpy.f26159a.startActivityForResult(a, 1000);
        }
    }
}
