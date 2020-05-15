package p000;

import java.util.concurrent.Callable;

/* renamed from: afwy */
public final /* synthetic */ class afwy implements Callable {

    /* renamed from: a */
    private final bngx f64901a;

    public afwy(bngx bngx) {
        this.f64901a = bngx;
    }

    public final Object call() {
        bngx bngx = this.f64901a;
        bnsn bnsn = afxa.f64903a;
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            ((bqgg) i.next()).get();
        }
        return null;
    }
}
