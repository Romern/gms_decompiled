package p000;

import android.content.ComponentName;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.display.CarRegionId;

/* renamed from: nql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nql extends niv {
    public nql(nip nip, ComponentName componentName) {
        super(nip, componentName);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final nij mo20845a(nin nin, nip nip, int i) {
        CarRegionId carRegionId = CarRegionId.f29494a;
        ccux.m131754c();
        oqa c = nip.mo20823c();
        ccux.m131754c();
        CarWindowLayoutParams carWindowLayoutParams = nin.f35747g;
        return new nqo(nip, this, c, carRegionId);
    }
}
