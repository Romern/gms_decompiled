package p000;

import java.util.concurrent.Callable;

/* renamed from: butg */
final /* synthetic */ class butg implements Callable {

    /* renamed from: a */
    private final Runnable f154846a;

    public butg(Runnable runnable) {
        this.f154846a = runnable;
    }

    public final Object call() {
        this.f154846a.run();
        return true;
    }
}
