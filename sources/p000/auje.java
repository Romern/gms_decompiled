package p000;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: auje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auje {
    /* renamed from: a */
    static boolean m77152a(Context context) {
        int i = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager != null && userManager.getUserCount() > 1;
    }
}
