package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: yon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yon implements ynd {

    /* renamed from: a */
    private final long f54277a;

    /* renamed from: b */
    private final yhx f54278b;

    public yon(long j, yhx yhx) {
        this.f54277a = j;
        this.f54278b = yhx;
    }

    /* renamed from: a */
    public final yhu mo30584a(List list, long j) {
        float f;
        List list2 = list;
        long j2 = j;
        long millis = TimeUnit.MINUTES.toMillis(j2);
        long j3 = 1 + j2;
        long millis2 = TimeUnit.MINUTES.toMillis(j3);
        int size = list.size();
        int i = 0;
        while (i < size) {
            long millis3 = TimeUnit.NANOSECONDS.toMillis(((yhu) list2.get(i)).mo30387b());
            int i2 = i + 1;
            if (millis3 - millis > this.f54277a) {
                return null;
            }
            millis = millis3;
            i = i2;
        }
        if (millis2 - millis > this.f54277a) {
            return null;
        }
        double d = 0.0d;
        int i3 = 0;
        long j4 = 0;
        while (i3 < list.size() - 1) {
            yhu yhu = (yhu) list2.get(i3);
            i3++;
            yhu yhu2 = (yhu) list2.get(i3);
            float b = yhu.mo30510b(0);
            float b2 = yhu2.mo30510b(0);
            long millis4 = TimeUnit.NANOSECONDS.toMillis(yhu2.mo30387b() - yhu.mo30387b());
            double d2 = (double) (((float) millis4) * ((b + b2) / 2.0f));
            Double.isNaN(d2);
            d += d2;
            j4 += millis4;
        }
        if (j4 > 0) {
            double d3 = (double) j4;
            Double.isNaN(d3);
            f = (float) (d / d3);
        } else {
            f = -1.0f;
        }
        if (f < 0.0f) {
            return null;
        }
        yht a = this.f54278b.mo30519a().mo30504a(yfv.m44005a(TimeUnit.MINUTES.toNanos(j2), TimeUnit.MINUTES.toNanos(j3)));
        a.mo30503a().mo30432a((double) f);
        return a.mo30508c();
    }
}
