package p000;

/* renamed from: bqip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqip {
    /* renamed from: a */
    private static int m112899a(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        while ((i & i3) != 0) {
            i3 >>= 1;
        }
        return (i & (i3 - 1)) + i3;
    }

    /* renamed from: a */
    static int m112900a(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        int i4;
        int[] iArr3 = iArr;
        int i5 = i2;
        int i6 = i3;
        int i7 = iArr3[i];
        int[] iArr4 = new int[i6];
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 1;
            if (i9 >= i6) {
                break;
            }
            int i10 = iArr2[i9];
            iArr5[i10] = iArr5[i10] + 1;
            i9++;
        }
        iArr6[1] = 0;
        int i11 = 1;
        while (i11 < 15) {
            int i12 = i11 + 1;
            iArr6[i12] = iArr6[i11] + iArr5[i11];
            i11 = i12;
        }
        int i13 = 0;
        while (i13 < i6) {
            int i14 = iArr2[i13];
            if (i14 != 0) {
                int i15 = iArr6[i14];
                iArr6[i14] = i15 + 1;
                iArr4[i15] = i13;
            }
            i13++;
            i4 = 1;
        }
        int i16 = i4 << i5;
        if (iArr6[15] != i4) {
            int i17 = 0;
            int i18 = 1;
            int i19 = 2;
            while (i18 <= i5) {
                while (iArr5[i18] > 0) {
                    m112901a(iArr3, i7 + i17, i19, i16, iArr4[i8] | (i18 << 16));
                    i17 = m112899a(i17, i18);
                    iArr5[i18] = iArr5[i18] - 1;
                    i8++;
                }
                i18++;
                i19 += i19;
                i4 = 1;
            }
            int i20 = i16 - 1;
            int i21 = i16;
            int i22 = i7;
            int i23 = i5 + 1;
            int i24 = -1;
            int i25 = i17;
            int i26 = i8;
            int i27 = 2;
            while (i23 <= 15) {
                int i28 = i24;
                while (iArr5[i23] > 0) {
                    int i29 = i25 & i20;
                    if (i29 != i28) {
                        i22 += i21;
                        int i30 = i4 << (i23 - i5);
                        int i31 = i23;
                        while (i31 < 15) {
                            int i32 = i30 - iArr5[i31];
                            if (i32 <= 0) {
                                break;
                            }
                            i31++;
                            i30 = i32 + i32;
                        }
                        int i33 = i31 - i5;
                        i21 = i4 << i33;
                        i16 += i21;
                        iArr3[i7 + i29] = ((i33 + i5) << 16) | ((i22 - i7) - i29);
                        i28 = i29;
                    }
                    m112901a(iArr3, i22 + (i25 >> i5), i27, i21, ((i23 - i5) << 16) | iArr4[i26]);
                    i25 = m112899a(i25, i23);
                    iArr5[i23] = iArr5[i23] - 1;
                    i26++;
                    i4 = 1;
                }
                i23++;
                i27 += i27;
                i24 = i28;
            }
            return i16;
        }
        for (int i34 = 0; i34 < i16; i34++) {
            iArr3[i7 + i34] = iArr4[0];
        }
        return i16;
    }

    /* renamed from: a */
    private static void m112901a(int[] iArr, int i, int i2, int i3, int i4) {
        do {
            i3 -= i2;
            iArr[i + i3] = i4;
        } while (i3 > 0);
    }
}
