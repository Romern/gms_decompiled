package p000;

/* renamed from: airv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class airv {

    /* renamed from: a */
    static final byte[] f69602a = {-112, 0};

    /* renamed from: b */
    static final byte[] f69603b = {0, 0};

    /* renamed from: a */
    public static int m57831a(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return bArr[0] & 255;
        }
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    /* renamed from: a */
    public static byte[] m57832a(int i) {
        if (i == 0) {
            return new byte[0];
        }
        if (i <= 255) {
            return new byte[]{(byte) i};
        } else if (i <= 65535) {
            return new byte[]{(byte) (i >> 8), (byte) i};
        } else {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Cannot convert ");
            sb.append(i);
            sb.append(" to 2 bytes because it's too large.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
