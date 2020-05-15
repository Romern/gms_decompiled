package p000;

import java.util.Iterator;

/* renamed from: qni */
final /* synthetic */ class qni implements Iterable {

    /* renamed from: a */
    private final qmk f41773a;

    /* renamed from: b */
    private final qmk f41774b;

    public qni(qmk qmk, qmk qmk2) {
        this.f41773a = qmk;
        this.f41774b = qmk2;
    }

    public final Iterator iterator() {
        return bnjr.m109610a(bnjr.m109609a(this.f41773a.f41709c.iterator(), qnj.f41775a), bnjr.m109609a(this.f41774b.f41709c.iterator(), qnk.f41776a));
    }
}
