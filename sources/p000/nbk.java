package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: nbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbk {

    /* renamed from: a */
    public final long[] f35184a = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: b */
    public final long[] f35185b = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: c */
    private final long f35186c = 27;

    public nbk() {
        long[] jArr = new long[64];
        jArr[0] = 27;
        for (int i = 1; i < 64; i++) {
            long j = jArr[i - 1];
            if ((Long.MIN_VALUE & j) == 0) {
                jArr[i] = j + j;
            } else {
                jArr[i] = this.f35186c ^ (j + j);
            }
        }
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = i2;
            int i4 = 0;
            while (i3 > 0 && i4 < 8) {
                if ((i3 & 1) == 1) {
                    long[] jArr2 = this.f35184a;
                    jArr2[i2] = jArr2[i2] ^ jArr[i4];
                }
                i3 >>>= 1;
                i4++;
            }
        }
        long[] jArr3 = new long[8];
        jArr3[0] = this.f35186c;
        for (int i5 = 65; i5 < 256; i5++) {
            long j2 = jArr3[(i5 - 1) % 8];
            if ((j2 & Long.MIN_VALUE) == 0) {
                jArr3[i5 % 8] = j2 + j2;
            } else {
                jArr3[i5 % 8] = (j2 + j2) ^ this.f35186c;
            }
        }
        for (int i6 = 0; i6 < 256; i6++) {
            int i7 = i6;
            int i8 = 0;
            while (i7 > 0 && i8 < 8) {
                if ((i7 & 1) == 1) {
                    long[] jArr4 = this.f35185b;
                    jArr4[i6] = jArr4[i6] ^ jArr3[i8];
                }
                i7 >>>= 1;
                i8++;
            }
        }
    }
}
