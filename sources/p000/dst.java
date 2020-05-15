package p000;

import android.util.Log;

/* renamed from: dst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dst {
    /* renamed from: a */
    private static String m9252a(String str, String str2, Object... objArr) {
        if (objArr.length != 0) {
            String valueOf = String.valueOf(String.format("[%s]", str));
            String valueOf2 = String.valueOf(String.format(str2, objArr));
            return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        return String.format("[%s]%s", str, str2);
    }

    /* renamed from: b */
    public static void m9256b(String str, String str2) {
        if (m9255a(5)) {
            Log.w("ctxmgr", m9252a(str, str2, new Object[0]));
        }
    }

    /* renamed from: b */
    public static void m9257b(String str, String str2, Object obj) {
        if (m9255a(5)) {
            Log.w("ctxmgr", m9252a(str, str2, obj));
        }
    }

    /* renamed from: a */
    public static void m9253a(String str, String str2) {
        if (m9255a(6)) {
            Log.e("ctxmgr", m9252a(str, str2, new Object[0]));
        }
    }

    /* renamed from: a */
    public static void m9254a(String str, String str2, Object obj) {
        if (m9255a(6)) {
            Log.e("ctxmgr", m9252a(str, str2, obj));
        }
    }

    /* renamed from: a */
    private static boolean m9255a(int i) {
        return Log.isLoggable("ctxmgr", i);
    }
}
