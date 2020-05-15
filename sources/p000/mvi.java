package p000;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;

/* renamed from: mvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mvi {
    static {
        new lvn("RestrictedLockUtils");
    }

    /* renamed from: a */
    public static boolean m25661a(Context context, String str, int i) {
        int userRestrictionSource;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (((DevicePolicyManager) context.getSystemService("device_policy")) == null || (userRestrictionSource = ((UserManager) context.getSystemService("user")).getUserRestrictionSource(str, UserHandle.of(i))) == 0 || userRestrictionSource == 1) {
            return false;
        }
        boolean z2 = (userRestrictionSource & 4) != 0;
        if ((userRestrictionSource & 2) != 0) {
            z = true;
        }
        return z2 | z;
    }
}
