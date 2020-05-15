package p000;

import java.util.concurrent.Semaphore;

/* renamed from: ayat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayat extends Thread {

    /* renamed from: a */
    private final Runnable f96976a;

    /* renamed from: b */
    private final Semaphore f96977b;

    public ayat(Runnable runnable, Semaphore semaphore) {
        this.f96976a = runnable;
        this.f96977b = semaphore;
    }

    public final void run() {
        Semaphore semaphore;
        try {
            this.f96976a.run();
            semaphore = this.f96977b;
        } catch (Throwable th) {
            this.f96977b.release();
            throw th;
        }
        semaphore.release();
    }
}
