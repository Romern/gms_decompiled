package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: bqgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqgx implements Executor {

    /* renamed from: a */
    public static final Logger f140642a = Logger.getLogger(bqgx.class.getName());

    /* renamed from: b */
    public final Deque f140643b = new ArrayDeque();

    /* renamed from: c */
    public long f140644c = 0;

    /* renamed from: d */
    public int f140645d = 1;

    /* renamed from: e */
    private final Executor f140646e;

    /* renamed from: f */
    private final bqgw f140647f = new bqgw(this);

    public bqgx(Executor executor) {
        bmxy.m108581a(executor);
        this.f140646e = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7.f140646e.execute(r7.f140647f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r7.f140645d != 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r7.f140643b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r7.f140644c != r3) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r7.f140645d != 2) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        r7.f140645d = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        monitor-enter(r7.f140643b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3 = r7.f140645d;
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        if (r3 == 1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004c, code lost:
        if (r3 != 2) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0055, code lost:
        if (r7.f140643b.removeLastOccurrence(r1) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0057, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005c, code lost:
        if ((r0 instanceof java.util.concurrent.RejectedExecutionException) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0062, code lost:
        throw r0;
     */
    public final void execute(Runnable runnable) {
        bmxy.m108581a(runnable);
        synchronized (this.f140643b) {
            int i = this.f140645d;
            if (i != 4) {
                if (i != 3) {
                    long j = this.f140644c;
                    bqgv bqgv = new bqgv(runnable);
                    this.f140643b.add(bqgv);
                    this.f140645d = 2;
                }
            }
            this.f140643b.add(runnable);
        }
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.f140646e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
