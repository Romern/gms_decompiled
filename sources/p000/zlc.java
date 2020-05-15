package p000;

import java.util.concurrent.Callable;

/* renamed from: zlc */
final /* synthetic */ class zlc implements Runnable {

    /* renamed from: a */
    private final bqgy f55361a;

    /* renamed from: b */
    private final Callable f55362b;

    public zlc(bqgy bqgy, Callable callable) {
        this.f55361a = bqgy;
        this.f55362b = callable;
    }

    public final void run() {
        bqgy bqgy = this.f55361a;
        Callable callable = this.f55362b;
        Object obj = zle.f55365b;
        try {
            if (!bqgy.isCancelled()) {
                bqgy.mo69138b(callable.call());
            }
        } catch (Throwable th) {
            bqgy.mo69136a(th);
        }
    }
}
