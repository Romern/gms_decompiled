package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: anfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfi {
    /* renamed from: a */
    public static String m64157a(Context context) {
        StringBuilder sb = new StringBuilder("Android/");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            sb.append(packageInfo.packageName);
            sb.append("/");
            sb.append(packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("HttpUtils", e.getMessage(), e);
        }
        return sb.toString();
    }
}
