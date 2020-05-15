package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bqff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqff implements bqeg {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f140586a;

    /* renamed from: b */
    final /* synthetic */ bqeg f140587b;

    public bqff(AtomicReference atomicReference, bqeg bqeg) {
        this.f140586a = atomicReference;
        this.f140587b = bqeg;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        if (!this.f140586a.compareAndSet(bqfi.NOT_RUN, bqfi.STARTED)) {
            return bqga.m112770a();
        }
        return this.f140587b.mo7073a();
    }

    public final String toString() {
        return this.f140587b.toString();
    }
}
