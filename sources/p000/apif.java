package p000;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: apif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apif {

    /* renamed from: a */
    private static final bnoa f84451a = bnoa.m109929a((Comparable) 0L, (Comparable) 0L);

    /* renamed from: a */
    public static int m70388a(apid apid) {
        int i;
        int i2;
        aebo aebo = apid.f84444n.f63119l;
        int i3 = aebo.f63079c;
        int i4 = aebo.f63080d;
        int i5 = aebo.f63078b;
        int j = (int) cedr.f182397a.mo6606a().mo78897j();
        if (j >= 0) {
            i = Math.max(j, i3);
        } else {
            i = i3;
        }
        int g = (int) cedr.f182397a.mo6606a().mo78894g();
        if (g > 0) {
            i3 = Math.max(g, i3);
        }
        int o = (int) cedr.f182397a.mo6606a().mo78902o();
        if (o != -1 && m70390a(o)) {
            i5 = o;
        }
        int i6 = apid.f84438h;
        if (!m70390a(i5)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Invalid RetryStrategy policy: ");
            sb.append(i5);
            Log.e("NetworkScheduler", sb.toString());
        }
        if (i5 != 1) {
            i2 = (int) Math.scalb((float) i3, i6);
        } else {
            i2 = (i6 + 1) * i3;
        }
        return Math.max(i, Math.min(i2, i4));
    }

    /* renamed from: a */
    private static boolean m70390a(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: a */
    public static bnoa m70389a(aeca aeca) {
        if (aeca instanceof aebj) {
            aebj aebj = (aebj) aeca;
            return bnoa.m109929a(Long.valueOf(TimeUnit.SECONDS.toMillis(aebj.f63068a)), Long.valueOf(TimeUnit.SECONDS.toMillis(aebj.f63069b)));
        } else if (aeca instanceof aebm) {
            aebm aebm = (aebm) aeca;
            long millis = TimeUnit.SECONDS.toMillis(aebm.f63072a);
            long millis2 = TimeUnit.SECONDS.toMillis(aebm.f63073b);
            long millis3 = TimeUnit.SECONDS.toMillis(cedr.f182397a.mo6606a().mo78899l());
            if (millis < millis3) {
                double d = (double) millis3;
                double d2 = (double) millis;
                double d3 = (double) millis2;
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d);
                millis2 = (long) (d / (d2 / d3));
                millis = millis3;
            }
            return bnoa.m109929a(Long.valueOf(millis - Math.min(bqcr.m112595a(millis2, millis / 20, TimeUnit.SECONDS.toMillis(cedr.f182397a.mo6606a().mo78898k())), millis)), Long.valueOf(millis));
        } else if (aeca instanceof aead) {
            return f84451a;
        } else {
            throw new IllegalArgumentException("Unknown task type.");
        }
    }
}
