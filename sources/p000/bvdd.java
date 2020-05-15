package p000;

import java.util.concurrent.Callable;

/* renamed from: bvdd */
final /* synthetic */ class bvdd implements Callable {

    /* renamed from: a */
    private final bvdc f155640a;

    /* renamed from: b */
    private final bvat f155641b;

    public bvdd(bvdc bvdc, bvat bvat) {
        this.f155640a = bvdc;
        this.f155641b = bvat;
    }

    public final Object call() {
        bvdc bvdc = this.f155640a;
        bvat bvat = this.f155641b;
        int i = bvdi.f155648g;
        return bvdc.mo73118a(bvat);
    }
}
