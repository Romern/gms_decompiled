package p000;

import android.app.Application;

/* renamed from: bdhf */
final /* synthetic */ class bdhf implements bmzi {

    /* renamed from: a */
    private final Application f105646a;

    public bdhf(Application application) {
        this.f105646a = application;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        return this.f105646a.getSharedPreferences("primes", 0);
    }
}
