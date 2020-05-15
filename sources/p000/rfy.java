package p000;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rfy {

    /* renamed from: a */
    private static boolean f42892a = false;
    @Deprecated

    /* renamed from: b */
    public static final int f42893b = 201515000;

    /* renamed from: c */
    static boolean f42894c = false;

    /* renamed from: d */
    static final AtomicBoolean f42895d = new AtomicBoolean();

    static {
        new AtomicBoolean();
    }

    @Deprecated
    /* renamed from: a */
    public static String m33542a(int i) {
        return ConnectionResult.m22453a(i);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m33547b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* renamed from: f */
    public static boolean m33549f(Context context) {
        if (!f42894c) {
            try {
                PackageInfo b = svr.m36484b(context).mo26176b("com.google.android.gms", 64);
                rfz.m33557a(context);
                if (b == null || rfz.m33558b(b, false) || !rfz.m33558b(b, true)) {
                    f42892a = false;
                } else {
                    f42892a = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                f42894c = true;
            }
        }
        return f42892a;
    }

    /* renamed from: g */
    public static boolean m33550g(Context context) {
        return m33549f(context) || !sre.m36079a();
    }

    @Deprecated
    /* renamed from: h */
    public static void m33551h(Context context) {
        if (!f42895d.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }

    /* renamed from: i */
    public static Context m33552i(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: j */
    public static int m33553j(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: l */
    public static void m33555l(Context context) {
        int b = rfj.f42872d.mo24590b(context);
        if (b != 0) {
            Intent b2 = rfj.f42872d.mo24591b(context, b, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(b);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (b2 == null) {
                throw new rfv(b);
            }
            throw new rfw(b, "Google Play Services not available", b2);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m33543a() {
        return sre.m36079a();
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m33548b(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m33546a(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m33554k(Context context) {
        int i = Build.VERSION.SDK_INT;
        Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m33544a(Context context, int i) {
        return str.m36310a(context, i);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m33545a(Context context, int i, String str) {
        return str.m36311a(context, i, str);
    }

    /* renamed from: a */
    public static boolean m33546a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (equals && sqr.m35998a()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
                if (equals) {
                    return applicationInfo.enabled;
                }
                if (!applicationInfo.enabled || m33554k(context)) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                return false;
            }
        } catch (Exception e2) {
            return false;
        }
    }
}
