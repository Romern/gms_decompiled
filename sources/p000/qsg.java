package p000;

import android.content.Intent;
import android.os.Build;

/* renamed from: qsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsg {
    /* renamed from: a */
    public static Intent m32789a(String str) {
        int i = Build.VERSION.SDK_INT;
        if (str.startsWith("android-app:")) {
            return Intent.parseUri(str, 2);
        }
        return Intent.parseUri(str, 1);
    }

    /* renamed from: a */
    public static String m32790a(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        return intent.toUri(2);
    }
}
