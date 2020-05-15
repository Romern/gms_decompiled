package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqv extends yqr {

    /* renamed from: b */
    private static final srn f54445b = zvt.m46581a();

    /* renamed from: c */
    private static final caah f54446c = yql.f54409e;

    /* renamed from: d */
    private static final caah f54447d = bzzn.f172063C;

    /* renamed from: e */
    private static final long f54448e = TimeUnit.SECONDS.toNanos(64);

    /* renamed from: f */
    private final AtomicReference f54449f = new AtomicReference();

    /* renamed from: a */
    public final caah mo30661a() {
        return f54446c;
    }

    /* renamed from: b */
    public final caah mo30663b() {
        return f54447d;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo30665d() {
    }

    /* renamed from: a */
    public final Collection mo30662a(cadn cadn) {
        cadn cadn2;
        if (!f54446c.equals(yyk.m45008a(cadn))) {
            ((bnsl) f54445b.mo68387b()).mo68420a("Require CSC measurement instead of: %s", yyk.m45023b(cadn));
        } else if (yyk.m45020a(cadn, yql.f54408d, f54446c) && yyk.m45020a(cadn, yql.f54407c, f54446c)) {
            while (true) {
                cadn2 = (cadn) this.f54449f.get();
                if (cadn2 != null && cadn2.f172702b > cadn.f172702b) {
                    ((bnsl) f54445b.mo68388c()).mo68424a("Out of order data point: %s is before %s", yyk.m45023b(cadn), yyk.m45023b(cadn2));
                    cadn2 = null;
                    break;
                } else if (this.f54449f.compareAndSet(cadn2, cadn)) {
                    if (cadn2 != null && cadn.f172702b - cadn2.f172702b > f54448e) {
                        ((bnsl) f54445b.mo68388c()).mo68424a("Data points too far apart: %s is far away from %s", yyk.m45023b(cadn), yyk.m45023b(cadn2));
                        cadn2 = null;
                    }
                }
            }
            if (cadn2 == null) {
                return bngx.m109376e();
            }
            long a = bqcx.m112609a(yyk.m45024c(cadn, yql.f54407c, f54446c)) - bqcx.m112609a(yyk.m45024c(cadn2, yql.f54407c, f54446c));
            if (a < 0) {
                a += 4294967296L;
            }
            int c = yyk.m45024c(cadn, yql.f54408d, f54446c) - yyk.m45024c(cadn2, yql.f54408d, f54446c);
            if (c < 0) {
                c += AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            }
            return bnic.m109489a(yyk.m45012a(mo30664c(), cadn.f172702b, TimeUnit.NANOSECONDS, (double) (((float) a) / ((((float) c) / 1024.0f) / 60.0f))));
        }
        return bngx.m109376e();
    }
}
