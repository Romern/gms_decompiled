package p000;

import android.os.Bundle;
import com.google.android.gms.car.CarChimeraService;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;

/* renamed from: nlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nlc extends oly {

    /* renamed from: a */
    final /* synthetic */ CarChimeraService f35941a;

    public nlc(CarChimeraService carChimeraService) {
        this.f35941a = carChimeraService;
    }

    /* renamed from: a */
    public final CarInfo mo21015a() {
        return this.f35941a.f29309b.mo21346p();
    }

    /* renamed from: b */
    public final CarUiInfo mo21017b() {
        return this.f35941a.f29309b.mo21349s();
    }

    /* renamed from: a */
    public final boolean mo21016a(Bundle bundle) {
        return bundle.containsKey("client_name") && "car-1-0".equals(bundle.getString("client_name"));
    }
}
