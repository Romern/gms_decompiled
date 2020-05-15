package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: adyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyz extends adyu {
    public adyz(adzb adzb) {
        super(adzb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo33945b(long j, TimeUnit timeUnit) {
        return this.f62946a.f62953a.tryAcquire(j, timeUnit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo33946c() {
        this.f62946a.f62953a.acquire();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo33948d() {
        adzb adzb = this.f62946a;
        synchronized (adzb.f62953a) {
            if (adzb.f62953a.availablePermits() == 0) {
                throw new IllegalStateException("Releasing reader lock that is exclusively held by writer");
            } else if (adzb.f62953a.availablePermits() >= 1073741823) {
                throw new IllegalStateException("Releasing reader lock that is not acquired");
            } else if (adzb.f62953a.availablePermits() >= 0) {
                adzb.f62953a.release();
            } else {
                throw new IllegalStateException("Lock is in an inconsistent state");
            }
        }
    }

    /* renamed from: f */
    public final void mo33952f() {
        super.mo33949e();
    }
}
