package p000;

import java.util.List;

/* renamed from: buri */
final /* synthetic */ class buri implements Runnable {

    /* renamed from: a */
    private final List f154767a;

    /* renamed from: b */
    private final busc f154768b;

    public buri(busc busc, List list) {
        this.f154768b = busc;
        this.f154767a = list;
    }

    public final void run() {
        busc busc = this.f154768b;
        List list = this.f154767a;
        if (busc.f154807a != null) {
            busc.f154808b.mo29352a(list);
        }
    }
}
