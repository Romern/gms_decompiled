package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: anjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anjc {
    /* renamed from: a */
    public static rtj m64558a(Context context) {
        return new rtj(context, "phonesky_recovery_shared_prefs", true, false);
    }

    /* renamed from: b */
    public static long m64559b(Context context) {
        return m64558a(context).getLong("last_shown_timestamp_ms", -1);
    }

    /* renamed from: c */
    public static void m64560c(Context context) {
        SharedPreferences.Editor edit = m64558a(context).edit();
        edit.clear();
        edit.apply();
    }
}
