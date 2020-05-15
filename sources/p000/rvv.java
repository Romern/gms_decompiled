package p000;

import java.util.concurrent.Future;

/* renamed from: rvv */
public final /* synthetic */ class rvv implements Runnable {

    /* renamed from: a */
    private final Future f43781a;

    /* renamed from: b */
    private final Thread f43782b;

    public rvv(Future future, Thread thread) {
        this.f43781a = future;
        this.f43782b = thread;
    }

    public final void run() {
        rvw.m34542a(this.f43781a, this.f43782b);
    }
}
