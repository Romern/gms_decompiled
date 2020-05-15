package p000;

import java.util.Arrays;

/* renamed from: caqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqh {
    /* renamed from: a */
    public static int m126960a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if ((bArr2[5] & 3) == 0 && (bArr3[2] & 3) == 0) {
            return 3;
        }
        byte b = bArr4[0];
        byte b2 = bArr4[1];
        byte b3 = bArr4[2];
        if (b == 0 || (b + b2) - 1 > bArr.length || b3 * b2 > 15 || b2 == 0 || b3 < 2) {
            return 3;
        }
        byte[] bArr5 = new byte[b2];
        for (int i = 0; i < b2; i++) {
            bArr5[i] = (byte) (bArr4[i + 3] & bArr[(b + i) - 1]);
        }
        for (int i2 = 1; i2 < b3; i2++) {
            byte[] bArr6 = new byte[b2];
            System.arraycopy(bArr4, (i2 * b2) + 3, bArr6, 0, b2);
            if (Arrays.equals(bArr5, bArr6)) {
                return 1;
            }
        }
        return 2;
    }
}
