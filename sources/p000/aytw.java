package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import com.google.android.libraries.directboot.DirectBootHelperService;
import java.util.List;

/* renamed from: aytw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aytw {

    /* renamed from: a */
    private static UserManager f98481a;

    /* renamed from: b */
    private static volatile boolean f98482b = false;

    /* renamed from: c */
    private static boolean f98483c = false;

    private aytw() {
    }

    /* renamed from: a */
    public static synchronized void m84812a() {
        synchronized (aytw.class) {
            f98483c = true;
        }
    }

    /* renamed from: b */
    public static void m84814b() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: c */
    public static Context m84816c(Context context) {
        return !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0079, code lost:
        return r3;
     */
    /* renamed from: e */
    private static boolean m84818e(Context context) {
        if (f98482b) {
            return true;
        }
        synchronized (aytw.class) {
            if (f98482b) {
                return true;
            }
            boolean z = false;
            if (f98483c) {
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setClassName(context, DirectBootHelperService.class.getName()), 512);
                if (queryIntentServices != null) {
                    if (!queryIntentServices.isEmpty()) {
                        z = true;
                    }
                }
            } else {
                int i = 1;
                while (true) {
                    if (i <= 2) {
                        if (f98481a == null) {
                            f98481a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f98481a;
                        if (userManager == null) {
                            z = true;
                            break;
                        }
                        try {
                            if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                z = true;
                            }
                        } catch (NullPointerException e) {
                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                            f98481a = null;
                            i++;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    f98481a = null;
                }
            }
            if (z) {
                f98482b = true;
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: d */
    public static Context m84817d(Context context) {
        int i = Build.VERSION.SDK_INT;
        return m84816c(context);
    }

    /* renamed from: a */
    public static boolean m84813a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return !m84818e(context);
    }

    /* renamed from: b */
    public static boolean m84815b(Context context) {
        int i = Build.VERSION.SDK_INT;
        return m84818e(context);
    }
}
