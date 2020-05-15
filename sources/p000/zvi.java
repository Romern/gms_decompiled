package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: zvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvi {
    /* renamed from: a */
    public static SharedPreferences m46559a(Context context, String str) {
        return context.getSharedPreferences(str.length() == 0 ? new String("fitness_wearable_sync_daily_summary_") : "fitness_wearable_sync_daily_summary_".concat(str), 0);
    }

    /* renamed from: a */
    public static void m46560a(SharedPreferences sharedPreferences, long j) {
        long a = zvp.m46576a(j);
        if (sharedPreferences.getLong("start_of_day_millis", 0) < a) {
            sharedPreferences.edit().clear().putLong("start_of_day_millis", a).apply();
        }
    }
}
