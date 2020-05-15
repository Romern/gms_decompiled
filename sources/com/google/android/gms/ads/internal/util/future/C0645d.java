package com.google.android.gms.ads.internal.util.future;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.internal.util.future.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0645d {

    /* renamed from: a */
    public static final bqgj f8973a = m5682a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), m5683a("Default")));

    /* renamed from: b */
    public static final bqgj f8974b;

    /* renamed from: c */
    public static final ScheduledExecutorService f8975c = new ScheduledThreadPoolExecutor(3, m5683a("Schedule"));

    /* renamed from: d */
    public static final bqgj f8976d = m5682a(new C0643b());

    /* renamed from: e */
    public static final bqgj f8977e = m5682a(bqfb.INSTANCE);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), m5683a("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f8974b = m5682a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), m5683a("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        m5682a(threadPoolExecutor2);
    }

    /* renamed from: a */
    private static bqgj m5682a(Executor executor) {
        return new C0644c(executor);
    }

    /* renamed from: a */
    private static ThreadFactory m5683a(String str) {
        return new C0642a(str);
    }
}
