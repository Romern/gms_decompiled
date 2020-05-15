package p000;

import android.content.Context;

/* renamed from: bhbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhbm {

    /* renamed from: a */
    public static int f118262a = -1;

    /* renamed from: b */
    public static String f118263b;

    /* renamed from: a */
    public static boolean m100588a(Context context) {
        m100589b(context);
        return "com.google.android.gms.location.history".equals(f118263b);
    }

    /* renamed from: b */
    public static void m100589b(Context context) {
        if (f118263b == null) {
            int i = spn.m35897i(context, "com.google.android.gms.location.history");
            if (i == -1) {
                f118263b = "com.google.android.gms";
                f118262a = spn.m35897i(context, "com.google.android.gms");
                return;
            }
            f118263b = "com.google.android.gms.location.history";
            f118262a = i;
        }
    }
}
