package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: bbop */
final /* synthetic */ class bbop implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f103026a = new bbop();

    private bbop() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new bboq(runnable));
    }
}
