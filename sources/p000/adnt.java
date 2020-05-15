package p000;

import android.util.Log;
import java.util.IllegalFormatException;

/* renamed from: adnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adnt {
    /* renamed from: a */
    public static void m50868a(String str) {
        if (Log.isLoggable("GmscoreIpa", 4)) {
            Log.i("GmscoreIpa", str);
        }
    }

    /* renamed from: b */
    public static void m50871b(String str) {
        if (Log.isLoggable("GmscoreIpa", 5)) {
            Log.w("GmscoreIpa", str);
        }
    }

    /* renamed from: c */
    public static void m50874c(String str) {
        if (Log.isLoggable("GmscoreIpa", 6)) {
            Log.e("GmscoreIpa", str);
        }
    }

    /* renamed from: d */
    private static String m50876d(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m50869a(String str, Object... objArr) {
        if (Log.isLoggable("GmscoreIpa", 4)) {
            Log.i("GmscoreIpa", m50876d(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m50872b(String str, Object... objArr) {
        if (Log.isLoggable("GmscoreIpa", 5)) {
            Log.w("GmscoreIpa", m50876d(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m50875c(String str, Object... objArr) {
        if (Log.isLoggable("GmscoreIpa", 6)) {
            Log.e("GmscoreIpa", m50876d(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m50870a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("GmscoreIpa", 5)) {
            Log.w("GmscoreIpa", m50876d(str, objArr), th);
        }
    }

    /* renamed from: b */
    public static void m50873b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("GmscoreIpa", 6)) {
            Log.e("GmscoreIpa", m50876d(str, objArr), th);
        }
    }
}
