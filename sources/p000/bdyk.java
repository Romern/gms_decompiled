package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: bdyk */
final /* synthetic */ class bdyk implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f106629a = new bdyk();

    private bdyk() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
