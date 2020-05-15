package p000;

import android.os.Bundle;
import com.google.android.gms.car.display.CarRegionId;

/* renamed from: niq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class niq {

    /* renamed from: a */
    public String f35751a;

    /* renamed from: b */
    public int f35752b;

    /* renamed from: c */
    public int f35753c;

    public niq() {
    }

    public niq(Bundle bundle) {
        this.f35751a = bundle.getString("com.google.android.gms.car.CarActivityOptions.packageName");
        bundle.getInt("com.google.android.gms.car.CarActivityOptions.animType");
        this.f35752b = bundle.getInt("com.google.android.gms.car.CarActivityOptions.enterResId", 0);
        this.f35753c = bundle.getInt("com.google.android.gms.car.CarActivityOptions.exitResId", 0);
        byte[] byteArray = bundle.getByteArray("com.google.android.gms.car.CarActivityOptions.launchRegionId");
        if (byteArray != null && byteArray.length > 0) {
            CarRegionId carRegionId = (CarRegionId) sef.m35069a(byteArray, CarRegionId.CREATOR);
        }
    }
}
