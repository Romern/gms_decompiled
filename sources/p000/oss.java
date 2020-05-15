package p000;

import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: oss */
final /* synthetic */ class oss implements Runnable {

    /* renamed from: a */
    private final osu f38360a;

    /* renamed from: b */
    private final boolean f38361b;

    /* renamed from: c */
    private final pbp f38362c;

    public oss(osu osu, boolean z, pbp pbp) {
        this.f38360a = osu;
        this.f38361b = z;
        this.f38362c = pbp;
    }

    public final void run() {
        osu osu = this.f38360a;
        boolean z = this.f38361b;
        pbp pbp = this.f38362c;
        if (!z) {
            CarSetupServiceImpl carSetupServiceImpl = osu.f38366a;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            CarInfoInternal carInfoInternal = carSetupServiceImpl.f29595l;
            if (!pbp.mo22889b(carInfoInternal)) {
                pbp.mo22888b(carInfoInternal, "allowedcars");
                pbp.mo22886a(carInfoInternal, "rejectedcars");
            }
        } else {
            CarSetupServiceImpl carSetupServiceImpl2 = osu.f38366a;
            bnsn bnsn2 = CarSetupServiceImpl.f29560a;
            CarInfoInternal carInfoInternal2 = carSetupServiceImpl2.f29595l;
            if (!pbp.mo22885a(carInfoInternal2)) {
                pbp.mo22888b(carInfoInternal2, "rejectedcars");
                pbp.mo22886a(carInfoInternal2, "allowedcars");
            }
        }
        osu.f38366a.mo17421e();
    }
}
