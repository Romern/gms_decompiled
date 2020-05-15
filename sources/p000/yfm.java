package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yfm */
public final /* synthetic */ class yfm {
    /* renamed from: a */
    public static void m43953a(yht yht, long j, long j2) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        yht.mo30507b();
        if (j != 0) {
            cadm cadm = yht.f53832a;
            long nanos = timeUnit.toNanos(j);
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn = (cadn) cadm.f164949b;
            cadn cadn2 = cadn.f172699j;
            cadn.f172701a |= 2;
            cadn.f172703c = nanos;
        }
        yht.mo30505a(j2, TimeUnit.NANOSECONDS);
    }
}
