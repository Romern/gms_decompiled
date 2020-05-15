package p000;

/* renamed from: cipq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cipq extends Thread {
    public cipq() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.mo74999a();
     */
    public final void run() {
        while (true) {
            try {
                synchronized (cipr.class) {
                    cipr cipr = cipr.f191205d.f191207e;
                    if (cipr == null) {
                        long nanoTime = System.nanoTime();
                        cipr.class.wait(cipr.f191203b);
                        if (cipr.f191205d.f191207e != null || System.nanoTime() - nanoTime < cipr.f191204c) {
                            cipr = null;
                        } else {
                            cipr = cipr.f191205d;
                        }
                    } else {
                        long a = cipr.mo86270a(System.nanoTime());
                        if (a <= 0) {
                            cipr.f191205d.f191207e = cipr.f191207e;
                            cipr.f191207e = null;
                        } else {
                            long j = a / 1000000;
                            Long.signum(j);
                            cipr.class.wait(j, (int) (a - (1000000 * j)));
                            cipr = null;
                        }
                    }
                    if (cipr != null) {
                        if (cipr == cipr.f191205d) {
                            cipr.f191205d = null;
                            return;
                        }
                    }
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
