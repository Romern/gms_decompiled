package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: str */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class str {
    /* renamed from: a */
    public static boolean m36310a(Context context, int i) {
        if (m36311a(context, i, "com.google.android.gms")) {
            try {
                return rfz.m33557a(context).mo24609b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m36311a(Context context, int i, String str) {
        return svr.m36484b(context).mo26174a(i, str);
    }
}
