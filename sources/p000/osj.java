package p000;

import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.IOException;

/* renamed from: osj */
final /* synthetic */ class osj implements Runnable {

    /* renamed from: a */
    private final osq f38321a;

    public osj(osq osq) {
        this.f38321a = osq;
    }

    public final void run() {
        osq osq = this.f38321a;
        osq.mo22567a();
        if (osq.f38337a.compareAndSet(false, true)) {
            bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
            d.mo68432a("osq", "g", 2187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Car setup no longer needed");
            try {
                osq.f38343g.close();
            } catch (IOException e) {
            }
            osq.f38339c.removeCallbacks(osq.f38338b);
            osq.f38340d.mo17423g();
            osq.f38349m.mo22838a();
        }
    }
}
