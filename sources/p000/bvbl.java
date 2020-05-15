package p000;

import java.util.concurrent.Callable;

/* renamed from: bvbl */
final /* synthetic */ class bvbl implements Callable {

    /* renamed from: a */
    private final bvbq f155540a;

    /* renamed from: b */
    private final buqh f155541b;

    /* renamed from: c */
    private final bvbk f155542c;

    /* renamed from: d */
    private final bvat f155543d;

    public bvbl(bvbq bvbq, buqh buqh, bvbk bvbk, bvat bvat) {
        this.f155540a = bvbq;
        this.f155541b = buqh;
        this.f155542c = bvbk;
        this.f155543d = bvat;
    }

    public final Object call() {
        bvbq bvbq = this.f155540a;
        buqh buqh = this.f155541b;
        bvbk bvbk = this.f155542c;
        bvat bvat = this.f155543d;
        buqh.mo72984b();
        bvbq.f155554d.set(1);
        bvbk.mo73129a(bvat, bvbq.f155556f);
        return null;
    }
}
