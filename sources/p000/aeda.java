package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aeda */
final /* synthetic */ class aeda implements bqeg {

    /* renamed from: a */
    private final aedj f63188a;

    /* renamed from: b */
    private final bbjr f63189b;

    /* renamed from: c */
    private final bbnn f63190c;

    /* renamed from: d */
    private final Executor f63191d;

    /* renamed from: e */
    private final int f63192e;

    public aeda(aedj aedj, bbjr bbjr, int i, bbnn bbnn, Executor executor) {
        this.f63188a = aedj;
        this.f63189b = bbjr;
        this.f63192e = i;
        this.f63190c = bbnn;
        this.f63191d = executor;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        aedj aedj = this.f63188a;
        bbjr bbjr = this.f63189b;
        int i = this.f63192e;
        bbnn bbnn = this.f63190c;
        Executor executor = this.f63191d;
        bqgg a = bqdf.m112619a(bqdx.m112674a(aedj.f63209b.mo34070a(), new aedb(bbnn), bqfb.INSTANCE), Exception.class, aedc.f63194a, bqfb.INSTANCE);
        AtomicReference atomicReference = new AtomicReference();
        bqgg a2 = bqdx.m112674a(bqdx.m112673a(a, new aedd(atomicReference), bqfb.INSTANCE), new aede(aedj, atomicReference, bbjr, i), executor);
        return bqga.m112783b(bqdx.m112674a(a2, new aedf(aedj, atomicReference, i), bqfb.INSTANCE), bqdf.m112620a(a2, Exception.class, new aedg(aedj, atomicReference, i), bqfb.INSTANCE)).mo69214a(new aedh(a2), bqfb.INSTANCE);
    }
}
