package p000;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: hct */
final /* synthetic */ class hct implements Callable {

    /* renamed from: a */
    private final hdf f19478a;

    public hct(hdf hdf) {
        this.f19478a = hdf;
    }

    public final Object call() {
        hdf hdf = this.f19478a;
        hdf.f19518x = hea.m14254a(hdf.getContext().getApplicationContext(), hdf.f19497c, hdf.f19506l, new ArrayList(hdf.f19509o), hdf.f19505k, hdf.f19503i);
        return bmxv.m108566b(adcq.SET_DEFAULT_ACCOUNT);
    }
}
