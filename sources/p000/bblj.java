package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bblj */
final /* synthetic */ class bblj implements bmxj {

    /* renamed from: a */
    private final bblp f102857a;

    /* renamed from: b */
    private final AtomicReference f102858b;

    /* renamed from: c */
    private final AtomicReference f102859c;

    public bblj(bblp bblp, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.f102857a = bblp;
        this.f102858b = atomicReference;
        this.f102859c = atomicReference2;
    }

    public final Object apply(Object obj) {
        bblp bblp = this.f102857a;
        AtomicReference atomicReference = this.f102858b;
        AtomicReference atomicReference2 = this.f102859c;
        bblp.mo56202a((bbjt) atomicReference.get(), (bbjt) obj);
        return (bteu) atomicReference2.get();
    }
}
