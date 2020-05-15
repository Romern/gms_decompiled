package p000;

import android.os.Build;
import android.os.Process;

/* renamed from: ankk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankk {

    /* renamed from: a */
    public static int f77014a = -1;

    /* renamed from: a */
    static String m64652a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("com.google.android.platform.") : "com.google.android.platform.".concat(valueOf);
    }

    /* renamed from: a */
    public static boolean m64653a() {
        int i = Build.VERSION.SDK_INT;
        if (!Process.myUserHandle().isOwner()) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }
}
