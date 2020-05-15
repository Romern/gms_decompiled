package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbli */
final /* synthetic */ class bbli implements bqeh {

    /* renamed from: a */
    private final bblp f102853a;

    /* renamed from: b */
    private final AtomicReference f102854b;

    /* renamed from: c */
    private final btet f102855c;

    /* renamed from: d */
    private final AtomicReference f102856d;

    public bbli(bblp bblp, AtomicReference atomicReference, btet btet, AtomicReference atomicReference2) {
        this.f102853a = bblp;
        this.f102854b = atomicReference;
        this.f102855c = btet;
        this.f102856d = atomicReference2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bblp bblp = this.f102853a;
        AtomicReference atomicReference = this.f102854b;
        btet btet = this.f102855c;
        AtomicReference atomicReference2 = this.f102856d;
        bbjt bbjt = (bbjt) obj;
        atomicReference.set(bbjt);
        return bqdx.m112673a(bqdx.m112674a(bblp.f102866a.mo56180a(btet), new bbku(bblp, bbjt), bqfb.INSTANCE), new bbld(atomicReference2), bqfb.INSTANCE);
    }
}
