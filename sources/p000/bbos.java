package p000;

import android.util.Log;

/* renamed from: bbos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbos {
    /* renamed from: a */
    public static void m88288a(int i, String str, String str2, Throwable th) {
        String valueOf = String.valueOf(str);
        String str3 = valueOf.length() == 0 ? new String("LT_") : "LT_".concat(valueOf);
        if (str3.length() > 23) {
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 33);
            sb.append("Log tag ");
            sb.append(str3);
            sb.append(" is longer than 23 chars.");
            Log.println(6, "LogUtils", sb.toString());
            str3 = str3.substring(0, 23);
        }
        if (str2 == null) {
            str2 = "null";
        }
        Log.println(i, str3, str2);
        if (th != null) {
            Log.println(i, str3, Log.getStackTraceString(th));
        }
    }

    /* renamed from: b */
    public static void m88291b(String str, String str2) {
        m88288a(4, str, str2, null);
    }

    /* renamed from: c */
    public static void m88293c(String str, String str2) {
        m88288a(5, str, str2, null);
    }

    /* renamed from: d */
    public static void m88294d(String str, String str2) {
        m88288a(6, str, str2, null);
    }

    /* renamed from: b */
    public static void m88292b(String str, String str2, Throwable th) {
        m88288a(6, str, str2, th);
    }

    /* renamed from: a */
    public static void m88289a(String str, String str2) {
        m88288a(3, str, str2, null);
    }

    /* renamed from: a */
    public static void m88290a(String str, String str2, Throwable th) {
        m88288a(3, str, str2, th);
    }
}
