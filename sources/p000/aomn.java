package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.sharebox.Circle;

/* renamed from: aomn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aomn implements rkl {

    /* renamed from: a */
    final /* synthetic */ aomu f78482a;

    public aomn(aomu aomu) {
        this.f78482a = aomu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        allb allb = (allb) rkk;
        Status bo = allb.mo7183bo();
        String b = allb.mo40473b();
        String c = allb.mo40474c();
        this.f78482a.f78521s = false;
        Circle circle = null;
        this.f78482a.f78522t = null;
        if (bo.mo17710c()) {
            circle = new Circle(1, b, c, Circle.f83440a);
        }
        aomt aomt = this.f78482a.f78508f;
        if (aomt != null) {
            aomt.mo43037a(bo, circle);
        }
    }
}
