package p000;

import android.util.Log;

/* renamed from: ejt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ejt {
    /* renamed from: a */
    public static String m10551a(String str) {
        return str.length() == 0 ? new String("TransportRuntime.") : "TransportRuntime.".concat(str);
    }

    /* renamed from: a */
    public static void m10552a(String str, Object obj) {
        m10551a(str);
        new Object[1][0] = obj;
    }

    /* renamed from: a */
    public static void m10553a(String str, String str2) {
        Log.i(m10551a(str), str2);
    }
}
