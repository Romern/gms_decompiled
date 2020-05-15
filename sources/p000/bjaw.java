package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;

/* renamed from: bjaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjaw {

    /* renamed from: a */
    private static boolean f122448a = false;

    /* renamed from: b */
    private static bjaw f122449b;

    /* renamed from: c */
    private final String f122450c;

    /* renamed from: d */
    private final Resources f122451d;

    private bjaw(String str, Resources resources) {
        this.f122450c = str;
        this.f122451d = resources;
    }

    /* renamed from: a */
    public static synchronized bjaw m103129a(Context context) {
        bjaw bjaw;
        synchronized (bjaw.class) {
            if (!f122448a) {
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("com.android.setupwizard.action.PARTNER_CUSTOMIZATION");
                int i = Build.VERSION.SDK_INT;
                for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 1835520)) {
                    if (resolveInfo.activityInfo != null) {
                        ApplicationInfo applicationInfo = resolveInfo.activityInfo.applicationInfo;
                        if ((applicationInfo.flags & 1) != 0) {
                            try {
                                f122449b = new bjaw(applicationInfo.packageName, packageManager.getResourcesForApplication(applicationInfo));
                                break;
                            } catch (PackageManager.NameNotFoundException e) {
                                String valueOf = String.valueOf(applicationInfo.packageName);
                                Log.w("(setupdesign) Partner", valueOf.length() == 0 ? new String("Failed to find resources for ") : "Failed to find resources for ".concat(valueOf));
                            }
                        } else {
                            continue;
                        }
                    }
                }
                f122448a = true;
            }
            bjaw = f122449b;
        }
        return bjaw;
    }

    /* renamed from: a */
    public static String m103130a(Context context, int i) {
        bjav bjav;
        Resources resources;
        int identifier;
        bjaw a = m103129a(context);
        if (a == null || (identifier = a.f122451d.getIdentifier((resources = context.getResources()).getResourceEntryName(i), resources.getResourceTypeName(i), a.f122450c)) == 0) {
            context.getPackageName();
            bjav = new bjav(context.getResources(), i);
        } else {
            bjav = new bjav(a.f122451d, identifier);
        }
        return bjav.f122446a.getString(bjav.f122447b);
    }
}
