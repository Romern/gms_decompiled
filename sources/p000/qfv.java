package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: qfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfv extends qfu {

    /* renamed from: a */
    private static final Logger f41134a = qgn.m32143a("HighFrequencyBackoffDelayComputer");

    /* renamed from: b */
    private final rtj f41135b;

    public qfv(Context context) {
        this.f41135b = qey.m32045a(context, "high_frequency_backoff_shared_pref_name");
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
    public final long mo24020a(long j, Bundle bundle) {
        long j2 = cdci.m132544j();
        long q = cdci.f180455a.mo6606a().mo77254q();
        long j3 = this.f41135b.getLong("HighFrequency_LastCheckinStartTime", 0);
        long j4 = this.f41135b.getLong("HighFrequency_TimeGapSum", 0);
        long j5 = this.f41135b.getLong("HighFrequency_Count", 0);
        long j6 = j - j3;
        if (j5 != 0 && j6 <= j2) {
            long j7 = j5 + 1;
            long max = Math.max(0L, (((j7 - q) * j2) - (j4 + j6)) / j7);
            if (qfu.m32093a(bundle)) {
                f41134a.mo25412b("Ignore high frequency delay for forced checkin.", new Object[0]);
                return 0;
            }
            long min = Math.min(max, j2);
            f41134a.mo25412b("High frequency delay %d ms enforced", Long.valueOf(min));
            return min;
        }
        f41134a.mo25412b("Exceeded high frequency delay range.", new Object[0]);
        return 0;
    }

    /* renamed from: a */
    public final String mo24021a() {
        return "HighFrequencyBackoffDelayComputer";
    }

    /* renamed from: b */
    public final void mo24023b() {
        SharedPreferences.Editor edit = this.f41135b.edit();
        edit.remove("HighFrequency_Count");
        edit.remove("HighFrequency_LastCheckinStartTime");
        edit.remove("HighFrequency_TimeGapSum");
        edit.commit();
    }

    /* renamed from: a */
    public final void mo24022a(long j, qda qda) {
        long j2;
        long j3;
        long j4 = j;
        if (qda.f40962e != 3) {
            long j5 = this.f41135b.getLong("HighFrequency_LastCheckinStartTime", 0);
            long j6 = this.f41135b.getLong("HighFrequency_TimeGapSum", 0);
            long j7 = this.f41135b.getLong("HighFrequency_Count", 0);
            long j8 = j4 - j5;
            if (j7 == 0) {
                j2 = 1;
                j3 = j;
            } else if (j8 > cdci.m132544j()) {
                j2 = 1;
                j3 = j;
            } else {
                SharedPreferences.Editor edit = this.f41135b.edit();
                edit.putLong("HighFrequency_Count", j7 + 1);
                edit.putLong("HighFrequency_TimeGapSum", j6 + j8);
                edit.putLong("HighFrequency_LastCheckinStartTime", j);
                edit.commit();
                return;
            }
            f41134a.mo25412b("Exceeded high frequency delay range. Reset high frequency state.", new Object[0]);
            SharedPreferences.Editor edit2 = this.f41135b.edit();
            edit2.putLong("HighFrequency_LastCheckinStartTime", j3);
            edit2.putLong("HighFrequency_Count", j2);
            edit2.putLong("HighFrequency_TimeGapSum", 0);
            edit2.commit();
        }
    }
}
