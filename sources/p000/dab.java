package p000;

import android.util.Base64;

/* renamed from: dab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dab {
    /* renamed from: a */
    public static String m8076a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, !z ? 2 : 11);
    }

    /* renamed from: a */
    public static byte[] m8077a(String str, boolean z) {
        int i;
        if (!z) {
            i = 2;
        } else {
            i = 11;
        }
        byte[] decode = Base64.decode(str, i);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unable to decode ") : "Unable to decode ".concat(valueOf));
    }
}
