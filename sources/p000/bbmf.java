package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbmf */
final /* synthetic */ class bbmf implements bqeh {

    /* renamed from: a */
    private final bbmm f102902a;

    /* renamed from: b */
    private final AtomicReference f102903b;

    /* renamed from: c */
    private final btet f102904c;

    /* renamed from: d */
    private final AtomicReference f102905d;

    public bbmf(bbmm bbmm, AtomicReference atomicReference, btet btet, AtomicReference atomicReference2) {
        this.f102902a = bbmm;
        this.f102903b = atomicReference;
        this.f102904c = btet;
        this.f102905d = atomicReference2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbmm bbmm = this.f102902a;
        AtomicReference atomicReference = this.f102903b;
        btet btet = this.f102904c;
        AtomicReference atomicReference2 = this.f102905d;
        bbjt bbjt = (bbjt) obj;
        atomicReference.set(bbjt);
        return bqdx.m112673a(bqdx.m112674a(bbmm.f102915a.mo56180a(btet), new bblr(bbmm, bbjt), bqfb.INSTANCE), new bbma(atomicReference2), bqfb.INSTANCE);
    }
}
