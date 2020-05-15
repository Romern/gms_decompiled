package p000;

import java.util.concurrent.Callable;

/* renamed from: aree */
final /* synthetic */ class aree implements Callable {

    /* renamed from: a */
    private final areg f87503a;

    public aree(areg areg) {
        this.f87503a = areg;
    }

    public final Object call() {
        areg areg = this.f87503a;
        return Boolean.valueOf(areg.f87505a.f87061b.post(new aref(areg)));
    }
}
