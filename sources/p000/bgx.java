package p000;

/* renamed from: bgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgx {
    /* renamed from: a */
    public static String m3000a(byte b) {
        String[] strArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        byte b2 = b & 255;
        String valueOf = String.valueOf(strArr[b2 >>> 4]);
        String valueOf2 = String.valueOf(strArr[b2 & 15]);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: b */
    public static String m3012b(byte[] bArr) {
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
    public static String m3001a(String str, int i) {
        if (str != null) {
            int i2 = i + i;
            return str.substring(i2, i2 + 2);
        }
        throw new bfq("Input data is Null!!");
    }

    /* renamed from: a */
    public static String m3002a(String str, int i, int i2) {
        if (str != null) {
            int i3 = i + i;
            return str.substring(i3, i2 + i2 + i3);
        }
        throw new bfq("Input data is Null!!");
    }

    /* renamed from: a */
    public static String m3003a(short s) {
        byte b = (byte) (s >>> 8);
        byte b2 = (byte) (s & 255);
        if (b == 0) {
            return m3000a(b2);
        }
        String valueOf = String.valueOf(m3000a(b));
        String valueOf2 = String.valueOf(m3000a(b2));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public static String m3004a(byte[] bArr) {
        return bArr != null ? m3005a(bArr, 0, bArr.length) : "";
    }

    /* renamed from: a */
    public static String m3005a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return "";
        }
        int length = bArr.length;
        if (length >= i + i2) {
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(Integer.toHexString((bArr[i + i3] & 255) | -256).substring(6));
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("startPos(");
        sb2.append(i);
        sb2.append(")+length(");
        sb2.append(i2);
        sb2.append(") > byteArray.length(");
        sb2.append(length);
        sb2.append(")");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public static short m3006a(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | (bArr[i] << 8));
    }

    /* renamed from: a */
    public static short m3007a(byte[] bArr, short s, byte b) {
        return ((byte) (bArr[s] & b)) == b ? (short) -23238 : 30003;
    }

    /* renamed from: a */
    public static short m3008a(byte[] bArr, short s, short s2) {
        bArr[s] = (byte) (s2 >> 8);
        bArr[s + 1] = (byte) s2;
        return (short) (s + 2);
    }

    /* renamed from: a */
    public static short m3009a(byte[] bArr, byte[] bArr2, short s) {
        if (s > bArr.length || s > bArr2.length) {
            return 30003;
        }
        for (short s2 = 0; s2 < s; s2 = (short) (s2 + 1)) {
            if (((byte) (bArr[s2] ^ bArr2[s2])) != 0) {
                return 30003;
            }
        }
        return -23238;
    }

    /* renamed from: a */
    public static void m3010a(byte[] bArr, short s, short s2, byte b) {
        while (true) {
            short s3 = (short) (s2 - 1);
            if (s2 >= 0) {
                bArr[s] = b;
                s = (short) (s + 1);
                s2 = s3;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m3011a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
