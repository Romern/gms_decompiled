package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: ix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1094ix {
    /* renamed from: a */
    public static Intent m16251a(Context context, ComponentName componentName) {
        String b = m16255b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return m16255b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: b */
    public static Intent m16254b(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String c = m16257c(activity);
        if (c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, c);
        try {
            if (m16255b(activity, componentName) != null) {
                return new Intent().setComponent(componentName);
            }
            return Intent.makeMainActivity(componentName);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + c + "' in manifest");
            return null;
        }
    }

    /* renamed from: c */
    public static String m16257c(Activity activity) {
        try {
            return m16255b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static void m16252a(Activity activity) {
        Intent b = m16254b(activity);
        if (b != null) {
            m16256b(activity, b);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    /* renamed from: a */
    public static boolean m16253a(Activity activity, Intent intent) {
        int i = Build.VERSION.SDK_INT;
        return activity.shouldUpRecreateTask(intent);
    }

    /* renamed from: b */
    public static String m16255b(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 269222528);
        int i3 = Build.VERSION.SDK_INT;
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: b */
    public static void m16256b(Activity activity, Intent intent) {
        int i = Build.VERSION.SDK_INT;
        activity.navigateUpTo(intent);
    }
}
