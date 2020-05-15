package p000;

import android.util.Log;

/* renamed from: avxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxz {
    /* renamed from: a */
    public static void m79525a(String str, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            Log.e("Vision", String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m79527b(String str, Object... objArr) {
        if (Log.isLoggable("Vision", 4)) {
            Log.i("Vision", String.format(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m79528c(String str, Object... objArr) {
        if (Log.isLoggable("Vision", 5)) {
            Log.w("Vision", String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m79526a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            String format = String.format(str, objArr);
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2 + String.valueOf(valueOf).length());
            sb.append(format);
            sb.append(": ");
            sb.append(valueOf);
            Log.e("Vision", sb.toString());
        }
    }
}
