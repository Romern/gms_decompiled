package p000;

import com.felicanetworks.mfc.FelicaException;

/* renamed from: brfs */
final /* synthetic */ class brfs implements Runnable {

    /* renamed from: a */
    private final brgn f142775a;

    /* renamed from: b */
    private final FelicaException f142776b;

    public brfs(brgn brgn, FelicaException felicaException) {
        this.f142775a = brgn;
        this.f142776b = felicaException;
    }

    public final void run() {
        this.f142775a.mo69524a(bret.m113949a(this.f142776b));
    }
}
