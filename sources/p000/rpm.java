package p000;

import java.util.concurrent.Executor;

/* renamed from: rpm */
final /* synthetic */ class rpm implements Executor {

    /* renamed from: a */
    static final Executor f43490a = new rpm();

    private rpm() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
