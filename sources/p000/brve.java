package p000;

import java.util.concurrent.Callable;

/* renamed from: brve */
final /* synthetic */ class brve implements Callable {

    /* renamed from: a */
    private final brvh f143441a;

    /* renamed from: b */
    private final brvg f143442b;

    public brve(brvh brvh, brvg brvg) {
        this.f143441a = brvh;
        this.f143442b = brvg;
    }

    public final Object call() {
        bruz b;
        brvh brvh = this.f143441a;
        brvg brvg = this.f143442b;
        synchronized (brvh.f143446a) {
            brvh.mo70004a(brvh.mo70003a(brvg));
            b = brvh.mo70005b(brvg);
        }
        return b;
    }
}
