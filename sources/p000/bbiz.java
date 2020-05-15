package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbiz */
final /* synthetic */ class bbiz implements bqeh {

    /* renamed from: a */
    private final AtomicReference f102762a;

    public bbiz(AtomicReference atomicReference) {
        this.f102762a = atomicReference;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Void voidR = (Void) obj;
        bqgg bqgg = (bqgg) this.f102762a.get();
        bmxy.m108582a(bqgg, "If update was successful, new value should have been captured!");
        return bqgg;
    }
}
