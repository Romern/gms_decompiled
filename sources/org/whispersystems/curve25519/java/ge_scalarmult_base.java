package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ge_scalarmult_base {
    static void cmov(ge_precomp ge_precomp, ge_precomp ge_precomp2, int i) {
        fe_cmov.fe_cmov(ge_precomp.yplusx, ge_precomp2.yplusx, i);
        fe_cmov.fe_cmov(ge_precomp.yminusx, ge_precomp2.yminusx, i);
        fe_cmov.fe_cmov(ge_precomp.xy2d, ge_precomp2.xy2d, i);
    }

    static int equal(byte b, byte b2) {
        return ((b ^ b2) - 1) >>> 31;
    }

    public static void ge_scalarmult_base(ge_p3 ge_p3, byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        ge_p1p1 ge_p1p1 = new ge_p1p1();
        ge_p2 ge_p2 = new ge_p2();
        ge_precomp ge_precomp = new ge_precomp();
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] >>> 4) & 15);
            i2++;
        }
        int i4 = 0;
        byte b = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + b);
            bArr2[i4] = b2;
            int i5 = ((byte) (b2 + 8)) >> 4;
            bArr2[i4] = (byte) (b2 - (i5 << 4));
            i4++;
            b = i5;
        }
        bArr2[63] = (byte) (bArr2[63] + b);
        ge_p3_0.ge_p3_0(ge_p3);
        for (i = 1; i < 64; i += 2) {
            select(ge_precomp, i / 2, bArr2[i]);
            ge_madd.ge_madd(ge_p1p1, ge_p3, ge_precomp);
            ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p3, ge_p1p1);
        }
        ge_p3_dbl.ge_p3_dbl(ge_p1p1, ge_p3);
        ge_p1p1_to_p2.ge_p1p1_to_p2(ge_p2, ge_p1p1);
        ge_p2_dbl.ge_p2_dbl(ge_p1p1, ge_p2);
        ge_p1p1_to_p2.ge_p1p1_to_p2(ge_p2, ge_p1p1);
        ge_p2_dbl.ge_p2_dbl(ge_p1p1, ge_p2);
        ge_p1p1_to_p2.ge_p1p1_to_p2(ge_p2, ge_p1p1);
        ge_p2_dbl.ge_p2_dbl(ge_p1p1, ge_p2);
        ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p3, ge_p1p1);
        for (int i6 = 0; i6 < 64; i6 += 2) {
            select(ge_precomp, i6 / 2, bArr2[i6]);
            ge_madd.ge_madd(ge_p1p1, ge_p3, ge_precomp);
            ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p3, ge_p1p1);
        }
    }

    static int negative(byte b) {
        return (int) (((long) b) >>> 63);
    }

    static void select(ge_precomp ge_precomp, int i, byte b) {
        ge_precomp[][] ge_precompArr = i <= 7 ? ge_precomp_base_0_7.base : i <= 15 ? ge_precomp_base_8_15.base : i > 23 ? ge_precomp_base_24_31.base : ge_precomp_base_16_23.base;
        ge_precomp ge_precomp2 = new ge_precomp();
        int negative = negative(b);
        byte b2 = (-negative) & b;
        ge_precomp_0.ge_precomp_0(ge_precomp);
        byte b3 = (byte) (b - (b2 + b2));
        cmov(ge_precomp, ge_precompArr[i][0], equal(b3, (byte) 1));
        cmov(ge_precomp, ge_precompArr[i][1], equal(b3, (byte) 2));
        cmov(ge_precomp, ge_precompArr[i][2], equal(b3, (byte) 3));
        cmov(ge_precomp, ge_precompArr[i][3], equal(b3, (byte) 4));
        cmov(ge_precomp, ge_precompArr[i][4], equal(b3, (byte) 5));
        cmov(ge_precomp, ge_precompArr[i][5], equal(b3, (byte) 6));
        cmov(ge_precomp, ge_precompArr[i][6], equal(b3, (byte) 7));
        cmov(ge_precomp, ge_precompArr[i][7], equal(b3, (byte) 8));
        fe_copy.fe_copy(ge_precomp2.yplusx, ge_precomp.yminusx);
        fe_copy.fe_copy(ge_precomp2.yminusx, ge_precomp.yplusx);
        fe_neg.fe_neg(ge_precomp2.xy2d, ge_precomp.xy2d);
        cmov(ge_precomp, ge_precomp2, negative);
    }
}
