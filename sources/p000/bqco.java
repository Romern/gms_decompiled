package p000;

import java.util.Arrays;

/* renamed from: bqco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqco {

    /* renamed from: a */
    private static final byte[] f140480a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        f140480a = bArr;
    }

    /* renamed from: a */
    static int m112587a(char c) {
        if (c < 128) {
            return f140480a[c];
        }
        return -1;
    }
}
