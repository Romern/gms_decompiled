package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: aexr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexr {
    /* renamed from: a */
    public static void m52659a(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        String valueOf = String.valueOf(str);
        edit.putBoolean(valueOf.length() == 0 ? new String("has_recently_viewed_location_sharing_settings:") : "has_recently_viewed_location_sharing_settings:".concat(valueOf), z).commit();
    }
}
