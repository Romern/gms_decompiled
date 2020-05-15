package p000;

import android.os.SystemClock;
import java.util.concurrent.FutureTask;

/* renamed from: awrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awrg {

    /* renamed from: a */
    public final String f94906a;

    /* renamed from: b */
    public final FutureTask f94907b;

    /* renamed from: c */
    public boolean f94908c;

    /* renamed from: d */
    public long f94909d = -1;

    public awrg(String str, FutureTask futureTask) {
        this.f94906a = str;
        this.f94907b = futureTask;
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
    public final void mo52500a(long j) {
        this.f94909d = SystemClock.elapsedRealtime() + Math.max(0L, j);
    }
}
