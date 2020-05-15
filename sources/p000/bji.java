package p000;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bji {
    /* renamed from: a */
    public static byte m3192a(byte[] bArr, int i, byte b) {
        return (bArr[i] & b) != b ? (byte) -91 : 92;
    }

    /* renamed from: a */
    public static int m3194a(byte b, byte b2) {
        return ((char) (b << 8)) | (b2 & 255);
    }

    /* renamed from: b */
    public static int m3205b(String str) {
        if (str.length() >= 4) {
            return Integer.parseInt(str.substring(0, 4), 16);
        }
        Log.e("amexhceclient", "::getShortFromHexString::String Index Out of bound");
        throw new bic(bib.f3275e);
    }

    /* renamed from: c */
    public static int m3209c(byte[] bArr) {
        return (bArr[15] & 255) | (bArr[12] << 24) | ((bArr[13] & 255) << 16) | ((bArr[14] & 255) << 8);
    }

    /* renamed from: d */
    public static byte[] m3210d(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            Log.e("amexhceclient", "Hash Algo not supported!!!");
            throw new bic(bib.f3284n);
        }
    }

    /* renamed from: a */
    public static byte m3193a(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (bArr == null || bArr2 == null || i2 > bArr.length || i + i2 > bArr2.length) {
            return -91;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (bArr[i3] != bArr2[i + i3]) {
                return -91;
            }
        }
        return 92;
    }

    /* renamed from: a */
    public static int m3195a(byte[] bArr, int i) {
        return m3194a(bArr[i], bArr[i + 1]);
    }

    /* renamed from: b */
    public static long m3206b(byte[] bArr) {
        int i = 0;
        int i2 = 5;
        long j = 0;
        do {
            byte b = bArr[i];
            j = (((j * 10) + ((long) ((b >> 4) & 15))) * 10) + ((long) (b & 15));
            i++;
            i2--;
        } while (i2 != 0);
        return j;
    }

    /* renamed from: a */
    public static int m3196a(byte[] bArr, int i, long j) {
        int i2 = 3;
        while (i2 >= 0) {
            bArr[i] = (byte) ((int) (j >> (i2 * 8)));
            i2--;
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m3207b(byte[] bArr, int i) {
        return (long) ((bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8));
    }

    /* renamed from: a */
    public static int m3197a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        if (i + i3 > bArr.length || (i4 = i2 + i3) > bArr2.length) {
            Log.e("amexhceclient", "::arrayCopy::Array Index Out of bound");
            throw new bic(bib.f3275e);
        }
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return i4;
    }

    /* renamed from: b */
    public static MessageDigest m3208b(int i) {
        if (i == 170) {
            try {
                return MessageDigest.getInstance("SHA1");
            } catch (Exception e) {
                Log.e("amexhceclient", "Hash Algo not supported!!!");
                throw new bic(bib.f3284n);
            }
        } else if (i == 41) {
            return MessageDigest.getInstance("SHA256");
        } else {
            Log.e("amexhceclient", "Hash Algo not supported!!!");
            throw new bic(bib.f3284n);
        }
    }

    /* renamed from: a */
    public static String m3198a(byte b) {
        return String.format("%02x", Integer.valueOf(b & 255));
    }

    /* renamed from: a */
    public static String m3199a(int i) {
        return String.format("%04x", Integer.valueOf((char) i));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    static String m3200a(String str, int i) {
        StringBuilder sb = new StringBuilder(15);
        sb.append("%1$");
        sb.append(i);
        sb.append("s");
        return String.format(sb.toString(), str).replace(' ', '0');
    }

    /* renamed from: a */
    public static String m3201a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", Integer.valueOf(bArr[i] & 255)));
        }
        return sb.toString().toUpperCase();
    }

    /* renamed from: a */
    public static short m3202a(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s >> 8);
        bArr[i + 1] = (byte) s;
        return (short) (i + 2);
    }

    /* renamed from: a */
    public static void m3203a(byte[] bArr, int i, int i2, byte b) {
        if (i + i2 <= bArr.length) {
            while (true) {
                int i3 = i2 - 1;
                if (i2 > 0) {
                    bArr[i + i3] = b;
                    i2 = i3;
                } else {
                    return;
                }
            }
        } else {
            throw new bic("arrayFill::Array Index Out of bound!!!");
        }
    }

    /* renamed from: a */
    public static byte[] m3204a(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
