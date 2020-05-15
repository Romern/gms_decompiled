package p000;

import android.util.Log;
import java.util.Locale;

/* renamed from: absg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absg {
    static {
        new sbw("Icing");
    }

    /* renamed from: a */
    public static int m48183a() {
        if (!Log.isLoggable("Icing", 2)) {
            return Log.isLoggable("Icing", 3) ? 1 : 0;
        }
        return 2;
    }

    /* renamed from: b */
    public static void m48191b(String str) {
        if (Log.isLoggable("Icing", 6)) {
            m48209f(str);
            Log.e("Icing", str);
        }
    }

    /* renamed from: c */
    public static void m48196c(String str) {
        if (Log.isLoggable("Icing", 4)) {
            m48209f(str);
            Log.i("Icing", str);
        }
    }

    /* renamed from: d */
    public static void m48201d(String str) {
        if (Log.isLoggable("Icing", 2)) {
            m48209f(str);
            Log.v("Icing", str);
        }
    }

    /* renamed from: e */
    public static void m48205e(String str) {
        if (Log.isLoggable("Icing", 5)) {
            m48209f(str);
            Log.w("Icing", str);
        }
    }

    /* renamed from: f */
    private static void m48209f(String str) {
        acry acry;
        if (celx.m137222b() && (acry = (acry) acsf.f60663a.get()) != null && str != null) {
            byne byne = acry.f60652a;
            botw botw = acry.f60653b;
            bxvf bxvf = (bxvf) botz.f134902c.mo74144da();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            botz botz = (botz) bxvf.f164949b;
            str.getClass();
            botz.f134904a |= 1;
            botz.f134905b = str;
            byne.mo74399a(botw, (botz) bxvf.mo74062i());
        }
    }

    /* renamed from: g */
    public static void m48211g(String str, Object... objArr) {
        m48187a("Icing", str, objArr);
    }

    /* renamed from: h */
    private static String m48212h(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: b */
    public static void m48192b(String str, Object obj) {
        if (Log.isLoggable("Icing", 6)) {
            String h = m48212h(str, obj);
            m48209f(h);
            Log.e("Icing", h);
        }
    }

    /* renamed from: c */
    public static void m48197c(String str, Object obj) {
        if (Log.isLoggable("Icing", 4)) {
            String h = m48212h(str, obj);
            m48209f(h);
            Log.i("Icing", h);
        }
    }

    /* renamed from: d */
    public static void m48202d(String str, Object obj) {
        if (Log.isLoggable("Icing", 2)) {
            String h = m48212h(str, obj);
            m48209f(h);
            Log.v("Icing", h);
        }
    }

    /* renamed from: e */
    public static void m48206e(String str, Object obj) {
        if (Log.isLoggable("Icing", 5)) {
            String h = m48212h(str, obj);
            m48209f(h);
            Log.w("Icing", h);
        }
    }

    /* renamed from: a */
    public static void m48184a(String str) {
        if (Log.isLoggable("Icing", 3)) {
            m48209f(str);
            Log.d("Icing", str);
        }
    }

    /* renamed from: b */
    public static void m48193b(String str, Object obj, Object obj2) {
        if (Log.isLoggable("Icing", 6)) {
            String h = m48212h(str, obj, obj2);
            m48209f(h);
            Log.e("Icing", h);
        }
    }

    /* renamed from: c */
    public static void m48198c(String str, Object obj, Object obj2) {
        if (Log.isLoggable("Icing", 4)) {
            String h = m48212h(str, obj, obj2);
            m48209f(h);
            Log.i("Icing", h);
        }
    }

    /* renamed from: d */
    public static void m48203d(String str, Object obj, Object obj2) {
        if (Log.isLoggable("Icing", 2)) {
            String h = m48212h(str, obj, obj2);
            m48209f(h);
            Log.v("Icing", h);
        }
    }

    /* renamed from: e */
    public static void m48207e(String str, Object obj, Object obj2) {
        if (Log.isLoggable("Icing", 5)) {
            String h = m48212h(str, obj, obj2);
            m48209f(h);
            Log.w("Icing", h);
        }
    }

    /* renamed from: a */
    public static void m48185a(String str, Object obj) {
        if (Log.isLoggable("Icing", 3)) {
            String h = m48212h(str, obj);
            m48209f(h);
            Log.d("Icing", h);
        }
    }

    /* renamed from: b */
    public static void m48194b(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 3)) {
            String h = m48212h(str, objArr);
            m48209f(h);
            Log.d("Icing", h);
        }
    }

    /* renamed from: c */
    public static void m48199c(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 6)) {
            String h = m48212h(str, objArr);
            m48209f(h);
            Log.e("Icing", h);
        }
    }

    /* renamed from: d */
    public static void m48204d(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 4)) {
            String h = m48212h(str, objArr);
            m48209f(h);
            Log.i("Icing", h);
        }
    }

    /* renamed from: e */
    public static void m48208e(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 2)) {
            String h = m48212h(str, objArr);
            m48209f(h);
            Log.v("Icing", h);
        }
    }

    /* renamed from: a */
    public static void m48186a(String str, Object obj, Object obj2) {
        if (Log.isLoggable("Icing", 3)) {
            String h = m48212h(str, obj, obj2);
            m48209f(h);
            Log.d("Icing", h);
        }
    }

    /* renamed from: b */
    public static void m48195b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("Icing", 6)) {
            m48189a(th, m48212h(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m48200c(Throwable th, String str, Object... objArr) {
        if (!Log.isLoggable("Icing", 5)) {
            return;
        }
        if (Log.isLoggable("Icing", 3)) {
            String h = m48212h(str, objArr);
            m48209f(h);
            Log.w("Icing", h, th);
            return;
        }
        String h2 = m48212h(str, objArr);
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(h2).length() + 2 + String.valueOf(valueOf).length());
        sb.append(h2);
        sb.append(": ");
        sb.append(valueOf);
        String sb2 = sb.toString();
        m48209f(sb2);
        Log.w("Icing", sb2);
    }

    /* renamed from: a */
    public static void m48187a(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 2)) {
            m48209f(m48212h(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m48188a(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 2)) {
            m48209f(m48212h(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m48189a(Throwable th, String str) {
        if (!Log.isLoggable("Icing", 6)) {
            return;
        }
        if (Log.isLoggable("Icing", 3)) {
            m48209f(str);
            Log.e("Icing", str, th);
            return;
        }
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(": ");
        sb.append(valueOf);
        String sb2 = sb.toString();
        m48209f(sb2);
        Log.e("Icing", sb2);
    }

    /* renamed from: f */
    public static void m48210f(String str, Object... objArr) {
        if (Log.isLoggable("Icing", 5)) {
            String h = m48212h(str, objArr);
            m48209f(h);
            Log.w("Icing", h);
        }
    }

    /* renamed from: a */
    public static void m48190a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("Icing", 3)) {
            String h = m48212h(str, objArr);
            m48209f(h);
            Log.d("Icing", h, th);
        }
    }
}
