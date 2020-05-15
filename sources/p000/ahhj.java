package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: ahhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahhj extends ahhh implements bqgk {

    /* renamed from: b */
    private final bqgk f67211b;

    public ahhj(bqgk bqgk) {
        super(bqgk);
        this.f67211b = bqgk;
    }

    /* renamed from: a */
    public final bqgi scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        try {
            return this.f67211b.mo25769a(this.f67209a.mo36501a(runnable), j, j2, timeUnit);
        } catch (RejectedExecutionException e) {
            return new ahhi(bqga.m112777a((Throwable) e));
        }
    }

    /* renamed from: b */
    public final bqgi scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        try {
            return this.f67211b.mo25820b(this.f67209a.mo36501a(runnable), j, j2, timeUnit);
        } catch (RejectedExecutionException e) {
            return new ahhi(bqga.m112777a((Throwable) e));
        }
    }

    /* renamed from: a */
    public final bqgi schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            return this.f67211b.mo25814a(this.f67209a.mo36501a(runnable), j, timeUnit);
        } catch (RejectedExecutionException e) {
            return new ahhi(bqga.m112777a((Throwable) e));
        }
    }

    /* renamed from: a */
    public final bqgi schedule(Callable callable, long j, TimeUnit timeUnit) {
        try {
            return this.f67211b.mo25815a(this.f67209a.mo36502a(callable), j, timeUnit);
        } catch (RejectedExecutionException e) {
            return new ahhi(bqga.m112777a((Throwable) e));
        }
    }
}
