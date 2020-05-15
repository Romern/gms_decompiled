package p000;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: atcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atcg {

    /* renamed from: a */
    static final Semaphore f90079a = new Semaphore(1);

    /* renamed from: a */
    public static bgm m75537a(atch atch) {
        try {
            if (f90079a.tryAcquire(10, TimeUnit.SECONDS)) {
                return new bgn(atch, atch);
            }
            throw new atcz("Cannot acquire the SDK lock");
        } catch (InterruptedException e) {
            throw new atcz("Cannot acquire the SDK lock", e);
        }
    }

    /* renamed from: a */
    public static void m75538a(bfw bfw) {
        if (Integer.parseInt(bfw.f3134c) > 10) {
            throw new atcf(bfw);
        }
    }

    /* renamed from: a */
    public static synchronized void m75539a(bgm bgm) {
        synchronized (atcg.class) {
            if (bgm != null) {
                f90079a.release();
            }
        }
    }
}
