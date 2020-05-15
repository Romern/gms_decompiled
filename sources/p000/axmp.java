package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: axmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axmp {
    /* renamed from: a */
    public static SharedPreferences m82728a(Context context) {
        return context.getSharedPreferences("walletp2p_global_preferences", 0);
    }

    /* renamed from: a */
    public static void m82729a(Context context, String str) {
        m82728a(context).edit().putString("default_account_name", str).apply();
    }
}
