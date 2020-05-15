package p000;

import android.content.Context;

/* renamed from: jtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jtb {
    /* renamed from: a */
    public static void m17295a(Context context, boolean z) {
        sdo.m34960a();
        context.getSharedPreferences("com.google.android.gms.auth.proximity.UNIFIED_SETUP", 0).edit().putBoolean("SETUP_COMPLETE_NOTIFICATION", z).commit();
    }
}
