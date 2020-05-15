package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: bqdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqdl extends bqdg {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater f140509a;

    /* renamed from: b */
    final AtomicReferenceFieldUpdater f140510b;

    /* renamed from: c */
    final AtomicReferenceFieldUpdater f140511c;

    /* renamed from: d */
    final AtomicReferenceFieldUpdater f140512d;

    /* renamed from: e */
    final AtomicReferenceFieldUpdater f140513e;

    /* renamed from: a */
    public final void mo69126a(bqds bqds, bqds bqds2) {
        this.f140510b.lazySet(bqds, bqds2);
    }

    public bqdl(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f140509a = atomicReferenceFieldUpdater;
        this.f140510b = atomicReferenceFieldUpdater2;
        this.f140511c = atomicReferenceFieldUpdater3;
        this.f140512d = atomicReferenceFieldUpdater4;
        this.f140513e = atomicReferenceFieldUpdater5;
    }

    /* renamed from: a */
    public final void mo69127a(bqds bqds, Thread thread) {
        this.f140509a.lazySet(bqds, thread);
    }

    /* renamed from: a */
    public final boolean mo69128a(bqdt bqdt, bqdk bqdk, bqdk bqdk2) {
        return this.f140512d.compareAndSet(bqdt, bqdk, bqdk2);
    }

    /* renamed from: a */
    public final boolean mo69129a(bqdt bqdt, bqds bqds, bqds bqds2) {
        return this.f140511c.compareAndSet(bqdt, bqds, bqds2);
    }

    /* renamed from: a */
    public final boolean mo69130a(bqdt bqdt, Object obj, Object obj2) {
        return this.f140513e.compareAndSet(bqdt, obj, obj2);
    }
}
