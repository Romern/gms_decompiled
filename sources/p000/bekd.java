package p000;

import java.util.concurrent.Future;

/* renamed from: bekd */
final /* synthetic */ class bekd implements bqeh {

    /* renamed from: a */
    private final bekk f111696a;

    /* renamed from: b */
    private final bqgg f111697b;

    /* renamed from: c */
    private final bqgg f111698c;

    public bekd(bekk bekk, bqgg bqgg, bqgg bqgg2) {
        this.f111696a = bekk;
        this.f111697b = bqgg;
        this.f111698c = bqgg2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bekk bekk = this.f111696a;
        bqgg bqgg = this.f111697b;
        bqgg bqgg2 = this.f111698c;
        if (bqga.m112780a((Future) bqgg).equals(bqga.m112780a((Future) bqgg2))) {
            return bqga.m112775a((Object) null);
        }
        return bqdx.m112674a(bekk.f111714f.mo60742a(bekk.f111710b), bljx.m107266a(new beke(bekk, bqgg2)), bqfb.INSTANCE);
    }
}
