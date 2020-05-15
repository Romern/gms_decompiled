package p000;

import java.util.concurrent.Callable;

/* renamed from: err */
final /* synthetic */ class err implements Callable {

    /* renamed from: a */
    private final Runnable f15576a;

    public err(Runnable runnable) {
        this.f15576a = runnable;
    }

    public final Object call() {
        this.f15576a.run();
        return null;
    }
}
