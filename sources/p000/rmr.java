package p000;

import java.util.concurrent.locks.Lock;

/* renamed from: rmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class rmr implements Runnable {

    /* renamed from: b */
    final /* synthetic */ rms f43295b;

    public rmr(rms rms) {
        this.f43295b = rms;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24902a();

    public final void run() {
        Lock lock;
        this.f43295b.f43297b.lock();
        try {
            if (Thread.interrupted()) {
                lock = this.f43295b.f43297b;
            } else {
                mo24902a();
                lock = this.f43295b.f43297b;
            }
        } catch (RuntimeException e) {
            rnb rnb = this.f43295b.f43296a;
            rnb.f43351e.sendMessage(rnb.f43351e.obtainMessage(2, e));
            lock = this.f43295b.f43297b;
        } catch (Throwable th) {
            this.f43295b.f43297b.unlock();
            throw th;
        }
        lock.unlock();
    }
}
