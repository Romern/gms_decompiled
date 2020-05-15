package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: bqed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqed extends bqec {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater f140541a;

    /* renamed from: b */
    final AtomicIntegerFieldUpdater f140542b;

    /* renamed from: a */
    public final int mo69161a(bqef bqef) {
        return this.f140542b.decrementAndGet(bqef);
    }

    public bqed(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f140541a = atomicReferenceFieldUpdater;
        this.f140542b = atomicIntegerFieldUpdater;
    }

    /* renamed from: a */
    public final void mo69162a(bqef bqef, Set set) {
        this.f140541a.compareAndSet(bqef, null, set);
    }
}
