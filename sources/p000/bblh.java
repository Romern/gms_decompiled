package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bblh */
final /* synthetic */ class bblh implements bmxj {

    /* renamed from: a */
    private final bblp f102850a;

    /* renamed from: b */
    private final AtomicReference f102851b;

    /* renamed from: c */
    private final AtomicReference f102852c;

    public bblh(bblp bblp, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.f102850a = bblp;
        this.f102851b = atomicReference;
        this.f102852c = atomicReference2;
    }

    public final Object apply(Object obj) {
        bblp bblp = this.f102850a;
        AtomicReference atomicReference = this.f102851b;
        AtomicReference atomicReference2 = this.f102852c;
        bblp.mo56202a((bbjt) atomicReference.get(), (bbjt) obj);
        return (btew) atomicReference2.get();
    }
}
