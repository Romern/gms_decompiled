package p000;

import java.util.concurrent.Executor;

/* renamed from: aacj */
final /* synthetic */ class aacj implements Executor {

    /* renamed from: a */
    private final Executor f27936a;

    /* renamed from: b */
    private final sni f27937b;

    public aacj(Executor executor, sni sni) {
        this.f27936a = executor;
        this.f27937b = sni;
    }

    public final void execute(Runnable runnable) {
        this.f27936a.execute(new aack(this.f27937b, runnable));
    }
}
