package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ahx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahx extends ahs {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater f573a;

    /* renamed from: b */
    final AtomicReferenceFieldUpdater f574b;

    /* renamed from: c */
    final AtomicReferenceFieldUpdater f575c;

    /* renamed from: d */
    final AtomicReferenceFieldUpdater f576d;

    /* renamed from: e */
    final AtomicReferenceFieldUpdater f577e;

    /* renamed from: a */
    public final void mo732a(aia aia, aia aia2) {
        this.f574b.lazySet(aia, aia2);
    }

    public ahx(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f573a = atomicReferenceFieldUpdater;
        this.f574b = atomicReferenceFieldUpdater2;
        this.f575c = atomicReferenceFieldUpdater3;
        this.f576d = atomicReferenceFieldUpdater4;
        this.f577e = atomicReferenceFieldUpdater5;
    }

    /* renamed from: a */
    public final void mo733a(aia aia, Thread thread) {
        this.f573a.lazySet(aia, thread);
    }

    /* renamed from: a */
    public final boolean mo734a(aib aib, ahw ahw, ahw ahw2) {
        return this.f576d.compareAndSet(aib, ahw, ahw2);
    }

    /* renamed from: a */
    public final boolean mo735a(aib aib, aia aia, aia aia2) {
        return this.f575c.compareAndSet(aib, aia, aia2);
    }

    /* renamed from: a */
    public final boolean mo736a(aib aib, Object obj, Object obj2) {
        return this.f577e.compareAndSet(aib, obj, obj2);
    }
}
