package p000;

import android.util.Base64;

/* renamed from: vxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxv {
    /* renamed from: a */
    public static String m41562a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    public static String m41564b(String str) {
        return m41562a(m41563a(str));
    }

    /* renamed from: a */
    public static byte[] m41563a(String str) {
        String valueOf = String.valueOf(str);
        return (valueOf.length() == 0 ? new String("ERROR : ") : "ERROR : ".concat(valueOf)).getBytes();
    }
}
