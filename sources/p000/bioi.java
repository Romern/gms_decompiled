package p000;

import android.util.Log;

/* renamed from: bioi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bioi {
    /* renamed from: a */
    public static void m102657a(String str) {
        Object[] objArr = {"?", str};
    }

    /* renamed from: b */
    public static void m102660b(String str, String str2) {
        Log.i(str, String.format("%s: %s", "?", str2));
    }

    /* renamed from: c */
    public static void m102662c(String str, String str2) {
        Log.w(str, String.format("%s: %s", "?", str2));
    }

    /* renamed from: d */
    public static void m102663d(String str, String str2) {
        Log.wtf(str, String.format("%s: %s", "?", str2));
    }

    /* renamed from: a */
    public static void m102658a(String str, String str2) {
        Log.e(str, String.format("%s: %s", "?", str2));
    }

    /* renamed from: b */
    public static void m102661b(String str, String str2, Throwable th) {
        Log.w(str, String.format("%s: %s\n%s", "?", str2, Log.getStackTraceString(th)));
    }

    /* renamed from: a */
    public static void m102659a(String str, String str2, Throwable th) {
        Log.i(str, String.format("%s: %s\n%s", "?", str2, Log.getStackTraceString(th)));
    }
}
