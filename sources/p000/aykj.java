package p000;

import android.content.Context;
import android.os.UserManager;

/* renamed from: aykj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aykj {
    /* renamed from: a */
    static boolean m84159a(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager != null && userManager.getUserCount() > 1;
    }
}
