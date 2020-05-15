package p000;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ciep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciep implements Executor, Runnable {

    /* renamed from: b */
    private static final Logger f189969b = Logger.getLogger(ciep.class.getName());

    /* renamed from: c */
    private static final ciem f189970c;

    /* renamed from: a */
    public volatile int f189971a = 0;

    /* renamed from: d */
    private final Executor f189972d;

    /* renamed from: e */
    private final Queue f189973e = new ConcurrentLinkedQueue();

    static {
        ciem ciem;
        try {
            ciem = new cien(AtomicIntegerFieldUpdater.newUpdater(ciep.class, "a"));
        } catch (Throwable th) {
            f189969b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            ciem = new cieo();
        }
        f189970c = ciem;
    }

    public ciep(Executor executor) {
        bmxy.m108582a(executor, "'executor' must not be null.");
        this.f189972d = executor;
    }

    /* renamed from: a */
    private final void m150136a(Runnable runnable) {
        if (f189970c.mo86010a(this)) {
            try {
                this.f189972d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f189973e.remove(runnable);
                }
                f189970c.mo86011b(this);
                throw th;
            }
        }
    }

    public final void execute(Runnable runnable) {
        Queue queue = this.f189973e;
        bmxy.m108582a(runnable, "'r' must not be null.");
        queue.add(runnable);
        m150136a(runnable);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    public final void run() {
        Runnable runnable;
        while (true) {
            try {
                runnable = (Runnable) this.f189973e.poll();
                if (runnable == null) {
                    break;
                }
                runnable.run();
            } catch (RuntimeException e) {
                Logger logger = f189969b;
                Level level = Level.SEVERE;
                String valueOf = String.valueOf(runnable);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Exception while executing runnable ");
                sb.append(valueOf);
                logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", sb.toString(), (Throwable) e);
            } catch (Throwable th) {
                f189970c.mo86011b(this);
                throw th;
            }
        }
        f189970c.mo86011b(this);
        if (!this.f189973e.isEmpty()) {
            m150136a(null);
        }
    }
}
