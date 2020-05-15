package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: catt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catt {

    /* renamed from: a */
    public static final catt f175956a;

    /* renamed from: b */
    public final Executor f175957b = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), cavk.m127319b("OkHttp ConnectionPool"));

    /* renamed from: c */
    public final int f175958c;

    /* renamed from: d */
    public final long f175959d;

    /* renamed from: e */
    public final Runnable f175960e = new cats(this);

    /* renamed from: f */
    public final Deque f175961f = new ArrayDeque();

    /* renamed from: g */
    public final cavi f175962g = new cavi();

    static {
        long j;
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        if (property2 != null) {
            j = Long.parseLong(property2);
        } else {
            j = 300000;
        }
        if (property != null && !Boolean.parseBoolean(property)) {
            f175956a = new catt(0, j);
        } else if (property3 != null) {
            f175956a = new catt(Integer.parseInt(property3), j);
        } else {
            f175956a = new catt(5, j);
        }
    }

    public catt(int i, long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f175958c = i;
        this.f175959d = timeUnit.toNanos(j);
        if (j <= 0) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("keepAliveDuration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
