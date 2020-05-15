package p000;

import android.os.Bundle;

/* renamed from: bixx */
final /* synthetic */ class bixx implements Runnable {

    /* renamed from: a */
    private final bixy f122238a;

    /* renamed from: b */
    private final String f122239b;

    /* renamed from: c */
    private final Bundle f122240c;

    public bixx(bixy bixy, String str, Bundle bundle) {
        this.f122238a = bixy;
        this.f122239b = str;
        this.f122240c = bundle;
    }

    public final void run() {
        this.f122238a.mo64855b(this.f122239b, this.f122240c);
    }
}
