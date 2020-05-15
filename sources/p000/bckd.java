package p000;

import android.util.Pair;

/* renamed from: bckd */
final /* synthetic */ class bckd implements Runnable {

    /* renamed from: a */
    private final bckf f104366a;

    /* renamed from: b */
    private final Pair f104367b;

    public bckd(bckf bckf, Pair pair) {
        this.f104366a = bckf;
        this.f104367b = pair;
    }

    public final void run() {
        bckf bckf = this.f104366a;
        Pair pair = this.f104367b;
        synchronized (bckf) {
            try {
                ((bqgy) pair.first).mo69138b(bckf.f104368a.get());
                bckf.f104368a = null;
                bckf.mo56956a();
            } catch (Throwable th) {
                ((bqgy) pair.first).mo69136a(th);
                bckf.f104368a = null;
                bckf.mo56957a(th);
            }
        }
    }
}
