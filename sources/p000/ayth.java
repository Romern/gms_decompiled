package p000;

/* renamed from: ayth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayth {

    /* renamed from: a */
    private static final char[] f98446a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m84785a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            char[] cArr2 = f98446a;
            char c = cArr2[(b >> 4) & 15];
            char c2 = cArr2[b & 15];
            int i2 = i + i;
            cArr[i2] = c;
            cArr[i2 + 1] = c2;
        }
        return new String(cArr);
    }
}
