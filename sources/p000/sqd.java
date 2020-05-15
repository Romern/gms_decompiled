package p000;

import android.util.Base64;

/* renamed from: sqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqd {
    /* renamed from: a */
    public static byte[] m35966a(String str) {
        if (str != null) {
            return Base64.decode(str, 0);
        }
        return null;
    }

    /* renamed from: b */
    public static String m35968b(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 0);
        }
        return null;
    }

    /* renamed from: c */
    public static String m35970c(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 10);
        }
        return null;
    }

    /* renamed from: d */
    public static String m35972d(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 11);
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m35967a(byte[] bArr) {
        if (bArr != null) {
            return Base64.decode(bArr, 11);
        }
        return null;
    }

    /* renamed from: b */
    public static byte[] m35969b(String str) {
        if (str != null) {
            return Base64.decode(str, 10);
        }
        return null;
    }

    /* renamed from: c */
    public static byte[] m35971c(String str) {
        if (str != null) {
            return Base64.decode(str, 11);
        }
        return null;
    }
}
