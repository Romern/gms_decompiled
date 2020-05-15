package p000;

import java.util.concurrent.Callable;

/* renamed from: adew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adew implements Callable {

    /* renamed from: a */
    private final adex f61535a;

    public adew(adex adex) {
        this.f61535a = adex;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bxxc a = this.f61535a.mo33395a();
        if (a != null) {
            adfs adfs = adey.f61536a;
            new Object[1][0] = a;
            return a;
        }
        adey.f61536a.mo33426b("Received null network response", new Object[0]);
        throw new chuw(chuv.f189217d);
    }
}
