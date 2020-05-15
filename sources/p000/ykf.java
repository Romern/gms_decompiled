package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ykf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ykf implements ynd {

    /* renamed from: a */
    private final yhx f53965a;

    public ykf(yhx yhx) {
        this.f53965a = yhx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final yhu mo30584a(List list, long j) {
        long j2 = j;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            yhu yhu = (yhu) list.get(i2);
            long a = yhu.mo30385a();
            long b = yhu.mo30387b();
            i += Math.round(((float) yhu.mo30517j()) * (((float) (Math.min(b, TimeUnit.MINUTES.toNanos(j2 + 1)) - Math.max(a, TimeUnit.MINUTES.toNanos(j2)))) / ((float) Math.max(1L, b - a))));
        }
        yht a2 = this.f53965a.mo30519a().mo30504a(yfv.m44005a(TimeUnit.MINUTES.toNanos(j2), TimeUnit.MINUTES.toNanos(j2 + 1)));
        a2.mo30503a().mo30433a(i);
        return a2.mo30508c();
    }
}
