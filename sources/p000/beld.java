package p000;

import java.util.concurrent.Callable;

/* renamed from: beld */
final /* synthetic */ class beld implements Callable {

    /* renamed from: a */
    private final bele f111754a;

    public beld(bele bele) {
        this.f111754a = bele;
    }

    public final Object call() {
        bele bele = this.f111754a;
        synchronized (bele.f111756b.f111764d) {
            bele.f111755a = null;
        }
        return null;
    }
}
