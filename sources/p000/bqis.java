package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;

/* renamed from: bqis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqis {

    /* renamed from: a */
    static final bqir f140895a;

    static {
        bqir bqir = new bqir();
        f140895a = bqir;
        byte[] bArr = bqir.f140892c;
        int[] iArr = f140895a.f140893d;
        int[] iArr2 = f140895a.f140891b;
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < 217; i3++) {
            char charAt = "# #s #, #e #.# the #.com/#Â # of # and # in # to #\"#\">#\n#]# for # a # that #. # with #'# from # by #. The # on # as # is #ing #\n\t#:#ed #(# at #ly #=\"# of the #. This #,# not #er #al #='#ful #ive #less #est #ize #ous #".charAt(i3);
            if (charAt == '#') {
                iArr[i] = i2;
                i++;
            } else {
                bArr[i2] = (byte) charAt;
                i2++;
            }
        }
        for (int i4 = 0; i4 < 363; i4++) {
            iArr2[i4] = "     !! ! ,  *!  &!  \" !  ) *   * -  ! # !  #!*!  +  ,$ !  -  %  .  / #   0  1 .  \"   2  3!*   4%  ! # /   5  6  7  8 0  1 &   $   9 +   :  ;  < '  !=  >  ?! 4  @ 4  2  &   A *# (   B  C& ) %  ) !*# *-% A +! *.  D! %'  & E *6  F  G% ! *A *%  H! D  I!+!  J!+   K +- *4! A  L!*4  M  N +6  O!*% +.! K *G  P +%(  ! G *D +D  Q +# *K!*G!+D!+# +G +A +4!+% +K!+4!*D!+K!*K".charAt(i4) - ' ';
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0162 A[SYNTHETIC] */
    /* renamed from: a */
    static int m112902a(byte[] bArr, int i, ByteBuffer byteBuffer, int i2, int i3, bqir bqir, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i3;
        bqir bqir2 = bqir;
        int[] iArr = bqir2.f140891b;
        byte[] bArr2 = bqir2.f140892c;
        int[] iArr2 = bqir2.f140893d;
        int i10 = i4 * 3;
        int i11 = iArr[i10];
        int i12 = iArr[i10 + 1];
        int i13 = iArr[i10 + 2];
        int i14 = iArr2[i11 + 1];
        int i15 = iArr2[i13 + 1];
        int i16 = i12 - 11;
        if (i16 <= 0) {
            i16 = 0;
        } else if (i16 > 9) {
            i16 = 0;
        }
        if (i12 <= 0) {
            i6 = i;
            i5 = 0;
        } else if (i12 > 9) {
            i6 = i;
            i5 = 0;
        } else {
            i6 = i;
            i5 = i12;
        }
        for (int i17 = iArr2[i11]; i17 != i14; i17++) {
            bArr[i6] = bArr2[i17];
            i6++;
        }
        if (i16 > i9) {
            i16 = i9;
        }
        int i18 = i2 + i16;
        int i19 = (i9 - i16) - i5;
        int i20 = i19;
        while (i20 > 0) {
            bArr[i6] = byteBuffer.get(i18);
            i20--;
            i6++;
            i18++;
        }
        if (i12 == 10 || i12 == 11) {
            int i21 = i6 - i19;
            int i22 = i12 == 10 ? 1 : i19;
            while (i22 > 0) {
                byte b = bArr[i21];
                byte b2 = b & 255;
                if (b2 < 192) {
                    if (b2 >= 97 && b2 <= 122) {
                        bArr[i21] = (byte) (b ^ 32);
                    }
                    i21++;
                    i7 = i22 - 1;
                } else if (b2 >= 224) {
                    int i23 = i21 + 2;
                    bArr[i23] = (byte) (bArr[i23] ^ 5);
                    i21 += 3;
                    i7 = i22 - 3;
                } else {
                    int i24 = i21 + 1;
                    bArr[i24] = (byte) (bArr[i24] ^ 32);
                    i21 += 2;
                    i7 = i22 - 2;
                }
            }
        } else if (i12 == 21 || i12 == 22) {
            int i25 = i6 - i19;
            short s = bqir2.f140894e[i4];
            int i26 = (s & Short.MAX_VALUE) + (16777216 - (s & 32768));
            while (i19 > 0) {
                byte b3 = bArr[i25] & 255;
                if (b3 < 128) {
                    i26 += b3;
                    bArr[i25] = (byte) (i26 & 127);
                } else {
                    if (b3 >= 192) {
                        if (b3 >= 224) {
                            if (b3 >= 240) {
                                if (b3 < 248) {
                                    if (i19 >= 4) {
                                        int i27 = i25 + 1;
                                        byte b4 = bArr[i27];
                                        int i28 = i25 + 2;
                                        byte b5 = bArr[i28];
                                        int i29 = i25 + 3;
                                        byte b6 = bArr[i29];
                                        i26 += (b6 & 63) | ((b5 & 63) << 6) | ((b4 & 63) << 12) | ((b3 & 7) << 18);
                                        bArr[i25] = (byte) (((i26 >> 18) & 7) | 240);
                                        bArr[i27] = (byte) ((b4 & 192) | ((i26 >> 12) & 63));
                                        bArr[i28] = (byte) ((b5 & 192) | ((i26 >> 6) & 63));
                                        bArr[i29] = (byte) ((b6 & 192) | (i26 & 63));
                                        i8 = 4;
                                    }
                                }
                            } else if (i19 >= 3) {
                                int i30 = i25 + 1;
                                byte b7 = bArr[i30];
                                int i31 = i25 + 2;
                                byte b8 = bArr[i31];
                                i26 += (b8 & 63) | ((b7 & 63) << 6) | ((b3 & 15) << 12);
                                bArr[i25] = (byte) (((i26 >> 12) & 15) | AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD);
                                bArr[i30] = (byte) ((b7 & 192) | ((i26 >> 6) & 63));
                                bArr[i31] = (byte) ((b8 & 192) | (i26 & 63));
                                i8 = 3;
                            }
                        } else if (i19 >= 2) {
                            int i32 = i25 + 1;
                            byte b9 = bArr[i32];
                            i26 += ((b3 & 31) << 6) | (b9 & 63);
                            bArr[i25] = (byte) (((i26 >> 6) & 31) | AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC);
                            bArr[i32] = (byte) ((b9 & 192) | (i26 & 63));
                            i8 = 2;
                        }
                        i8 = i19;
                    } else {
                        i8 = 1;
                    }
                    i25 += i8;
                    i19 -= i8;
                    if (i12 != 21) {
                        i19 = 0;
                    }
                }
                i8 = 1;
                i25 += i8;
                i19 -= i8;
                if (i12 != 21) {
                }
            }
        }
        for (int i33 = iArr2[i13]; i33 != i15; i33++) {
            bArr[i6] = bArr2[i33];
            i6++;
        }
        return i6 - i;
    }
}
