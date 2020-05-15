package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: bqgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqgn extends bqdu {

    /* renamed from: a */
    private final Object f140626a = new Object();

    /* renamed from: b */
    private int f140627b = 0;

    /* renamed from: c */
    private boolean f140628c = false;

    /* renamed from: a */
    private final void m112805a() {
        synchronized (this.f140626a) {
            int i = this.f140627b - 1;
            this.f140627b = i;
            if (i == 0) {
                this.f140626a.notifyAll();
            }
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        synchronized (this.f140626a) {
            while (true) {
                if (this.f140628c) {
                    if (this.f140627b == 0) {
                        return true;
                    }
                }
                if (nanos <= 0) {
                    return false;
                }
                long nanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.f140626a, nanos);
                nanos -= System.nanoTime() - nanoTime;
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f140626a) {
            if (!this.f140628c) {
                this.f140627b++;
            } else {
                throw new RejectedExecutionException("Executor already shutdown");
            }
        }
        try {
            runnable.run();
        } finally {
            m112805a();
        }
    }

    public final boolean isShutdown() {
        boolean z;
        synchronized (this.f140626a) {
            z = this.f140628c;
        }
        return z;
    }

    public final boolean isTerminated() {
        boolean z;
        synchronized (this.f140626a) {
            z = false;
            if (this.f140628c && this.f140627b == 0) {
                z = true;
            }
        }
        return z;
    }

    public final void shutdown() {
        synchronized (this.f140626a) {
            this.f140628c = true;
            if (this.f140627b == 0) {
                this.f140626a.notifyAll();
            }
        }
    }

    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
