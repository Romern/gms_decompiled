package p000;

/* renamed from: srv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class srv {

    /* renamed from: a */
    public static final char[] f45064a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static final char[] f45065b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static String m36160a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f45064a;
            cArr[i] = cArr2[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m36162b(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return new String();
        }
        char[] cArr = new char[((length * 3) - 1)];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length2 = bArr.length - 1;
            if (i < length2) {
                byte b = bArr[i] & 255;
                int i3 = i2 + 1;
                char[] cArr2 = f45065b;
                cArr[i2] = cArr2[b >>> 4];
                int i4 = i3 + 1;
                cArr[i3] = cArr2[b & 15];
                cArr[i4] = ':';
                i++;
                i2 = i4 + 1;
            } else {
                byte b2 = bArr[length2] & 255;
                char[] cArr3 = f45065b;
                cArr[i2] = cArr3[b2 >>> 4];
                cArr[i2 + 1] = cArr3[b2 & 15];
                return new String(cArr);
            }
        }
    }

    /* renamed from: c */
    public static String m36163c(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return new String();
        }
        char[] cArr = new char[((length * 3) - 1)];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length2 = bArr.length - 1;
            if (i < length2) {
                byte b = bArr[i] & 255;
                int i3 = i2 + 1;
                char[] cArr2 = f45064a;
                cArr[i2] = cArr2[b >>> 4];
                int i4 = i3 + 1;
                cArr[i3] = cArr2[b & 15];
                cArr[i4] = ':';
                i++;
                i2 = i4 + 1;
            } else {
                byte b2 = bArr[length2] & 255;
                char[] cArr3 = f45064a;
                cArr[i2] = cArr3[b2 >>> 4];
                cArr[i2 + 1] = cArr3[b2 & 15];
                return new String(cArr);
            }
        }
    }

    /* renamed from: d */
    public static String m36164d(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            sb.append(f45065b[(bArr[i] & 240) >>> 4]);
            sb.append(f45065b[bArr[i] & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m36161a(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            int i = 0;
            while (i < length) {
                int i2 = i + 2;
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
                i = i2;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
}
