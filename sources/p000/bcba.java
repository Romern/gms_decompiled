package p000;

import java.util.concurrent.Callable;

/* renamed from: bcba */
final /* synthetic */ class bcba implements Callable {

    /* renamed from: a */
    private final Runnable f103926a;

    public bcba(Runnable runnable) {
        this.f103926a = runnable;
    }

    public final Object call() {
        this.f103926a.run();
        return null;
    }
}
