package p000;

import android.text.TextUtils;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: djh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djh {
    /* renamed from: a */
    public static int m8640a(brtj brtj, din din) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        brtj brtj2 = brtj;
        din din2 = din;
        int i7 = 1;
        int a = m8643a(brtj2, din2.f13233c, true);
        int a2 = m8643a(brtj2, din2.f13235e, true);
        int a3 = m8643a(brtj2, din2.f13236f, true);
        int a4 = m8642a(brtj2, din2.f13237g);
        bxwc bxwc = din2.f13240j;
        if (!bxwc.isEmpty()) {
            int[] iArr = new int[bxwc.size()];
            for (int i8 = 0; i8 < bxwc.size(); i8++) {
                diq diq = (diq) bxwc.get(i8);
                if (!diq.f13264c.isEmpty()) {
                    int[] iArr2 = new int[diq.f13264c.size()];
                    for (int i9 = 0; i9 < diq.f13264c.size(); i9++) {
                        iArr2[i9] = diq.f13264c.mo74151b(i9);
                    }
                    i6 = brtm.m114592b(brtj2, iArr2);
                } else {
                    i6 = 0;
                }
                iArr[i8] = brtm.m114589a(brtj2, diq.f13263b, i6);
            }
            i = djy.m8681a(brtj2, iArr);
        } else {
            i = 0;
        }
        if ((din2.f13231a & 2048) != 0) {
            i2 = brtj2.mo69862a(din2.f13244n);
        } else {
            i2 = 0;
        }
        if ((din2.f13231a & 4096) != 0) {
            i3 = brtj2.mo69862a(din2.f13245o);
        } else {
            i3 = 0;
        }
        if ((din2.f13231a & 8192) != 0) {
            i4 = brtj2.mo69862a(din2.f13246p);
        } else {
            i4 = 0;
        }
        if ((din2.f13231a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            i5 = brtj2.mo69862a(din2.f13247q);
        } else {
            i5 = 0;
        }
        int a5 = dik.m8576a(din2.f13232b);
        if (a5 == 0) {
            a5 = 1;
        }
        int i10 = a5 - 1;
        long j = din2.f13234d;
        int i11 = din2.f13238h;
        int a6 = dkc.m8723a(din2.f13239i);
        if (a6 == 0) {
            a6 = 1;
        }
        int i12 = a6 - 1;
        int a7 = dim.m8578a(din2.f13241k);
        if (a7 != 0) {
            i7 = a7;
        }
        return djy.m8680a(brtj, i10, a, j, a2, a3, a4, i11, i12, i, i7 - 1, din2.f13242l, din2.f13243m, i2, i3, i4, i5);
    }

    /* renamed from: b */
    private static int[] m8649b(brtj brtj, List list) {
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = m8643a(brtj, (String) list.get(i), true);
        }
        return iArr;
    }

    /* renamed from: a */
    public static int m8641a(brtj brtj, djy djy) {
        int i;
        int i2;
        brtj brtj2 = brtj;
        djy djy2 = djy;
        if (djy2 == null) {
            return 0;
        }
        int a = m8643a(brtj2, djy.mo9151b(), true);
        int a2 = m8643a(brtj2, djy.mo9154e(), true);
        int a3 = m8643a(brtj2, djy.mo9155f(), true);
        int a4 = m8642a(brtj2, djy.mo9156g());
        int j = djy.mo9159j();
        if (j != 0) {
            int[] iArr = new int[j];
            brtm brtm = new brtm();
            for (int i3 = 0; i3 < j; i3++) {
                djy2.mo9150a(brtm, i3);
                if (brtm.mo69893B() != 0) {
                    int[] iArr2 = new int[brtm.mo69893B()];
                    for (int i4 = 0; i4 < brtm.mo69893B(); i4++) {
                        iArr2[i4] = brtm.mo69923d(i4);
                    }
                    i2 = brtm.m114592b(brtj2, iArr2);
                } else {
                    i2 = 0;
                }
                iArr[i3] = brtm.m114589a(brtj2, brtm.mo9183R(), i2);
            }
            i = djy.m8681a(brtj2, iArr);
        } else {
            i = 0;
        }
        return djy.m8680a(brtj, djy.mo9149a(), a, djy.mo9153d(), a2, a3, a4, djy.mo9157h(), djy.mo9158i(), i, djy.mo9160k(), djy.mo9161l(), djy.mo9162m(), m8642a(brtj2, djy.mo9163n()), m8642a(brtj2, djy.mo9164o()), m8642a(brtj2, djy.mo9165p()), m8642a(brtj2, djy.mo9166q()));
    }

    /* renamed from: a */
    private static int m8642a(brtj brtj, String str) {
        return m8643a(brtj, str, false);
    }

    /* renamed from: a */
    private static int m8643a(brtj brtj, String str, boolean z) {
        if (!z && TextUtils.isEmpty(str)) {
            return 0;
        }
        bmzs.m108696a(str);
        return brtj.mo69862a(str);
    }

    /* renamed from: a */
    public static int m8644a(brtj brtj, ByteBuffer byteBuffer, long j, ByteBuffer byteBuffer2) {
        byteBuffer.mark();
        byteBuffer2.mark();
        int a = brtj.mo69863a(byteBuffer);
        int a2 = brtj.mo69863a(byteBuffer2);
        byteBuffer.reset();
        byteBuffer2.reset();
        ThreadLocal threadLocal = brtm.UTF8_CHARSET;
        brtj.mo69885d(3);
        brtj.mo69871a(1, j, 0);
        brtj.mo69883c(2, a2);
        brtj.mo69883c(0, a);
        int e = brtj.mo69886e();
        brtj.mo69878b(e, 4);
        brtj.mo69878b(e, 8);
        return e;
    }

    /* renamed from: a */
    private static int m8645a(brtj brtj, List list) {
        int i;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < list.size(); i2++) {
            dmo dmo = (dmo) list.get(i2);
            int a = m8643a(brtj, dmo.f13575b, true);
            int[] b = m8649b(brtj, dmo.f13577d);
            if (b != null) {
                int length = b.length;
                int i3 = dnc.f13617a;
                brtj.mo69870a(4, length, 4);
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    brtj.mo69882c(b[length]);
                }
                i = brtj.mo69876b();
            } else {
                i = 0;
            }
            int i4 = dmo.f13576c;
            int i5 = dmo.f13578e;
            int i6 = dnc.f13617a;
            brtj.mo69885d(4);
            brtj.mo69879b(3, i5, 0);
            brtj.mo69883c(2, i);
            brtj.mo69879b(1, i4, 0);
            brtj.mo69883c(0, a);
            int e = brtj.mo69886e();
            brtj.mo69878b(e, 4);
            iArr[i2] = e;
        }
        ThreadLocal threadLocal = brtm.UTF8_CHARSET;
        brtj.mo69870a(4, size, 4);
        while (true) {
            size--;
            if (size < 0) {
                return brtj.mo69876b();
            }
            brtj.mo69882c(iArr[size]);
        }
    }

    /* renamed from: a */
    public static djc m8646a(brtm brtm) {
        bxvd da = djc.f13307f.mo74144da();
        String P = brtm.mo9295P();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        djc djc = (djc) da.f164949b;
        P.getClass();
        djc.f13309a |= 1;
        djc.f13310b = P;
        long s = brtm.mo69929s();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        djc djc2 = (djc) da.f164949b;
        djc2.f13309a |= 2;
        djc2.f13311c = s;
        boolean t = brtm.mo69931t();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        djc djc3 = (djc) da.f164949b;
        djc3.f13309a |= 4;
        djc3.f13312d = t;
        boolean u = brtm.mo69932u();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        djc djc4 = (djc) da.f164949b;
        djc4.f13309a |= 8;
        djc4.f13313e = u;
        return (djc) da.mo74062i();
    }

    /* renamed from: a */
    public static djz m8647a(int i, List list, List list2, dmn dmn, String str, List list3, List list4, List list5, String str2, List list6) {
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
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        String str3;
        bxtx bxtx;
        int i34;
        bxwc bxwc;
        int i35;
        int i36;
        int[] iArr;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int[] iArr2;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        dmn dmn2 = dmn;
        brtj brtj = new brtj(i);
        if (!list.isEmpty()) {
            int size = list.size();
            int[] iArr3 = new int[size];
            for (int i54 = 0; i54 < list.size(); i54++) {
                iArr3[i54] = m8640a(brtj, (din) list.get(i54));
            }
            int i55 = djz.f13375a;
            brtj.mo69870a(4, size, 4);
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                brtj.mo69882c(iArr3[size]);
            }
            i2 = brtj.mo69876b();
        } else {
            i2 = 0;
        }
        int i56 = 3;
        boolean z = true;
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            int[] iArr4 = new int[size2];
            for (int i57 = 0; i57 < list2.size(); i57++) {
                dio dio = (dio) list2.get(i57);
                int a = m8643a(brtj, dio.f13251b, true);
                int i58 = dio.f13252c;
                int i59 = dio.f13253d;
                int i60 = dka.f13377a;
                brtj.mo69885d(3);
                brtj.mo69879b(2, i59, 0);
                brtj.mo69879b(1, i58, 0);
                brtj.mo69883c(0, a);
                int e = brtj.mo69886e();
                brtj.mo69878b(e, 4);
                iArr4[i57] = e;
            }
            int i61 = djz.f13375a;
            brtj.mo69870a(4, size2, 4);
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                brtj.mo69882c(iArr4[size2]);
            }
            i3 = brtj.mo69876b();
        } else {
            i3 = 0;
        }
        int a2 = m8643a(brtj, dmn2.f13552b, true);
        int[] b = m8649b(brtj, dmn2.f13553c);
        if (b != null) {
            int length = b.length;
            ThreadLocal threadLocal = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, length, 4);
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                brtj.mo69882c(b[length]);
            }
            i4 = brtj.mo69876b();
        } else {
            i4 = 0;
        }
        int a3 = m8642a(brtj, dmn2.f13555e);
        bxwc bxwc2 = dmn2.f13556f;
        if (!bxwc2.isEmpty()) {
            int size3 = bxwc2.size();
            int[] iArr5 = new int[size3];
            int i62 = 0;
            while (i62 < bxwc2.size()) {
                dmr dmr = (dmr) bxwc2.get(i62);
                int a4 = m8643a(brtj, dmr.f13595b, z);
                int i63 = dmr.f13596c;
                int i64 = dmr.f13597d;
                ThreadLocal threadLocal2 = brtm.UTF8_CHARSET;
                brtj.mo69885d(i56);
                brtj.mo69879b(2, i64, Integer.MAX_VALUE);
                brtj.mo69879b(1, i63, 0);
                brtj.mo69883c(0, a4);
                int e2 = brtj.mo69886e();
                brtj.mo69878b(e2, 4);
                iArr5[i62] = e2;
                i62++;
                i56 = 3;
                z = true;
            }
            ThreadLocal threadLocal3 = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, size3, 4);
            while (true) {
                size3--;
                if (size3 < 0) {
                    break;
                }
                brtj.mo69882c(iArr5[size3]);
            }
            i5 = brtj.mo69876b();
        } else {
            i5 = 0;
        }
        int a5 = m8645a(brtj, dmn2.f13558h);
        bxwc bxwc3 = dmn2.f13559i;
        if (!bxwc3.isEmpty()) {
            int size4 = bxwc3.size();
            int[] iArr6 = new int[size4];
            int i65 = 0;
            while (i65 < bxwc3.size()) {
                dms dms = (dms) bxwc3.get(i65);
                int a6 = m8643a(brtj, dms.f13601b, true);
                int a7 = m8643a(brtj, dms.f13602c, true);
                int i66 = dms.f13603d;
                int i67 = dnf.f13620a;
                brtj.mo69885d(3);
                brtj.mo69879b(2, i66, 0);
                brtj.mo69883c(1, a7);
                brtj.mo69883c(0, a6);
                int e3 = brtj.mo69886e();
                brtj.mo69878b(e3, 4);
                brtj.mo69878b(e3, 6);
                iArr6[i65] = e3;
                i65++;
                bxwc3 = bxwc3;
                i2 = i2;
            }
            i6 = i2;
            ThreadLocal threadLocal4 = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, size4, 4);
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                brtj.mo69882c(iArr6[size4]);
            }
            i7 = brtj.mo69876b();
        } else {
            i6 = i2;
            i7 = 0;
        }
        bxwc bxwc4 = dmn2.f13560j;
        if (!bxwc4.isEmpty()) {
            int size5 = bxwc4.size();
            int[] iArr7 = new int[size5];
            int i68 = 0;
            while (i68 < bxwc4.size()) {
                dmq dmq = (dmq) bxwc4.get(i68);
                int a8 = m8643a(brtj, dmq.f13589b, true);
                int a9 = m8643a(brtj, dmq.f13590c, true);
                int i69 = dmq.f13591d;
                int i70 = dne.f13619a;
                brtj.mo69885d(3);
                brtj.mo69879b(2, i69, 0);
                brtj.mo69883c(1, a9);
                brtj.mo69883c(0, a8);
                int e4 = brtj.mo69886e();
                brtj.mo69878b(e4, 4);
                brtj.mo69878b(e4, 6);
                iArr7[i68] = e4;
                i68++;
                bxwc4 = bxwc4;
                i3 = i3;
            }
            i8 = i3;
            ThreadLocal threadLocal5 = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, size5, 4);
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                brtj.mo69882c(iArr7[size5]);
            }
            i9 = brtj.mo69876b();
        } else {
            i8 = i3;
            i9 = 0;
        }
        bxwc bxwc5 = dmn2.f13561k;
        if (!bxwc5.isEmpty()) {
            int size6 = bxwc5.size();
            int[] iArr8 = new int[size6];
            int i71 = 0;
            while (i71 < bxwc5.size()) {
                dmp dmp = (dmp) bxwc5.get(i71);
                int a10 = m8643a(brtj, dmp.f13582b, true);
                int a11 = m8643a(brtj, dmp.f13583c, true);
                int i72 = dmp.f13585e;
                boolean z2 = dmp.f13584d;
                int i73 = dnd.f13618a;
                brtj.mo69885d(4);
                brtj.mo69879b(2, i72, 0);
                brtj.mo69883c(1, a11);
                brtj.mo69883c(0, a10);
                brtj.mo69880b(3, z2);
                int e5 = brtj.mo69886e();
                brtj.mo69878b(e5, 4);
                brtj.mo69878b(e5, 6);
                iArr8[i71] = e5;
                i71++;
                bxwc5 = bxwc5;
                a2 = a2;
                i4 = i4;
            }
            i10 = a2;
            i11 = i4;
            ThreadLocal threadLocal6 = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, size6, 4);
            while (true) {
                size6--;
                if (size6 < 0) {
                    break;
                }
                brtj.mo69882c(iArr8[size6]);
            }
            i12 = brtj.mo69876b();
        } else {
            i10 = a2;
            i11 = i4;
            i12 = 0;
        }
        bxwc bxwc6 = dmn2.f13563m;
        if (!bxwc6.isEmpty()) {
            int size7 = bxwc6.size();
            int[] iArr9 = new int[size7];
            int i74 = 0;
            while (i74 < bxwc6.size()) {
                dmb dmb = (dmb) bxwc6.get(i74);
                int a12 = m8643a(brtj, dmb.f13486b, true);
                int a13 = m8643a(brtj, dmb.f13487c, true);
                int a14 = m8642a(brtj, dmb.f13488d);
                int i75 = dmb.f13489e;
                int i76 = dmx.f13612a;
                brtj.mo69885d(4);
                brtj.mo69879b(3, i75, 0);
                brtj.mo69883c(2, a14);
                brtj.mo69883c(1, a13);
                brtj.mo69883c(0, a12);
                int e6 = brtj.mo69886e();
                brtj.mo69878b(e6, 4);
                brtj.mo69878b(e6, 6);
                iArr9[i74] = e6;
                i74++;
                a3 = a3;
                bxwc6 = bxwc6;
            }
            i13 = a3;
            ThreadLocal threadLocal7 = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, size7, 4);
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                brtj.mo69882c(iArr9[size7]);
            }
            i14 = brtj.mo69876b();
        } else {
            i13 = a3;
            i14 = 0;
        }
        bxwc bxwc7 = dmn2.f13564n;
        if (!bxwc7.isEmpty()) {
            int size8 = bxwc7.size();
            int[] iArr10 = new int[size8];
            int i77 = 0;
            while (i77 < bxwc7.size()) {
                dmi dmi = (dmi) bxwc7.get(i77);
                int a15 = m8643a(brtj, dmi.f13535b, true);
                bxwc bxwc8 = dmi.f13536c;
                if (!bxwc8.isEmpty()) {
                    int size9 = bxwc8.size();
                    int[] iArr11 = new int[size9];
                    bxwc = bxwc7;
                    int i78 = 0;
                    while (i78 < size9) {
                        bxwc bxwc9 = bxwc8;
                        dmh dmh = (dmh) bxwc8.get(i78);
                        int i79 = i5;
                        int i80 = a5;
                        int a16 = m8643a(brtj, dmh.f13530b, true);
                        bxwc bxwc10 = dmh.f13531c;
                        if (!bxwc10.isEmpty()) {
                            int size10 = bxwc10.size();
                            i52 = i7;
                            int[] iArr12 = new int[size10];
                            i51 = i9;
                            int i81 = 0;
                            while (i81 < size10) {
                                dmg dmg = (dmg) bxwc10.get(i81);
                                int a17 = m8642a(brtj, dmg.f13520b);
                                int i82 = dmg.f13521c;
                                boolean z3 = dmg.f13522d;
                                boolean z4 = dmg.f13523e;
                                boolean z5 = dmg.f13524f;
                                boolean z6 = dmg.f13525g;
                                int i83 = dmg.f13526h;
                                int i84 = dnb.f13616a;
                                brtj.mo69885d(7);
                                brtj.mo69879b(6, i83, 0);
                                brtj.mo69879b(1, i82, 0);
                                brtj.mo69883c(0, a17);
                                brtj.mo69880b(5, z6);
                                brtj.mo69880b(4, z5);
                                brtj.mo69880b(3, z4);
                                brtj.mo69880b(2, z3);
                                iArr12[i81] = brtj.mo69886e();
                                i81++;
                                i12 = i12;
                                bxwc10 = bxwc10;
                                i14 = i14;
                                size8 = size8;
                                iArr10 = iArr10;
                                i77 = i77;
                                a15 = a15;
                                size9 = size9;
                            }
                            i50 = i12;
                            i49 = i14;
                            i48 = size8;
                            iArr2 = iArr10;
                            i47 = i77;
                            i45 = size9;
                            i46 = a15;
                            int i85 = dmw.f13611a;
                            brtj.mo69870a(4, size10, 4);
                            while (true) {
                                size10--;
                                if (size10 < 0) {
                                    break;
                                }
                                brtj.mo69882c(iArr12[size10]);
                            }
                            i53 = brtj.mo69876b();
                        } else {
                            i52 = i7;
                            i51 = i9;
                            i50 = i12;
                            i49 = i14;
                            i48 = size8;
                            iArr2 = iArr10;
                            i47 = i77;
                            i45 = size9;
                            i46 = a15;
                            i53 = 0;
                        }
                        int i86 = dmw.f13611a;
                        brtj.mo69885d(2);
                        brtj.mo69883c(1, i53);
                        brtj.mo69883c(0, a16);
                        int e7 = brtj.mo69886e();
                        brtj.mo69878b(e7, 4);
                        iArr11[i78] = e7;
                        i78++;
                        i5 = i79;
                        bxwc8 = bxwc9;
                        a5 = i80;
                        i7 = i52;
                        i9 = i51;
                        i12 = i50;
                        i14 = i49;
                        size8 = i48;
                        iArr10 = iArr2;
                        i77 = i47;
                        a15 = i46;
                        size9 = i45;
                    }
                    i41 = i7;
                    i43 = i5;
                    i42 = a5;
                    i40 = i9;
                    i39 = i12;
                    i38 = i14;
                    i37 = size8;
                    iArr = iArr10;
                    i36 = i77;
                    i35 = a15;
                    int i87 = dmz.f13614a;
                    brtj.mo69870a(4, size9, 4);
                    for (int i88 = size9 - 1; i88 >= 0; i88--) {
                        brtj.mo69882c(iArr11[i88]);
                    }
                    i44 = brtj.mo69876b();
                } else {
                    i41 = i7;
                    i43 = i5;
                    i42 = a5;
                    i40 = i9;
                    i39 = i12;
                    i38 = i14;
                    bxwc = bxwc7;
                    i37 = size8;
                    iArr = iArr10;
                    i36 = i77;
                    i35 = a15;
                    i44 = 0;
                }
                int i89 = dmz.f13614a;
                brtj.mo69885d(2);
                brtj.mo69883c(1, i44);
                brtj.mo69883c(0, i35);
                int e8 = brtj.mo69886e();
                brtj.mo69878b(e8, 4);
                iArr[i36] = e8;
                i77 = i36 + 1;
                bxwc7 = bxwc;
                i5 = i43;
                a5 = i42;
                i7 = i41;
                i9 = i40;
                i12 = i39;
                i14 = i38;
                size8 = i37;
                iArr10 = iArr;
            }
            i18 = i7;
            i20 = i5;
            i19 = a5;
            i17 = i9;
            i16 = i12;
            i15 = i14;
            int[] iArr13 = iArr10;
            ThreadLocal threadLocal8 = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, size8, 4);
            for (int i90 = size8 - 1; i90 >= 0; i90--) {
                brtj.mo69882c(iArr13[i90]);
            }
            i21 = brtj.mo69876b();
        } else {
            i18 = i7;
            i20 = i5;
            i19 = a5;
            i17 = i9;
            i16 = i12;
            i15 = i14;
            i21 = 0;
        }
        dmn dmn3 = dmn;
        int a18 = m8643a(brtj, dmn3.f13565o, true);
        bxwc bxwc11 = dmn3.f13566p;
        if (!bxwc11.isEmpty()) {
            int size11 = bxwc11.size();
            int[] iArr14 = new int[size11];
            for (int i91 = 0; i91 < bxwc11.size(); i91++) {
                dmd dmd = (dmd) bxwc11.get(i91);
                int a19 = m8643a(brtj, dmd.f13498b, true);
                int a20 = m8642a(brtj, dmd.f13499c);
                int a21 = m8642a(brtj, dmd.f13500d);
                boolean z7 = dmd.f13501e;
                int i92 = dmd.f13502f;
                int i93 = dmy.f13613a;
                brtj.mo69885d(5);
                brtj.mo69879b(4, i92, 0);
                brtj.mo69883c(2, a21);
                brtj.mo69883c(1, a20);
                brtj.mo69883c(0, a19);
                brtj.mo69880b(3, z7);
                int e9 = brtj.mo69886e();
                brtj.mo69878b(e9, 4);
                iArr14[i91] = e9;
            }
            ThreadLocal threadLocal9 = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, size11, 4);
            while (true) {
                size11--;
                if (size11 < 0) {
                    break;
                }
                brtj.mo69882c(iArr14[size11]);
            }
            i22 = brtj.mo69876b();
        } else {
            i22 = 0;
        }
        bxwc bxwc12 = dmn3.f13568r;
        if (!bxwc12.isEmpty()) {
            int size12 = bxwc12.size();
            int[] iArr15 = new int[size12];
            int i94 = 0;
            while (i94 < bxwc12.size()) {
                dmm dmm = (dmm) bxwc12.get(i94);
                int a22 = m8642a(brtj, dmm.f13546d);
                if (dmm.f13544b == 6) {
                    str3 = (String) dmm.f13545c;
                } else {
                    str3 = "";
                }
                int a23 = m8642a(brtj, str3);
                if (dmm.f13544b == 7) {
                    bxtx = (bxtx) dmm.f13545c;
                } else {
                    bxtx = bxtx.f164797b;
                }
                byte[] k = bxtx.mo73780k();
                if (k == null || k.length == 0) {
                    i34 = 0;
                } else {
                    int i95 = dna.f13615a;
                    i34 = brtj.mo69864a(k);
                }
                int a24 = dml.m8815a(dmm.f13547e);
                if (a24 == 0) {
                    a24 = 1;
                }
                int i96 = a24 - 1;
                int intValue = dmm.f13544b == 3 ? ((Integer) dmm.f13545c).intValue() : 0;
                bxwc bxwc13 = bxwc12;
                float floatValue = dmm.f13544b == 4 ? ((Float) dmm.f13545c).floatValue() : 0.0f;
                int i97 = i21;
                boolean booleanValue = dmm.f13544b == 5 ? ((Boolean) dmm.f13545c).booleanValue() : false;
                int i98 = dmm.f13548f;
                int i99 = dna.f13615a;
                brtj.mo69885d(8);
                int i100 = a18;
                brtj.mo69879b(7, i98, 0);
                brtj.mo69883c(6, i34);
                brtj.mo69883c(5, a23);
                if (((double) floatValue) != 0.0d) {
                    brtj.mo69866a(floatValue);
                    brtj.mo69887e(3);
                }
                brtj.mo69879b(2, intValue, 0);
                brtj.mo69879b(1, i96, 0);
                brtj.mo69883c(0, a22);
                brtj.mo69880b(4, booleanValue);
                iArr15[i94] = brtj.mo69886e();
                i94++;
                a18 = i100;
                bxwc12 = bxwc13;
                i21 = i97;
            }
            i24 = i21;
            i23 = a18;
            ThreadLocal threadLocal10 = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, size12, 4);
            while (true) {
                size12--;
                if (size12 < 0) {
                    break;
                }
                brtj.mo69882c(iArr15[size12]);
            }
            i25 = brtj.mo69876b();
        } else {
            i24 = i21;
            i23 = a18;
            i25 = 0;
        }
        bxwc bxwc14 = dmn3.f13569s;
        if (!bxwc14.isEmpty()) {
            int size13 = bxwc14.size();
            int[] iArr16 = new int[size13];
            for (int i101 = 0; i101 < bxwc14.size(); i101++) {
                dme dme = (dme) bxwc14.get(i101);
                int a25 = m8642a(brtj, dme.f13506b);
                int i102 = dme.f13507c;
                ThreadLocal threadLocal11 = brtm.UTF8_CHARSET;
                brtj.mo69885d(2);
                brtj.mo69879b(1, i102, 0);
                brtj.mo69883c(0, a25);
                iArr16[i101] = brtj.mo69886e();
            }
            ThreadLocal threadLocal12 = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, size13, 4);
            while (true) {
                size13--;
                if (size13 < 0) {
                    break;
                }
                brtj.mo69882c(iArr16[size13]);
            }
            i26 = brtj.mo69876b();
        } else {
            i26 = 0;
        }
        bxwc bxwc15 = dmn3.f13570t;
        if (!bxwc15.isEmpty()) {
            int size14 = bxwc15.size();
            int[] iArr17 = new int[size14];
            for (int i103 = 0; i103 < bxwc15.size(); i103++) {
                dmt dmt = (dmt) bxwc15.get(i103);
                int a26 = m8643a(brtj, dmt.f13607b, true);
                int a27 = m8643a(brtj, dmt.f13608c, true);
                int[] b2 = m8649b(brtj, dmt.f13609d);
                if (b2 != null) {
                    int length2 = b2.length;
                    int i104 = dng.f13621a;
                    brtj.mo69870a(4, length2, 4);
                    while (true) {
                        length2--;
                        if (length2 < 0) {
                            break;
                        }
                        brtj.mo69882c(b2[length2]);
                    }
                    i33 = brtj.mo69876b();
                } else {
                    i33 = 0;
                }
                int i105 = dmt.f13610e;
                int i106 = dng.f13621a;
                brtj.mo69885d(4);
                brtj.mo69879b(3, i105, 0);
                brtj.mo69883c(2, i33);
                brtj.mo69883c(1, a27);
                brtj.mo69883c(0, a26);
                int e10 = brtj.mo69886e();
                brtj.mo69878b(e10, 4);
                brtj.mo69878b(e10, 6);
                iArr17[i103] = e10;
            }
            ThreadLocal threadLocal13 = brtm.UTF8_CHARSET;
            brtj.mo69870a(4, size14, 4);
            while (true) {
                size14--;
                if (size14 < 0) {
                    break;
                }
                brtj.mo69882c(iArr17[size14]);
            }
            i27 = brtj.mo69876b();
        } else {
            i27 = 0;
        }
        if ((dmn3.f13551a & 16) != 0) {
            dmc dmc = dmn3.f13571u;
            if (dmc == null) {
                dmc = dmc.f13490d;
            }
            int a28 = m8642a(brtj, dmc.f13493b);
            int i107 = dmc.f13494c;
            ThreadLocal threadLocal14 = brtm.UTF8_CHARSET;
            brtj.mo69885d(2);
            brtj.mo69879b(1, i107, 0);
            brtj.mo69883c(0, a28);
            i28 = brtj.mo69886e();
        } else {
            i28 = 0;
        }
        int i108 = dmn3.f13554d;
        ThreadLocal threadLocal15 = brtm.UTF8_CHARSET;
        brtj.mo69885d(17);
        brtj.mo69883c(16, i28);
        brtj.mo69883c(15, i27);
        brtj.mo69883c(14, i26);
        brtj.mo69883c(13, i25);
        brtj.mo69883c(12, i22);
        brtj.mo69883c(11, i23);
        brtj.mo69883c(10, i24);
        brtj.mo69883c(9, i15);
        brtj.mo69883c(8, i16);
        brtj.mo69883c(7, i17);
        brtj.mo69883c(6, i18);
        brtj.mo69883c(5, i19);
        brtj.mo69883c(4, i20);
        brtj.mo69883c(3, i13);
        brtj.mo69879b(2, i108, 0);
        brtj.mo69883c(1, i11);
        brtj.mo69883c(0, i10);
        int e11 = brtj.mo69886e();
        brtj.mo69878b(e11, 4);
        brtj.mo69878b(e11, 26);
        int a29 = m8643a(brtj, str, true);
        if (!list3.isEmpty()) {
            bxvd da = boju.f133349e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boju boju = (boju) da.f164949b;
            boju.mo68913a();
            bxsy.m123078a(list3, boju.f133352b);
            i29 = brtj.mo69864a(((boju) da.mo74062i()).mo73642k());
        } else {
            i29 = 0;
        }
        int[] b3 = m8649b(brtj, list5);
        if (b3 != null) {
            int length3 = b3.length;
            brtj.mo69870a(4, length3, 4);
            while (true) {
                length3--;
                if (length3 < 0) {
                    break;
                }
                brtj.mo69882c(b3[length3]);
            }
            i30 = brtj.mo69876b();
        } else {
            i30 = 0;
        }
        int a30 = m8643a(brtj, str2, true);
        if (!list6.isEmpty()) {
            int size15 = list6.size();
            int[] iArr18 = new int[size15];
            int i109 = 0;
            while (i109 < list6.size()) {
                djc djc = (djc) list6.get(i109);
                int a31 = m8643a(brtj, djc.f13310b, true);
                long j = djc.f13311c;
                boolean z8 = djc.f13312d;
                boolean z9 = djc.f13313e;
                brtj.mo69885d(4);
                brtj.mo69871a(1, j, 0);
                brtj.mo69883c(0, a31);
                brtj.mo69880b(3, z9);
                brtj.mo69880b(2, z8);
                iArr18[i109] = brtj.mo69886e();
                i109++;
                a29 = a29;
            }
            i31 = a29;
            brtj.mo69870a(4, size15, 4);
            while (true) {
                size15--;
                if (size15 < 0) {
                    break;
                }
                brtj.mo69882c(iArr18[size15]);
            }
            i32 = brtj.mo69876b();
        } else {
            i31 = a29;
            i32 = 0;
        }
        int a32 = m8645a(brtj, list4);
        brtj.mo69885d(10);
        brtj.mo69883c(9, a32);
        brtj.mo69883c(8, i32);
        brtj.mo69883c(7, a30);
        brtj.mo69883c(6, i30);
        brtj.mo69883c(5, i29);
        brtj.mo69883c(4, i31);
        brtj.mo69883c(3, e11);
        brtj.mo69883c(2, i8);
        brtj.mo69883c(1, i6);
        brtj.mo69879b(0, 15, 0);
        int e12 = brtj.mo69886e();
        brtj.mo69878b(e12, 10);
        brtj.mo69878b(e12, 12);
        brtj.mo69878b(e12, 18);
        brtj.mo69872a(e12, "CHMR");
        ByteBuffer f = brtj.mo69888f();
        f.remaining();
        return djz.m8701a(f);
    }

    /* renamed from: a */
    public static ByteBuffer m8648a(String str) {
        return ByteBuffer.wrap(str.getBytes((Charset) brtm.UTF8_CHARSET.get()));
    }
}
