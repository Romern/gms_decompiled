package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;

/* renamed from: sre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sre {

    /* renamed from: a */
    private static Boolean f45014a;

    /* renamed from: b */
    private static Boolean f45015b;

    /* renamed from: c */
    private static Boolean f45016c;

    /* renamed from: d */
    private static Boolean f45017d;

    /* renamed from: e */
    private static Boolean f45018e;

    /* renamed from: f */
    private static Boolean f45019f;

    /* renamed from: g */
    private static Boolean f45020g;

    /* renamed from: h */
    private static Boolean f45021h;

    /* renamed from: i */
    private static Boolean f45022i;

    /* renamed from: j */
    private static Boolean f45023j;

    /* renamed from: k */
    private static Boolean f45024k;

    /* renamed from: a */
    public static boolean m36079a() {
        int i = rfy.f42893b;
        return "user".equals(Build.TYPE);
    }

    /* renamed from: b */
    public static boolean m36082b(Context context) {
        if (f45018e == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f45018e = Boolean.valueOf(z);
        }
        return f45018e.booleanValue();
    }

    /* renamed from: c */
    public static boolean m36083c(Context context) {
        if (f45020g == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f45020g = Boolean.valueOf(z);
        }
        return f45020g.booleanValue();
    }

    /* renamed from: d */
    public static boolean m36084d(Context context) {
        ActivityManager activityManager;
        int i = Build.VERSION.SDK_INT;
        if (f45019f == null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            f45019f = Boolean.valueOf(activityManager.isLowRamDevice());
        }
        return sdg.m34949a(f45019f, Boolean.TRUE);
    }

    /* renamed from: e */
    public static boolean m36085e(Context context) {
        if (f45021h == null) {
            f45021h = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
        }
        return f45021h.booleanValue();
    }

    /* renamed from: f */
    public static boolean m36086f(Context context) {
        if (f45024k == null) {
            f45024k = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_EXPERIENCE"));
        }
        return f45024k.booleanValue();
    }

    /* renamed from: g */
    public static void m36087g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f45022i == null) {
            int i = Build.VERSION.SDK_INT;
            f45022i = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        f45022i.booleanValue();
    }

    /* renamed from: h */
    public static void m36088h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f45023j == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            f45023j = Boolean.valueOf(z);
        }
        f45023j.booleanValue();
    }

    /* renamed from: i */
    public static void m36089i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f45016c == null) {
            int i = Build.VERSION.SDK_INT;
            f45016c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f45016c.booleanValue();
    }

    /* renamed from: j */
    public static void m36090j(Context context) {
        m36089i(context);
    }

    /* renamed from: a */
    public static boolean m36080a(Context context) {
        if (f45017d == null) {
            int i = Build.VERSION.SDK_INT;
            f45017d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f45017d.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (p000.sre.f45015b.booleanValue() == false) goto L_0x003a;
     */
    /* renamed from: a */
    public static boolean m36081a(Resources resources) {
        boolean z;
        boolean z2 = false;
        if (resources == null) {
            return false;
        }
        if (f45014a == null) {
            if ((resources.getConfiguration().screenLayout & 15) <= 3) {
                if (f45015b == null) {
                    Configuration configuration = resources.getConfiguration();
                    if ((configuration.screenLayout & 15) > 3 || configuration.smallestScreenWidthDp < 600) {
                        z = false;
                    } else {
                        z = true;
                    }
                    f45015b = Boolean.valueOf(z);
                }
            }
            z2 = true;
            f45014a = Boolean.valueOf(z2);
        }
        return f45014a.booleanValue();
    }
}
