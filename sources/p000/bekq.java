package p000;

import java.util.concurrent.Future;

/* renamed from: bekq */
final /* synthetic */ class bekq implements bqeh {

    /* renamed from: a */
    private final bekv f111728a;

    /* renamed from: b */
    private final bqgg f111729b;

    /* renamed from: c */
    private final bqgg f111730c;

    public bekq(bekv bekv, bqgg bqgg, bqgg bqgg2) {
        this.f111728a = bekv;
        this.f111729b = bqgg;
        this.f111730c = bqgg2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bekv bekv = this.f111728a;
        bqgg bqgg = this.f111729b;
        bqgg bqgg2 = this.f111730c;
        if (bqga.m112780a((Future) bqgg).equals(bqga.m112780a((Future) bqgg2))) {
            return bqga.m112775a((Object) null);
        }
        return bqdx.m112674a(bqgg2, bljx.m107266a(new bekr(bekv, bqgg2)), bekv.f111739d);
    }
}
