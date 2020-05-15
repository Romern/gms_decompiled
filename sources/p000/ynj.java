package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ynj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ynj implements ynd {

    /* renamed from: a */
    private final yhx f54131a;

    public ynj(yhx yhx) {
        this.f54131a = yhx;
    }

    /* renamed from: a */
    public final yhu mo30584a(List list, long j) {
        int size = list.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            yhu yhu = (yhu) list.get(i);
            j2 += Math.min(yhu.mo30387b(), TimeUnit.MINUTES.toNanos(1 + j)) - Math.max(yhu.mo30385a(), TimeUnit.MINUTES.toNanos(j));
        }
        if (j2 >= TimeUnit.MINUTES.toNanos(1)) {
            return this.f54131a.mo30519a().mo30504a(yfv.m44005a(TimeUnit.MINUTES.toNanos(j), TimeUnit.MINUTES.toNanos(j + 1))).mo30508c();
        }
        return null;
    }
}
