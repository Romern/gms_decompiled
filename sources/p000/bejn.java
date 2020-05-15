package p000;

import java.util.List;
import java.util.concurrent.Future;

/* renamed from: bejn */
final /* synthetic */ class bejn implements bqeg {

    /* renamed from: a */
    private final bejp f111662a;

    /* renamed from: b */
    private final bxxc f111663b;

    /* renamed from: c */
    private final int f111664c;

    /* renamed from: d */
    private final List f111665d;

    public bejn(bejp bejp, bxxc bxxc, int i, List list) {
        this.f111662a = bejp;
        this.f111663b = bxxc;
        this.f111664c = i;
        this.f111665d = list;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bejp bejp = this.f111662a;
        bxxc bxxc = this.f111663b;
        int i = this.f111664c;
        List list = this.f111665d;
        bqgg a = bqga.m112775a(bxxc);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) bqga.m112780a((Future) list.get(i2))).booleanValue()) {
                a = bqdx.m112674a(a, bljx.m107266a(new bejo((belw) bejp.f111667a.get(i2))), bqfb.INSTANCE);
            }
        }
        return a;
    }
}
