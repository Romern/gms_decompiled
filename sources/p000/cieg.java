package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: cieg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cieg {

    /* renamed from: a */
    public final ScheduledExecutorService f189951a;

    /* renamed from: b */
    public final Executor f189952b;

    /* renamed from: c */
    public final Runnable f189953c;

    /* renamed from: d */
    public long f189954d;

    /* renamed from: e */
    public boolean f189955e;

    /* renamed from: f */
    public ScheduledFuture f189956f;

    /* renamed from: g */
    private final bmza f189957g;

    public cieg(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, bmza bmza) {
        this.f189953c = runnable;
        this.f189952b = executor;
        this.f189951a = scheduledExecutorService;
        this.f189957g = bmza;
        bmza.mo66930d();
    }

    /* renamed from: a */
    public final long mo86005a() {
        return this.f189957g.mo66928a(TimeUnit.NANOSECONDS);
    }
}
