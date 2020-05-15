package p000;

import android.util.Log;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: azoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azoj {
    /* renamed from: a */
    private static String m85928a(String str, Object[] objArr) {
        if (str == null) {
            return "null";
        }
        if (objArr.length == 0) {
            return str;
        }
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException e) {
            String valueOf = String.valueOf(Arrays.toString(objArr));
            return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        }
    }

    /* renamed from: b */
    public static void m85932b(String str, String str2, Object... objArr) {
        m85929a(5, str, null, str2, objArr);
    }

    /* renamed from: c */
    public static void m85933c(String str, String str2, Object... objArr) {
        m85929a(6, str, null, str2, objArr);
    }

    /* renamed from: a */
    private static void m85929a(int i, String str, Throwable th, String str2, Object[] objArr) {
        String valueOf = String.valueOf(str);
        String str3 = valueOf.length() == 0 ? new String("MS_") : "MS_".concat(valueOf);
        if (str3.length() > 23) {
            m85933c("MS_", "Log tag %s is longer than 23 chars.", str3);
            str3 = str3.substring(0, 23);
        }
        String a = m85928a(str2, objArr);
        if (th != null) {
            String stackTraceString = Log.getStackTraceString(th);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(stackTraceString).length());
            sb.append(a);
            sb.append(10);
            sb.append(stackTraceString);
            Log.println(i, str3, sb.toString());
            return;
        }
        Log.println(i, str3, a);
    }

    /* renamed from: a */
    public static void m85930a(String str, String str2, Object... objArr) {
        m85929a(4, str, null, str2, objArr);
    }

    /* renamed from: a */
    public static void m85931a(String str, Throwable th, String str2, Object... objArr) {
        m85929a(6, str, th, str2, objArr);
    }
}
