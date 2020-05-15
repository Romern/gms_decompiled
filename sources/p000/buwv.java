package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: buwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buwv implements bvda {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f155193a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f155194b;

    /* renamed from: c */
    final /* synthetic */ buxb f155195c;

    public buwv(buxb buxb, AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
        this.f155195c = buxb;
        this.f155193a = atomicBoolean;
        this.f155194b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo73126a() {
        this.f155193a.set(true);
        this.f155194b.countDown();
    }

    /* renamed from: b */
    public final void mo73127b() {
        this.f155195c.mo73235i();
        this.f155194b.countDown();
    }
}
