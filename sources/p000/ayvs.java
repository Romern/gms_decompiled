package p000;

import java.util.concurrent.Future;

/* renamed from: ayvs */
final /* synthetic */ class ayvs implements bqeg {

    /* renamed from: a */
    private final ayvx f98577a;

    /* renamed from: b */
    private final bqgy f98578b;

    /* renamed from: c */
    private final bqgg f98579c;

    public ayvs(ayvx ayvx, bqgy bqgy, bqgg bqgg) {
        this.f98577a = ayvx;
        this.f98578b = bqgy;
        this.f98579c = bqgg;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        boolean z;
        ayvx ayvx = this.f98577a;
        bqgy bqgy = this.f98578b;
        bqgg bqgg = this.f98579c;
        long longValue = ((Long) bqga.m112780a((Future) bqgy)).longValue();
        if (ayvx.f98586a == -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Duration set more than once");
        ayvx.f98586a = longValue;
        return bqgg;
    }
}
