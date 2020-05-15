package p000;

import java.util.concurrent.Semaphore;

/* renamed from: nwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nwo extends nwm {

    /* renamed from: b */
    public final Semaphore f36816b;

    /* renamed from: c */
    public boolean f36817c;

    /* renamed from: d */
    public boolean f36818d;

    /* renamed from: a */
    public final synchronized void mo21755a() {
        this.f36817c = true;
        notify();
    }

    /* renamed from: b */
    public final synchronized boolean mo21756b() {
        boolean z = false;
        while (!this.f36817c && !(z = this.f36816b.tryAcquire())) {
            this.f36818d = false;
            wait();
        }
        if (z || this.f36816b.tryAcquire()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final synchronized void mo21757c() {
        this.f36816b.release();
        this.f36818d = true;
        notify();
    }

    public nwo(Semaphore semaphore) {
        this.f36816b = semaphore;
    }
}
