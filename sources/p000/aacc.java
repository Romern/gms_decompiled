package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: aacc */
final /* synthetic */ class aacc implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f27919a = new aacc();

    private aacc() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new aace(runnable), "common_PhantomFutures");
    }
}
