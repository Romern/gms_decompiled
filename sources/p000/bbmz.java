package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbmz */
final /* synthetic */ class bbmz implements bmxj {

    /* renamed from: a */
    private final bbnn f102939a;

    /* renamed from: b */
    private final AtomicReference f102940b;

    public bbmz(bbnn bbnn, AtomicReference atomicReference) {
        this.f102939a = bbnn;
        this.f102940b = atomicReference;
    }

    public final Object apply(Object obj) {
        bbnn bbnn = this.f102939a;
        AtomicReference atomicReference = this.f102940b;
        Void voidR = (Void) obj;
        bbnd bbnd = bbnn.f102961a;
        bbnd.getClass();
        return new bbnm(new bbnb(bbnd), bbnn.f102963c, bbnn.f102962b, (bbnu) atomicReference.get());
    }
}
