package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: bjbn */
final /* synthetic */ class bjbn implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f122476a = new bjbn();

    private bjbn() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "LoggingStore");
    }
}
