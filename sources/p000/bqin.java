package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.compression.brotli.dec.Dictionary;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: bqin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqin {

    /* renamed from: a */
    static final int[] f140811a = {PSKKeyManager.MAX_KEY_LENGTH_BYTES, ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, 436, 468, 500, 534, 566, 598, 630, 662, 694, 726, 758, 790, 822, 854, 886, 920, 952, 984, 1016, 1048, 1080};

    /* renamed from: b */
    static final int[] f140812b = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625};

    /* renamed from: c */
    static final int[] f140813c = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};

    /* renamed from: d */
    static final short[] f140814d = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};

    /* renamed from: e */
    static final short[] f140815e = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};

    /* renamed from: f */
    static final short[] f140816f;

    /* renamed from: g */
    private static final int[] f140817g = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    /* renamed from: h */
    private static final int[] f140818h = {0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3};

    /* renamed from: i */
    private static final int[] f140819i = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};

    /* renamed from: j */
    private static final int[] f140820j = {AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE, 131076, 131075, 196610, AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE, 131076, 131075, 262145, AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE, 131076, 131075, 196610, AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE, 131076, 131075, 262149};

    static {
        int i;
        int i2;
        short[] sArr = new short[2816];
        f140816f = sArr;
        short[] sArr2 = new short[24];
        short[] sArr3 = new short[24];
        sArr3[0] = 2;
        int i3 = 0;
        while (i3 < 23) {
            int i4 = i3 + 1;
            sArr2[i4] = (short) (sArr2[i3] + (1 << f140814d[i3]));
            sArr3[i4] = (short) (sArr3[i3] + (1 << f140815e[i3]));
            i3 = i4;
        }
        for (int i5 = 0; i5 < 704; i5++) {
            int i6 = i5 >>> 6;
            if (i6 >= 2) {
                i6 -= 2;
                i = 0;
            } else {
                i = -4;
            }
            int i7 = i6 + i6;
            int i8 = (((170064 >>> i7) & 3) << 3) | ((i5 >>> 3) & 7);
            int i9 = (((156228 >>> i7) & 3) << 3) | (i5 & 7);
            short s = sArr3[i9];
            if (s <= 4) {
                i2 = s - 2;
            } else {
                i2 = 3;
            }
            int i10 = i5 * 4;
            sArr[i10] = (short) (f140814d[i8] | (f140815e[i9] << 8));
            sArr[i10 + 1] = sArr2[i8];
            sArr[i10 + 2] = sArr3[i9];
            sArr[i10 + 3] = (short) (i + i2);
        }
    }

    /* renamed from: a */
    private static int m112883a(int i) {
        int i2 = -1;
        for (int i3 = 16; i3 > 0; i3 >>= 1) {
            int i4 = i >>> i3;
            if (i4 != 0) {
                i2 += i3;
                i = i4;
            }
        }
        return i2 + i;
    }

    /* renamed from: a */
    private static int m112885a(int i, int i2, int i3) {
        int i4 = i3 << i;
        return i2 + 16 + i4 + i4;
    }

    /* renamed from: b */
    private static int m112893b(bqiq bqiq, int i, int i2) {
        int[] iArr = bqiq.f140874k;
        int i3 = i + i;
        int i4 = iArr[i3];
        if (i2 <= 1) {
            iArr[i3 + 1] = i4;
            iArr[i3 + 2] = i4;
            return 268435456;
        }
        int i5 = i2 + 2;
        int a = i4 + m112886a(i5, i5, iArr, i3, bqiq);
        int[] iArr2 = bqiq.f140874k;
        int i6 = i3 + 1;
        iArr2[i6] = a;
        int a2 = m112886a(26, 26, iArr2, i6, bqiq);
        int[] iArr3 = bqiq.f140874k;
        iArr3[i3 + 2] = a + a2;
        return m112894b(iArr3, i6, bqiq);
    }

    /* renamed from: c */
    private static int m112896c(bqiq bqiq) {
        bqij.m112875c(bqiq);
        if (bqij.m112872b(bqiq, 1) == 0) {
            return 0;
        }
        int b = bqij.m112872b(bqiq, 3);
        if (b != 0) {
            return bqij.m112872b(bqiq, b) + (1 << b);
        }
        return 1;
    }

    /* renamed from: d */
    private static void m112897d(bqiq bqiq) {
        bqiq.f140823B = m112888a(bqiq, 0, bqiq.f140824C);
        int i = bqiq.f140873j[5];
        int i2 = i << 6;
        bqiq.f140837P = i2;
        bqiq.f140833L = bqiq.f140866c[i2] & 255;
        int i3 = bqiq.f140865b[i] << 9;
        bqiq.f140839R = i3;
        bqiq.f140840S = i3 + PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    /* renamed from: e */
    private static int m112898e(bqiq bqiq) {
        int i = bqiq.f140849aa;
        int i2 = bqiq.f140856ah;
        return i;
    }

    /* renamed from: a */
    private static int m112884a(int i, int i2) {
        if ((2 << i) + i2 <= 2147483644) {
            int i3 = ((2147483644 - i2) >> i) + 4;
            int a = m112883a(i3) - 1;
            int i4 = a - 1;
            return (((((i3 >> a) & 1) | (i4 + i4)) - 1) << i) + (1 << i) + i2 + 16;
        }
        throw new IllegalArgumentException("maxDistance is too small");
    }

    /* renamed from: a */
    private static int m112886a(int i, int i2, int[] iArr, int i3, bqiq bqiq) {
        int i4;
        int i5;
        int i6;
        int i7 = i2;
        int[] iArr2 = iArr;
        int i8 = i3;
        bqiq bqiq2 = bqiq;
        bqij.m112869a(bqiq);
        bqij.m112875c(bqiq);
        int b = bqij.m112872b(bqiq2, 2);
        if (b != 1) {
            int[] iArr3 = new int[i7];
            int[] iArr4 = new int[18];
            int i9 = 32;
            int i10 = 0;
            while (b < 18 && i9 > 0) {
                int i11 = f140817g[b];
                bqij.m112875c(bqiq);
                int e = bqij.m112877e(bqiq) & 15;
                bqiq2.f140883t += f140820j[e] >> 16;
                int i12 = (char) f140820j[e];
                iArr4[i11] = i12;
                if (i12 != 0) {
                    i9 -= 32 >> i12;
                    i10++;
                }
                b++;
            }
            if (i9 == 0 || i10 == 1) {
                int[] iArr5 = new int[33];
                bqip.m112900a(iArr5, 32, 5, iArr4, 18);
                int i13 = 8;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                while (i14 < i7 && i17 > 0) {
                    bqij.m112869a(bqiq);
                    bqij.m112875c(bqiq);
                    int e2 = bqij.m112877e(bqiq);
                    int i18 = bqiq2.f140883t;
                    int i19 = iArr5[e2 & 31];
                    bqiq2.f140883t = i18 + (i19 >> 16);
                    int i20 = (char) i19;
                    if (i20 < 16) {
                        int i21 = i14 + 1;
                        iArr3[i14] = i20;
                        if (i20 != 0) {
                            i17 -= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT >> i20;
                            i14 = i21;
                            i13 = i20;
                        } else {
                            i14 = i21;
                        }
                        i16 = 0;
                    } else {
                        int i22 = i20 - 14;
                        if (i20 == 16) {
                            i4 = i13;
                        } else {
                            i4 = 0;
                        }
                        if (i15 != i4) {
                            i5 = i4;
                        } else {
                            i5 = i15;
                        }
                        if (i15 != i4) {
                            i16 = 0;
                        }
                        if (i16 > 0) {
                            i6 = (i16 - 2) << i22;
                        } else {
                            i6 = i16;
                        }
                        bqij.m112875c(bqiq);
                        int b2 = i6 + bqij.m112872b(bqiq2, i22) + 3;
                        int i23 = b2 - i16;
                        if (i14 + i23 <= i7) {
                            int i24 = 0;
                            while (i24 < i23) {
                                iArr3[i14] = i5;
                                i24++;
                                i14++;
                            }
                            if (i5 != 0) {
                                i17 -= i23 << (15 - i5);
                            }
                            i16 = b2;
                            i15 = i5;
                        } else {
                            throw new bqil("symbol + repeatDelta > numSymbols");
                        }
                    }
                }
                if (i17 == 0) {
                    while (i14 < i7) {
                        int min = Math.min(i14 + 1024, i7) - i14;
                        System.arraycopy(bqit.f140897b, 0, iArr3, i14, min);
                        i14 += min;
                    }
                    return bqip.m112900a(iArr2, i8, 8, iArr3, i7);
                }
                throw new bqil("Unused space");
            }
            throw new bqil("Corrupted Huffman code histogram");
        }
        int[] iArr6 = new int[i7];
        int[] iArr7 = new int[4];
        int a = m112883a(i - 1) + 1;
        int b3 = bqij.m112872b(bqiq2, 2) + 1;
        int i25 = 0;
        while (i25 < b3) {
            bqij.m112875c(bqiq);
            int b4 = bqij.m112872b(bqiq2, a);
            if (b4 < i7) {
                iArr7[i25] = b4;
                i25++;
            } else {
                throw new bqil("Can't readHuffmanCode");
            }
        }
        int i26 = 0;
        while (i26 < b3 - 1) {
            int i27 = i26 + 1;
            int i28 = i27;
            while (i28 < b3) {
                if (iArr7[i26] != iArr7[i28]) {
                    i28++;
                } else {
                    throw new bqil("Duplicate simple Huffman code symbol");
                }
            }
            i26 = i27;
        }
        if (b3 == 4) {
            b3 = bqij.m112872b(bqiq2, 1) + 4;
        }
        if (b3 == 1) {
            iArr6[iArr7[0]] = 1;
        } else if (b3 == 2) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 1;
        } else if (b3 == 3) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 2;
        } else if (b3 == 4) {
            iArr6[iArr7[0]] = 2;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 2;
            iArr6[iArr7[3]] = 2;
        } else if (b3 == 5) {
            iArr6[iArr7[0]] = 1;
            iArr6[iArr7[1]] = 2;
            iArr6[iArr7[2]] = 3;
            iArr6[iArr7[3]] = 3;
        }
        return bqip.m112900a(iArr2, i8, 8, iArr6, i7);
    }

    /* renamed from: b */
    private static int m112894b(int[] iArr, int i, bqiq bqiq) {
        bqij.m112875c(bqiq);
        int a = m112889a(iArr, i, bqiq);
        int i2 = f140813c[a];
        bqij.m112875c(bqiq);
        return f140812b[a] + bqij.m112874c(bqiq, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: byte} */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r12 <= 30) goto L_0x0052;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03a3 A[LOOP:8: B:142:0x03a3->B:148:0x03d3, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0530 A[LOOP:10: B:206:0x052e->B:207:0x0530, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0109 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0594 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* renamed from: b */
    static void m112895b(bqiq bqiq) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ByteBuffer byteBuffer;
        int min;
        bqiq bqiq2 = bqiq;
        int i13 = bqiq2.f140880q;
        if (i13 == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        } else if (i13 != 11) {
            int i14 = 10;
            int i15 = 6;
            int i16 = 8;
            int i17 = 2;
            int i18 = -1;
            int i19 = 0;
            int i20 = 1;
            if (i13 == 1) {
                int i21 = bqiq2.f140857ai;
                bqiq2.f140857ai = 0;
                bqij.m112875c(bqiq);
                int i22 = 17;
                if (bqij.m112872b(bqiq2, 1) != 0) {
                    int b = bqij.m112872b(bqiq2, 3);
                    if (b != 0) {
                        i22 = 17 + b;
                    } else {
                        int b2 = bqij.m112872b(bqiq2, 3);
                        if (b2 != 0) {
                            if (b2 != 1) {
                                i22 = b2 + 8;
                            } else {
                                if (i21 != 0) {
                                    bqiq2.f140857ai = 1;
                                    if (bqij.m112872b(bqiq2, 1) != 1) {
                                        i22 = bqij.m112872b(bqiq2, 6);
                                        if (i22 >= 10) {
                                        }
                                    }
                                }
                                i22 = -1;
                            }
                        }
                    }
                } else {
                    i22 = 16;
                }
                if (i22 != -1) {
                    int i23 = 1 << i22;
                    bqiq2.f140847Z = i23;
                    bqiq2.f140846Y = i23 - 16;
                    bqiq2.f140880q = 2;
                } else {
                    throw new bqil("Invalid 'windowBits' code");
                }
            }
            int e = m112898e(bqiq);
            int i24 = bqiq2.f140849aa - 1;
            byte[] bArr = bqiq2.f140848a;
            while (true) {
                int i25 = bqiq2.f140880q;
                if (i25 != i14) {
                    int i26 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    int i27 = 4;
                    i27 = 4;
                    i27 = 4;
                    i27 = 4;
                    switch (i25) {
                        case 2:
                            if (bqiq2.f140887x >= 0) {
                                if (bqiq2.f140888y == 0) {
                                    bqiq2.f140875l = new int[0];
                                    bqiq2.f140876m = new int[0];
                                    bqiq2.f140877n = new int[0];
                                    bqij.m112869a(bqiq);
                                    bqij.m112875c(bqiq);
                                    int b3 = bqij.m112872b(bqiq2, 1);
                                    bqiq2.f140888y = b3;
                                    bqiq2.f140887x = 0;
                                    bqiq2.f140889z = 0;
                                    bqiq2.f140822A = 0;
                                    if (b3 == 0 || bqij.m112872b(bqiq2, 1) == 0) {
                                        int b4 = bqij.m112872b(bqiq2, 2) + 4;
                                        if (b4 == 7) {
                                            bqiq2.f140822A = 1;
                                            if (bqij.m112872b(bqiq2, 1) == 0) {
                                                int b5 = bqij.m112872b(bqiq2, 2);
                                                if (b5 != 0) {
                                                    for (int i28 = 0; i28 < b5; i28++) {
                                                        bqij.m112875c(bqiq);
                                                        int b6 = bqij.m112872b(bqiq2, 8);
                                                        if (b6 == 0 && i28 + 1 == b5 && b5 > 1) {
                                                            throw new bqil("Exuberant nibble");
                                                        }
                                                        bqiq2.f140887x = (b6 << (i28 * 8)) | bqiq2.f140887x;
                                                    }
                                                }
                                            } else {
                                                throw new bqil("Corrupted reserved bit");
                                            }
                                        } else {
                                            for (int i29 = 0; i29 < b4; i29++) {
                                                bqij.m112875c(bqiq);
                                                int b7 = bqij.m112872b(bqiq2, 4);
                                                if (b7 == 0 && i29 + 1 == b4 && b4 > 4) {
                                                    throw new bqil("Exuberant nibble");
                                                }
                                                bqiq2.f140887x = (b7 << (i29 * 4)) | bqiq2.f140887x;
                                            }
                                        }
                                        bqiq2.f140887x++;
                                        if (bqiq2.f140888y == 0) {
                                            bqiq2.f140889z = bqij.m112872b(bqiq2, 1);
                                        }
                                    }
                                    if (bqiq2.f140887x != 0 || bqiq2.f140822A != 0) {
                                        if (bqiq2.f140889z == 0) {
                                            i = bqiq2.f140822A;
                                            if (i == 0) {
                                                bqiq2.f140880q = 3;
                                                if (i != 0) {
                                                    int i30 = bqiq2.f140850ab + bqiq2.f140887x;
                                                    bqiq2.f140850ab = i30;
                                                    if (i30 > 1073741824) {
                                                        bqiq2.f140850ab = JGCastService.FLAG_PRIVATE_DISPLAY;
                                                        i30 = JGCastService.FLAG_PRIVATE_DISPLAY;
                                                    }
                                                    int i31 = bqiq2.f140849aa;
                                                    int i32 = bqiq2.f140847Z;
                                                    if (i31 < i32) {
                                                        if (i32 > i30) {
                                                            while (true) {
                                                                int i33 = i32 >> 1;
                                                                if (i33 > i30) {
                                                                    i32 = i33;
                                                                } else if (bqiq2.f140888y == 0 && i32 < 16384 && bqiq2.f140847Z >= 16384) {
                                                                    i32 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                                                }
                                                            }
                                                        }
                                                        int i34 = bqiq2.f140849aa;
                                                        if (i32 > i34) {
                                                            byte[] bArr2 = new byte[(i32 + 37)];
                                                            byte[] bArr3 = bqiq2.f140848a;
                                                            if (bArr3.length != 0) {
                                                                System.arraycopy(bArr3, 0, bArr2, 0, i34);
                                                            }
                                                            bqiq2.f140848a = bArr2;
                                                            bqiq2.f140849aa = i32;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        bqij.m112880h(bqiq);
                                        i = bqiq2.f140822A;
                                        if (i == 0) {
                                            i2 = 6;
                                        } else {
                                            i2 = 5;
                                        }
                                        bqiq2.f140880q = i2;
                                        if (i != 0) {
                                        }
                                    }
                                } else {
                                    bqiq2.f140881r = 10;
                                    bqiq2.f140880q = 12;
                                }
                                int e2 = m112898e(bqiq);
                                i24 = bqiq2.f140849aa - 1;
                                bArr = bqiq2.f140848a;
                                e = e2;
                                i14 = 10;
                                i15 = 6;
                                i16 = 8;
                                i17 = 2;
                                i18 = -1;
                                i19 = 0;
                                i20 = 1;
                                continue;
                            } else {
                                throw new bqil("Invalid metablock length");
                            }
                            break;
                        case 3:
                            int c = m112896c(bqiq) + i20;
                            bqiq2.f140824C = c;
                            bqiq2.f140823B = m112893b(bqiq2, 0, c);
                            int c2 = m112896c(bqiq) + i20;
                            bqiq2.f140826E = c2;
                            bqiq2.f140825D = m112893b(bqiq2, i20, c2);
                            int c3 = m112896c(bqiq) + i20;
                            bqiq2.f140828G = c3;
                            bqiq2.f140827F = m112893b(bqiq2, i17, c3);
                            bqij.m112869a(bqiq);
                            bqij.m112875c(bqiq);
                            bqiq2.f140843V = bqij.m112872b(bqiq2, i17);
                            bqiq2.f140842U = bqij.m112872b(bqiq2, 4) << bqiq2.f140843V;
                            bqiq2.f140865b = new byte[bqiq2.f140824C];
                            int i35 = 0;
                            while (true) {
                                int i36 = bqiq2.f140824C;
                                if (i35 >= i36) {
                                    int i37 = i36 << 6;
                                    bqiq2.f140866c = new byte[i37];
                                    int a = m112887a(i37, bqiq2.f140866c, bqiq2);
                                    bqiq2.f140832K = i20;
                                    int i38 = 0;
                                    while (true) {
                                        if (i38 < (bqiq2.f140824C << i15)) {
                                            if (bqiq2.f140866c[i38] == (i38 >> 6)) {
                                                i38++;
                                            } else {
                                                bqiq2.f140832K = 0;
                                            }
                                        }
                                    }
                                    int i39 = bqiq2.f140828G << i17;
                                    bqiq2.f140867d = new byte[i39];
                                    int a2 = m112887a(i39, bqiq2.f140867d, bqiq2);
                                    bqiq2.f140875l = m112892a(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES, a, bqiq2);
                                    bqiq2.f140876m = m112892a(704, 704, bqiq2.f140826E, bqiq2);
                                    int a3 = m112885a(bqiq2.f140843V, bqiq2.f140842U, 24);
                                    if (bqiq2.f140857ai == i20) {
                                        a3 = m112885a(bqiq2.f140843V, bqiq2.f140842U, 62);
                                        i12 = m112884a(bqiq2.f140843V, bqiq2.f140842U);
                                    } else {
                                        i12 = a3;
                                    }
                                    bqiq2.f140877n = m112892a(a3, i12, a2, bqiq2);
                                    byte[] bArr4 = bqiq2.f140868e;
                                    int[] iArr = bqiq2.f140878o;
                                    int i40 = bqiq2.f140843V;
                                    int i41 = bqiq2.f140842U;
                                    int i42 = i20 << i40;
                                    int i43 = 0;
                                    int i44 = 16;
                                    while (i43 < i41) {
                                        bArr4[i44] = 0;
                                        i43++;
                                        iArr[i44] = i43;
                                        i44++;
                                    }
                                    int i45 = i44;
                                    int i46 = 0;
                                    int i47 = 1;
                                    while (i45 < i12) {
                                        int i48 = i47;
                                        int i49 = i41 + ((((i46 + 2) << i48) - 4) << i40) + 1;
                                        for (int i50 = 0; i50 < i42; i50++) {
                                            bArr4[i45] = (byte) i48;
                                            iArr[i45] = i49 + i50;
                                            i45++;
                                        }
                                        i47 = i48 + i46;
                                        i46 ^= 1;
                                        i26 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                        i20 = 1;
                                        i27 = 4;
                                    }
                                    bqiq2.f140837P = 0;
                                    bqiq2.f140838Q = 0;
                                    int i51 = bqiq2.f140865b[0] * 512;
                                    bqiq2.f140839R = i51;
                                    bqiq2.f140840S = i51 + i26;
                                    bqiq2.f140833L = 0;
                                    bqiq2.f140834M = 0;
                                    int[] iArr2 = bqiq2.f140873j;
                                    iArr2[i27] = i20;
                                    iArr2[5] = 0;
                                    iArr2[6] = i20;
                                    iArr2[7] = 0;
                                    iArr2[8] = i20;
                                    iArr2[9] = 0;
                                    bqiq2.f140880q = i27;
                                    if (bqiq2.f140887x <= 0) {
                                        bqij.m112869a(bqiq);
                                        int i52 = bqiq2.f140825D;
                                        if (i52 == 0) {
                                            i52 = m112888a(bqiq2, i20, bqiq2.f140826E);
                                            bqiq2.f140825D = i52;
                                            bqiq2.f140834M = bqiq2.f140873j[7];
                                        }
                                        bqiq2.f140825D = i52 - 1;
                                        bqij.m112875c(bqiq);
                                        int a4 = m112889a(bqiq2.f140876m, bqiq2.f140834M, bqiq2) << 2;
                                        short[] sArr = f140816f;
                                        short s = sArr[a4];
                                        short s2 = sArr[a4 + 1];
                                        short s3 = sArr[a4 + 2];
                                        bqiq2.f140841T = sArr[a4 + 3];
                                        bqij.m112875c(bqiq);
                                        bqiq2.f140836O = s2 + bqij.m112874c(bqiq2, s & 255);
                                        bqij.m112875c(bqiq);
                                        bqiq2.f140845X = s3 + bqij.m112874c(bqiq2, s >> 8);
                                        bqiq2.f140835N = 0;
                                        bqiq2.f140880q = 7;
                                        if (bqiq2.f140832K == 0) {
                                            while (true) {
                                                if (bqiq2.f140835N < bqiq2.f140836O) {
                                                    bqij.m112869a(bqiq);
                                                    if (bqiq2.f140823B == 0) {
                                                        m112897d(bqiq);
                                                    }
                                                    bqiq2.f140823B--;
                                                    bqij.m112875c(bqiq);
                                                    bArr[bqiq2.f140829H] = (byte) m112889a(bqiq2.f140875l, bqiq2.f140833L, bqiq2);
                                                    int i53 = bqiq2.f140829H + i20;
                                                    bqiq2.f140829H = i53;
                                                    bqiq2.f140835N += i20;
                                                    if (i53 >= e) {
                                                        bqiq2.f140881r = 7;
                                                        bqiq2.f140880q = 12;
                                                        i8 = 7;
                                                    }
                                                } else {
                                                    i8 = 7;
                                                }
                                            }
                                        } else {
                                            int i54 = bqiq2.f140829H;
                                            int i55 = bArr[(i54 - 1) & i24] & 255;
                                            int i56 = bArr[(i54 - 2) & i24] & 255;
                                            while (true) {
                                                if (bqiq2.f140835N < bqiq2.f140836O) {
                                                    bqij.m112869a(bqiq);
                                                    if (bqiq2.f140823B == 0) {
                                                        m112897d(bqiq);
                                                    }
                                                    byte b8 = bqiq2.f140866c[bqiq2.f140837P + (bqim.f140810a[bqiq2.f140840S + i56] | bqim.f140810a[bqiq2.f140839R + i55])];
                                                    bqiq2.f140823B--;
                                                    bqij.m112875c(bqiq);
                                                    int a5 = m112889a(bqiq2.f140875l, b8 & 255, bqiq2);
                                                    int i57 = bqiq2.f140829H;
                                                    bArr[i57] = (byte) a5;
                                                    int i58 = i57 + i20;
                                                    bqiq2.f140829H = i58;
                                                    bqiq2.f140835N += i20;
                                                    if (i58 < e) {
                                                        i55 = a5;
                                                        i56 = i55;
                                                    } else {
                                                        i8 = 7;
                                                        bqiq2.f140881r = 7;
                                                        bqiq2.f140880q = 12;
                                                    }
                                                } else {
                                                    i8 = 7;
                                                }
                                            }
                                        }
                                        if (bqiq2.f140880q == i8) {
                                            break;
                                        } else {
                                            int i59 = bqiq2.f140887x - bqiq2.f140836O;
                                            bqiq2.f140887x = i59;
                                            if (i59 <= 0) {
                                                bqiq2.f140880q = i27;
                                                break;
                                            } else {
                                                int i60 = bqiq2.f140841T;
                                                if (i60 < 0) {
                                                    int i61 = bqiq2.f140873j[bqiq2.f140831J];
                                                    bqiq2.f140844W = i61;
                                                    i9 = i61;
                                                } else {
                                                    bqij.m112869a(bqiq);
                                                    int i62 = bqiq2.f140827F;
                                                    if (i62 == 0) {
                                                        i62 = m112888a(bqiq2, 2, bqiq2.f140828G);
                                                        bqiq2.f140827F = i62;
                                                        bqiq2.f140838Q = bqiq2.f140873j[9] << 2;
                                                    }
                                                    bqiq2.f140827F = i62 - 1;
                                                    bqij.m112875c(bqiq);
                                                    i60 = m112889a(bqiq2.f140877n, bqiq2.f140867d[bqiq2.f140838Q + i60] & 255, bqiq2);
                                                    if (i60 < 16) {
                                                        i9 = bqiq2.f140873j[(bqiq2.f140831J + f140818h[i60]) & 3] + f140819i[i60];
                                                        bqiq2.f140844W = i9;
                                                        if (i9 < 0) {
                                                            throw new bqil("Negative distance");
                                                        }
                                                    } else {
                                                        byte b9 = bqiq2.f140868e[i60];
                                                        if (bqiq2.f140883t + b9 <= bqij.f140796a) {
                                                            i11 = bqij.m112872b(bqiq2, b9);
                                                        } else {
                                                            bqij.m112875c(bqiq);
                                                            i11 = bqij.m112874c(bqiq2, b9);
                                                        }
                                                        i9 = (i11 << bqiq2.f140843V) + bqiq2.f140878o[i60];
                                                        bqiq2.f140844W = i9;
                                                    }
                                                }
                                                int i63 = bqiq2.f140830I;
                                                int i64 = bqiq2.f140846Y;
                                                if (i63 == i64 || (i10 = bqiq2.f140829H) >= i64) {
                                                    bqiq2.f140830I = i64;
                                                } else {
                                                    bqiq2.f140830I = i10;
                                                    i64 = i10;
                                                }
                                                if (i9 > i64) {
                                                    bqiq2.f140880q = 9;
                                                    break;
                                                } else {
                                                    if (i60 > 0) {
                                                        int i65 = (bqiq2.f140831J + i20) & 3;
                                                        bqiq2.f140831J = i65;
                                                        bqiq2.f140873j[i65] = i9;
                                                    }
                                                    if (bqiq2.f140845X <= bqiq2.f140887x) {
                                                        bqiq2.f140835N = 0;
                                                        bqiq2.f140880q = 8;
                                                        int i66 = bqiq2.f140829H;
                                                        int i67 = (i66 - bqiq2.f140844W) & i24;
                                                        i3 = bqiq2.f140845X - bqiq2.f140835N;
                                                        i4 = i67 + i3;
                                                        int i68 = i66 + i3;
                                                        if (i4 < i24 && i68 < i24) {
                                                            if (i3 >= 12) {
                                                                i7 = 0;
                                                                while (i7 < i3) {
                                                                    int i69 = i66 + 1;
                                                                    int i70 = i67 + 1;
                                                                    bArr[i66] = bArr[i67];
                                                                    int i71 = i69 + 1;
                                                                    int i72 = i70 + 1;
                                                                    bArr[i69] = bArr[i70];
                                                                    int i73 = i71 + 1;
                                                                    int i74 = i72 + 1;
                                                                    bArr[i71] = bArr[i72];
                                                                    i66 = i73 + 1;
                                                                    i67 = i74 + 1;
                                                                    bArr[i73] = bArr[i74];
                                                                    i7 += 4;
                                                                }
                                                            } else if (i4 > i66 && i68 > i67) {
                                                                i7 = 0;
                                                                while (i7 < i3) {
                                                                }
                                                            } else {
                                                                bqit.m112904a(bArr, i66, i67, i4);
                                                            }
                                                            bqiq2.f140835N += i3;
                                                            bqiq2.f140887x -= i3;
                                                            bqiq2.f140829H += i3;
                                                            i6 = 8;
                                                        } else {
                                                            while (true) {
                                                                i5 = bqiq2.f140835N;
                                                                if (i5 >= bqiq2.f140845X) {
                                                                    int i75 = bqiq2.f140829H;
                                                                    bArr[i75] = bArr[(i75 - bqiq2.f140844W) & i24];
                                                                    bqiq2.f140887x--;
                                                                    int i76 = i75 + i20;
                                                                    bqiq2.f140829H = i76;
                                                                    bqiq2.f140835N = i5 + 1;
                                                                    if (i76 >= e) {
                                                                        i6 = 8;
                                                                        bqiq2.f140881r = 8;
                                                                        bqiq2.f140880q = 12;
                                                                    }
                                                                } else {
                                                                    i6 = 8;
                                                                }
                                                            }
                                                        }
                                                        if (bqiq2.f140880q == i6) {
                                                            bqiq2.f140880q = i27;
                                                            break;
                                                        }
                                                    } else {
                                                        throw new bqil("Invalid backward reference");
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        bqiq2.f140880q = 2;
                                        break;
                                    }
                                } else {
                                    int min2 = Math.min(i35 + 96, i36);
                                    while (i35 < min2) {
                                        bqij.m112875c(bqiq);
                                        bqiq2.f140865b[i35] = (byte) bqij.m112872b(bqiq2, i17);
                                        i35++;
                                    }
                                    bqij.m112869a(bqiq);
                                }
                            }
                            break;
                        case 4:
                            if (bqiq2.f140887x <= 0) {
                            }
                            break;
                        case 5:
                            while (bqiq2.f140887x > 0) {
                                bqij.m112869a(bqiq);
                                bqij.m112875c(bqiq);
                                bqij.m112872b(bqiq2, i16);
                                bqiq2.f140887x += i18;
                            }
                            bqiq2.f140880q = i17;
                            break;
                        case 6:
                            byte[] bArr5 = bqiq2.f140848a;
                            int i77 = bqiq2.f140887x;
                            if (i77 > 0) {
                                int min3 = Math.min(bqiq2.f140849aa - bqiq2.f140829H, i77);
                                bqij.m112871a(bqiq2, bArr5, bqiq2.f140829H, min3);
                                bqiq2.f140887x -= min3;
                                int i78 = bqiq2.f140829H + min3;
                                bqiq2.f140829H = i78;
                                if (i78 != bqiq2.f140849aa) {
                                    bqij.m112879g(bqiq);
                                    bqiq2.f140880q = i17;
                                } else {
                                    bqiq2.f140881r = i15;
                                    bqiq2.f140880q = 12;
                                }
                                break;
                            } else {
                                bqij.m112879g(bqiq);
                                bqiq2.f140880q = i17;
                                break;
                            }
                        case 7:
                            if (bqiq2.f140832K == 0) {
                            }
                            if (bqiq2.f140880q == i8) {
                            }
                            break;
                        case 8:
                            int i662 = bqiq2.f140829H;
                            int i672 = (i662 - bqiq2.f140844W) & i24;
                            i3 = bqiq2.f140845X - bqiq2.f140835N;
                            i4 = i672 + i3;
                            int i682 = i662 + i3;
                            if (i4 < i24) {
                                if (i3 >= 12) {
                                }
                                bqiq2.f140835N += i3;
                                bqiq2.f140887x -= i3;
                                bqiq2.f140829H += i3;
                                i6 = 8;
                                if (bqiq2.f140880q == i6) {
                                }
                            }
                            while (true) {
                                i5 = bqiq2.f140835N;
                                if (i5 >= bqiq2.f140845X) {
                                }
                            }
                            if (bqiq2.f140880q == i6) {
                            }
                            break;
                        case 9:
                            int i79 = bqiq2.f140844W;
                            if (i79 <= 2147483644) {
                                int i80 = (i79 - bqiq2.f140830I) + i18;
                                int i81 = bqiq2.f140858aj;
                                if (i80 < 0) {
                                    int i82 = (-i80) + i18;
                                    int i83 = bqiq2.f140845X;
                                    int i84 = bqiq2.f140862an;
                                    if (i84 == i18) {
                                        bqiq2.f140863ao = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                                        while (true) {
                                            int i85 = bqiq2.f140858aj;
                                            if ((i18 >>> i16) != 0) {
                                                i16++;
                                            } else {
                                                i84 = i16 - 8;
                                                bqiq2.f140862an = i84;
                                            }
                                        }
                                    }
                                    byte b10 = bqiq2.f140863ao[i82 >>> i84];
                                    int[] iArr3 = bqiq2.f140861am;
                                    throw null;
                                }
                                if (Dictionary.f152332a != null) {
                                    byteBuffer = Dictionary.f152332a;
                                } else if (bqio.f140821a) {
                                    byteBuffer = Dictionary.f152332a;
                                } else {
                                    throw new bqil("brotli dictionary is not set");
                                }
                                int i86 = bqiq2.f140845X;
                                if (i86 <= 31) {
                                    int i87 = Dictionary.f152334c[i86];
                                    if (i87 != 0) {
                                        int i88 = i80 >>> i87;
                                        int i89 = Dictionary.f152333b[i86] + ((i80 & ((i20 << i87) + i18)) * i86);
                                        bqir bqir = bqis.f140895a;
                                        int i90 = bqir.f140890a;
                                        if (i88 < 121) {
                                            int a6 = bqis.m112902a(bqiq2.f140848a, bqiq2.f140829H, byteBuffer, i89, i86, bqir, i88);
                                            int i91 = bqiq2.f140829H + a6;
                                            bqiq2.f140829H = i91;
                                            bqiq2.f140887x -= a6;
                                            if (i91 >= e) {
                                                bqiq2.f140881r = 4;
                                                bqiq2.f140880q = 12;
                                            } else {
                                                bqiq2.f140880q = 4;
                                            }
                                            break;
                                        } else {
                                            throw new bqil("Invalid backward reference");
                                        }
                                    } else {
                                        throw new bqil("Invalid backward reference");
                                    }
                                } else {
                                    throw new bqil("Invalid backward reference");
                                }
                            } else {
                                throw new bqil("Invalid backward reference");
                            }
                        case 10:
                        case 11:
                        default:
                            StringBuilder sb = new StringBuilder(28);
                            sb.append("Unexpected state ");
                            sb.append(i25);
                            throw new bqil(sb.toString());
                        case 12:
                            bqiq2.f140855ag = Math.min(bqiq2.f140829H, bqiq2.f140849aa);
                            bqiq2.f140880q = 13;
                            min = Math.min(bqiq2.f140852ad - bqiq2.f140853ae, bqiq2.f140855ag - bqiq2.f140854af);
                            if (min != 0) {
                                System.arraycopy(bqiq2.f140848a, bqiq2.f140854af, bqiq2.f140869f, bqiq2.f140851ac + bqiq2.f140853ae, min);
                                bqiq2.f140853ae += min;
                                bqiq2.f140854af += min;
                            }
                            if (bqiq2.f140853ae >= bqiq2.f140852ad) {
                                int i92 = bqiq2.f140829H;
                                int i93 = bqiq2.f140846Y;
                                if (i92 >= i93) {
                                    bqiq2.f140830I = i93;
                                }
                                int i94 = bqiq2.f140849aa;
                                if (i92 >= i94) {
                                    if (i92 > i94) {
                                        bqit.m112904a(bArr, i19, i94, i92);
                                    }
                                    bqiq2.f140829H &= i24;
                                    bqiq2.f140854af = i19;
                                }
                                bqiq2.f140880q = bqiq2.f140881r;
                                break;
                            } else {
                                return;
                            }
                        case 13:
                            min = Math.min(bqiq2.f140852ad - bqiq2.f140853ae, bqiq2.f140855ag - bqiq2.f140854af);
                            if (min != 0) {
                            }
                            if (bqiq2.f140853ae >= bqiq2.f140852ad) {
                            }
                            break;
                        case 14:
                            int i95 = bqiq2.f140829H;
                            int i96 = bqiq2.f140859ak;
                            int i97 = bqiq2.f140860al;
                            if (i95 < e) {
                                bqiq2.f140880q = 4;
                                break;
                            } else {
                                bqiq2.f140881r = 14;
                                bqiq2.f140880q = 12;
                                return;
                            }
                    }
                    i14 = 10;
                    i15 = 6;
                    i16 = 8;
                    i17 = 2;
                    i18 = -1;
                    i19 = 0;
                } else if (bqiq2.f140887x >= 0) {
                    bqij.m112880h(bqiq);
                    bqij.m112870a(bqiq2, 1);
                    return;
                } else {
                    throw new bqil("Invalid metablock length");
                }
            }
        } else {
            throw new IllegalStateException("Can't decompress after close");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    private static int m112887a(int i, byte[] bArr, bqiq bqiq) {
        bqij.m112869a(bqiq);
        int c = m112896c(bqiq) + 1;
        if (c != 1) {
            bqij.m112875c(bqiq);
            int b = bqij.m112872b(bqiq, 1) != 0 ? bqij.m112872b(bqiq, 4) + 1 : 0;
            int i2 = c + b;
            int i3 = f140811a[(i2 + 31) >> 5] + 1;
            int[] iArr = new int[i3];
            int i4 = i3 - 1;
            m112886a(i2, i2, iArr, i4, bqiq);
            int i5 = 0;
            while (i5 < i) {
                bqij.m112869a(bqiq);
                bqij.m112875c(bqiq);
                int a = m112889a(iArr, i4, bqiq);
                if (a == 0) {
                    bArr[i5] = 0;
                    i5++;
                } else if (a <= b) {
                    bqij.m112875c(bqiq);
                    int b2 = (1 << a) + bqij.m112872b(bqiq, a);
                    while (b2 != 0) {
                        if (i5 < i) {
                            bArr[i5] = 0;
                            i5++;
                            b2--;
                        } else {
                            throw new bqil("Corrupted context map");
                        }
                    }
                    continue;
                } else {
                    bArr[i5] = (byte) (a - b);
                    i5++;
                }
            }
            bqij.m112875c(bqiq);
            if (bqij.m112872b(bqiq, 1) == 1) {
                int[] iArr2 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                for (int i6 = 0; i6 < 256; i6++) {
                    iArr2[i6] = i6;
                }
                for (int i7 = 0; i7 < i; i7++) {
                    int i8 = bArr[i7] & 255;
                    int i9 = iArr2[i8];
                    bArr[i7] = (byte) i9;
                    if (i8 != 0) {
                        while (i8 > 0) {
                            int i10 = i8 - 1;
                            iArr2[i8] = iArr2[i10];
                            i8 = i10;
                        }
                        iArr2[0] = i9;
                    }
                }
            }
            return c;
        }
        int i11 = 0;
        while (i11 < i) {
            int min = Math.min(i11 + 1024, i) - i11;
            System.arraycopy(bqit.f140896a, 0, bArr, i11, min);
            i11 += min;
        }
        return 1;
    }

    /* renamed from: a */
    private static int m112888a(bqiq bqiq, int i, int i2) {
        int i3;
        int[] iArr = bqiq.f140873j;
        int i4 = i + i;
        int i5 = i4 + 4;
        bqij.m112875c(bqiq);
        int a = m112889a(bqiq.f140874k, i4, bqiq);
        int b = m112894b(bqiq.f140874k, i4 + 1, bqiq);
        if (a == 1) {
            i3 = iArr[i5 + 1] + 1;
        } else if (a != 0) {
            i3 = a - 2;
        } else {
            i3 = iArr[i5];
        }
        if (i3 >= i2) {
            i3 -= i2;
        }
        int i6 = i5 + 1;
        iArr[i5] = iArr[i6];
        iArr[i6] = i3;
        return b;
    }

    /* renamed from: a */
    private static int m112889a(int[] iArr, int i, bqiq bqiq) {
        int i2 = iArr[i];
        int e = bqij.m112877e(bqiq);
        int i3 = i2 + (e & 255);
        int i4 = iArr[i3];
        int i5 = i4 >> 16;
        char c = (char) i4;
        if (i5 <= 8) {
            bqiq.f140883t += i5;
            return c;
        }
        int i6 = bqiq.f140883t;
        int i7 = iArr[i3 + c + ((e & ((1 << i5) - 1)) >>> 8)];
        bqiq.f140883t = i6 + (i7 >> 16) + 8;
        return (char) i7;
    }

    /* renamed from: a */
    static void m112890a(bqiq bqiq) {
        int i = bqiq.f140880q;
        if (i == 0) {
            throw new IllegalStateException("State MUST be initialized");
        } else if (i != 11) {
            bqiq.f140880q = 11;
            InputStream inputStream = bqiq.f140864ap;
            if (inputStream != null) {
                inputStream.close();
                bqiq.f140864ap = null;
            }
        }
    }

    /* renamed from: a */
    static void m112891a(bqiq bqiq, InputStream inputStream) {
        if (bqiq.f140880q == 0) {
            bqiq.f140874k = new int[3091];
            bqiq.f140874k[0] = 7;
            bqiq.f140831J = 3;
            int a = m112884a(3, 120);
            bqiq.f140868e = new byte[a];
            bqiq.f140878o = new int[a];
            bqiq.f140864ap = inputStream;
            bqij.m112878f(bqiq);
            bqiq.f140880q = 1;
            return;
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }

    /* renamed from: a */
    private static int[] m112892a(int i, int i2, int i3, bqiq bqiq) {
        int[] iArr = new int[((f140811a[(i2 + 31) >> 5] * i3) + i3)];
        int i4 = i3;
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i5] = i4;
            i4 += m112886a(i, i2, iArr, i5, bqiq);
        }
        return iArr;
    }
}
