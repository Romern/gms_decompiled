package p000;

import java.util.concurrent.Executor;

/* renamed from: brxi */
final /* synthetic */ class brxi implements Executor {

    /* renamed from: a */
    private final brxw f143560a;

    /* renamed from: b */
    private final Executor f143561b;

    public brxi(brxw brxw, Executor executor) {
        this.f143560a = brxw;
        this.f143561b = executor;
    }

    public final void execute(Runnable runnable) {
        this.f143561b.execute(new brxk(this.f143560a, runnable));
    }
}
