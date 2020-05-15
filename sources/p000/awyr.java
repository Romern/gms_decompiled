package p000;

import java.util.concurrent.Executor;

/* renamed from: awyr */
final /* synthetic */ class awyr implements Executor {

    /* renamed from: a */
    private final adzt f95325a;

    public awyr(adzt adzt) {
        this.f95325a = adzt;
    }

    public final void execute(Runnable runnable) {
        this.f95325a.post(runnable);
    }
}
