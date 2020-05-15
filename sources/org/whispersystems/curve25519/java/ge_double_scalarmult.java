package org.whispersystems.curve25519.java;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ge_double_scalarmult {

    /* renamed from: Bi */
    static ge_precomp[] f192130Bi;

    static {
        ge_precomp[] ge_precompArr = new ge_precomp[8];
        f192130Bi = ge_precompArr;
        ge_precompArr[0] = new ge_precomp(new int[]{25967493, -14356035, 29566456, 3660896, -12694345, 4014787, 27544626, -11754271, -6079156, 2047605}, new int[]{-12545711, 934262, -2722910, 3049990, -727428, 9406986, 12720692, 5043384, 19500929, -15469378}, new int[]{-8738181, 4489570, 9688441, -14785194, 10184609, -12363380, 29287919, 11864899, -24514362, -4438546});
        f192130Bi[1] = new ge_precomp(new int[]{15636291, -9688557, 24204773, -7912398, 616977, -16685262, 27787600, -14772189, 28944400, -1550024}, new int[]{16568933, 4717097, -11556148, -1102322, 15682896, -11807043, 16354577, -11775962, 7689662, 11199574}, new int[]{30464156, -5976125, -11779434, -15670865, 23220365, 15915852, 7512774, 10017326, -17749093, -9920357});
        f192130Bi[2] = new ge_precomp(new int[]{10861363, 11473154, 27284546, 1981175, -30064349, 12577861, 32867885, 14515107, -15438304, 10819380}, new int[]{4708026, 6336745, 20377586, 9066809, -11272109, 6594696, -25653668, 12483688, -12668491, 5581306}, new int[]{19563160, 16186464, -29386857, 4097519, 10237984, -4348115, 28542350, 13850243, -23678021, -15815942});
        f192130Bi[3] = new ge_precomp(new int[]{5153746, 9909285, 1723747, -2777874, 30523605, 5516873, 19480852, 5230134, -23952439, -15175766}, new int[]{-30269007, -3463509, 7665486, 10083793, 28475525, 1649722, 20654025, 16520125, 30598449, 7715701}, new int[]{28881845, 14381568, 9657904, 3680757, -20181635, 7843316, -31400660, 1370708, 29794553, -1409300});
        f192130Bi[4] = new ge_precomp(new int[]{-22518993, -6692182, 14201702, -8745502, -23510406, 8844726, 18474211, -1361450, -13062696, 13821877}, new int[]{-6455177, -7839871, 3374702, -4740862, -27098617, -10571707, 31655028, -7212327, 18853322, -14220951}, new int[]{4566830, -12963868, -28974889, -12240689, -7602672, -2830569, -8514358, -10431137, 2207753, -3209784});
        f192130Bi[5] = new ge_precomp(new int[]{-25154831, -4185821, 29681144, 7868801, -6854661, -9423865, -12437364, -663000, -31111463, -16132436}, new int[]{25576264, -2703214, 7349804, -11814844, 16472782, 9300885, 3844789, 15725684, 171356, 6466918}, new int[]{23103977, 13316479, 9739013, -16149481, 817875, -15038942, 8965339, -14088058, -30714912, 16193877});
        f192130Bi[6] = new ge_precomp(new int[]{-33521811, 3180713, -2394130, 14003687, -16903474, -16270840, 17238398, 4729455, -18074513, 9256800}, new int[]{-25182317, -4174131, 32336398, 5036987, -21236817, 11360617, 22616405, 9761698, -19827198, 630305}, new int[]{-13720693, 2639453, -24237460, -7406481, 9494427, -5774029, -6554551, -15960994, -2449256, -14291300});
        f192130Bi[7] = new ge_precomp(new int[]{-3151181, -5046075, 9282714, 6866145, -31907062, -863023, -18940575, 15033784, 25105118, -7894876}, new int[]{-24326370, 15950226, -31801215, -14592823, -11662737, -5090925, 1573892, -2625887, 2198790, -15804619}, new int[]{-3099351, 10324967, -2241613, 7453183, -5446979, -2735503, -13812022, -16236442, -32461234, -12290683});
    }

    public static void ge_double_scalarmult_vartime(ge_p2 ge_p2, byte[] bArr, ge_p3 ge_p3, byte[] bArr2) {
        byte[] bArr3 = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        byte[] bArr4 = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        ge_cached[] ge_cachedArr = new ge_cached[8];
        for (int i = 0; i < 8; i++) {
            ge_cachedArr[i] = new ge_cached();
        }
        ge_p1p1 ge_p1p1 = new ge_p1p1();
        ge_p3 ge_p32 = new ge_p3();
        ge_p3 ge_p33 = new ge_p3();
        slide(bArr3, bArr);
        slide(bArr4, bArr2);
        ge_p3_to_cached.ge_p3_to_cached(ge_cachedArr[0], ge_p3);
        ge_p3_dbl.ge_p3_dbl(ge_p1p1, ge_p3);
        ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p33, ge_p1p1);
        ge_add.ge_add(ge_p1p1, ge_p33, ge_cachedArr[0]);
        ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
        ge_p3_to_cached.ge_p3_to_cached(ge_cachedArr[1], ge_p32);
        ge_add.ge_add(ge_p1p1, ge_p33, ge_cachedArr[1]);
        ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
        ge_p3_to_cached.ge_p3_to_cached(ge_cachedArr[2], ge_p32);
        ge_add.ge_add(ge_p1p1, ge_p33, ge_cachedArr[2]);
        ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
        ge_p3_to_cached.ge_p3_to_cached(ge_cachedArr[3], ge_p32);
        ge_add.ge_add(ge_p1p1, ge_p33, ge_cachedArr[3]);
        ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
        ge_p3_to_cached.ge_p3_to_cached(ge_cachedArr[4], ge_p32);
        ge_add.ge_add(ge_p1p1, ge_p33, ge_cachedArr[4]);
        ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
        ge_p3_to_cached.ge_p3_to_cached(ge_cachedArr[5], ge_p32);
        ge_add.ge_add(ge_p1p1, ge_p33, ge_cachedArr[5]);
        ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
        ge_p3_to_cached.ge_p3_to_cached(ge_cachedArr[6], ge_p32);
        ge_add.ge_add(ge_p1p1, ge_p33, ge_cachedArr[6]);
        ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
        ge_p3_to_cached.ge_p3_to_cached(ge_cachedArr[7], ge_p32);
        ge_p2_0.ge_p2_0(ge_p2);
        int i2 = 255;
        while (i2 >= 0 && bArr3[i2] == 0 && bArr4[i2] == 0) {
            i2--;
        }
        while (i2 >= 0) {
            ge_p2_dbl.ge_p2_dbl(ge_p1p1, ge_p2);
            byte b = bArr3[i2];
            if (b > 0) {
                ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
                ge_add.ge_add(ge_p1p1, ge_p32, ge_cachedArr[bArr3[i2] / 2]);
            } else if (b < 0) {
                ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
                ge_sub.ge_sub(ge_p1p1, ge_p32, ge_cachedArr[(-bArr3[i2]) / 2]);
            }
            byte b2 = bArr4[i2];
            if (b2 > 0) {
                ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
                ge_madd.ge_madd(ge_p1p1, ge_p32, f192130Bi[bArr4[i2] / 2]);
            } else if (b2 < 0) {
                ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p32, ge_p1p1);
                ge_msub.ge_msub(ge_p1p1, ge_p32, f192130Bi[(-bArr4[i2]) / 2]);
            }
            ge_p1p1_to_p2.ge_p1p1_to_p2(ge_p2, ge_p1p1);
            i2--;
        }
    }

    public static void slide(byte[] bArr, byte[] bArr2) {
        int i;
        for (int i2 = 0; i2 < 256; i2++) {
            bArr[i2] = (byte) ((bArr2[i2 >> 3] >>> (i2 & 7)) & 1);
        }
        int i3 = 0;
        while (i3 < 256) {
            if (bArr[i3] != 0) {
                int i4 = 1;
                while (i4 <= 6 && (i = i3 + i4) < 256) {
                    byte b = bArr[i];
                    if (b != 0) {
                        byte b2 = bArr[i3];
                        int i5 = b << i4;
                        int i6 = b2 + i5;
                        if (i6 > 15) {
                            int i7 = b2 - i5;
                            if (i7 < -15) {
                                break;
                            }
                            bArr[i3] = (byte) i7;
                            while (true) {
                                if (i < 256) {
                                    if (bArr[i] == 0) {
                                        bArr[i] = 1;
                                        break;
                                    } else {
                                        bArr[i] = 0;
                                        i++;
                                    }
                                } else {
                                    break;
                                }
                            }
                        } else {
                            bArr[i3] = (byte) i6;
                            bArr[i] = 0;
                        }
                    }
                    i4++;
                }
            }
            i3++;
        }
    }
}
