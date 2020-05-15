package p000;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: asjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjk {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public static ComponentName m74226a(Context context) {
        return new ComponentName(context, "com.google.android.gms.tapandpay.admin.TpDeviceAdminReceiver");
    }

    /* renamed from: b */
    public static synchronized boolean m74228b(Context context) {
        boolean d;
        synchronized (asjk.class) {
            int i = Build.VERSION.SDK_INT;
            d = m74230d(context);
            new atkm(context).f90420c.edit().putBoolean("was_password_sufficient", d).apply();
        }
        return d;
    }

    /* renamed from: d */
    static boolean m74230d(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).isDeviceSecure();
    }

    /* renamed from: e */
    public static void m74231e(Context context) {
        DevicePolicyManager devicePolicyManager;
        if (m74227a() && !m74232f(context)) {
            try {
                Method method = DevicePolicyManager.class.getMethod("setActiveAdmin", ComponentName.class, Boolean.TYPE);
                if (method != null && (devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy")) != null) {
                    method.invoke(devicePolicyManager, m74226a(context), false);
                }
            } catch (NoSuchMethodException e) {
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException e2) {
            }
        }
    }

    /* renamed from: f */
    public static boolean m74232f(Context context) {
        m74234h(context);
        return m74233g(context);
    }

    /* renamed from: g */
    public static boolean m74233g(Context context) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (devicePolicyManager != null) {
            return devicePolicyManager.isAdminActive(m74226a(context));
        }
        return false;
    }

    /* renamed from: h */
    public static void m74234h(Context context) {
        if (m74227a()) {
            PackageManager packageManager = context.getPackageManager();
            ComponentName a = m74226a(context);
            if (packageManager.getComponentEnabledSetting(a) != 1) {
                packageManager.setComponentEnabledSetting(a, 1, 1);
                return;
            }
            return;
        }
        PackageManager packageManager2 = context.getPackageManager();
        ComponentName a2 = m74226a(context);
        if (packageManager2.getComponentEnabledSetting(a2) == 1) {
            packageManager2.setComponentEnabledSetting(a2, 2, 1);
        }
    }

    /* renamed from: a */
    public static boolean m74227a() {
        if (cgwn.m147268r() == 28) {
            int i = Build.VERSION.SDK_INT;
            return false;
        } else if (((long) Build.VERSION.SDK_INT) <= cgwn.m147268r()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m74229c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return m74230d(context);
    }
}
