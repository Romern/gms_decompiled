package p000;

import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.IOException;
import java.util.List;

/* renamed from: osl */
final /* synthetic */ class osl implements Runnable {

    /* renamed from: a */
    private final osq f38323a;

    /* renamed from: b */
    private final boolean f38324b;

    /* renamed from: c */
    private final List f38325c;

    /* renamed from: d */
    private final bivd f38326d;

    /* renamed from: e */
    private final CarInfoInternal f38327e;

    /* renamed from: f */
    private final int f38328f;

    public osl(osq osq, boolean z, List list, bivd bivd, CarInfoInternal carInfoInternal, int i) {
        this.f38323a = osq;
        this.f38324b = z;
        this.f38325c = list;
        this.f38326d = bivd;
        this.f38327e = carInfoInternal;
        this.f38328f = i;
    }

    public final void run() {
        osq osq = this.f38323a;
        boolean z = this.f38324b;
        List list = this.f38325c;
        bivd bivd = this.f38326d;
        CarInfoInternal carInfoInternal = this.f38327e;
        int i = this.f38328f;
        try {
            osq.f38343g.close();
        } catch (IOException e) {
        }
        if (z) {
            bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
            d.mo68432a("osq", "a", 2026, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("Handoff success with %d", list.size());
            osq.f38340d.mo17413a(carInfoInternal, bivd.f121962n);
            return;
        }
        bnsi b = CarSetupServiceImpl.f29560a.mo68387b();
        b.mo68432a("osq", "a", 2032, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68409a("Handoff failed with %d", i);
    }
}
