package p000;

import android.os.Build;
import android.util.Log;
import com.felicanetworks.mfc.BuildConfig;

/* renamed from: ssw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssw {

    /* renamed from: a */
    private static Boolean f45108a;

    /* renamed from: a */
    public static boolean m36269a() {
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.CODENAME.equals("REL")) {
            return true;
        }
        boolean z = false;
        if (Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'R' || Build.VERSION.CODENAME.charAt(0) > 'Z') {
            return false;
        }
        Boolean bool = f45108a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if (BuildConfig.FLAVOR_client.equals(Build.BRAND) && !Build.ID.startsWith("RPP1") && !Build.ID.startsWith("RPP2") && Integer.parseInt(Build.VERSION.INCREMENTAL) >= 6301457) {
                z = true;
            }
            f45108a = Boolean.valueOf(z);
        } catch (NumberFormatException e) {
            f45108a = true;
        }
        if (!f45108a.booleanValue()) {
            Log.w("PlatformVersion", "Build version must be at least 6301457 to support R in gmscore");
        }
        return f45108a.booleanValue();
    }
}
