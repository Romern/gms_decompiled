package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: avls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avls {

    /* renamed from: a */
    private static final sek f93327a = avpq.m79016c("Device");

    /* renamed from: a */
    public static boolean m78732a() {
        return stn.m36304a("ro.build.ab_update", "").equalsIgnoreCase("true");
    }

    /* renamed from: b */
    public static boolean m78734b() {
        return stn.m36304a("ro.boot.vr", "").equals("1");
    }

    /* renamed from: c */
    public static int m78736c(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                return (intExtra * 100) / intExtra2;
            }
        }
        return 100;
    }

    /* renamed from: e */
    public static boolean m78739e(Context context) {
        return rfy.m33550g(context);
    }

    /* renamed from: f */
    public static boolean m78740f(Context context) {
        srd.m36078b(context);
        return false;
    }

    /* renamed from: g */
    public static boolean m78741g(Context context) {
        if (ssw.m36269a() && !cfsy.f185667a.mo6606a().mo82690b()) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            for (int i : ((SubscriptionManager) context.getSystemService("telephony_subscription_service")).getActiveSubscriptionIdList()) {
                if (telephonyManager.createForSubscriptionId(i).isIccLockEnabled()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static void m78743i(Context context) {
        sre.m36087g(context);
    }

    /* renamed from: j */
    public static void m78744j(Context context) {
        sre.m36088h(context);
    }

    /* renamed from: k */
    public static void m78745k(Context context) {
        sre.m36089i(context);
    }

    /* renamed from: b */
    public static boolean m78735b(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        return (registerReceiver == null || registerReceiver.getIntExtra("plugged", 0) == 0) ? false : true;
    }

    /* renamed from: d */
    public static boolean m78738d(Context context) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        bmxy.m108588a(true);
        return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
    }

    /* renamed from: h */
    public static boolean m78742h(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((KeyguardManager) context.getSystemService("keyguard")).isDeviceSecure();
    }

    /* renamed from: a */
    public static boolean m78733a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((PowerManager) context.getSystemService("power")).isDeviceIdleMode();
    }

    /* renamed from: c */
    public static long m78737c() {
        String a = stn.m36304a("ro.build.version.security_patch", "");
        if (bmxx.m108577a(a)) {
            f93327a.mo25414c("Failed to get security patch level.", new Object[0]);
            return 0;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(a).getTime();
        } catch (ParseException e) {
            f93327a.mo25414c("Unable to parse the patch level: %s.", a);
            return 0;
        }
    }
}
