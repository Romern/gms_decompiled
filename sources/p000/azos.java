package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: azos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azos {
    /* renamed from: a */
    public static boolean m85957a(Context context) {
        return m85958a(context, "android.permission.READ_CONTACTS") || m85958a(context, "android.permission.WRITE_CONTACTS");
    }

    /* renamed from: b */
    public static boolean m85959b(Context context) {
        return m85958a(context, "android.permission.READ_PHONE_STATE");
    }

    /* renamed from: a */
    public static boolean m85958a(Context context, String str) {
        int i = Build.VERSION.SDK_INT;
        return context.checkSelfPermission(str) == 0;
    }
}
