package p000;

import com.felicanetworks.mfc.FelicaException;

/* renamed from: brfr */
final /* synthetic */ class brfr implements Runnable {

    /* renamed from: a */
    private final brgn f142773a;

    /* renamed from: b */
    private final FelicaException f142774b;

    public brfr(brgn brgn, FelicaException felicaException) {
        this.f142773a = brgn;
        this.f142774b = felicaException;
    }

    public final void run() {
        this.f142773a.mo69524a(bret.m113949a(this.f142774b));
    }
}
