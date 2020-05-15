package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: qof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qof implements bdcc {

    /* renamed from: a */
    final /* synthetic */ qog f41834a;

    /* renamed from: b */
    private CountDownLatch f41835b = new CountDownLatch(0);

    public qof(qog qog) {
        this.f41834a = qog;
    }

    /* renamed from: a */
    public final synchronized boolean mo24153a() {
        if (this.f41835b.getCount() != 0) {
            return false;
        }
        this.f41835b = new CountDownLatch(1);
        return true;
    }

    /* renamed from: b */
    public final synchronized CountDownLatch mo24154b() {
        return this.f41835b;
    }

    /* renamed from: c */
    public final void mo24155c() {
        qlp.m32393a().mo8860a(this.f41834a.f41838b, 59);
    }

    /* renamed from: d */
    public final void mo24156d() {
    }

    /* renamed from: e */
    public final void mo24157e() {
        synchronized (this) {
            this.f41835b.countDown();
        }
        qlp.m32393a().mo8860a(this.f41834a.f41838b, 56);
    }
}
