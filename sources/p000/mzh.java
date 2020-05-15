package p000;

import java.util.concurrent.Callable;

/* renamed from: mzh */
final /* synthetic */ class mzh implements Callable {

    /* renamed from: a */
    private final nab f35041a;

    public mzh(nab nab) {
        this.f35041a = nab;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public final Object call() {
        nab nab = this.f35041a;
        long j = 604800000;
        if (nab.mo20386g()) {
            j = cclp.m130472b();
        } else {
            nab.f35116w.mo3199a(0);
            if (nab.f35115v.mo19624a() != null) {
                long min = Math.min(604800000L, nab.f35116w.mo3197a(nab.f35076A) - System.currentTimeMillis());
                if (min > 0) {
                    nab.f35075a.mo25414c("Next backup will happen in %d millis.", Long.valueOf(min));
                }
                j = Math.max(0L, min);
            }
        }
        return Long.valueOf(j);
    }
}
