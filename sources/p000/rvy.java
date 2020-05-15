package p000;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: rvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rvy extends ruq {
    public rvy() {
        super("SafebootCrashThresholdCondition");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25185a(rvl rvl) {
        if (rvz.m34545b()) {
            rud a = rvl.mo25202a();
            if (a == null) {
                Log.e("SfbtCrashThresholdCond", "Missing crash data");
                return false;
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            long j = a.f43692e;
            if (seconds - j <= 3600) {
                double d = (double) a.f43690c;
                double max = (double) Math.max(1L, j - a.f43691d);
                Double.isNaN(d);
                Double.isNaN(max);
                double d2 = d / max;
                double seconds2 = (double) TimeUnit.HOURS.toSeconds(1);
                Double.isNaN(seconds2);
                if (d2 * seconds2 < cdkp.f181122a.mo6606a().mo77808K() || a.f43690c < cdkp.f181122a.mo6606a().mo77809L()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
