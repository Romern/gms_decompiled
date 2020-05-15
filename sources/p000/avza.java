package p000;

import android.os.Build;

/* renamed from: avza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avza {
    static {
        if (Build.CPU_ABI2 == null || Build.CPU_ABI2.isEmpty() || Build.CPU_ABI2.equals("unknown")) {
            String str = Build.CPU_ABI;
            return;
        }
        String str2 = Build.CPU_ABI;
        String str3 = Build.CPU_ABI2;
    }

    /* renamed from: a */
    public static String[] m79537a() {
        int i = Build.VERSION.SDK_INT;
        return Build.SUPPORTED_ABIS;
    }
}
