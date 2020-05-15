package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: amdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amdk {
    /* renamed from: a */
    public static String m62653a(String str, Object... objArr) {
        try {
            Locale locale = Locale.US;
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj instanceof Bundle) {
                    StringBuilder sb = new StringBuilder();
                    amdj.m62652a((Bundle) obj, "", sb);
                    obj = sb.toString();
                }
                objArr[i] = obj;
            }
            return String.format(locale, str, objArr);
        } catch (IllegalFormatException e) {
            String format = String.format(Locale.US, "Error formatting log string. fmtMessage:%s params: [%s]", str, TextUtils.join(", ", objArr));
            Log.e("PeopleModuleLog", format, e);
            return format;
        }
    }

    /* renamed from: b */
    public static void m62659b(String str, String str2, Object... objArr) {
        Log.e(str, m62653a(str2, objArr));
    }

    /* renamed from: a */
    public static void m62654a(String str, String str2, int i) {
        Log.i(str, m62653a(str2, Integer.valueOf(i)));
    }

    /* renamed from: a */
    public static void m62655a(String str, String str2, int i, int i2) {
        Log.i(str, m62653a(str2, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: a */
    public static void m62656a(String str, String str2, Object obj) {
        Log.i(str, m62653a(str2, obj));
    }

    /* renamed from: a */
    public static void m62657a(String str, String str2, Object obj, Object obj2) {
        Log.i(str, m62653a(str2, obj, obj2));
    }

    /* renamed from: a */
    public static void m62658a(String str, String str2, Object... objArr) {
        Log.w(str, m62653a(str2, objArr));
    }
}
