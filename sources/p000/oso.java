package p000;

import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: oso */
final /* synthetic */ class oso implements Runnable {

    /* renamed from: a */
    private final osq f38334a;

    /* renamed from: b */
    private final omi f38335b;

    public oso(osq osq, omi omi) {
        this.f38334a = osq;
        this.f38335b = omi;
    }

    public final void run() {
        osq osq = this.f38334a;
        omi omi = this.f38335b;
        if (omi == null) {
            osq.f38340d.mo17418b(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.NO_SENSORS, "No sensors");
        } else if (osq.f38350n) {
            CarSetupServiceImpl carSetupServiceImpl = osq.f38340d;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            carSetupServiceImpl.f29573L.mo22736a(omi);
            otw otw = osq.f38340d.f29594k;
            if (otw != null) {
                otw.mo22632b();
            }
        }
    }
}
