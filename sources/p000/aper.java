package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aper */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aper {
    /* renamed from: a */
    public static SharedPreferences m70107a(Context context) {
        return context.getApplicationContext().getSharedPreferences("romanesco_gms_backup_and_restore_settings", 0);
    }

    /* renamed from: a */
    public static boolean m70108a(Context context, String str, boolean z) {
        if (sto.m36305a()) {
            aoyg.f83841a.mo46985d("SharedPreference being modified on main thread - setRestoreFromSettings()");
        }
        SharedPreferences.Editor edit = m70107a(context).edit();
        String valueOf = String.valueOf(str);
        return edit.putBoolean(valueOf.length() == 0 ? new String("is_restore_from_settings__") : "is_restore_from_settings__".concat(valueOf), z).commit();
    }
}
