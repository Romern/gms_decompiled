package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbmd */
final /* synthetic */ class bbmd implements bqeh {

    /* renamed from: a */
    private final bbmm f102895a;

    /* renamed from: b */
    private final AtomicReference f102896b;

    /* renamed from: c */
    private final btev f102897c;

    /* renamed from: d */
    private final AtomicReference f102898d;

    public bbmd(bbmm bbmm, AtomicReference atomicReference, btev btev, AtomicReference atomicReference2) {
        this.f102895a = bbmm;
        this.f102896b = atomicReference;
        this.f102897c = btev;
        this.f102898d = atomicReference2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbmm bbmm = this.f102895a;
        AtomicReference atomicReference = this.f102896b;
        btev btev = this.f102897c;
        AtomicReference atomicReference2 = this.f102898d;
        bbjt bbjt = (bbjt) obj;
        atomicReference.set(bbjt);
        return bqdx.m112673a(bqdx.m112674a(bbmm.f102915a.mo56181a(btev), new bbmk(bbmm, bbjt), bqfb.INSTANCE), new bbmc(atomicReference2), bqfb.INSTANCE);
    }
}
