package p000;

import android.util.Log;
import java.util.Locale;

/* renamed from: wgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgn {

    /* renamed from: a */
    public static final sbw f50624a = new sbw("Family");

    /* renamed from: b */
    private static final boolean f50625b = "20.15.15 (120300-{{cl}})".contains("eng");

    /* renamed from: a */
    public static String m41920a(String str, String str2, Object... objArr) {
        if (objArr.length != 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m41922b(String str, String str2, Object... objArr) {
        if (m41921a(2)) {
            m41920a(str, str2, objArr);
        }
    }

    /* renamed from: c */
    public static void m41923c(String str, String str2, Object... objArr) {
        if (m41921a(3)) {
            m41920a(str, str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m41924d(String str, String str2, Object... objArr) {
        if (f50624a.mo25370a(4)) {
            f50624a.mo25366a("Family", m41920a(str, str2, objArr));
        }
    }

    /* renamed from: e */
    public static void m41925e(String str, String str2, Object... objArr) {
        if (f50624a.mo25370a(5)) {
            f50624a.mo25372b("Family", m41920a(str, str2, objArr));
        }
    }

    /* renamed from: f */
    public static void m41926f(String str, String str2, Object... objArr) {
        if (f50624a.mo25370a(6)) {
            f50624a.mo25377c("Family", m41920a(str, str2, objArr));
        }
    }

    /* renamed from: a */
    private static boolean m41921a(int i) {
        return f50625b || Log.isLoggable("Family", i);
    }
}
