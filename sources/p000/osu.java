package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.util.concurrent.ExecutorService;

/* renamed from: osu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class osu implements otv {

    /* renamed from: a */
    public final CarSetupServiceImpl f38366a;

    /* renamed from: b */
    private final pbn f38367b;

    public osu(CarSetupServiceImpl carSetupServiceImpl, pbn pbn) {
        this.f38366a = carSetupServiceImpl;
        this.f38367b = pbn;
    }

    /* renamed from: a */
    public final void mo22586a() {
        CarSetupServiceImpl carSetupServiceImpl = this.f38366a;
        asfb asfb = carSetupServiceImpl.f29587d;
        if (asfb != null) {
            asfb.mo49120c();
            carSetupServiceImpl.f29587d = null;
        }
    }

    /* renamed from: b */
    public final void mo22588b() {
        if (ccql.m131269d()) {
            ofd.m28611a(this.f38366a, "com.google.android.gms.car.FRX", ofa.COMPLETED);
        }
        CarSetupServiceImpl carSetupServiceImpl = this.f38366a;
        if (ccql.m131269d()) {
            ofd.m28611a(carSetupServiceImpl, "com.google.android.gms.car.AUTHORIZATION", ofa.COMPLETED);
        }
        if (carSetupServiceImpl.mo17425i()) {
            carSetupServiceImpl.f29570I.mo22581f();
        } else {
            try {
                Bundle bundle = new Bundle();
                carSetupServiceImpl.f29589f.mo22221b(bundle);
                carSetupServiceImpl.f29596m.f29611a.mo22654a(bundle);
            } catch (RemoteException e) {
            }
        }
        carSetupServiceImpl.f29596m = null;
        carSetupServiceImpl.f29594k = null;
        carSetupServiceImpl.mo17423g();
    }

    /* renamed from: c */
    public final void mo22590c() {
        CarSetupServiceImpl carSetupServiceImpl = this.f38366a;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        carSetupServiceImpl.mo17422f();
    }

    /* renamed from: d */
    public final void mo22592d() {
        if (!this.f38367b.mo22878d()) {
            this.f38366a.mo17421e();
        }
    }

    /* renamed from: a */
    public final void mo22587a(boolean z) {
        if (ccql.m131269d()) {
            ofd.m28611a(this.f38366a, "com.google.android.gms.car.FRX", ofa.FAILED);
        }
        CarSetupServiceImpl carSetupServiceImpl = this.f38366a;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        carSetupServiceImpl.mo17416a(z);
    }

    /* renamed from: c */
    public final void mo22591c(boolean z) {
        bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
        d.mo68432a("osu", "c", 2373, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Received BTAuthorization update: %s", Boolean.valueOf(z));
        if (this.f38367b.mo22878d()) {
            this.f38366a.f29570I.mo22575a(this.f38366a.f29595l.f29554p, z);
            this.f38366a.f29595l.f29541c = z;
            return;
        }
        pbp d2 = this.f38366a.mo17420d();
        ExecutorService a = nzh.m28223a();
        a.execute(new ost(this, d2, z));
        a.shutdown();
    }

    /* renamed from: b */
    public final void mo22589b(boolean z) {
        bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
        d.mo68432a("osu", "b", 2344, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Received projectionAuthorization update: %s", Boolean.valueOf(z));
        if (this.f38367b.mo22878d()) {
            this.f38366a.f29570I.mo22575a(z, this.f38366a.f29595l.f29541c);
            this.f38366a.f29595l.f29554p = z;
            return;
        }
        pbp d2 = this.f38366a.mo17420d();
        ExecutorService a = nzh.m28223a();
        a.execute(new oss(this, z, d2));
        a.shutdown();
    }
}
