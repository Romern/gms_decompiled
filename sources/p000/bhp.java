package p000;

/* renamed from: bhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhp {
    /* renamed from: a */
    public static int m3053a(String str) {
        String upperCase = str.toUpperCase();
        int i = 0;
        for (int i2 = 0; i2 < upperCase.length(); i2++) {
            i = (i * 16) + "0123456789ABCDEF".indexOf(upperCase.charAt(i2));
        }
        return i;
    }

    /* renamed from: b */
    public static int m3057b(byte[] bArr) {
        int i;
        int length = bArr.length;
        if (length <= 0 || length > 4) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Length must be between 1 and 4. Length = ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length == 4) {
            byte b = bArr[0];
            if (((b >>> 7) & 1) == 1) {
                String valueOf = String.valueOf(m3054a(b));
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Signed bit is set (leftmost bit): ") : "Signed bit is set (leftmost bit): ".concat(valueOf));
            }
            i = 0;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < length; i2++) {
            i += (bArr[i2] & 255) << (((length - i2) - 1) * 8);
        }
        return i;
    }

    /* renamed from: c */
    public static void m3059c(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(27);
        sb.append("CONTENT LENGTH::");
        sb.append(length);
        sb.toString();
        while (str.length() > 0) {
            if (str.length() > 4000) {
                str.substring(0, 4000);
                str = str.substring(4000);
            } else {
                str.substring(0, str.length());
                str = "";
            }
        }
    }

    /* renamed from: a */
    public static String m3054a(byte b) {
        String[] strArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        byte b2 = b & 255;
        String valueOf = String.valueOf(strArr[b2 >>> 4]);
        String valueOf2 = String.valueOf(strArr[b2 & 15]);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public static String m3055a(int i) {
        String hexString = Integer.toHexString(i);
        if (hexString.length() % 2 != 0) {
            String valueOf = String.valueOf(hexString);
            hexString = valueOf.length() == 0 ? new String("0") : "0".concat(valueOf);
        }
        return hexString.toUpperCase();
    }

    /* renamed from: a */
    public static String m3056a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toHexString((b & 255) | -256).substring(6));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m3058b(String str) {
        return m3055a(str.length() / 2) + str;
    }
}
