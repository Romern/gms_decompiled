package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: zuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zuw {
    /* renamed from: a */
    public static long m46534a(Context context, String str) {
        return m46538d(context, str).getLong("sync_time", -1);
    }

    /* renamed from: b */
    public static long m46536b(Context context, String str) {
        return m46538d(context, str).getLong("overlap_start", -1);
    }

    /* renamed from: c */
    public static void m46537c(Context context, String str) {
        m46538d(context, str).edit().clear().apply();
    }

    /* renamed from: d */
    public static SharedPreferences m46538d(Context context, String str) {
        String valueOf = String.valueOf(str);
        return context.getSharedPreferences(valueOf.length() == 0 ? new String("fitness_sync_account_") : "fitness_sync_account_".concat(valueOf), 0);
    }

    /* renamed from: a */
    public static void m46535a(Context context, String str, long j) {
        SharedPreferences d = m46538d(context, str);
        d.edit().putLong("sync_time", j).remove("oldest_wear").putLong("overlap_start", Math.min(d.getLong("sync_time", -1), d.getLong("oldest_wear", Long.MAX_VALUE))).apply();
    }
}
