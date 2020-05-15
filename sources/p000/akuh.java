package p000;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: akuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akuh implements RejectedExecutionHandler {
    /* renamed from: a */
    private static final void m60497a(Runnable runnable) {
        if (runnable instanceof akun) {
            akun akun = (akun) runnable;
            akun.f72901b.f72903a.mo39836c(akun.f72900a);
        }
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (!threadPoolExecutor.isShutdown()) {
            threadPoolExecutor.execute(runnable);
            m60497a(threadPoolExecutor.getQueue().poll());
            return;
        }
        m60497a(runnable);
    }
}
