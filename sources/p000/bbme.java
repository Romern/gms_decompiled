package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbme */
final /* synthetic */ class bbme implements bmxj {

    /* renamed from: a */
    private final bbmm f102899a;

    /* renamed from: b */
    private final AtomicReference f102900b;

    /* renamed from: c */
    private final AtomicReference f102901c;

    public bbme(bbmm bbmm, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.f102899a = bbmm;
        this.f102900b = atomicReference;
        this.f102901c = atomicReference2;
    }

    public final Object apply(Object obj) {
        bbmm bbmm = this.f102899a;
        AtomicReference atomicReference = this.f102900b;
        AtomicReference atomicReference2 = this.f102901c;
        bbjp b = bbjq.m88104b((btew) atomicReference.get());
        b.f102772c = bbmm.mo56211a((bbjt) atomicReference2.get(), (bbjt) obj);
        return b.mo56173a();
    }
}
