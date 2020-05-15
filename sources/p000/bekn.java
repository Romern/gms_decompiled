package p000;

import java.util.concurrent.Executor;

/* renamed from: bekn */
final /* synthetic */ class bekn implements bqeg {

    /* renamed from: a */
    private final bekv f111722a;

    /* renamed from: b */
    private final bqgg f111723b;

    /* renamed from: c */
    private final bqeh f111724c;

    /* renamed from: d */
    private final Executor f111725d;

    public bekn(bekv bekv, bqgg bqgg, bqeh bqeh, Executor executor) {
        this.f111722a = bekv;
        this.f111723b = bqgg;
        this.f111724c = bqeh;
        this.f111725d = executor;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bekv bekv = this.f111722a;
        bqgg bqgg = this.f111723b;
        bqeh bqeh = this.f111724c;
        Executor executor = this.f111725d;
        bqgg a = bqdx.m112674a(bqgg, new beko(bekv), bqfb.INSTANCE);
        bqgg a2 = bqdx.m112674a(a, bqeh, executor);
        return bqdx.m112674a(a2, bljx.m107266a(new bekq(bekv, a, a2)), bqfb.INSTANCE);
    }
}
