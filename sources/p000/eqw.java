package p000;

import java.util.concurrent.Callable;

/* renamed from: eqw */
final /* synthetic */ class eqw implements Callable {

    /* renamed from: a */
    private final Runnable f15539a;

    public eqw(Runnable runnable) {
        this.f15539a = runnable;
    }

    public final Object call() {
        this.f15539a.run();
        return null;
    }
}
