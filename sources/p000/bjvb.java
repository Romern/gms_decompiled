package p000;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.BuildConfig;

/* renamed from: bjvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvb {

    /* renamed from: a */
    public static Boolean f123375a;

    /* renamed from: a */
    public static boolean m104682a() {
        if (!"unknown".equals(Build.BOARD)) {
            return false;
        }
        if ("generic".equals(Build.BRAND) || "generic_x86".equals(Build.BRAND) || BuildConfig.FLAVOR_client.equals(Build.BRAND)) {
            return "generic".equals(Build.DEVICE) || "generic_x86".equals(Build.DEVICE) || "Android".equals(Build.DEVICE);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m104683a(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }
}
