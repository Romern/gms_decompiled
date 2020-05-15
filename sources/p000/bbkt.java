package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbkt */
final /* synthetic */ class bbkt implements bqeh {

    /* renamed from: a */
    private final bblp f102825a;

    /* renamed from: b */
    private final AtomicReference f102826b;

    /* renamed from: c */
    private final int f102827c;

    public bbkt(bblp bblp, AtomicReference atomicReference, int i) {
        this.f102825a = bblp;
        this.f102826b = atomicReference;
        this.f102827c = i;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bblp bblp = this.f102825a;
        AtomicReference atomicReference = this.f102826b;
        int i = this.f102827c;
        bbjt bbjt = (bbjt) obj;
        atomicReference.set(bbjt);
        return bqdx.m112674a(bblp.f102866a.mo56179a(i), new bblm(bblp, bbjt), bqfb.INSTANCE);
    }
}
