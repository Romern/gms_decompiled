package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ypk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ypk {
    /* renamed from: a */
    public static float m44525a(yhu yhu) {
        return yhu.mo30510b(0);
    }

    /* renamed from: c */
    public static float m44529c(yhu yhu) {
        if (yhu.f53837a.f172704d.size() <= 2 || !yyp.m45052c((caaw) yhu.f53837a.f172704d.get(2))) {
            return 500.0f;
        }
        return yhu.mo30510b(2);
    }

    /* renamed from: a */
    public static float m44526a(yhu yhu, yhu yhu2) {
        return (float) ayuo.m84846b((double) m44525a(yhu), (double) m44528b(yhu), (double) m44525a(yhu2), (double) m44528b(yhu2));
    }

    /* renamed from: b */
    public static double m44527b(yhu yhu, yhu yhu2) {
        double max = Math.max(0.0d, (double) (m44526a(yhu, yhu2) - (m44529c(yhu) + m44529c(yhu2))));
        double abs = (double) Math.abs(yhf.m44096c(yhu2) - yhf.m44096c(yhu));
        double millis = (double) TimeUnit.HOURS.toMillis(1);
        Double.isNaN(abs);
        Double.isNaN(millis);
        return (max / 1000.0d) / (abs / millis);
    }

    /* renamed from: b */
    public static float m44528b(yhu yhu) {
        return yhu.mo30510b(1);
    }
}
