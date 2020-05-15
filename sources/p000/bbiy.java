package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbiy */
final /* synthetic */ class bbiy implements bqeh {

    /* renamed from: a */
    private final bqeh f102760a;

    /* renamed from: b */
    private final AtomicReference f102761b;

    public bbiy(bqeh bqeh, AtomicReference atomicReference) {
        this.f102760a = bqeh;
        this.f102761b = atomicReference;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqeh bqeh = this.f102760a;
        AtomicReference atomicReference = this.f102761b;
        bqgg a = bqeh.mo6375a((bxxc) obj);
        atomicReference.set(a);
        return a;
    }
}
