package p000;

import android.util.Log;
import java.util.Locale;

/* renamed from: acnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acnv {
    /* renamed from: a */
    public static String m49540a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: b */
    public static void m49546b(String str) {
        if (Log.isLoggable("IcingInternalCorpora", 6)) {
            Log.e("IcingInternalCorpora", str);
        }
    }

    /* renamed from: c */
    public static void m49550c(String str) {
        if (Log.isLoggable("IcingInternalCorpora", 4)) {
            Log.i("IcingInternalCorpora", str);
        }
    }

    /* renamed from: d */
    public static void m49554d(String str) {
        if (Log.isLoggable("IcingInternalCorpora", 2)) {
            Log.v("IcingInternalCorpora", str);
        }
    }

    /* renamed from: e */
    public static void m49556e(String str) {
        if (Log.isLoggable("IcingInternalCorpora", 5)) {
            Log.w("IcingInternalCorpora", str);
        }
    }

    /* renamed from: a */
    public static void m49541a(String str) {
        if (Log.isLoggable("IcingInternalCorpora", 3)) {
            Log.d("IcingInternalCorpora", str);
        }
    }

    /* renamed from: b */
    public static void m49547b(String str, Object obj) {
        if (Log.isLoggable("IcingInternalCorpora", 6)) {
            Log.e("IcingInternalCorpora", m49540a(str, obj));
        }
    }

    /* renamed from: c */
    public static void m49551c(String str, Object obj) {
        if (Log.isLoggable("IcingInternalCorpora", 4)) {
            Log.i("IcingInternalCorpora", m49540a(str, obj));
        }
    }

    /* renamed from: d */
    public static void m49555d(String str, Object obj) {
        if (Log.isLoggable("IcingInternalCorpora", 2)) {
            Log.v("IcingInternalCorpora", m49540a(str, obj));
        }
    }

    /* renamed from: e */
    public static void m49557e(String str, Object obj) {
        if (Log.isLoggable("IcingInternalCorpora", 5)) {
            Log.w("IcingInternalCorpora", m49540a(str, obj));
        }
    }

    /* renamed from: a */
    public static void m49542a(String str, Object obj) {
        if (Log.isLoggable("IcingInternalCorpora", 3)) {
            Log.d("IcingInternalCorpora", m49540a(str, obj));
        }
    }

    /* renamed from: b */
    public static void m49548b(String str, Object obj, Object obj2) {
        if (Log.isLoggable("IcingInternalCorpora", 4)) {
            Log.i("IcingInternalCorpora", m49540a(str, obj, obj2));
        }
    }

    /* renamed from: c */
    public static void m49552c(String str, Object obj, Object obj2) {
        if (Log.isLoggable("IcingInternalCorpora", 2)) {
            Log.v("IcingInternalCorpora", m49540a(str, obj, obj2));
        }
    }

    /* renamed from: a */
    public static void m49543a(String str, Object obj, Object obj2) {
        if (Log.isLoggable("IcingInternalCorpora", 3)) {
            Log.d("IcingInternalCorpora", m49540a(str, obj, obj2));
        }
    }

    /* renamed from: b */
    public static void m49549b(String str, Object... objArr) {
        if (Log.isLoggable("IcingInternalCorpora", 3)) {
            Log.d("IcingInternalCorpora", m49540a(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m49553c(String str, Object... objArr) {
        if (Log.isLoggable("IcingInternalCorpora", 2)) {
            Log.v("IcingInternalCorpora", m49540a(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m49544a(Throwable th, String str, Object... objArr) {
        if (!Log.isLoggable("IcingInternalCorpora", 6)) {
            return;
        }
        if (Log.isLoggable("IcingInternalCorpora", 3)) {
            Log.e("IcingInternalCorpora", m49540a(str, objArr), th);
            return;
        }
        String a = m49540a(str, objArr);
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("IcingInternalCorpora", sb.toString());
    }

    /* renamed from: a */
    public static boolean m49545a() {
        return Log.isLoggable("IcingInternalCorpora", 3);
    }
}
