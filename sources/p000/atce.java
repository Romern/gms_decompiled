package p000;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: atce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atce {

    /* renamed from: a */
    static final Semaphore f90077a = new Semaphore(1);

    /* renamed from: a */
    public static bit m75534a(atci atci) {
        try {
            if (f90077a.tryAcquire(10, TimeUnit.SECONDS)) {
                return new bis(atci, atci);
            }
            throw new atcz("Cannot acquire the SDK lock");
        } catch (InterruptedException e) {
            throw new atcz("Cannot acquire the SDK lock", e);
        }
    }

    /* renamed from: a */
    public static void m75535a(bin bin) {
        if (Integer.parseInt(bin.f3321c) > 10) {
            throw new atcd(bin);
        }
    }

    /* renamed from: a */
    public static synchronized void m75536a(bit bit) {
        synchronized (atce.class) {
            if (bit != null) {
                f90077a.release();
            }
        }
    }
}
