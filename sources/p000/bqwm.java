package p000;

import java.util.Arrays;

/* renamed from: bqwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqwm extends bqur {
    public bqwm(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    public final int mo69334a() {
        return 24;
    }

    /* renamed from: a */
    public final int[] mo69335a(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            bqur.m113441a(iArr3, this.f141645a);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            bqur.m113439a(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            bqur.m113441a(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
