package p000;

import android.content.Context;
import android.preference.PreferenceManager;

/* renamed from: aowz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowz {
    /* renamed from: a */
    public static boolean m69769a(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("pref_use_custom_snooze_preset", false);
    }

    /* renamed from: b */
    public static void m69770b(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("pref_use_custom_snooze_preset", true).apply();
    }
}
