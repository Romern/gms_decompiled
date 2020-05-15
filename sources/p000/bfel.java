package p000;

import android.os.Handler;

/* renamed from: bfel */
final /* synthetic */ class bfel implements Runnable {

    /* renamed from: a */
    private final bfev f113568a;

    /* renamed from: b */
    private final bfgn f113569b;

    /* renamed from: c */
    private final Handler f113570c;

    public bfel(bfev bfev, bfgn bfgn, Handler handler) {
        this.f113568a = bfev;
        this.f113569b = bfgn;
        this.f113570c = handler;
    }

    public final void run() {
        bfev bfev = this.f113568a;
        bfgn bfgn = this.f113569b;
        Handler handler = this.f113570c;
        if (!bfev.f113607b) {
            bfgn.mo61579a();
            handler.sendEmptyMessage(2);
            bfev.f113607b = true;
        }
    }
}
