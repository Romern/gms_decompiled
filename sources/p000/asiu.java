package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: asiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asiu {
    /* renamed from: a */
    public static String m74180a(String str, Context context, String str2) {
        return atxr.m76516a(asko.m74292a(context).mo49214a(), "SELECT value from GlobalValues where key_id = ? AND environment = ?;", str, str2);
    }

    /* renamed from: a */
    public static boolean m74181a(Context context, String str) {
        return TextUtils.equals("true", m74180a("seen_keyguard_setup", context, str));
    }
}
