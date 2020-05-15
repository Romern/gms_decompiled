package p000;

import android.os.Build;

/* renamed from: bfgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfgd {

    /* renamed from: a */
    public static final String f113742a;

    static {
        String str;
        if (Build.FINGERPRINT != null) {
            String valueOf = String.valueOf(Build.FINGERPRINT);
            str = valueOf.length() == 0 ? new String("android/") : "android/".concat(valueOf);
        } else {
            str = "android";
        }
        f113742a = str;
    }
}
