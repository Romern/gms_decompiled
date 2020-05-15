package p000;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqs extends yqr {

    /* renamed from: b */
    private static final srn f54431b = zvt.m46581a();

    /* renamed from: c */
    private static final caah f54432c = yql.f54411g;

    /* renamed from: d */
    private static final caah f54433d = bzzn.f172102ao;

    /* renamed from: e */
    private static final long f54434e = TimeUnit.SECONDS.toNanos(64);

    /* renamed from: f */
    private final AtomicReference f54435f = new AtomicReference();

    /* renamed from: a */
    public final caah mo30661a() {
        return f54432c;
    }

    /* renamed from: b */
    public final caah mo30663b() {
        return f54433d;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo30665d() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo30662a(cadn cadn) {
        cadn cadn2;
        if (!f54432c.equals(yyk.m45008a(cadn))) {
            ((bnsl) f54431b.mo68387b()).mo68420a("Require RSC measurement instead of: %s", yyk.m45023b(cadn));
        } else if (yyk.m45020a(cadn, bzzj.f172024ap, f54432c)) {
            while (true) {
                cadn2 = (cadn) this.f54435f.get();
                if (cadn2 != null && cadn2.f172702b > cadn.f172702b) {
                    ((bnsl) f54431b.mo68388c()).mo68424a("Out of order data point: %s is before %s", yyk.m45023b(cadn), yyk.m45023b(cadn2));
                    cadn2 = null;
                    break;
                } else if (this.f54435f.compareAndSet(cadn2, cadn)) {
                    if (cadn2 != null && cadn.f172702b - cadn2.f172702b > f54434e) {
                        ((bnsl) f54431b.mo68388c()).mo68424a("Data points too far apart: %s is far away from %s", yyk.m45023b(cadn), yyk.m45023b(cadn2));
                        cadn2 = null;
                    }
                }
            }
            if (cadn2 == null) {
                return bngx.m109376e();
            }
            return bngx.m109356a(yyk.m45011a(mo30664c(), cadn2.f172702b, cadn.f172702b, TimeUnit.NANOSECONDS, yyp.m45047a(Math.round((((((float) yyk.m45022b(cadn, bzzj.f172024ap, f54432c).f172383c) + ((float) yyk.m45022b(cadn2, bzzj.f172024ap, f54432c).f172383c)) / 2.0f) * ((float) (cadn.f172702b - cadn2.f172702b))) / ((float) TimeUnit.MINUTES.toNanos(1))))));
        }
        return bngx.m109376e();
    }
}
