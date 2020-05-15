package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: adza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adza extends adyu {
    public adza(adzb adzb) {
        super(adzb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo33945b(long j, TimeUnit timeUnit) {
        return this.f62946a.f62953a.tryAcquire(1073741823, j, timeUnit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo33946c() {
        this.f62946a.f62953a.acquire(1073741823);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo33948d() {
        adzb adzb = this.f62946a;
        synchronized (adzb.f62953a) {
            if (adzb.f62953a.availablePermits() == 0) {
                adzb.f62953a.release(1073741823);
            } else {
                throw new IllegalStateException("ReadWriteLock is in an inconsistent state");
            }
        }
    }
}
