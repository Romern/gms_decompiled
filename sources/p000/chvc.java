package p000;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: chvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chvc implements Executor {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f189249a;

    /* renamed from: b */
    private final Queue f189250b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private final AtomicReference f189251c = new AtomicReference();

    public chvc(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        bmxy.m108582a(uncaughtExceptionHandler, "uncaughtExceptionHandler");
        this.f189249a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public final chvb mo85702a(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        chva chva = new chva(runnable);
        return new chvb(chva, scheduledExecutorService.schedule(new chuz(this, chva, runnable), j, timeUnit));
    }

    /* renamed from: b */
    public final void mo85705b() {
        bmxy.m108601b(Thread.currentThread() == this.f189251c.get(), "Not called from the SynchronizationContext");
    }

    public final void execute(Runnable runnable) {
        mo85704a(runnable);
        mo85703a();
    }

    /* renamed from: a */
    public final void mo85703a() {
        while (this.f189251c.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f189250b.poll();
                    if (runnable == null) {
                        this.f189251c.set(null);
                        if (this.f189250b.isEmpty()) {
                            return;
                        }
                    } else {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    this.f189251c.set(null);
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo85704a(Runnable runnable) {
        Queue queue = this.f189250b;
        bmxy.m108582a(runnable, "runnable is null");
        queue.add(runnable);
    }
}
