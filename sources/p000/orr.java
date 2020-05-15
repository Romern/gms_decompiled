package p000;

import android.os.Bundle;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: orr */
public final /* synthetic */ class orr implements Runnable {

    /* renamed from: a */
    private final CarSetupServiceImpl f38294a;

    /* renamed from: b */
    private final Bundle f38295b;

    public orr(CarSetupServiceImpl carSetupServiceImpl, Bundle bundle) {
        this.f38294a = carSetupServiceImpl;
        this.f38295b = bundle;
    }

    public final void run() {
        CarSetupServiceImpl carSetupServiceImpl = this.f38294a;
        Bundle bundle = this.f38295b;
        bmxy.m108601b(((Boolean) carSetupServiceImpl.f29605v.mo6606a()).booleanValue(), "Unable to handoff car connection and not configured to fall back to GMS Core.");
        if (carSetupServiceImpl.mo17426j()) {
            carSetupServiceImpl.f29572K.post(new ort(carSetupServiceImpl, bundle));
        } else {
            carSetupServiceImpl.mo17411a(bundle);
        }
    }
}
