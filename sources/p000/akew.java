package p000;

import java.util.concurrent.Callable;

/* renamed from: akew */
final /* synthetic */ class akew implements Runnable {

    /* renamed from: a */
    private final bqgy f71763a;

    /* renamed from: b */
    private final Callable f71764b;

    public akew(bqgy bqgy, Callable callable) {
        this.f71763a = bqgy;
        this.f71764b = callable;
    }

    public final void run() {
        bqgy bqgy = this.f71763a;
        try {
            bqgy.mo69138b((Integer) this.f71764b.call());
        } catch (Exception e) {
            bqgy.mo69136a((Throwable) e);
        }
    }
}
