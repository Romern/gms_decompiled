package p000;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: jho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jho implements jhn {

    /* renamed from: a */
    public static final ComponentName f22496a = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.managed.admin.DeviceAdminReceiver");

    /* renamed from: b */
    private static final Logger f22497b = ght.m13171a("AuthManaged", "PasswordComplexityHelperImpl");

    /* renamed from: c */
    private static jho f22498c;

    private jho() {
    }

    /* renamed from: a */
    private static final synchronized void m16721a(Context context, boolean z) {
        synchronized (jho.class) {
            try {
                f22497b.mo25414c((!z ? "Disabling " : "Enabling ").concat("com.google.android.gms.auth.managed.admin.DeviceAdminReceiver"), new Object[0]);
                spn.m35856a(context, "com.google.android.gms.auth.managed.admin.DeviceAdminReceiver", z);
            } catch (IllegalArgumentException e) {
                f22497b.mo25415d("Component does not exist.", e, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static synchronized jho m16722b() {
        jho jho;
        synchronized (jho.class) {
            if (f22498c == null) {
                f22498c = new jho();
            }
            jho = f22498c;
        }
        return jho;
    }

    /* renamed from: d */
    private static final DevicePolicyManager m16724d(Context context) {
        return (DevicePolicyManager) context.getSystemService("device_policy");
    }

    /* renamed from: c */
    public final skc mo13751c(Context context) {
        return new skc(context);
    }

    /* renamed from: b */
    private static final void m16723b(Context context, boolean z) {
        try {
            f22497b.mo25414c((!z ? "Disabling " : "Enabling ").concat("com.google.android.gms.auth.managed.ui.SetNewPasswordActivity"), new Object[0]);
            spn.m35856a(context, "com.google.android.gms.auth.managed.ui.SetNewPasswordActivity", z);
        } catch (IllegalArgumentException e) {
            f22497b.mo25415d("Component does not exist.", e, new Object[0]);
        }
    }

    /* renamed from: c */
    public final boolean mo13752c() {
        mo13746a();
        return false;
    }

    /* renamed from: a */
    public final int mo13746a() {
        int i = Build.VERSION.SDK_INT;
        return 4;
    }

    /* renamed from: b */
    public final synchronized void mo13750b(Context context) {
        f22497b.mo25414c("Updating password complexity components state.", new Object[0]);
        mo13752c();
        m16721a(context, false);
        m16723b(context, false);
    }

    /* renamed from: a */
    public final synchronized void mo13747a(DevicePolicyManager devicePolicyManager) {
        mo13748a(devicePolicyManager, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo13748a(DevicePolicyManager devicePolicyManager, int i, int i2) {
        if (!ccgt.f178960a.mo6606a().mo75938a()) {
            devicePolicyManager.setPasswordQuality(f22496a, i);
            devicePolicyManager.setPasswordMinimumLength(f22496a, i2);
        } else if (devicePolicyManager.isAdminActive(f22496a)) {
            mo13752c();
        }
    }

    /* renamed from: a */
    public final boolean mo13749a(Context context) {
        m16721a(context, true);
        if (m16724d(context).isAdminActive(f22496a)) {
            return true;
        }
        try {
            Method method = DevicePolicyManager.class.getMethod("setActiveAdmin", ComponentName.class, Boolean.TYPE);
            if (method != null) {
                method.invoke(m16724d(context), f22496a, true);
                f22497b.mo25412b("Successfully enabled device admin.", new Object[0]);
                return m16724d(context).isAdminActive(f22496a);
            }
        } catch (NoSuchMethodException e) {
            f22497b.mo25412b("Cannot find DevicePolicyManager.setActiveAdmin()", new Object[0]);
        } catch (Exception e2) {
            f22497b.mo25412b("Unable to set as device admin silently.", new Object[0]);
        }
        return false;
    }
}
