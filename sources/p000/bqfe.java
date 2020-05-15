package p000;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bqfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqfe {

    /* renamed from: a */
    private static final Logger f140583a = Logger.getLogger(bqfe.class.getName());

    /* renamed from: b */
    private bqfd f140584b;

    /* renamed from: c */
    private boolean f140585c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: b */
    private static void m112741b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f140583a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ExecutionList", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r2 = r0.f140582c;
        r0.f140582c = r1;
        r1 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r1 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        m112741b(r1.f140580a, r1.f140581b);
        r1 = r1.f140582c;
     */
    /* renamed from: a */
    public final void mo69200a() {
        synchronized (this) {
            if (!this.f140585c) {
                this.f140585c = true;
                bqfd bqfd = this.f140584b;
                bqfd bqfd2 = null;
                this.f140584b = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo69201a(Runnable runnable, Executor executor) {
        bmxy.m108582a(runnable, "Runnable was null.");
        bmxy.m108582a(executor, "Executor was null.");
        synchronized (this) {
            if (!this.f140585c) {
                this.f140584b = new bqfd(runnable, executor, this.f140584b);
            } else {
                m112741b(runnable, executor);
            }
        }
    }
}
