package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserManager;
import android.provider.Settings;

/* renamed from: apgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apgy {

    /* renamed from: a */
    public final Context f84364a;

    /* renamed from: b */
    private volatile Boolean f84365b = null;

    /* renamed from: c */
    private volatile Boolean f84366c = null;

    public apgy(Context context) {
        this.f84364a = context;
    }

    /* renamed from: c */
    public static boolean m70271c(Context context) {
        return m70268b(context, "upload_apk_enable", 0) == 1;
    }

    /* renamed from: d */
    private static boolean m70272d(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager != null && userManager.hasUserRestriction("ensure_verify_apps");
    }

    /* renamed from: e */
    public final synchronized boolean mo47206e() {
        PackageInfo packageInfo;
        if (this.f84365b == null) {
            boolean z = false;
            try {
                packageInfo = this.f84364a.getPackageManager().getPackageInfo("com.android.vending", 0);
            } catch (PackageManager.NameNotFoundException e) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                if (packageInfo.versionCode < 80440000) {
                    this.f84365b = Boolean.valueOf(z);
                }
            }
            z = true;
            this.f84365b = Boolean.valueOf(z);
        }
        return this.f84365b.booleanValue();
    }

    /* renamed from: f */
    public final synchronized boolean mo47207f() {
        PackageInfo packageInfo;
        int i = Build.VERSION.SDK_INT;
        if (this.f84366c == null) {
            boolean z = false;
            try {
                packageInfo = this.f84364a.getPackageManager().getPackageInfo("com.android.vending", 0);
            } catch (PackageManager.NameNotFoundException e) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                if (packageInfo.versionCode < 80750000) {
                    this.f84366c = Boolean.valueOf(z);
                }
            }
            z = true;
            this.f84366c = Boolean.valueOf(z);
        }
        return this.f84366c.booleanValue();
    }

    /* renamed from: a */
    private static void m70266a(Context context, String str, int i) {
        int i2 = Build.VERSION.SDK_INT;
        Settings.Global.putInt(context.getContentResolver(), str, i);
    }

    /* renamed from: b */
    private static int m70268b(Context context, String str, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(context.getContentResolver(), str, i);
    }

    /* renamed from: g */
    private final boolean m70273g() {
        int i = Build.VERSION.SDK_INT;
        apgz apgz = new apgz(this.f84364a);
        int i2 = Build.VERSION.SDK_INT;
        return apgz.f84367a.isSystemUser();
    }

    /* renamed from: c */
    public final boolean mo47204c() {
        if (mo47202a(this.f84364a)) {
            return false;
        }
        if (!mo47207f() || m70273g()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo47205d() {
        if (mo47206e() || mo47207f()) {
            return mo47201a();
        }
        return m70270b(this.f84364a);
    }

    /* renamed from: a */
    public static void m70267a(Context context, boolean z) {
        m70266a(context, "upload_apk_enable", z ? 1 : 0);
    }

    /* renamed from: b */
    private static void m70269b(Context context, boolean z) {
        m70266a(context, "package_verifier_enable", z ? 1 : 0);
    }

    /* renamed from: b */
    public static boolean m70270b(Context context) {
        return m70268b(context, "package_verifier_enable", 1) == 1;
    }

    /* renamed from: a */
    public final void mo47200a(boolean z) {
        int i = -1;
        if (mo47207f()) {
            if (m70273g()) {
                m70269b(this.f84364a, true);
                if (z) {
                    i = 1;
                }
                Settings.Global.putInt(this.f84364a.getContentResolver(), "package_verifier_user_consent", i);
            }
        } else if (mo47206e()) {
            m70269b(this.f84364a, true);
            ContentResolver contentResolver = this.f84364a.getContentResolver();
            if (z) {
                i = 1;
            }
            Settings.Secure.putInt(contentResolver, "package_verifier_user_consent", i);
        } else {
            m70269b(this.f84364a, z);
        }
    }

    /* renamed from: b */
    public final boolean mo47203b() {
        if (mo47207f()) {
            if (mo47202a(this.f84364a)) {
                return true;
            }
            try {
                return Settings.Global.getInt(this.f84364a.getContentResolver(), "package_verifier_user_consent") == 1;
            } catch (Settings.SettingNotFoundException e) {
            }
        }
        if (mo47206e()) {
            int i = Build.VERSION.SDK_INT;
            return mo47202a(this.f84364a) || Settings.Secure.getInt(this.f84364a.getContentResolver(), "package_verifier_user_consent", 0) == 1;
        }
        int i2 = Build.VERSION.SDK_INT;
        return Settings.Secure.getInt(this.f84364a.getContentResolver(), "package_verifier_user_consent", 0) == 1;
    }

    /* renamed from: a */
    public final boolean mo47201a() {
        if (mo47207f()) {
            return mo47203b();
        }
        if (mo47206e()) {
            return mo47203b();
        }
        return mo47203b() && m70270b(this.f84364a);
    }

    /* renamed from: a */
    public final boolean mo47202a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (!mo47207f()) {
            return m70272d(context);
        }
        if (m70272d(context)) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        return false;
    }
}
