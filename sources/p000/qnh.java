package p000;

import java.util.Iterator;

/* renamed from: qnh */
final /* synthetic */ class qnh implements Iterable {

    /* renamed from: a */
    private final qmk f41771a;

    /* renamed from: b */
    private final qmk f41772b;

    public qnh(qmk qmk, qmk qmk2) {
        this.f41771a = qmk;
        this.f41772b = qmk2;
    }

    public final Iterator iterator() {
        return bnjr.m109610a(this.f41771a.f41707a.iterator(), this.f41772b.f41707a.iterator());
    }
}
