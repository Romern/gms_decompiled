package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: biyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biyl {

    /* renamed from: c */
    private static final String f122304c = biyl.class.getSimpleName();

    /* renamed from: a */
    public final int f122305a;

    /* renamed from: b */
    public final Resources f122306b;

    public biyl(int i, Resources resources) {
        this.f122305a = i;
        this.f122306b = resources;
    }

    /* renamed from: a */
    public static biyl m102984a(Context context, Bundle bundle) {
        if (!bundle.containsKey("packageName") || !bundle.containsKey("resourceName") || !bundle.containsKey("resourceId")) {
            return null;
        }
        String string = bundle.getString("packageName");
        String string2 = bundle.getString("resourceName");
        int i = bundle.getInt("resourceId");
        try {
            PackageManager packageManager = context.getPackageManager();
            int i2 = Build.VERSION.SDK_INT;
            return new biyl(i, packageManager.getResourcesForApplication(packageManager.getApplicationInfo(string, 512)));
        } catch (PackageManager.NameNotFoundException e) {
            Bundle bundle2 = bundle.getBundle("fallbackConfig");
            if (bundle2 == null) {
                return null;
            }
            String str = f122304c;
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 38 + String.valueOf(string2).length());
            sb.append(string);
            sb.append(" not found, ");
            sb.append(string2);
            sb.append(" fallback to default value");
            Log.w(str, sb.toString());
            return m102984a(context, bundle2);
        }
    }
}
