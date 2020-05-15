package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bqfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqfj {

    /* renamed from: a */
    private final AtomicReference f140599a = new AtomicReference(bqga.m112775a((Object) null));

    private bqfj() {
    }

    /* renamed from: a */
    public static bqfj m112745a() {
        return new bqfj();
    }

    /* renamed from: a */
    public final bqgg mo69205a(bqeg bqeg, Executor executor) {
        bmxy.m108581a(bqeg);
        AtomicReference atomicReference = new AtomicReference(bqfi.NOT_RUN);
        bqff bqff = new bqff(atomicReference, bqeg);
        bqgy c = bqgy.m112818c();
        bqgg bqgg = (bqgg) this.f140599a.getAndSet(c);
        bqgg a = bqga.m112771a(bqff, new bqfg(bqgg, executor));
        bqgg a2 = bqga.m112772a(a);
        bqfh bqfh = new bqfh(a, a2, atomicReference, c, bqgg);
        a2.mo741a(bqfh, bqfb.INSTANCE);
        a.mo741a(bqfh, bqfb.INSTANCE);
        return a2;
    }
}
