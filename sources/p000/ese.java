package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: ese */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ese extends ThreadPoolExecutor.DiscardPolicy {

    /* renamed from: a */
    private static final Logger f15602a = ffw.m11631a("ResourceExecutor");

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        f15602a.mo25412b("Execution rejected - isShutdown:%b", Boolean.valueOf(threadPoolExecutor.isShutdown()));
    }
}
