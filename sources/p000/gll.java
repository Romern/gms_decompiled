package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;

/* renamed from: gll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gll {

    /* renamed from: a */
    private static final Logger f18474a = new Logger("FRP", "SecureFrpUtil");

    /* renamed from: a */
    static SharedPreferences m13390a(Context context) {
        return context.getSharedPreferences("secure_frp_prefs", 0);
    }

    /* renamed from: b */
    public static void m13392b(Context context) {
        if (!gli.m13382a(context) && !m13390a(context).getBoolean("secure_frp_already_populated", false) && m13391a(true, context)) {
            m13390a(context).edit().putBoolean("secure_frp_already_populated", true).apply();
        }
    }

    /* renamed from: a */
    public static boolean m13391a(boolean z, Context context) {
        sdo.m34970a(!gli.m13382a(context));
        boolean putInt = Settings.Secure.putInt(context.getContentResolver(), "secure_frp_mode", z ? 1 : 0);
        if (!putInt) {
            f18474a.mo25416d("Could not write SECURE_FRP_MODE setting.", new Object[0]);
        } else {
            f18474a.mo25414c("Secure FRP bit written", new Object[0]);
        }
        return putInt;
    }
}
