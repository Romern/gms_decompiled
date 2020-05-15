package p000;

import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.List;

/* renamed from: pbi */
final /* synthetic */ class pbi implements Runnable {

    /* renamed from: a */
    private final pbk f38762a;

    /* renamed from: b */
    private final CarInfoInternal f38763b;

    /* renamed from: c */
    private final bivd f38764c;

    /* renamed from: d */
    private final List f38765d;

    public pbi(pbk pbk, CarInfoInternal carInfoInternal, bivd bivd, List list) {
        this.f38762a = pbk;
        this.f38763b = carInfoInternal;
        this.f38764c = bivd;
        this.f38765d = list;
    }

    public final void run() {
        pbk pbk = this.f38762a;
        CarInfoInternal carInfoInternal = this.f38763b;
        bivd bivd = this.f38764c;
        List list = this.f38765d;
        pbm pbm = pbk.f38767a;
        bnsn bnsn = pbm.f38775a;
        pbm.f38783i.mo22573a(true, 0, carInfoInternal, bivd, list);
    }
}
