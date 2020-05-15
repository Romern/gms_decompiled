package p000;

import java.util.concurrent.Callable;

/* renamed from: njv */
final /* synthetic */ class njv implements Callable {

    /* renamed from: a */
    private final nkq f35870a;

    public njv(nkq nkq) {
        this.f35870a = nkq;
    }

    public final Object call() {
        nyj nyj = this.f35870a.f35906h;
        boolean z = false;
        if (nyj != null && nyj.mo21843a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
