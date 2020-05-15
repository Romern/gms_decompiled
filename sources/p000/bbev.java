package p000;

import android.util.Log;
import java.util.Locale;

/* renamed from: bbev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbev {
    /* renamed from: a */
    public static String m87903a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: b */
    public static void m87909b(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 4)) {
            Log.i("MDD", m87903a(str, obj, obj2));
        }
    }

    /* renamed from: c */
    public static void m87912c(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", m87903a(str, obj, obj2));
        }
    }

    /* renamed from: a */
    public static void m87904a(String str) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", str);
        }
    }

    /* renamed from: b */
    public static void m87910b(String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", m87903a(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m87905a(String str, Object obj) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", m87903a(str, obj));
        }
    }

    /* renamed from: b */
    public static void m87911b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 5)) {
            String a = m87903a(str, objArr);
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("MDD", sb.toString());
        }
    }

    /* renamed from: a */
    public static void m87906a(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", m87903a(str, obj, obj2));
        }
    }

    /* renamed from: a */
    public static void m87907a(Throwable th, String str) {
        if (Log.isLoggable("MDD", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.e("MDD", sb.toString());
        }
    }

    /* renamed from: a */
    public static void m87908a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            m87907a(th, m87903a(str, objArr));
        }
    }
}
