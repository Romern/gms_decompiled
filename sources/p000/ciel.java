package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ciel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciel implements Executor {

    /* renamed from: a */
    private static final Logger f189965a = Logger.getLogger(ciel.class.getName());

    /* renamed from: b */
    private boolean f189966b;

    /* renamed from: c */
    private ArrayDeque f189967c;

    /* renamed from: a */
    private final void m150129a() {
        while (true) {
            Runnable runnable = (Runnable) this.f189967c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Logger logger = f189965a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(runnable);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", sb.toString(), th);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r8.f189967c == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r8.f189967c != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        m150129a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r8.f189966b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        return;
     */
    public final void execute(Runnable runnable) {
        bmxy.m108582a(runnable, "'task' must not be null.");
        if (!this.f189966b) {
            this.f189966b = true;
            try {
                runnable.run();
            } catch (Throwable th) {
                if (this.f189967c != null) {
                    m150129a();
                }
                this.f189966b = false;
                throw th;
            }
        } else {
            if (this.f189967c == null) {
                this.f189967c = new ArrayDeque(4);
            }
            this.f189967c.add(runnable);
        }
    }
}
