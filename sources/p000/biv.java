package p000;

import java.security.MessageDigest;

/* renamed from: biv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biv {

    /* renamed from: a */
    private final byte[] f3337a = {-97, 39, 1, 0, -97, 54, 2, 0, 0};

    /* renamed from: b */
    private final byte[] f3338b = {5, 1, 38, 8};

    /* JADX WARN: Type inference failed for: r4v19, types: [int], assign insn: 0x04c6: ARITH  (r4v19 ? I:int) = (r2v22 short) + (1 short) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bji.a(byte[], int, short):short
     arg types: [byte[], int, int]
     candidates:
      bji.a(byte[], int, byte):byte
      bji.a(byte[], int, long):int
      bji.a(byte[], int, short):short */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final bij mo3169a(big big) {
        short s;
        byte[] bArr;
        char c;
        char c2;
        byte b;
        int i;
        byte[] bArr2;
        int i2;
        int i3;
        short s2;
        byte[] bArr3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        bix bix;
        byte b4;
        big big2;
        bij bij;
        int i6;
        int i7;
        byte b5;
        int i8;
        char c3;
        big big3 = big;
        bix a = biy.m3166a();
        byte[] bArr4 = a.f3347c;
        if (bArr4[14] == -68) {
            bArr4[14] = -91;
            byte b6 = (byte) (big3.f3293b & -64);
            byte b7 = bArr4[27];
            byte[] c4 = a.mo3182c(335618);
            byte[] bArr5 = new byte[4];
            bij bij2 = new bij();
            byte b8 = a.f3346b[6];
            if (b8 != 4) {
                if (b8 == 5) {
                    s = 27013;
                } else if (b8 == 2) {
                    s = 27013;
                } else if (a.f3347c[17] == -94) {
                    if (big3.f3294c == 0) {
                        if ((big3.f3293b & 47) == 0 && b6 != -64) {
                            int i9 = big3.f3297f;
                            if (i9 == 3 || i9 == 4) {
                                if (b7 != -121) {
                                    bArr = a.mo3177a(73484);
                                } else {
                                    bArr = a.mo3177a(73485);
                                }
                                if (bArr == null) {
                                    throw new bic((short) 27013);
                                } else if (big3.f3295d == bArr[0]) {
                                    if ((big3.f3293b & 16) != 16) {
                                        if (biw.OPERATION.f3341b.equals(bii.TAP_PAYMENT) && bjf.m3184a(4, 8) == 92) {
                                            if (bji.m3192a(c4, 0, (byte) 1) != 92) {
                                                c = 65445;
                                            } else if (b6 != 0) {
                                                throw new bic((short) 27014);
                                            }
                                        }
                                        c = 65445;
                                    } else {
                                        c = '\\';
                                    }
                                    if (c == '\\' && bji.m3192a(c4, 0, (byte) 1) == -91) {
                                        throw new bic((short) 27013);
                                    }
                                    byte[] bArr6 = a.f3347c;
                                    if (bArr6[31] == -57) {
                                        if (bArr6[26] != -67) {
                                            c3 = 31;
                                        } else if (b7 != 19) {
                                            c3 = 31;
                                        } else if (bji.m3192a(big3.f3296e, bArr[5] + 2, Byte.MIN_VALUE) == 92) {
                                            c3 = 31;
                                            a.f3347c[31] = 114;
                                            if (b7 == -121) {
                                                a.f3347c[c3] = 114;
                                            }
                                        } else {
                                            c3 = 31;
                                        }
                                        a.f3347c[c3] = -112;
                                        if (b7 == -121) {
                                        }
                                    }
                                    if (b7 == 19) {
                                        int a2 = bji.m3195a(a.f3345a, 18);
                                        if (!(a2 == 65535 || a2 == bji.m3195a(big3.f3296e, bArr[6]))) {
                                            a.f3347c[31] = 114;
                                        }
                                        if (a.mo3180b(73500)) {
                                            byte[] a3 = a.mo3177a(73500);
                                            byte[] bArr7 = big3.f3296e;
                                            byte b9 = bArr[2];
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 >= 6) {
                                                    break;
                                                }
                                                int i11 = b9 + i10;
                                                byte[] bArr8 = bArr7;
                                                short a4 = (short) (bji.m3194a((byte) 0, bArr7[i11]) - bji.m3194a((byte) 0, a3[i11]));
                                                if (a4 <= 0) {
                                                    if (a4 < 0) {
                                                        break;
                                                    }
                                                    i10++;
                                                    bArr7 = bArr8;
                                                } else {
                                                    a.f3347c[31] = 114;
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (b6 == 64) {
                                        b6 = Byte.MIN_VALUE;
                                    }
                                    byte[] bArr9 = biy.m3166a().f3347c;
                                    if (bArr9[18] == -91) {
                                        c2 = 4402;
                                    } else {
                                        c2 = 258;
                                    }
                                    if (bArr9[23] == -91 && (bArr9[31] == 114 || bArr9[32] == 92)) {
                                        c2 |= 16576;
                                    }
                                    if ((c2 & 49344) != 16576) {
                                        if ((c2 & 12336) == 4144) {
                                            b = 0;
                                        } else {
                                            b = b6 != 0 ? Byte.MIN_VALUE : 0;
                                        }
                                        if (b == 0) {
                                            bjf.m3189c(0, 48);
                                            c = 65445;
                                        } else {
                                            bjf.m3188b(0, 32);
                                        }
                                        if (c == '\\') {
                                            bjf.m3188b(2, 2);
                                        }
                                        if (b7 == -121) {
                                            bjf.m3189c(1, 254);
                                            bjf.m3189c(2, 255);
                                        }
                                        if (b7 == 19) {
                                            int i12 = big3.f3295d;
                                            bArr2 = new byte[(i12 + 9)];
                                            bArr2[0] = (byte) i12;
                                            int a5 = bji.m3197a(big3.f3296e, bArr[1], bArr2, bji.m3197a(big3.f3296e, bArr[8], bArr2, bji.m3197a(big3.f3296e, bArr[7], bArr2, bji.m3197a(big3.f3296e, bArr[6], bArr2, bji.m3197a(big3.f3296e, bArr[5], bArr2, bji.m3197a(big3.f3296e, bArr[4], bArr2, bji.m3197a(big3.f3296e, bArr[3], bArr2, bji.m3197a(big3.f3296e, bArr[2], bArr2, 1, 6), 6), 2), 5), 2), 3), 1), 4);
                                            i = 0;
                                            bji.m3197a(big3.f3296e, bArr[1], bArr5, 0, 4);
                                            i2 = bji.m3197a(c4, 0, bArr2, a5, 2);
                                        } else {
                                            i = 0;
                                            int i13 = big3.f3295d;
                                            bArr2 = new byte[(i13 + 7)];
                                            bArr2[0] = (byte) i13;
                                            i2 = bji.m3197a(big3.f3296e, bArr[1], bArr2, 1, 4);
                                            bji.m3197a(big3.f3296e, bArr[1], bArr5, 0, 4);
                                        }
                                        bih bih = a.f3351g;
                                        if (bih == null) {
                                            i3 = bji.m3195a(a.f3346b, i);
                                        } else {
                                            i3 = bih.f3301d;
                                        }
                                        if (i3 != 65535) {
                                            bji.m3197a(a.f3347c, 19, bArr2, bji.m3202a(bArr2, i2, (short) i3), 4);
                                            byte[] bArr10 = new byte[8];
                                            biq f = a.mo3187f();
                                            int c5 = f.mo3156c(bArr2, bArr10);
                                            if (c5 < 0) {
                                                s2 = 27013;
                                            } else if (i3 <= c5) {
                                                if (bih != null) {
                                                    a.f3351g = null;
                                                } else if (c5 <= a.mo3183d()) {
                                                    bih = a.mo3186e(c5);
                                                    if (bih != null) {
                                                        a.f3351g = bih;
                                                    } else {
                                                        throw new bic((short) 28416);
                                                    }
                                                } else {
                                                    throw new bic((short) 27013);
                                                }
                                                String a6 = a.mo3173a();
                                                if (a6 != null) {
                                                    bArr3 = bArr5;
                                                    a.mo3185e().mo3144a(biw.OPERATION.f3342c, "HCECLIENT_META_DATA", a6);
                                                } else {
                                                    bArr3 = bArr5;
                                                }
                                                bix a7 = biy.m3166a();
                                                if (b7 == 19) {
                                                    byte b10 = a7.f3345a[8];
                                                    if (b10 != -1) {
                                                        if (b10 == 1) {
                                                            if (bih.f3304g != null) {
                                                                i8 = 27;
                                                            } else {
                                                                i8 = 12;
                                                            }
                                                            if (a7.mo3180b(73488)) {
                                                                b5 = b10;
                                                                i4 = a7.mo3177a(73488).length + i8;
                                                            } else {
                                                                b5 = b10;
                                                                i4 = i8;
                                                            }
                                                        } else {
                                                            b5 = b10;
                                                            i4 = 8;
                                                        }
                                                        b2 = a7.f3345a[7];
                                                        if (b2 != 0) {
                                                            b3 = b5;
                                                        } else {
                                                            throw new bic((short) 28416);
                                                        }
                                                    } else {
                                                        throw new bic((short) 28416);
                                                    }
                                                } else {
                                                    byte b11 = a7.f3345a[6];
                                                    if (b11 != 0) {
                                                        b2 = b11;
                                                        b3 = 2;
                                                        i4 = 7;
                                                    } else {
                                                        throw new bic((short) 28416);
                                                    }
                                                }
                                                biq biq = f;
                                                if (c == '\\') {
                                                    i4 += 3;
                                                }
                                                byte[] bArr11 = bArr;
                                                byte[] bArr12 = new byte[i4];
                                                if (c == '\\') {
                                                    short a8 = bji.m3202a(bArr12, 0, (short) -24816);
                                                    int i14 = a8 + 1;
                                                    bArr12[a8] = (byte) (i4 - 3);
                                                    i5 = i14 + 1;
                                                    bArr12[i14] = (byte) (i4 - 4);
                                                } else {
                                                    bArr12[0] = (byte) (i4 - 1);
                                                    i5 = 1;
                                                }
                                                int i15 = i5 + 1;
                                                bArr12[i5] = bih.f3302e;
                                                bArr12[i15] = b2;
                                                int a9 = bji.m3197a(a7.f3347c, 19, bArr12, i15 + 1, 4);
                                                if (b7 == 19) {
                                                    int i16 = a9 + 1;
                                                    bArr12[a9] = b3;
                                                    if (b3 == 1) {
                                                        byte[] bArr13 = bih.f3304g;
                                                        if (bArr13 != null) {
                                                            int length = bArr13.length;
                                                            bArr12[i16] = (byte) length;
                                                            i6 = bji.m3197a(bArr13, 0, bArr12, i16 + 1, length);
                                                        } else {
                                                            bArr12[i16] = 0;
                                                            i6 = i16 + 1;
                                                        }
                                                        int i17 = i6 + 1;
                                                        bArr12[i6] = 1;
                                                        byte[] bArr14 = a7.f3347c;
                                                        if (bArr14[23] == 92) {
                                                            byte b12 = bArr14[24];
                                                            if (b12 == -73) {
                                                                bArr12[i17] = 5;
                                                                i17++;
                                                                i7 = 0;
                                                            } else if (b12 == -33) {
                                                                bArr12[i17] = 2;
                                                                i17++;
                                                                i7 = 0;
                                                            } else if (b12 == 69) {
                                                                bArr12[i17] = 1;
                                                                i17++;
                                                                i7 = 0;
                                                            } else if (b12 != 105) {
                                                                i7 = 0;
                                                            } else {
                                                                bArr12[i17] = 3;
                                                                i17++;
                                                                i7 = 0;
                                                            }
                                                        } else {
                                                            i7 = 0;
                                                            bArr12[i17] = 0;
                                                            i17++;
                                                        }
                                                        if (a7.mo3180b(73488)) {
                                                            byte[] a10 = a7.mo3177a(73488);
                                                            bji.m3197a(a10, i7, bArr12, i17, a10.length);
                                                        }
                                                    }
                                                }
                                                if (c == 65445) {
                                                    int i18 = i4 + 13;
                                                    byte[] bArr15 = new byte[i18];
                                                    bArr15[0] = Byte.MIN_VALUE;
                                                    bArr15[1] = (byte) (i18 - 2);
                                                    bArr15[2] = b;
                                                    bji.m3197a(bArr12, 0, bArr15, bji.m3197a(bArr10, 0, bArr15, bji.m3202a(bArr15, 3, (short) c5), 8), i4);
                                                    bij2.f3316a = bArr15;
                                                    big2 = big;
                                                    bix = a;
                                                    b4 = b7;
                                                    bij = bij2;
                                                } else {
                                                    int c6 = bji.m3209c(a.f3345a) / 8;
                                                    if (c6 != 0) {
                                                        byte[] bArr16 = new byte[8];
                                                        System.arraycopy(a.f3345a, 24, bArr16, 0, 8);
                                                        int i19 = c6 - 2;
                                                        byte[] bArr17 = new byte[i19];
                                                        bji.m3203a(bArr17, 0, i19, (byte) 0);
                                                        MessageDigest g = a.mo3188g();
                                                        if (g != null) {
                                                            big2 = big;
                                                            g.update(big2.f3296e);
                                                            int i20 = i4 + 9;
                                                            byte[] bArr18 = new byte[i20];
                                                            b4 = b7;
                                                            byte[] bArr19 = this.f3337a;
                                                            bix = a;
                                                            bij bij3 = bij2;
                                                            bji.m3197a(bArr19, 0, bArr18, 0, bArr19.length);
                                                            int i21 = 3;
                                                            bArr18[3] = b;
                                                            short s3 = (short) c5;
                                                            bji.m3197a(bArr12, 0, bArr18, bji.m3202a(bArr18, 7, s3), i4);
                                                            byte[] digest = g.digest(bArr18);
                                                            bji.m3197a(digest, 0, bArr17, 21, digest.length);
                                                            byte[] bArr20 = this.f3338b;
                                                            bji.m3197a(bArr20, 0, bArr17, 0, bArr20.length);
                                                            bji.m3202a(bArr17, 10, s3);
                                                            bArr17[12] = b;
                                                            bji.m3197a(bArr10, 0, bArr17, 13, 8);
                                                            bji.m3203a(bArr17, 41, c6 - 63, (byte) -69);
                                                            bji.m3197a(big2.f3296e, bArr11[1], bArr17, c6 - 22, 4);
                                                            byte[] bArr21 = new byte[c6];
                                                            int a11 = biq.mo3151a(bArr17, bArr21, bArr16);
                                                            if (a11 >= 0) {
                                                                int i22 = c6 + 14 + i4;
                                                                if (c6 > 127) {
                                                                    i22 += 2;
                                                                } else if (i22 - 2 > 127) {
                                                                    i22++;
                                                                }
                                                                byte[] bArr22 = new byte[i22];
                                                                bArr22[0] = 119;
                                                                int i23 = i22 - 2;
                                                                if (i23 > 127) {
                                                                    bArr22[1] = -127;
                                                                    bArr22[2] = (byte) (i22 - 3);
                                                                } else {
                                                                    bArr22[1] = (byte) i23;
                                                                    i21 = 2;
                                                                }
                                                                short a12 = bji.m3202a(bArr22, bji.m3197a(bArr18, 0, bArr22, i21, i20), (short) -24757);
                                                                if (c6 > 127) {
                                                                    bArr22[a12] = -127;
                                                                    a12++;
                                                                }
                                                                bArr22[a12] = (byte) a11;
                                                                bji.m3197a(bArr21, 0, bArr22, a12 + 1, c6);
                                                                bij = bij3;
                                                                bij.f3316a = bArr22;
                                                            } else {
                                                                throw new bic((short) 27013);
                                                            }
                                                        } else {
                                                            throw new bic((short) 28416);
                                                        }
                                                    } else {
                                                        throw new bic((short) 28416);
                                                    }
                                                }
                                                bix bix2 = bix;
                                                byte b13 = bix2.f3347c[31];
                                                if (b13 == 114) {
                                                    bix2.f3350f = bib.f3274d;
                                                } else if (b13 == -112) {
                                                    bix2.f3350f = bib.f3273c;
                                                }
                                                bix2.mo3179b(335637, bArr10);
                                                bix2.mo3179b(335638, bArr3);
                                                if (b4 == 19) {
                                                    byte[] bArr23 = new byte[6];
                                                    System.arraycopy(big2.f3296e, bArr11[2], bArr23, 0, 6);
                                                    bix2.mo3179b(335633, bArr23);
                                                    byte[] bArr24 = new byte[2];
                                                    System.arraycopy(big2.f3296e, bArr11[6], bArr24, 0, 2);
                                                    bix2.mo3179b(335641, bArr24);
                                                }
                                                byte[] bArr25 = bix2.f3347c;
                                                bArr25[17] = -59;
                                                bArr25[23] = -91;
                                                return bij;
                                            } else {
                                                s2 = 27013;
                                            }
                                            throw new bic(s2);
                                        }
                                        a.mo3191h(5);
                                        throw new bic((short) 27013);
                                    }
                                    throw new bic(27012, bib.f3272b);
                                } else {
                                    throw new bic((short) 26368);
                                }
                            } else {
                                throw new bic((short) 26368);
                            }
                        }
                    }
                    throw new bic((short) 27270);
                } else {
                    throw new bic((short) 27013);
                }
                throw new bic(s);
            }
            throw new bic((short) 27014);
        }
        throw new bic(bib.f3276f);
    }
}
