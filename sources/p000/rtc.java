package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserManager;
import android.util.Log;
import java.util.Set;

/* renamed from: rtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rtc {

    /* renamed from: a */
    public static int f43639a = 0;

    /* renamed from: d */
    public static rtb f43640d = null;

    /* renamed from: e */
    private static final Object f43641e = new Object();

    /* renamed from: f */
    private static Context f43642f;

    /* renamed from: g */
    private static Set f43643g;

    /* renamed from: b */
    public final String f43644b;

    /* renamed from: c */
    protected final Object f43645c;

    protected rtc(String str, Object obj) {
        this.f43644b = str;
        this.f43645c = obj;
    }

    /* renamed from: a */
    public static SharedPreferences m34374a(Context context) {
        return m34381b(context.getApplicationContext().createDeviceProtectedStorageContext());
    }

    /* renamed from: b */
    static SharedPreferences m34381b(Context context) {
        return context.getSharedPreferences("gservices-direboot-cache", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo25079a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo25080a(Context context, String str, Object obj) {
        throw null;
    }

    /* renamed from: b */
    public static boolean m34382b() {
        boolean z;
        synchronized (f43641e) {
            z = f43640d != null;
        }
        return z;
    }

    /* renamed from: c */
    private static boolean m34383c(Context context) {
        int i = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        if (!userManager.isUserUnlocked()) {
            return userManager.isUserRunning(Process.myUserHandle());
        }
        return false;
    }

    /* renamed from: a */
    public static rtc m34375a(String str, Float f) {
        return new rsz(str, f);
    }

    /* renamed from: a */
    public static rtc m34376a(String str, Integer num) {
        return new rsy(str, num);
    }

    /* renamed from: a */
    public static rtc m34377a(String str, Long l) {
        return new rsx(str, l);
    }

    /* renamed from: a */
    public static rtc m34378a(String str, String str2) {
        return new rta(str, str2);
    }

    /* renamed from: c */
    public final Object mo25081c() {
        boolean z;
        Set set;
        Context context;
        long clearCallingIdentity;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        synchronized (f43641e) {
            z = false;
            if (f43642f != null && m34383c(f43642f)) {
                z = true;
            }
            set = f43643g;
            context = f43642f;
        }
        if (!z) {
            synchronized (f43641e) {
                f43643g = null;
                f43642f = null;
            }
            try {
                Object a = mo25079a();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return a;
            } catch (SecurityException e) {
                clearCallingIdentity = Binder.clearCallingIdentity();
                Object a2 = mo25079a();
                Binder.restoreCallingIdentity(clearCallingIdentity);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return a2;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        } else if (set == null || set.contains(this.f43644b)) {
            return mo25080a(context, this.f43644b, this.f43645c);
        } else {
            String valueOf = String.valueOf(this.f43644b);
            Log.e("GservicesValue", valueOf.length() == 0 ? new String("Gservices key not whitelisted for directboot access: ") : "Gservices key not whitelisted for directboot access: ".concat(valueOf));
            return this.f43645c;
        }
    }

    /* renamed from: a */
    public static rtc m34379a(String str, boolean z) {
        return new rsw(str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static void m34380a(Context context, Set set) {
        synchronized (f43641e) {
            if (f43640d == null) {
                rtb rtb = new rtb(context.getContentResolver());
                synchronized (f43641e) {
                    f43640d = rtb;
                    f43643g = null;
                    f43642f = null;
                    if (context != null && m34383c(context)) {
                        f43643g = set;
                        f43642f = context.getApplicationContext().createDeviceProtectedStorageContext();
                    }
                }
            }
            if (f43639a == 0) {
                try {
                    f43639a = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("GservicesValue", e.toString());
                }
            }
        }
    }
}
