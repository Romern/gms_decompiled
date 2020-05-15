package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bblq */
final /* synthetic */ class bblq implements bqeh {

    /* renamed from: a */
    private final bbmm f102874a;

    /* renamed from: b */
    private final AtomicReference f102875b;

    /* renamed from: c */
    private final int f102876c;

    public bblq(bbmm bbmm, AtomicReference atomicReference, int i) {
        this.f102874a = bbmm;
        this.f102875b = atomicReference;
        this.f102876c = i;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbmm bbmm = this.f102874a;
        AtomicReference atomicReference = this.f102875b;
        int i = this.f102876c;
        bbjt bbjt = (bbjt) obj;
        atomicReference.set(bbjt);
        return bqdx.m112674a(bbmm.f102915a.mo56179a(i), new bbmj(bbmm, bbjt), bqfb.INSTANCE);
    }
}
