package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* renamed from: mpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpv {
    /* renamed from: a */
    public static String m25497a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.apps.pixelmigrate", 1048576);
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                return "com.google.android.apps.restore";
            }
            return "com.google.android.apps.pixelmigrate";
        } catch (PackageManager.NameNotFoundException e) {
            return "com.google.android.apps.restore";
        }
    }
}
