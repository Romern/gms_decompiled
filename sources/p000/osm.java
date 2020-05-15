package p000;

import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: osm */
final /* synthetic */ class osm implements Runnable {

    /* renamed from: a */
    private final osq f38329a;

    public osm(osq osq) {
        this.f38329a = osq;
    }

    public final void run() {
        osq osq = this.f38329a;
        osq.f38339c.removeCallbacks(osq.f38338b);
        CarSetupServiceImpl carSetupServiceImpl = osq.f38340d;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        carSetupServiceImpl.f29594k.mo22638e();
    }
}
