package p000;

/* renamed from: asti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asti {

    /* renamed from: a */
    static final char[] f89686a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    static final char[] f89687b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m74760a(byte[] bArr) {
        return m74761a(bArr, f89687b);
    }

    /* renamed from: b */
    public static String m74763b(byte[] bArr) {
        return m74761a(bArr, f89686a);
    }

    /* renamed from: a */
    private static String m74761a(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append(cArr[(b & 240) >> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m74762a(String str) {
        boolean z;
        if (str.length() % 2 != 0) {
            String valueOf = String.valueOf(str);
            str = valueOf.length() == 0 ? new String("0") : "0".concat(valueOf);
        }
        int length = str.length();
        if (length % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34976b(z, "String not of even length: %s", str);
        byte[] bArr = new byte[(length / 2)];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            char charAt2 = str.charAt(i + 1);
            int digit = Character.digit(charAt, 16);
            int digit2 = Character.digit(charAt2, 16);
            sdo.m34976b(digit != -1, "Invalid character: '%s'", String.valueOf(charAt));
            sdo.m34976b(digit2 != -1, "Invalid character: '%s'", String.valueOf(charAt2));
            bArr[i2] = (byte) ((digit << 4) | digit2);
            i += 2;
            i2++;
        }
        return bArr;
    }
}
