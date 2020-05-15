package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: canz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canz {

    /* renamed from: a */
    private static final int[][] f175427a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f175428b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f175429c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, ErrorInfo.TYPE_SDU_FAILED, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED}, new int[]{6, 24, 50, 76, 102, 128, MfiClientException.TYPE_MFICLIENT_NOT_STARTED}, new int[]{6, 28, 54, 80, 106, 132, MfiClientException.TYPE_ILLEGAL_CARD_OPERATION}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f175430d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    static int m126851a(int i) {
        int i2 = 0;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    /* renamed from: b */
    private static void m126855b(int i, int i2, canw canw) {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m126856b(canw.mo74708a(i, i4))) {
                canw.mo74709a(i, i4, 0);
                i3++;
            } else {
                throw new cank();
            }
        }
    }

    /* renamed from: b */
    private static boolean m126856b(int i) {
        return i == -1;
    }

    /* renamed from: c */
    private static void m126857c(int i, int i2, canw canw) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                canw.mo74709a(i + i4, i2 + i3, f175427a[i3][i4]);
            }
        }
    }

    /* renamed from: a */
    static int m126852a(int i, int i2) {
        int a = m126851a(i2);
        int i3 = i << (a - 1);
        while (m126851a(i3) >= a) {
            i3 ^= i2 << (m126851a(i3) - a);
        }
        return i3;
    }

    /* renamed from: a */
    private static void m126853a(int i, int i2, canw canw) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m126856b(canw.mo74708a(i4, i2))) {
                canw.mo74709a(i4, i2, 0);
                i3++;
            } else {
                throw new cank();
            }
        }
    }

    /* renamed from: a */
    public static void m126854a(canl canl, canq canq, canu canu, int i, canw canw) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        canl canl2 = canl;
        canu canu2 = canu;
        int i7 = i;
        canw canw2 = canw;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i2 = -1;
            if (i9 >= canw2.f175424c) {
                break;
            }
            for (int i10 = 0; i10 < canw2.f175423b; i10++) {
                canw2.f175422a[i9][i10] = -1;
            }
            i9++;
            i8 = 0;
        }
        int length = f175427a[i8].length;
        m126857c(i8, i8, canw2);
        m126857c(canw2.f175423b - length, i8, canw2);
        m126857c(i8, canw2.f175423b - length, canw2);
        m126853a(i8, 7, canw2);
        m126853a(canw2.f175423b - 8, 7, canw2);
        m126853a(i8, canw2.f175423b - 8, canw2);
        m126855b(7, i8, canw2);
        m126855b(canw2.f175424c - 8, i8, canw2);
        m126855b(7, canw2.f175424c - 7, canw2);
        if (canw2.mo74708a(8, canw2.f175424c - 8) != 0) {
            canw2.mo74709a(8, canw2.f175424c - 8, 1);
            int i11 = canu2.f175417a;
            int i12 = 5;
            if (i11 >= 2) {
                int i13 = i11 - 1;
                int[][] iArr = f175429c;
                int[] iArr2 = iArr[i13];
                int length2 = iArr[i13].length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = 0;
                    while (i15 < length2) {
                        int i16 = iArr2[i14];
                        int i17 = iArr2[i15];
                        if (!(i17 == i2 || i16 == i2 || !m126856b(canw2.mo74708a(i17, i16)))) {
                            int i18 = i17 - 2;
                            int i19 = i16 - 2;
                            int i20 = 0;
                            while (i20 < i12) {
                                int i21 = 0;
                                while (i21 < i12) {
                                    canw2.mo74709a(i18 + i21, i19 + i20, f175428b[i20][i21]);
                                    i21++;
                                    i12 = 5;
                                }
                                i20++;
                                i12 = 5;
                            }
                        }
                        i15++;
                        i2 = -1;
                        i12 = 5;
                    }
                    i14++;
                    i2 = -1;
                    i12 = 5;
                }
                i3 = 8;
            } else {
                i3 = 8;
            }
            while (i3 < canw2.f175423b - 8) {
                int i22 = i3 + 1;
                int i23 = i22 % 2;
                if (m126856b(canw2.mo74708a(i3, 6))) {
                    canw2.mo74709a(i3, 6, i23);
                }
                if (m126856b(canw2.mo74708a(6, i3))) {
                    canw2.mo74709a(6, i3, i23);
                }
                i3 = i22;
            }
            canl canl3 = new canl();
            if (i7 < 0 || i7 >= 8) {
                throw new cank("Invalid mask pattern");
            }
            int i24 = (canq.f175398e << 3) | i7;
            canl3.mo74684a(i24, 5);
            canl3.mo74684a(m126852a(i24, 1335), 10);
            canl canl4 = new canl();
            canl4.mo74684a(21522, 15);
            if (canl3.f175375a.length == canl4.f175375a.length) {
                int i25 = 0;
                while (true) {
                    int[] iArr3 = canl3.f175375a;
                    if (i25 >= iArr3.length) {
                        break;
                    }
                    iArr3[i25] = iArr3[i25] ^ canl4.f175375a[i25];
                    i25++;
                }
                if (canl3.f175376b == 15) {
                    int i26 = 0;
                    while (true) {
                        int i27 = canl3.f175376b;
                        if (i26 >= i27) {
                            break;
                        }
                        boolean a = canl3.mo74687a((i27 - 1) - i26);
                        int[][] iArr4 = f175430d;
                        canw2.mo74710a(iArr4[i26][0], iArr4[i26][1], a);
                        if (i26 < 8) {
                            canw2.mo74710a((canw2.f175423b - i26) - 1, 8, a);
                        } else {
                            canw2.mo74710a(8, (canw2.f175424c - 7) + (i26 - 8), a);
                        }
                        i26++;
                    }
                    if (canu2.f175417a >= 7) {
                        canl canl5 = new canl();
                        canl5.mo74684a(canu2.f175417a, 6);
                        canl5.mo74684a(m126852a(canu2.f175417a, 7973), 12);
                        if (canl5.f175376b == 18) {
                            int i28 = 17;
                            for (int i29 = 0; i29 < 6; i29++) {
                                for (int i30 = 0; i30 < 3; i30++) {
                                    boolean a2 = canl5.mo74687a(i28);
                                    i28--;
                                    canw2.mo74710a(i29, (canw2.f175424c - 11) + i30, a2);
                                    canw2.mo74710a((canw2.f175424c - 11) + i30, i29, a2);
                                }
                            }
                        } else {
                            throw new cank("should not happen but we got: " + canl5.f175376b);
                        }
                    }
                    int i31 = canw2.f175423b - 1;
                    int i32 = canw2.f175424c - 1;
                    int i33 = -1;
                    int i34 = 0;
                    while (i31 > 0) {
                        if (i31 == 6) {
                            i31 = 5;
                        }
                        while (i32 >= 0 && i32 < canw2.f175424c) {
                            for (int i35 = 0; i35 < 2; i35++) {
                                int i36 = i31 - i35;
                                if (m126856b(canw2.mo74708a(i36, i32))) {
                                    if (i34 < canl2.f175376b) {
                                        boolean a3 = canl2.mo74687a(i34);
                                        i34++;
                                        z = a3;
                                    } else {
                                        z = false;
                                    }
                                    switch (i7) {
                                        case 0:
                                            i5 = i32 + i36;
                                            i4 = i5 & 1;
                                            break;
                                        case 1:
                                            i6 = i32 & 1;
                                            i4 = i6;
                                            break;
                                        case 2:
                                            i6 = i36 % 3;
                                            i4 = i6;
                                            break;
                                        case 3:
                                            i6 = (i32 + i36) % 3;
                                            i4 = i6;
                                            break;
                                        case 4:
                                            i5 = (i32 >>> 1) + (i36 / 3);
                                            i4 = i5 & 1;
                                            break;
                                        case 5:
                                            int i37 = i32 * i36;
                                            i6 = (i37 & 1) + (i37 % 3);
                                            i4 = i6;
                                            break;
                                        case 6:
                                            int i38 = i32 * i36;
                                            i6 = ((i38 & 1) + (i38 % 3)) & 1;
                                            i4 = i6;
                                            break;
                                        default:
                                            i4 = (((i32 * i36) % 3) + ((i32 + i36) & 1)) & 1;
                                            break;
                                    }
                                    if (i4 == 0) {
                                        z = !z;
                                    }
                                    canw2.mo74710a(i36, i32, z);
                                }
                            }
                            i32 += i33;
                        }
                        i33 = -i33;
                        i32 += i33;
                        i31 -= 2;
                    }
                    if (i34 != canl2.f175376b) {
                        throw new cank("Not all bits consumed: " + i34 + '/' + canl2.f175376b);
                    }
                    return;
                }
                throw new cank("should not happen but we got: " + canl3.f175376b);
            }
            throw new IllegalArgumentException("Sizes don't match");
        }
        throw new cank();
    }
}
