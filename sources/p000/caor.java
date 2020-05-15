package p000;

/* renamed from: caor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caor {
    /* renamed from: b */
    public static byte[] m126890b() {
        return m126888a(27270);
    }

    /* renamed from: a */
    public static byte[] m126887a() {
        return m126888a(27013);
    }

    /* renamed from: c */
    public static byte[] m126891c() {
        return m126888a(28416);
    }

    /* renamed from: a */
    public static byte[] m126888a(char c) {
        return new byte[]{(byte) ((c >> 8) & 255), (byte) (c & 255)};
    }

    /* renamed from: a */
    public static byte[] m126889a(byte[] bArr) {
        byte[] a = m126888a(36864);
        if (bArr == null || a.length != 2) {
            throw new capg("Invalid APDU value or statusWord");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[(length + 2)];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(a, 0, bArr2, length, 2);
        return bArr2;
    }
}
