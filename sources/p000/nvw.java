package p000;

import com.google.android.gms.car.CarSensorEvent;

/* renamed from: nvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nvw extends nsq {

    /* renamed from: a */
    final /* synthetic */ nvx f36696a;

    /* renamed from: b */
    private int f36697b = 31;

    public nvw(nvx nvx) {
        this.f36696a = nvx;
    }

    /* renamed from: a */
    public final void mo21436a(CarSensorEvent carSensorEvent) {
        byte b;
        nvx nvx = this.f36696a;
        int i = nvx.f36698h;
        nmi nmi = nvx.f36705f;
        if (nmi != null && nmi.mo21151b() && this.f36697b != (b = carSensorEvent.f29367e[0])) {
            this.f36697b = b;
            if ((b & 8) == 0) {
                this.f36696a.mo21729a();
            } else {
                this.f36696a.mo21732b();
            }
        }
    }
}
