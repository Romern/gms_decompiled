package p000;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;

/* renamed from: dia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dia {
    /* renamed from: a */
    public static boolean m8551a(Context context) {
        int i = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager == null) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        return userManager.isSystemUser();
    }

    /* renamed from: b */
    public static long m8552b(Context context) {
        int i = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager != null) {
            return userManager.getSerialNumberForUser(Process.myUserHandle());
        }
        return 0;
    }
}
