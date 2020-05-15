package p000;

import android.content.Context;
import android.provider.Settings;

/* renamed from: gli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gli {

    /* renamed from: a */
    private static final sek f18469a = new sek("FRP", "FrpUtil");

    /* renamed from: a */
    public static boolean m13382a(Context context) {
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException e) {
            f18469a.mo25415d("USER_SETUP_COMPLETE setting not found.", e, new Object[0]);
            return false;
        }
    }
}
