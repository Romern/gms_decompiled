package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: bocf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bocf {

    /* renamed from: a */
    public static final ScheduledExecutorService f132535a;

    /* renamed from: b */
    private static final ThreadFactory f132536b;

    static {
        bqha bqha = new bqha();
        bqha.mo69262a("RetryingFuture-Timer-%d");
        bqha.mo69261a();
        ThreadFactory a = bqha.m112820a(bqha);
        f132536b = a;
        f132535a = Executors.newSingleThreadScheduledExecutor(a);
    }
}
