package p000;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: bqhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhi {
    /* renamed from: a */
    public static Object m112838a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* renamed from: a */
    public static void m112839a(long j, TimeUnit timeUnit) {
        boolean z = true;
        boolean z2 = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long nanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException e) {
                    nanos = nanoTime - System.nanoTime();
                    z2 = true;
                } catch (Throwable th) {
                    th = th;
                    if (z) {
                    }
                    throw th;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static void m112840a(Thread thread) {
        boolean z = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
