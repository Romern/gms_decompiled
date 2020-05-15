package p000;

import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* renamed from: aqfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqfr {

    /* renamed from: a */
    private static final String f85993a = aqfr.class.getCanonicalName();

    /* renamed from: b */
    private final ContentResolver f85994b;

    /* renamed from: c */
    private final Context f85995c;

    /* renamed from: d */
    private final aqfq f85996d = new aqfq();

    /* renamed from: e */
    private final String f85997e;

    /* renamed from: f */
    private final aqfp f85998f;

    public aqfr(Context context) {
        this.f85995c = context;
        this.f85994b = context.getContentResolver();
        if (cgkt.m145950v()) {
            int i = Build.VERSION.SDK_INT;
            this.f85997e = "android.provider.Settings$Secure";
        } else {
            int i2 = Build.VERSION.SDK_INT;
            this.f85997e = "android.provider.Settings$Global";
        }
        this.f85998f = new aqfp(context);
    }

    /* renamed from: a */
    private final int m71505a(String str, String str2) {
        try {
            return ((Integer) Class.forName(str).getMethod("getInt", ContentResolver.class, String.class, Integer.TYPE).invoke(null, this.f85994b, str2, 0)).intValue();
        } catch (ClassNotFoundException e) {
            m71506a(e);
            return 0;
        } catch (NoSuchMethodException e2) {
            m71506a(e2);
            return 0;
        } catch (IllegalAccessException e3) {
            m71506a(e3);
            return 0;
        } catch (InvocationTargetException e4) {
            m71506a(e4);
            return 0;
        }
    }

    /* renamed from: a */
    private static void m71506a(Exception exc) {
        if (Log.isLoggable(f85993a, 6)) {
            Log.e(f85993a, exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aqfq mo47832a() {
        boolean z;
        boolean z2;
        int i;
        boolean z3 = false;
        this.f85996d.f85985a = m71505a(this.f85997e, "adb_enabled") != 0;
        aqfq aqfq = this.f85996d;
        if (cgkt.m145950v()) {
            int i2 = Build.VERSION.SDK_INT;
            AppOpsManager appOpsManager = (AppOpsManager) this.f85995c.getSystemService("appops");
            PackageManager packageManager = this.f85995c.getPackageManager();
            Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                PackageInfo next = it.next();
                try {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(next.packageName, 0);
                    int i3 = Build.VERSION.SDK_INT;
                    if (appOpsManager.unsafeCheckOpNoThrow(AppOpsManager.permissionToOp("android.permission.REQUEST_INSTALL_PACKAGES"), applicationInfo.uid, next.packageName) == 0) {
                        z = true;
                        break;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    String str = f85993a;
                    String valueOf = String.valueOf(next.packageName);
                    Log.e(str, valueOf.length() == 0 ? new String("App not found for package name ") : "App not found for package name ".concat(valueOf), e);
                }
            }
        } else {
            z = m71505a(this.f85997e, "install_non_market_apps") != 0;
        }
        aqfq.f85986b = z;
        aqfq aqfq2 = this.f85996d;
        aqfp aqfp = this.f85998f;
        int i4 = Build.VERSION.SDK_INT;
        if (Settings.Global.getInt(aqfp.f85984a.getContentResolver(), "upload_apk_enable", 0) == 1) {
            z3 = true;
        }
        aqfq2.f85989e = z3;
        int i5 = Build.VERSION.SDK_INT;
        KeyguardManager keyguardManager = (KeyguardManager) this.f85995c.getSystemService("keyguard");
        if (!cgkt.f187180a.mo6606a().mo84022Y()) {
            z2 = keyguardManager.isKeyguardSecure();
        } else {
            int i6 = Build.VERSION.SDK_INT;
            z2 = keyguardManager.isDeviceSecure();
        }
        if (z2) {
            this.f85996d.f85990f = 2;
            int i7 = Build.VERSION.SDK_INT;
            aqfq aqfq3 = this.f85996d;
            Notification build = new Notification.Builder(this.f85995c).build();
            if (build != null) {
                int i8 = build.visibility;
                i = i8 != -1 ? i8 != 0 ? i8 != 1 ? 1 : 3 : 2 : 4;
            } else {
                i = 1;
            }
            aqfq3.f85991g = i;
        } else {
            this.f85996d.f85990f = 1;
        }
        this.f85996d.f85987c = m71505a(this.f85997e, "lock_screen_lock_after_timeout");
        this.f85996d.f85988d = ((DevicePolicyManager) this.f85995c.getSystemService("device_policy")).getStorageEncryptionStatus();
        if (this.f85995c.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            C1178ly a = C1178ly.m19617a(this.f85995c);
            if (!a.mo15435b()) {
                this.f85996d.f85992h = 1;
            } else if (a.mo15434a()) {
                this.f85996d.f85992h = 2;
            } else {
                this.f85996d.f85992h = 3;
            }
        }
        return this.f85996d;
    }
}
