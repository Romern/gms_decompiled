package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: waa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class waa {
    /* renamed from: a */
    public static String m41647a(String str, Context context, String str2) {
        return m41648a(context, str2).getString(str, null);
    }

    /* renamed from: b */
    public static int m41650b(String str, Context context, String str2) {
        return m41648a(context, str2).getInt(str, 0);
    }

    /* renamed from: c */
    public static void m41652c(String str, Context context, String str2) {
        SharedPreferences.Editor edit = m41648a(context, str2).edit();
        edit.putBoolean(str, true);
        edit.commit();
    }

    /* renamed from: a */
    public static rtj m41648a(Context context, String str) {
        return new rtj(context, String.valueOf(str).concat(".AppInviteReferral"), true);
    }

    /* renamed from: b */
    public static void m41651b(Context context, String str) {
        m41652c("scionInstallEvent", context, str);
    }

    /* renamed from: a */
    public static boolean m41649a(String str, boolean z, Context context, String str2) {
        return m41648a(context, str2).getBoolean(str, z);
    }
}
