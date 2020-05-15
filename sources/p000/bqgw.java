package p000;

/* renamed from: bqgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqgw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgx f140641a;

    public bqgw(bqgx bqgx) {
        this.f140641a = bqgx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r10.f140641a.f140645d = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        r2 = r2 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3 = p000.bqgx.f140642a;
        r4 = java.util.logging.Level.SEVERE;
        r0 = java.lang.String.valueOf(r0);
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r9.append("Exception while executing runnable ");
        r9.append(r0);
        r3.logp(r4, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", r9.toString(), (java.lang.Throwable) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007f, code lost:
        if (r2 != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0088, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008e, code lost:
        monitor-enter(r10.f140641a.f140643b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r10.f140641a.f140645d = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0094, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    public final void run() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (this.f140641a.f140643b) {
                    if (!z) {
                        bqgx bqgx = this.f140641a;
                        if (bqgx.f140645d == 4) {
                            break;
                        }
                        bqgx.f140644c++;
                        bqgx.f140645d = 4;
                    }
                    Runnable runnable = (Runnable) this.f140641a.f140643b.poll();
                    if (runnable == null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                th = th;
            }
        }
    }
}
