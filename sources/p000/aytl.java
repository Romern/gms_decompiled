package p000;

import android.util.Log;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: aytl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aytl {
    /* renamed from: a */
    private static String m84791a(String str, Object[] objArr) {
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

    /* renamed from: a */
    public static void m84792a(int i, String str, Throwable th, String str2, Object[] objArr) {
        String str3 = str.length() == 0 ? new String("SIGNAL_") : "SIGNAL_".concat(str);
        if (str3.length() > 23) {
            m84792a(6, "SIGNAL_", null, "Log tag %s is longer than 23 chars.", new Object[]{str3});
            str3 = str3.substring(0, 23);
        }
        String a = m84791a(str2, objArr);
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
    public static void m84793a(String str, String str2, Object... objArr) {
        m84792a(5, str, null, str2, objArr);
    }

    /* renamed from: a */
    public static void m84794a(String str, Throwable th, String str2, Object... objArr) {
        m84792a(6, str, th, str2, objArr);
    }
}
