package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bblg */
final /* synthetic */ class bblg implements bqeh {

    /* renamed from: a */
    private final bblp f102846a;

    /* renamed from: b */
    private final AtomicReference f102847b;

    /* renamed from: c */
    private final btev f102848c;

    /* renamed from: d */
    private final AtomicReference f102849d;

    public bblg(bblp bblp, AtomicReference atomicReference, btev btev, AtomicReference atomicReference2) {
        this.f102846a = bblp;
        this.f102847b = atomicReference;
        this.f102848c = btev;
        this.f102849d = atomicReference2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bblp bblp = this.f102846a;
        AtomicReference atomicReference = this.f102847b;
        btev btev = this.f102848c;
        AtomicReference atomicReference2 = this.f102849d;
        bbjt bbjt = (bbjt) obj;
        atomicReference.set(bbjt);
        return bqdx.m112673a(bqdx.m112674a(bblp.f102866a.mo56181a(btev), new bbln(bblp, bbjt), bqfb.INSTANCE), new bblf(atomicReference2), bqfb.INSTANCE);
    }
}
