package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: myz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class myz {

    /* renamed from: d */
    private static final lvn f34995d = new lvn("FullBackupScheduler");

    /* renamed from: a */
    public final bjr f34996a = new bjr(this.f34998c);

    /* renamed from: b */
    public final bjq f34997b;

    /* renamed from: c */
    public final SharedPreferences f34998c;

    /* renamed from: a */
    private static final int m25797a(int i) {
        long millis = TimeUnit.SECONDS.toMillis((long) i);
        if (millis <= 2147483647L) {
            return (int) millis;
        }
        f34995d.mo25416d("Overflow when converting from seconds to milliseconds; returning max int value", new Object[0]);
        return Integer.MAX_VALUE;
    }

    public myz(Context context) {
        this.f34998c = context.getSharedPreferences("FullBackupScheduler", 0);
        bjq bjq = new bjq();
        this.f34997b = bjq;
        bjq.f3398b = 0;
        bjq.f3399c = m25797a((int) ccnf.f179489a.mo6606a().mo76434f());
        this.f34997b.f3400d = (long) m25797a((int) ccnf.m130734c());
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
    public final long mo20341a(long j, long j2) {
        return Math.max(0L, Math.min(j2, j));
    }

    /* renamed from: a */
    public final void mo20342a(String str) {
        String valueOf = String.valueOf(str);
        String str2 = valueOf.length() == 0 ? new String("Tracker_") : "Tracker_".concat(valueOf);
        if (this.f34998c.contains(str2)) {
            this.f34998c.edit().remove(str2).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20343a(String str, long j) {
        String valueOf = String.valueOf(str);
        this.f34998c.edit().putLong(valueOf.length() == 0 ? new String("Tracker_") : "Tracker_".concat(valueOf), j).apply();
    }
}
