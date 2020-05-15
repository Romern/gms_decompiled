package p000;

import java.util.concurrent.Callable;

/* renamed from: asfe */
final /* synthetic */ class asfe implements Callable {

    /* renamed from: a */
    private final long f88832a;

    public asfe(long j) {
        this.f88832a = j;
    }

    public final Object call() {
        Thread.sleep(this.f88832a);
        return null;
    }
}
