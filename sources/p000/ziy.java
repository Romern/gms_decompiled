package p000;

import android.content.Context;
import android.location.Location;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ziy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ziy implements yqf {

    /* renamed from: a */
    private static final srn f55176a = zvt.m46581a();

    /* renamed from: b */
    private static final caah f55177b = bzzn.f172085Y;

    /* renamed from: c */
    private static final caah f55178c = bzzn.f172069I;

    /* renamed from: d */
    private final Context f55179d;

    /* renamed from: e */
    private final AtomicReference f55180e = new AtomicReference();

    public ziy(Context context) {
        this.f55179d = context;
    }

    /* renamed from: b */
    private final cadn m45562b(cadn cadn) {
        cadn cadn2;
        do {
            cadn2 = (cadn) this.f55180e.get();
            if (cadn2 != null && cadn2.f172702b > cadn.f172702b) {
                bnsl bnsl = (bnsl) f55176a.mo68388c();
                bnsl.mo68432a("ziy", "b", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Out of order data point: %s is before %s", yyk.m45023b(cadn), yyk.m45023b(cadn2));
                return null;
            }
        } while (!this.f55180e.compareAndSet(cadn2, cadn));
        return cadn2;
    }

    /* renamed from: c */
    private static boolean m45563c(cadn cadn) {
        if (f55177b.equals(yyk.m45008a(cadn))) {
            return true;
        }
        bnsl bnsl = (bnsl) f55176a.mo68387b();
        bnsl.mo68432a("ziy", "c", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("%s is required, but got %s", bzzn.m126362a(f55177b), yyk.m45023b(cadn));
        return false;
    }

    /* renamed from: a */
    public final caah mo30661a() {
        return f55177b;
    }

    /* renamed from: b */
    public final caah mo30663b() {
        return f55178c;
    }

    /* renamed from: d */
    public final void mo30665d() {
    }

    /* renamed from: a */
    public final Collection mo30662a(cadn cadn) {
        cadn cadn2;
        cadn cadn3 = cadn;
        if (f55177b.equals(yyk.m45008a(cadn))) {
            while (true) {
                cadn2 = (cadn) this.f55180e.get();
                if (cadn2 == null || cadn2.f172702b <= cadn3.f172702b) {
                    if (this.f55180e.compareAndSet(cadn2, cadn3)) {
                        break;
                    }
                } else {
                    bnsl bnsl = (bnsl) f55176a.mo68388c();
                    bnsl.mo68432a("ziy", "b", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68424a("Out of order data point: %s is before %s", yyk.m45023b(cadn), yyk.m45023b(cadn2));
                    cadn2 = null;
                    break;
                }
            }
            if (cadn2 == null) {
                return bngx.m109376e();
            }
            float d = yyk.m45025d(cadn2, bzzj.f171993Q, f55177b);
            float d2 = yyk.m45025d(cadn3, bzzj.f171993Q, f55177b);
            float[] fArr = new float[1];
            Location.distanceBetween((double) d, (double) yyk.m45025d(cadn2, bzzj.f171994R, f55177b), (double) d2, (double) yyk.m45025d(cadn3, bzzj.f171994R, f55177b), fArr);
            float f = fArr[0];
            return bngx.m109356a(yyk.m45011a(mo30664c(), cadn2.f172702b, cadn3.f172702b, TimeUnit.NANOSECONDS, yyp.m45046a((double) f)));
        }
        bnsl bnsl2 = (bnsl) f55176a.mo68387b();
        bnsl2.mo68432a("ziy", "c", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68424a("%s is required, but got %s", bzzn.m126362a(f55177b), yyk.m45023b(cadn));
        return bngx.m109376e();
    }

    /* renamed from: c */
    public final caae mo30664c() {
        yyc a = yyd.m44987a();
        a.mo30856a(caad.DERIVED);
        a.mo30857a(f55178c);
        a.mo30855a(yxy.f54800b);
        a.mo30858a(zvn.m46574a(this.f55179d));
        a.mo30859a("live_distance_from_location");
        return a.mo30854a();
    }
}
