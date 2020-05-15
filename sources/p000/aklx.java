package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: aklx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aklx {
    /* renamed from: a */
    public static void m59987a() {
        int i = Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    public static void m59988a(Context context, String str) {
        try {
            spn.m35856a(context, str, true);
        } catch (IllegalArgumentException e) {
            eoa.m10825a("NetRec", e, "Unrecognized component: %s", str);
        }
    }

    /* renamed from: b */
    public static void m59991b(Context context) {
        if (m59989a(context)) {
            m59987a();
            int i = eoa.f15378a;
            m59988a(context, "com.google.android.gms.netrec.scoring.client.wfa.WfaOptInActivity");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: c */
    public static void m59992c(Context context) {
        int i = Build.VERSION.SDK_INT;
        try {
            spn.m35856a(context, "com.google.android.gms.netrec.scoring.receiver.ScoreNetworksBroadcastReceiver", false);
        } catch (IllegalArgumentException e) {
            eoa.m10825a("NetRec", e, "Unrecognized component: %s", "com.google.android.gms.netrec.scoring.receiver.ScoreNetworksBroadcastReceiver");
        }
    }

    /* renamed from: a */
    public static boolean m59989a(Context context) {
        try {
            context.getPackageManager().getPackageInfo(cfpm.m142486b(), 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m59990a(Context context, ComponentName componentName) {
        try {
            return context.getPackageManager().getComponentEnabledSetting(componentName) == 1;
        } catch (RuntimeException e) {
            return false;
        }
    }
}
