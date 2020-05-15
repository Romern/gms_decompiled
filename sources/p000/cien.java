package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: cien */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cien extends ciem {

    /* renamed from: a */
    private final AtomicIntegerFieldUpdater f189968a;

    /* renamed from: a */
    public final boolean mo86010a(ciep ciep) {
        return this.f189968a.compareAndSet(ciep, 0, -1);
    }

    /* renamed from: b */
    public final void mo86011b(ciep ciep) {
        this.f189968a.set(ciep, 0);
    }

    public cien(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f189968a = atomicIntegerFieldUpdater;
    }
}
