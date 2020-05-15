package p000;

import android.os.Bundle;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: ort */
final /* synthetic */ class ort implements Runnable {

    /* renamed from: a */
    private final CarSetupServiceImpl f38298a;

    /* renamed from: b */
    private final Bundle f38299b;

    public ort(CarSetupServiceImpl carSetupServiceImpl, Bundle bundle) {
        this.f38298a = carSetupServiceImpl;
        this.f38299b = bundle;
    }

    public final void run() {
        this.f38298a.mo17411a(this.f38299b);
    }
}
