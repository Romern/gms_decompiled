package p000;

import java.util.concurrent.Callable;

/* renamed from: njw */
final /* synthetic */ class njw implements Callable {

    /* renamed from: a */
    private final nkq f35871a;

    public njw(nkq nkq) {
        this.f35871a = nkq;
    }

    public final Object call() {
        nyj nyj = this.f35871a.f35906h;
        boolean z = false;
        if (nyj != null && nyj.mo21844b()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
