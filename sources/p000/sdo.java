package p000;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: sdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sdo {
    /* renamed from: a */
    public static Object m34959a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: b */
    public static void m34973b(String str) {
        if (sto.m36305a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: c */
    public static void m34977c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* renamed from: a */
    public static void m34960a() {
        m34973b("Must not be called on the main application thread");
    }

    /* renamed from: b */
    public static void m34974b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m34961a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
    }

    /* renamed from: b */
    public static void m34975b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m34962a(int i, Object obj) {
        if (i == 0) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: b */
    public static void m34976b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m34963a(long j) {
        if (j == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    /* renamed from: a */
    public static void m34964a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            String name = Looper.myLooper() != null ? Looper.myLooper().getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m34965a(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m34966a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    /* renamed from: a */
    public static void m34967a(String str) {
        if (!sto.m36305a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m34968a(String str, ContentValues contentValues) {
        if (contentValues.containsKey(str) && contentValues.get(str) == null) {
            throw new IllegalArgumentException(str.concat(" cannot be set to null"));
        }
    }

    /* renamed from: a */
    public static void m34969a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m34970a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m34971a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m34972a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
