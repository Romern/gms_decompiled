package p000;

import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: ose */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ose implements ojl {

    /* renamed from: a */
    final /* synthetic */ CarSetupServiceImpl f38310a;

    public ose(CarSetupServiceImpl carSetupServiceImpl) {
        this.f38310a = carSetupServiceImpl;
    }

    /* renamed from: a */
    public final void mo21210a() {
        this.f38310a.f29598o.mo22788b(biva.SENSOR_DRIVING_STATUS_DATA.f121920w, 0);
        if (ccql.m131269d()) {
            ofd.m28611a(this.f38310a, "com.google.android.gms.car.FRX", ofa.STARTED);
        }
        this.f38310a.f29594k.mo22632b();
    }

    /* renamed from: a */
    public final boolean mo21211a(ofs ofs, int i) {
        return true;
    }
}
