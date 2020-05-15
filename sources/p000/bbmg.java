package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbmg */
final /* synthetic */ class bbmg implements bmxj {

    /* renamed from: a */
    private final bbmm f102906a;

    /* renamed from: b */
    private final AtomicReference f102907b;

    /* renamed from: c */
    private final AtomicReference f102908c;

    public bbmg(bbmm bbmm, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.f102906a = bbmm;
        this.f102907b = atomicReference;
        this.f102908c = atomicReference2;
    }

    public final Object apply(Object obj) {
        bbmm bbmm = this.f102906a;
        AtomicReference atomicReference = this.f102907b;
        AtomicReference atomicReference2 = this.f102908c;
        bbjp b = bbjq.m88104b((bteu) atomicReference.get());
        b.f102772c = bbmm.mo56211a((bbjt) atomicReference2.get(), (bbjt) obj);
        return b.mo56173a();
    }
}
