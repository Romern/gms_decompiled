package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ren */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ren {

    /* renamed from: a */
    public final Context f42813a;

    public ren(Context context) {
        this.f42813a = context;
    }

    /* renamed from: a */
    public final void mo24560a() {
        SharedPreferences sharedPreferences = this.f42813a.getSharedPreferences("timing_control_pref", 0);
        long max = Math.max(sharedPreferences.getLong("server_suggested_interval_millis", 0), cdej.f180585a.mo6606a().mo77351r());
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long currentTimeMillis = System.currentTimeMillis();
        edit.putLong("last_record_wall_time_millis", currentTimeMillis);
        edit.putLong("next_upload_time_millis", currentTimeMillis + max);
        edit.apply();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: b */
    public final long mo24561b() {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.f42813a.getSharedPreferences("timing_control_pref", 0);
        if (currentTimeMillis >= sharedPreferences.getLong("last_record_wall_time_millis", 0)) {
            return Math.max(sharedPreferences.getLong("next_upload_time_millis", 0) - currentTimeMillis, 0L);
        }
        return 0;
    }
}
