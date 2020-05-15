package p000;

import java.nio.charset.Charset;

/* renamed from: yxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxw {

    /* renamed from: a */
    private static final Charset f54798a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static String m44960a(String str, String str2) {
        return (str2 == null || str2.startsWith("com.google.")) ? str : m44963b(str, str2);
    }

    /* renamed from: b */
    public static String m44963b(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        int length = str.length() + str2.length();
        byte[] bArr = new byte[length];
        int i = 0;
        System.arraycopy(str.getBytes(f54798a), 0, bArr, 0, str.length());
        System.arraycopy(str2.getBytes(f54798a), 0, bArr, str.length(), str2.length());
        int i2 = length & -4;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4 += 4) {
            int i5 = ((bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | (bArr[i4 + 3] << 24)) * -862048943;
            int i6 = i3 ^ (((i5 << 15) | (i5 >>> 17)) * 461845907);
            i3 = (((i6 >>> 19) | (i6 << 13)) * 5) - 430675100;
        }
        int i7 = length & 3;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    i = (bArr[i2 + 2] & 255) << 16;
                }
                int i8 = i3 ^ length;
                int i9 = (i8 ^ (i8 >>> 16)) * -2048144789;
                int i10 = (i9 ^ (i9 >>> 13)) * -1028477387;
                return Integer.toHexString(i10 ^ (i10 >>> 16));
            }
            i |= (bArr[i2 + 1] & 255) << 8;
        }
        int i11 = ((bArr[i2] & 255) | i) * -862048943;
        i3 ^= ((i11 >>> 17) | (i11 << 15)) * 461845907;
        int i82 = i3 ^ length;
        int i92 = (i82 ^ (i82 >>> 16)) * -2048144789;
        int i102 = (i92 ^ (i92 >>> 13)) * -1028477387;
        return Integer.toHexString(i102 ^ (i102 >>> 16));
    }

    /* renamed from: a */
    public static boolean m44961a(caae caae, caae caae2, String str) {
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        caah caah2 = caae2.f172330f;
        if (caah2 == null) {
            caah2 = caah.f172333d;
        }
        if (!bzzn.m126363a(caah, caah2)) {
            return false;
        }
        caad a = caad.m126389a(caae.f172329e);
        if (a == null) {
            a = caad.RAW;
        }
        caad a2 = caad.m126389a(caae2.f172329e);
        if (a2 == null) {
            a2 = caad.RAW;
        }
        if (!a.equals(a2) || !caae.f172327c.equals(caae2.f172327c)) {
            return false;
        }
        caaq caaq = caae.f172331g;
        if (caaq == null) {
            caaq = caaq.f172356h;
        }
        caaq caaq2 = caae2.f172331g;
        if (caaq2 == null) {
            caaq2 = caaq.f172356h;
        }
        caap a3 = caap.m126421a(caaq.f172360c);
        if (a3 == null) {
            a3 = caap.UNKNOWN;
        }
        caap a4 = caap.m126421a(caaq2.f172360c);
        if (a4 == null) {
            a4 = caap.UNKNOWN;
        }
        if (a3 != a4 || !m44962a(caaq.f172363f, caaq2.f172363f, str) || !m44962a(caaq.f172362e, caaq2.f172362e, str) || !m44962a(caaq.f172361d, caaq2.f172361d, str) || !m44962a(caaq.f172359b, caaq2.f172359b, str) || !caae.f172328d.equals(caae2.f172328d) || !bmxi.m108538a(yyd.m44986a(caae), yyd.m44986a(caae2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m44962a(String str, String str2, String str3) {
        return str.equals(str2) || m44963b(str, str3).equals(str2);
    }
}
