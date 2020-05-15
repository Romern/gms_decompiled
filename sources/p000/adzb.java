package p000;

import java.util.concurrent.Semaphore;

/* renamed from: adzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adzb {

    /* renamed from: a */
    public final Semaphore f62953a;

    public adzb() {
        this(new Semaphore(1073741823));
    }

    public adzb(Semaphore semaphore) {
        bmxy.m108581a(semaphore);
        this.f62953a = semaphore;
    }
}
