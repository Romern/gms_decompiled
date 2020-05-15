package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: bbox */
final /* synthetic */ class bbox implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f103029a = new bbox();

    private bbox() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new bboy(runnable));
    }
}
