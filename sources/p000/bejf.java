package p000;

import java.util.concurrent.Future;

/* renamed from: bejf */
final /* synthetic */ class bejf implements bqeh {

    /* renamed from: a */
    private final bejk f111641a;

    /* renamed from: b */
    private final bqgg f111642b;

    /* renamed from: c */
    private final bqgg f111643c;

    public bejf(bejk bejk, bqgg bqgg, bqgg bqgg2) {
        this.f111641a = bejk;
        this.f111642b = bqgg;
        this.f111643c = bqgg2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bejk bejk = this.f111641a;
        bqgg bqgg = this.f111642b;
        bqgg bqgg2 = this.f111643c;
        bxxc bxxc = (bxxc) obj;
        if (((bxxc) bqga.m112780a((Future) bqgg)).equals(bqga.m112780a((Future) bqgg2))) {
            return bqga.m112775a((Object) null);
        }
        return bqdx.m112674a(bqgg2, bljx.m107266a(new bejg(bejk)), bejk.f111651c);
    }
}
