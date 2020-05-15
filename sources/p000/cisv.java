package p000;

/* renamed from: cisv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cisw f191354a;

    public cisv(cisw cisw) {
        this.f191354a = cisw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r0 = r6.f191354a.f191357c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = (java.lang.Runnable) r6.f191354a.f191357c.pollFirst();
        r2 = r6.f191354a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r2.f191358d = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
        monitor-enter(r6.f191354a.f191357c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2 = r6.f191354a;
        r2.f191358d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.f191355a.execute(r2.f191356b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0059, code lost:
        return;
     */
    public final void run() {
        boolean z;
        synchronized (this.f191354a.f191357c) {
            cisw cisw = this.f191354a;
            if (!cisw.f191358d) {
                Runnable runnable = (Runnable) cisw.f191357c.pollFirst();
                cisw cisw2 = this.f191354a;
                if (runnable != null) {
                    z = true;
                } else {
                    z = false;
                }
                cisw2.f191358d = z;
            }
        }
    }
}
