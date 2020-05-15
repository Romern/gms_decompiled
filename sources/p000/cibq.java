package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cibq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cibq implements Runnable {

    /* renamed from: a */
    private static final Logger f189747a = Logger.getLogger(cibq.class.getName());

    /* renamed from: b */
    private final Runnable f189748b;

    public cibq(Runnable runnable) {
        bmxy.m108582a(runnable, "task");
        this.f189748b = runnable;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f189748b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("LogExceptionRunnable(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final void run() {
        try {
            this.f189748b.run();
        } catch (Throwable th) {
            Logger logger = f189747a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(this.f189748b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Exception while executing runnable ");
            sb.append(valueOf);
            logger.logp(level, "io.grpc.internal.LogExceptionRunnable", "run", sb.toString(), th);
            bmzo.m108686a(th);
            throw new AssertionError(th);
        }
    }
}
