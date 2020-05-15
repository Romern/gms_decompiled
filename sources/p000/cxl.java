package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;

/* renamed from: cxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cxl extends cvq {
    public cxl(Class cls) {
        super(cls);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cwn.a(byte[], int, boolean):void
     arg types: [byte[], int, int]
     candidates:
      cwn.a(int, int, boolean):void
      cwn.a(byte[], int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cwn.a(cwl, boolean):void
     arg types: [cxa, int]
     candidates:
      cwn.a(int, byte):void
      cwn.a(int, int):void
      cwn.a(cwl, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x05fd  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x069c  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x07c9  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x07cd  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x087c  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x08a5  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x099f  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x09c5  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0a13  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0a4e  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0a93  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0a9b  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0ac0  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0acb  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0ad4  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0aff  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0bfe  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0c09  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0c19 A[SYNTHETIC, Splitter:B:395:0x0c19] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0204  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cvv mo8339a(cuf cuf, cvs cvs) {
        cvh cvh;
        boolean z;
        boolean z2;
        cvc cvc;
        byte b;
        boolean z3;
        String b2;
        cwe cwe;
        Long l;
        byte b3;
        boolean z4;
        boolean z5;
        boolean a;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        cys cys;
        Byte b4;
        Integer num;
        cys cys2;
        Byte b5;
        Integer num2;
        cys cys3;
        long j;
        cys cys4;
        long j2;
        byte b6;
        cvw cvw;
        byte[] bArr;
        boolean z10;
        byte[] a2;
        cvw cvw2;
        cuw cuw;
        byte[] bArr2;
        cza cza;
        cva cva;
        byte b7;
        byte[] bArr3;
        byte[] f;
        int i;
        byte[] bArr4;
        byte b8;
        byte[] bArr5;
        int length;
        long j3;
        long j4;
        long j5;
        long j6;
        Byte b9;
        Integer num3;
        Byte b10;
        Integer num4;
        Byte b11;
        Integer num5;
        Byte b12;
        Integer num6;
        byte b13;
        String str;
        String str2;
        cup cup = (cup) cuf;
        cup.mo8310g();
        cuu cuu = cuu.WRONG_MISSING_OR_INVALID_DATA_80;
        cyp cyp = (cyp) cvs;
        cvp cvp = cyp.f12398a;
        cvg a3 = cvp.f12202c.mo8336a(cvp.f12201b.mo8322a(cuw.FCI_PROPRIETARY_TEMPLATE));
        cuz cuz = cuz.UNPREDICTABLE_NUMBER;
        cvh[] cvhArr = (cvh[]) a3.f12181b;
        int length2 = cvhArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                cvh = null;
                break;
            }
            cvh = cvhArr[i2];
            if (cvh.f12187c == cuz) {
                break;
            }
            i2++;
        }
        cuu.mo8315a((cvh != null ? cvh.f12188d : 0) > 4);
        cuu.CONDITIONS_OF_USE_NOT_SATISFIED.mo8315a(cyp.mo8403d() == null);
        cuu.APPLICATION_BLOCKED.mo8315a(cxt.m7848a(cyp, cyp.f12398a.f12200a));
        cyq a4 = cyp.mo8394a(cup, cyp.mo8400b().mo8322a(cuw.FCI_PROPRIETARY_TEMPLATE));
        cwm c = a4.mo8402c();
        cwm a5 = a4.mo8340a();
        cwm a6 = cxd.m7814a(a4.mo8417a(cuz.TERMINAL_TRANSACTION_QUALIFIERS));
        cuu.WRONG_MISSING_OR_INVALID_DATA_80.mo8315a(!cwd.m7752a(a4.mo8419b(cuz.AMOUNT_AUTHORISED_NUMERIC)));
        cuu.WRONG_MISSING_OR_INVALID_DATA_80.mo8315a(!cwd.m7752a(a4.mo8419b(cuz.AMOUNT_OTHER_NUMERIC)));
        if (a6.mo8362a(cxd.MAGSTRIPE_SUPPORTED) && (c.mo8362a(cwj.MAGSTRIPE_PREFERRED) || !a6.mo8362a(cxd.EMV_SUPPORTED))) {
            cxr.m7842a((cyp) a4);
            cxr.m7843a(a4);
            cxh cxh = cxh.ZIP;
            cvp cvp2 = a4.f12398a;
            return cvv.m7695a(cyz.m7964a(new cyq(new cvp(cvp2.f12200a, cvp2.f12201b, cxh, cvp2.f12203d), a4.f12404g, a4.f12399b, a4.f12400c, a4.mo8405f(), cwf.m7756a())), cxr.m7844b(a4));
        } else if (a6.mo8362a(cxd.EMV_SUPPORTED)) {
            cyu d = a4.mo8403d();
            cuu cuu2 = cuu.CONDITIONS_OF_USE_NOT_SATISFIED;
            if (d == null || cwd.m7751a((CharSequence) d.f12419c)) {
                z = true;
            } else {
                z = false;
            }
            cuu2.mo8315a(z);
            cws a7 = cxm.m7835a(a4, c);
            boolean a8 = a4.f12400c.f12235b.mo49425a();
            cuu cuu3 = cuu.COMMAND_NOT_ALLOWED;
            if (!a8) {
                cxd[] cxdArr = {cxd.TERMINAL_SUPPORTS_CONSUMER_DEVICE_CVM, cxd.CONSUMER_DEVICE_CVM_REQUIRED};
                boolean z11 = true;
                for (int i3 = 0; i3 < 2; i3++) {
                    z11 = z11 && a6.mo8362a(cxdArr[i3]);
                }
                if (z11) {
                    z2 = true;
                    cuu3.mo8315a(z2);
                    cvc = (cvc) a4.f12404g.f12053b.get(cuz.TRANSACTION_TYPE);
                    if (cvc == null) {
                        b = cvc.mo8323a()[0];
                    } else {
                        b = 0;
                    }
                    if (!c.mo8362a(cwj.DOMESTICITY_BASED_ON_COUNTRY_CODE)) {
                        z3 = Arrays.equals(a4.mo8417a(cuz.TERMINAL_COUNTRY_CODE), a4.mo8412m());
                    } else {
                        z3 = Arrays.equals(a4.mo8417a(cuz.TRANSACTION_CURRENCY_CODE), a4.mo8414o());
                    }
                    boolean z12 = b != 32;
                    b2 = a4.mo8419b(cuz.TRANSACTION_CURRENCY_CODE);
                    if (b2.equalsIgnoreCase(a4.f12399b.f12408a.mo8440b())) {
                        String c2 = a4.f12399b.f12408a.mo8442c();
                        if (c2 != null) {
                            str = c2.substring(0, 4);
                        } else {
                            str = null;
                        }
                        if (b2.equalsIgnoreCase(str)) {
                            cwe = cyp.m7883c(a4.f12399b.f12408a.mo8442c());
                        } else {
                            String d2 = a4.f12399b.f12408a.mo8444d();
                            if (d2 != null) {
                                str2 = d2.substring(0, 4);
                            } else {
                                str2 = null;
                            }
                            cwe = b2.equalsIgnoreCase(str2) ? cyp.m7883c(a4.f12399b.f12408a.mo8444d()) : cxk.f12376b;
                        }
                    } else {
                        cwe = cxk.f12375a;
                    }
                    Long l2 = (Long) cwe.mo8353a(a4.mo8417a(cuz.AMOUNT_OTHER_NUMERIC));
                    l = (Long) cwe.mo8353a(a4.mo8417a(cuz.AMOUNT_AUTHORISED_NUMERIC));
                    if (a4.mo8406g()) {
                        z5 = z12;
                        z4 = z3;
                        b3 = b;
                    } else if (!a5.mo8362a(cwk.COUNT_AND_ACCUMULATE_REFUNDS) && z12) {
                        z5 = z12;
                        z4 = z3;
                        b3 = b;
                    } else {
                        if (l == null) {
                            z5 = z12;
                            z4 = z3;
                            b3 = b;
                            b13 = 32;
                        } else if (l2 == null) {
                            z5 = z12;
                            z4 = z3;
                            b3 = b;
                            b13 = 32;
                        } else if (l.longValue() == 0 && l2.longValue() == 0) {
                            z5 = z12;
                            z4 = z3;
                            b3 = b;
                            b13 = 32;
                        } else {
                            long longValue = l.longValue();
                            long longValue2 = l2.longValue();
                            cuz cuz2 = cuz.CUMULATIVE_OFFLINE_AMOUNT;
                            Long valueOf = Long.valueOf(longValue);
                            Long valueOf2 = Long.valueOf(longValue2);
                            z5 = z12;
                            b13 = 32;
                            z4 = z3;
                            b3 = b;
                            cxk.m7832a(a4, cuz2, 2, a5, valueOf, valueOf2);
                            if (a5.mo8362a(cwk.CL_ACCUMULATOR_SUPPORTED)) {
                                cxk.m7832a(a4, cuz.CONTACTLESS_ACCUMULATOR, 4, a5, valueOf, valueOf2);
                            }
                            if (a5.mo8362a(cwk.CVM_ACCUMULATOR_SUPPORTED)) {
                                cxk.m7832a(a4, cuz.CVM_ACCUMULATOR, 5, a5, valueOf, valueOf2);
                            }
                        }
                        boolean equals = Arrays.equals(a4.mo8417a(cuz.TERMINAL_COUNTRY_CODE), a4.mo8412m());
                        boolean equals2 = Arrays.equals(a4.mo8417a(cuz.TRANSACTION_CURRENCY_CODE), a4.mo8414o());
                        if ((!(l == null || l.longValue() == 0) || a5.mo8362a(cwk.COUNT_ZERO_AMOUNT)) && (cxk.m7833a(a5, Byte.MIN_VALUE) || ((cxk.m7833a(a5, (byte) 0) && equals) || ((cxk.m7833a(a5, b13) && !equals) || ((cxk.m7833a(a5, (byte) 64) && equals2) || (cxk.m7833a(a5, (byte) 96) && !equals2)))))) {
                            cxk.m7831a(a4, cuz.CONSECUTIVE_OFFLINE_TRANSACTION);
                        }
                        if (a5.mo8362a(cwk.CL_COUNTER_SUPPORTED)) {
                            cxk.m7831a(a4, cuz.CONTACTLESS_COUNTER);
                        }
                        if (a5.mo8362a(cwk.CVM_COUNTER_SUPPORTED) && !a6.mo8362a(cxd.CVM_REQUIRED)) {
                            cxk.m7831a(a4, cuz.CVM_COUNTER);
                        }
                    }
                    boolean a9 = a5.mo8362a(cwk.CVM_ACCUMULATOR_SUPPORTED);
                    a = a5.mo8362a(cwk.CVM_COUNTER_SUPPORTED);
                    cwn cwn = new cwn(8);
                    cwn.mo8365a(2, 8, a6.mo8362a(cxd.ONLINE_CRYPTOGRAM_REQUIRED));
                    byte b14 = b3;
                    cwn.mo8365a(2, 7, b14 != 1 ? true : b14 == 9);
                    cwn.mo8365a(2, 6, z5);
                    cwn.mo8365a(2, 5, z4);
                    cwn.mo8365a(2, 4, !z4);
                    cwn.mo8365a(2, 2, a8);
                    cwn.mo8365a(3, 8, a6.mo8362a(cxd.CVM_REQUIRED));
                    cwn.mo8365a(3, 7, a8);
                    if (!a) {
                        Long valueOf3 = Long.valueOf(a4.f12405h.mo8354a(cuz.CVM_COUNTER, a4.f12399b.f12408a));
                        cys cys5 = a4.f12399b;
                        if (!cys5.mo8426a(cxb.PROFILE_SPECIFIC_CVM_CONS)) {
                            b12 = cvz.m7730e(cys5.f12408a.mo8446e("CVM-Cons_limit_1"));
                        } else {
                            b12 = cvz.m7730e(cys5.f12408a.mo8443c("CVM-Cons_limit_1"));
                        }
                        if (b12 != null) {
                            num6 = Integer.valueOf(cvz.m7729e(b12.byteValue()));
                        } else {
                            num6 = null;
                        }
                        z6 = cyq.m7913a(valueOf3, Long.valueOf((long) num6.intValue()));
                    } else {
                        z6 = false;
                    }
                    cwn.mo8365a(3, 6, z6);
                    if (!a) {
                        Long valueOf4 = Long.valueOf(a4.f12405h.mo8354a(cuz.CVM_COUNTER, a4.f12399b.f12408a));
                        cys cys6 = a4.f12399b;
                        if (!cys6.mo8426a(cxb.PROFILE_SPECIFIC_CVM_CONS)) {
                            b11 = cvz.m7730e(cys6.f12408a.mo8446e("CVM-Cons_limit_2"));
                        } else {
                            b11 = cvz.m7730e(cys6.f12408a.mo8443c("CVM-Cons_limit_2"));
                        }
                        if (b11 != null) {
                            num5 = Integer.valueOf(cvz.m7729e(b11.byteValue()));
                        } else {
                            num5 = null;
                        }
                        z7 = cyq.m7913a(valueOf4, Long.valueOf((long) num5.intValue()));
                    } else {
                        z7 = false;
                    }
                    cwn.mo8365a(3, 5, z7);
                    cwn.mo8365a(3, 4, !a9 ? cyq.m7913a(Long.valueOf(a4.f12405h.mo8354a(cuz.CVM_ACCUMULATOR, a4.f12399b.f12408a)), a4.f12399b.mo8434g()) : false);
                    cwn.mo8365a(3, 3, !a9 ? cyq.m7913a(Long.valueOf(a4.f12405h.mo8354a(cuz.CVM_ACCUMULATOR, a4.f12399b.f12408a)), a4.f12399b.mo8434g()) : false);
                    cwn.mo8365a(4, 3, a7.f12275d);
                    cwn.mo8365a(4, 2, a7.mo8372b());
                    cwn.mo8365a(4, 1, a7.mo8371a());
                    cwn.mo8365a(4, 7, a4.mo8420r().mo8362a(cxa.LAST_CONTACTLESS_TRANSACTION_COMPLETED));
                    cwn.mo8365a(4, 8, a4.mo8420r().mo8362a(cxa.ODA_FAILED));
                    if (!a5.mo8362a(cwk.CL_COUNTER_SUPPORTED)) {
                        Long valueOf5 = Long.valueOf(a4.f12405h.mo8354a(cuz.CONTACTLESS_COUNTER, a4.f12399b.f12408a));
                        cys cys7 = a4.f12399b;
                        if (!cys7.mo8426a(cxb.PROFILE_SPECIFIC_CL_CONS_LIMIT)) {
                            b10 = cvz.m7730e(cys7.f12408a.mo8446e("CL-Cons_limit"));
                        } else {
                            b10 = cvz.m7730e(cys7.f12408a.mo8443c("CL-Cons_limit"));
                        }
                        if (b10 != null) {
                            num4 = Integer.valueOf(cvz.m7729e(b10.byteValue()));
                        } else {
                            num4 = null;
                        }
                        z8 = cyq.m7912a(valueOf5, num4);
                    } else {
                        z8 = false;
                    }
                    cwn.mo8365a(5, 8, z8);
                    if (!a5.mo8362a(cwk.CL_COUNTER_SUPPORTED)) {
                        Long valueOf6 = Long.valueOf(a4.f12405h.mo8354a(cuz.CONTACTLESS_COUNTER, a4.f12399b.f12408a));
                        cys cys8 = a4.f12399b;
                        if (!cys8.mo8426a(cxb.PROFILE_SPECIFIC_CL_CUM_LIMIT)) {
                            b9 = cvz.m7730e(cys8.f12408a.mo8446e("CL-Cum_limit"));
                        } else {
                            b9 = cvz.m7730e(cys8.f12408a.mo8443c("CL-Cum_limit"));
                        }
                        if (b9 != null) {
                            num3 = Integer.valueOf(cvz.m7729e(b9.byteValue()));
                        } else {
                            num3 = null;
                        }
                        if (cyq.m7912a(valueOf6, num3)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else {
                        z9 = false;
                    }
                    cwn.mo8365a(5, 7, z9);
                    Long valueOf7 = Long.valueOf(a4.f12405h.mo8354a(cuz.CONSECUTIVE_OFFLINE_TRANSACTION, a4.f12399b.f12408a));
                    cys = a4.f12399b;
                    if (cys.mo8426a(cxb.PROFILE_SPECIFIC_LCOL_UCOL)) {
                        b4 = cvz.m7730e(cys.f12408a.mo8446e("LCOL"));
                    } else {
                        b4 = cvz.m7730e(cys.f12408a.mo8443c("LCOL"));
                    }
                    if (b4 == null) {
                        num = Integer.valueOf(cvz.m7729e(b4.byteValue()));
                    } else {
                        num = null;
                    }
                    cwn.mo8365a(5, 5, cyq.m7912a(valueOf7, num));
                    Long valueOf8 = Long.valueOf(a4.f12405h.mo8354a(cuz.CONSECUTIVE_OFFLINE_TRANSACTION, a4.f12399b.f12408a));
                    cys2 = a4.f12399b;
                    if (cys2.mo8426a(cxb.PROFILE_SPECIFIC_LCOL_UCOL)) {
                        b5 = cvz.m7730e(cys2.f12408a.mo8446e("UCOL"));
                    } else {
                        b5 = cvz.m7730e(cys2.f12408a.mo8443c("UCOL"));
                    }
                    if (b5 == null) {
                        num2 = Integer.valueOf(cvz.m7729e(b5.byteValue()));
                    } else {
                        num2 = null;
                    }
                    cwn.mo8365a(5, 4, cyq.m7912a(valueOf8, num2));
                    long a10 = a4.f12405h.mo8354a(cuz.CUMULATIVE_OFFLINE_AMOUNT, a4.f12399b.f12408a);
                    cys3 = a4.f12399b;
                    if (cys3.mo8426a(cxb.PROFILE_SPECIFIC_LCOA_UCOA)) {
                        j = Long.parseLong(cys3.f12408a.mo8446e("LCOA"));
                    } else {
                        j = Long.parseLong(cys3.f12408a.mo8443c("LCOA"));
                    }
                    cwn.mo8365a(5, 3, cyq.m7911a(a10, Long.valueOf(j)));
                    long a11 = a4.f12405h.mo8354a(cuz.CUMULATIVE_OFFLINE_AMOUNT, a4.f12399b.f12408a);
                    cys4 = a4.f12399b;
                    if (cys4.mo8426a(cxb.PROFILE_SPECIFIC_LCOA_UCOA)) {
                        j2 = Long.parseLong(cys4.f12408a.mo8446e("UCOA"));
                    } else {
                        j2 = Long.parseLong(cys4.f12408a.mo8443c("UCOA"));
                    }
                    cwn.mo8365a(5, 2, cyq.m7911a(a11, Long.valueOf(j2)));
                    if (a7.mo8371a()) {
                        b6 = a7.f12274c;
                    } else {
                        b6 = a7.f12273b;
                    }
                    cwn.mo8363a(6, (byte) (b6 << 4));
                    cwn.mo8363a(6, a7.f12272a);
                    cwn.mo8364a(7, 8);
                    cwn.mo8365a(7, 7, a6.mo8362a(cxd.OFFLINE_ONLY));
                    cwn.mo8364a(7, 6);
                    cwn.mo8365a(7, 5, a6.mo8362a(cxd.SIGNATURE_SUPPORTED));
                    cwn.mo8365a(7, 4, a6.mo8362a(cxd.READER_SUPPORTING_ISSUER_UPDATE_PROCESSING));
                    if (l != null) {
                        long longValue3 = l.longValue();
                        cys cys9 = a4.f12399b;
                        if (!cys9.mo8426a(cxb.PROFILE_SPECIFIC_CL_STA)) {
                            j3 = Long.parseLong(cys9.f12408a.mo8446e("STA"));
                        } else {
                            j3 = Long.parseLong(cys9.f12408a.mo8443c("STA"));
                        }
                        cwn.mo8365a(5, 1, cyq.m7911a(longValue3, Long.valueOf(j3)));
                        long longValue4 = l.longValue();
                        cys cys10 = a4.f12399b;
                        if (!cys10.mo8426a(cxb.PROFILE_SPECIFIC_STA_LIMIT)) {
                            j4 = Long.parseLong(cys10.f12408a.mo8446e("CL-STA_limit"));
                        } else {
                            j4 = Long.parseLong(cys10.f12408a.mo8443c("CL-STA_limit"));
                        }
                        cwn.mo8365a(5, 6, cyq.m7911a(longValue4, Long.valueOf(j4)));
                        long longValue5 = l.longValue();
                        cys cys11 = a4.f12399b;
                        if (!cys11.mo8426a(cxb.PROFILE_SPECIFIC_CVM_STA_LIMIT)) {
                            j5 = Long.parseLong(cys11.f12408a.mo8446e("CVM-Sta_limit_2"));
                        } else {
                            j5 = Long.parseLong(cys11.f12408a.mo8443c("CVM-Sta_limit_2"));
                        }
                        cwn.mo8365a(3, 1, cyq.m7911a(longValue5, Long.valueOf(j5)));
                        long longValue6 = l.longValue();
                        cys cys12 = a4.f12399b;
                        if (!cys12.mo8426a(cxb.PROFILE_SPECIFIC_CVM_STA_LIMIT)) {
                            j6 = Long.parseLong(cys12.f12408a.mo8446e("CVM-Sta_limit_1"));
                        } else {
                            j6 = Long.parseLong(cys12.f12408a.mo8443c("CVM-Sta_limit_1"));
                        }
                        cwn.mo8365a(3, 2, cyq.m7911a(longValue6, Long.valueOf(j6)));
                    }
                    byte[] a12 = cwn.mo8368a();
                    byte[] b15 = a4.f12399b.f12408a.mo8441b("CRM-CAC_Denial");
                    byte[] b16 = a4.f12399b.f12408a.mo8441b("CRM-CAC_Online");
                    byte[] d3 = a4.f12399b.f12408a.mo8445d("CRM-CAC_Default");
                    if (!a7.mo8371a()) {
                        cvw = cvw.AAC;
                    } else if (a7.mo8372b()) {
                        cvw = cvw.ARQC;
                    } else if (cvz.m7707a(a12[1], b15[0]) || cvz.m7707a(a12[3], b15[1]) || cvz.m7707a(a12[4], b15[2])) {
                        cvw = cvw.AAC;
                    } else if (a6.mo8362a(cxd.ONLINE_CRYPTOGRAM_REQUIRED)) {
                        cvw = cvw.ARQC;
                    } else if (a6.mo8362a(cxd.OFFLINE_ONLY) && (cvz.m7707a(a12[1], d3[0]) || cvz.m7707a(a12[3], d3[1]) || cvz.m7707a(a12[4], d3[2]))) {
                        cvw = cvw.AAC;
                    } else if (cvz.m7707a(a12[1], b16[0]) || cvz.m7707a(a12[3], b16[1]) || cvz.m7707a(a12[4], b16[2])) {
                        cvw = cvw.ARQC;
                    } else if (!a4.mo8406g()) {
                        cvw = cvw.AAC;
                    } else {
                        cvw = cvw.TC;
                    }
                    cwn.mo8363a(1, cvw.f12212d);
                    byte[] a13 = cwn.mo8368a();
                    if (c.mo8362a(cwj.IDD_IN_IAD)) {
                        Object[] objArr = new Object[3];
                        objArr[0] = Byte.valueOf(a4.mo8413n());
                        objArr[1] = Byte.valueOf(!c.mo8362a(cwj.CVN_16_FOR_CRYPTOGRAM) ? (byte) 21 : 22);
                        objArr[2] = a13;
                        bArr = cvz.m7722b(objArr);
                    } else {
                        byte[] b17 = a4.mo8401b("IADOL");
                        if (b17 == null) {
                            i = 0;
                            b7 = 22;
                        } else if (b17.length != 0) {
                            List<cvh> asList = Arrays.asList(cve.m7670b(b17));
                            ArrayList arrayList = new ArrayList();
                            for (cvh cvh2 : asList) {
                                cvb cvb = cvh2.f12187c;
                                if (cvb instanceof cuz) {
                                    Long l3 = (Long) a4.f12405h.f12231b.get((cuz) cvb);
                                    bArr4 = l3 != null ? cvz.m7728d(l3.toString()) : null;
                                    if (bArr4 != null) {
                                        int length3 = bArr4.length;
                                        int i4 = cvh2.f12188d;
                                        if (length3 != i4) {
                                            if (length3 <= i4) {
                                                byte[] f2 = cvh2.mo8334f();
                                                System.arraycopy(bArr4, 0, f2, f2.length - length3, length3);
                                                bArr4 = f2;
                                            } else {
                                                bArr4 = Arrays.copyOfRange(bArr4, length3 - i4, length3);
                                            }
                                        }
                                        arrayList.add(bArr4);
                                    }
                                }
                                byte[] a14 = cvh2.f12187c.mo8320a();
                                if (a14[0] == -33 && (b8 = a14[1]) > 0 && b8 <= 10) {
                                    byte[] b18 = a4.mo8401b(cyx.m7946b(b8 - 1));
                                    if (b18 == null || (length = b18.length) < 3) {
                                        bArr5 = null;
                                    } else {
                                        bArr5 = Arrays.copyOfRange(b18, 2, length);
                                    }
                                    bArr4 = bArr5 != null ? Arrays.copyOfRange(bArr5, 0, cvh2.f12188d) : cvh2.mo8334f();
                                    arrayList.add(bArr4);
                                } else {
                                    String str3 = (String) cyq.f12403f.get(cvz.m7704a(cvh2.f12187c.mo8320a()));
                                    if (str3 == null) {
                                        bArr4 = cvh2.mo8334f();
                                    } else {
                                        byte[] a15 = a4.mo8399a(str3);
                                        bArr4 = a15 != null ? Arrays.copyOfRange(a15, 0, cvh2.f12188d) : cvh2.mo8334f();
                                    }
                                    arrayList.add(bArr4);
                                }
                            }
                            bArr3 = cvz.m7711a(arrayList);
                            b7 = 22;
                            if (bArr3.length > 22) {
                                bArr3 = Arrays.copyOfRange(bArr3, 0, 22);
                            }
                            f = a4.f12399b.f12408a.mo8449f();
                            if (bArr3.length > f.length - 10) {
                                cwn cwn2 = new cwn(f);
                                cwn2.mo8365a(2, 1, !c.mo8362a(cwj.CVN_16_FOR_CRYPTOGRAM));
                                cwn2.mo8365a(2, 2, c.mo8362a(cwj.CVN_16_FOR_CRYPTOGRAM));
                                cwn2.mo8367a(a13, 2, true);
                                cwn2.mo8367a(bArr3, 10, false);
                                bArr = cwn2.mo8368a();
                            } else {
                                Object[] objArr2 = new Object[4];
                                objArr2[0] = Byte.valueOf(a4.mo8413n());
                                if (!c.mo8362a(cwj.CVN_16_FOR_CRYPTOGRAM)) {
                                    b7 = 21;
                                }
                                objArr2[1] = Byte.valueOf(b7);
                                objArr2[2] = a13;
                                objArr2[3] = bArr3;
                                bArr = cvz.m7722b(objArr2);
                            }
                        } else {
                            i = 0;
                            b7 = 22;
                        }
                        bArr3 = new byte[i];
                        f = a4.f12399b.f12408a.mo8449f();
                        if (bArr3.length > f.length - 10) {
                        }
                    }
                    byte[] b19 = a4.f12399b.f12408a.mo8441b("CVM-CAC_Online-PIN");
                    cwn cwn3 = new cwn(cvz.m7720b(a4.f12399b.f12408a.mo8439a("CPR")));
                    if (a6.mo8362a(cxd.ONLINE_PIN_SUPPORTED)) {
                        if (cvz.m7707a(b19[0], a13[2])) {
                            z10 = true;
                        } else if (cvz.m7707a(b19[1], a13[3])) {
                            z10 = true;
                        }
                        cwn3.mo8365a(1, 8, z10);
                        cwn3.mo8364a(1, 5);
                        a2 = cwn3.mo8368a();
                        a4.mo8397a("CPR", a2);
                        a4.mo8397a("Issuer_Application_Data", bArr);
                        cwf cwf = a4.f12405h;
                        if (cvw == cvw.ARQC) {
                            if (a5.mo8362a(cwk.RESET_COA_ON_ARQC)) {
                                cwf.mo8357b(cuz.CUMULATIVE_OFFLINE_AMOUNT);
                            }
                            if (a5.mo8362a(cwk.RESET_NCOT_ON_ARQC)) {
                                cwf.mo8357b(cuz.CONSECUTIVE_OFFLINE_TRANSACTION);
                            }
                            if (a5.mo8362a(cwk.RESET_CL_CA_ON_ARQC)) {
                                cwf.mo8357b(cuz.CONTACTLESS_ACCUMULATOR);
                                cwf.mo8357b(cuz.CONTACTLESS_COUNTER);
                            }
                            if (a5.mo8362a(cwk.RESET_CVM_CA_ON_ARQC)) {
                                cwf.mo8357b(cuz.CVM_ACCUMULATOR);
                                cwf.mo8357b(cuz.CVM_COUNTER);
                            }
                        }
                        cwf cwf2 = a4.f12405h;
                        if (cvw == cvw.ARQC || cvw == cvw.AAC) {
                            if (c.mo8362a(cwj.AFL_IN_ONLINE_TXNS)) {
                                cwz.m7803b(cwf2);
                                cwz.m7802a(cwf2, a4.mo8409j());
                            } else {
                                cwz.m7801a(cwf2);
                            }
                        } else if (cvw == cvw.TC) {
                            cwz.m7803b(cwf2);
                            cwn a16 = cwz.m7800a(cwf2.f12232c);
                            a16.mo8366a((cwl) cxa.ODA_FAILED, true);
                            cwf2.f12232c = a16.mo8368a();
                            cwz.m7802a(cwf2, a4.mo8409j());
                        }
                        if (cvw != cvw.TC && !c.mo8362a(cwj.AFL_IN_ONLINE_TXNS)) {
                            cza a17 = cyz.m7965a(a4, cxc.SUCCESS);
                            cuw cuw2 = cuw.RESPONSE_MESSAGE_TEMPLATE_2;
                            cvc[] cvcArr = new cvc[12];
                            cvcArr[0] = cuz.APPLICATION_INTERCHANGE_PROFILE.mo8318a(a4.mo8411l());
                            cuz cuz3 = cuz.APP_CRYPTOGRAM;
                            if (!c.mo8362a(cwj.CVN_16_FOR_CRYPTOGRAM)) {
                                a13 = bArr;
                            }
                            cvcArr[1] = cuz3.mo8318a(a4.mo8418a(a13));
                            cvcArr[2] = cuz.APP_TRANSACTION_COUNTER.mo8318a(a4.mo8415p());
                            cvcArr[3] = cuz.ISSUER_APPLICATION_DATA.mo8318a(bArr);
                            cvcArr[4] = cuz.CRYPTOGRAM_INFORMATION_DATA.mo8318a(cvw.f12213e);
                            cuz cuz4 = cuz.TRACK_2_EQV_DATA;
                            byte[] i5 = cvz.m7734i(a4.f12399b.f12408a.mo8447e());
                            i5[12] = (byte) (i5[12] | 1);
                            cvcArr[5] = cuz4.mo8318a(i5);
                            cvcArr[6] = cuz.APP_USAGE_CONTROL.mo8318a(cvz.m7720b(a4.f12399b.f12408a.mo8439a("AUC")));
                            cvcArr[7] = cuz.ISSUER_COUNTRY_CODE.mo8318a(cvz.m7710a(a4.f12399b.f12408a.mo8439a("Issuer_Country_Code")));
                            cvcArr[8] = new cva(cuz.PAN_SEQUENCE_NUMBER, cvz.m7728d(cwd.m7754c(a4.f12399b.f12408a.mo8439a("PAN_Seq_NBR"), 2)));
                            cvcArr[9] = cuz.CARD_PROCESSING_REQUIREMENTS.mo8318a(a2);
                            cvcArr[10] = cuz.APP_EFFECTIVE_DATE.mo8318a(cvz.m7720b(a4.f12399b.f12408a.mo8439a("Effective_Date")));
                            cvcArr[11] = cuz.APP_VERSION_NUMBER_CARD.mo8318a(cvz.m7720b(a4.f12399b.f12408a.mo8439a("AVN")));
                            return cvv.m7695a(a17, cut.m7621a(cuw2.mo8317a(cvcArr)));
                        }
                        cza a18 = cyz.m7965a(a4, cxc.SUCCESS);
                        cuw cuw3 = cuw.RESPONSE_MESSAGE_TEMPLATE_2;
                        cvc[] cvcArr2 = new cvc[7];
                        cvcArr2[0] = cuz.APPLICATION_INTERCHANGE_PROFILE.mo8318a(a4.mo8411l());
                        if (!c.mo8362a(cwj.CVN_16_FOR_CRYPTOGRAM)) {
                            a13 = bArr;
                        }
                        byte[] a19 = a4.mo8418a(a13);
                        if (cvw.TC == cvw) {
                            cva = cuz.APP_CRYPTOGRAM.mo8318a(a19);
                            cza = a18;
                            bArr2 = a2;
                            cvw2 = cvw;
                            cuw = cuw3;
                        } else {
                            try {
                                List a20 = cvz.m7705a(cuz.APPLICATION_INTERCHANGE_PROFILE.mo8318a(a4.mo8411l()), cuz.APPLICATION_FILE_LOCATOR.mo8318a(cxn.m7838a(a4.mo8409j())), cuz.APP_TRANSACTION_COUNTER.mo8318a(a4.mo8415p()), cuz.ISSUER_APPLICATION_DATA.mo8318a(bArr), cuz.CRYPTOGRAM_INFORMATION_DATA.mo8318a(cvw.f12213e), cuz.CARD_PROCESSING_REQUIREMENTS.mo8318a(a2));
                                cuz cuz5 = cuz.SIGNED_DYNAMIC_APPLICATION_DATA;
                                cvj cvj = a4.f12399b.f12410c;
                                byte[] bArr6 = a4.f12404g.f12054c;
                                int length4 = bArr6.length;
                                if (length4 > 2) {
                                    bArr6 = cvz.m7713a(bArr6, 2, length4 - 2);
                                }
                                cvc[] cvcArr3 = (cvc[]) a20.toArray(new cvc[a20.size()]);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr6);
                                for (cvc cvc2 : cvcArr3) {
                                    byteArrayOutputStream.write(cvc2.mo8331d());
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                byte[] a21 = a4.mo8417a(cuz.UNPREDICTABLE_NUMBER);
                                cvw cvw3 = cvw.TC;
                                cvi cvi = cvi.SHA1;
                                byte[] bArr7 = new byte[8];
                                new SecureRandom().nextBytes(bArr7);
                                byte b20 = cvw3.f12213e;
                                byte[] a22 = cvi.mo8335a(byteArray);
                                int i6 = cvj != null ? cvj.f12197f : 0;
                                cza = a18;
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                cuw = cuw3;
                                byteArrayOutputStream2.write(8);
                                byteArrayOutputStream2.write(bArr7);
                                byteArrayOutputStream2.write(b20);
                                byteArrayOutputStream2.write(a19);
                                byteArrayOutputStream2.write(a22);
                                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                int length5 = byteArray2.length;
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                byteArrayOutputStream3.write(5);
                                byteArrayOutputStream3.write(cvi.f12191b);
                                byteArrayOutputStream3.write(length5);
                                byteArrayOutputStream3.write(byteArray2);
                                byteArrayOutputStream3.write(cvz.m7709a((i6 - length5) - 25, (byte) -69));
                                byteArrayOutputStream3.write(a21);
                                byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                if (cvj != null) {
                                    byte[] b21 = cvz.m7722b((byte) 106, cvz.m7713a(byteArray3, 0, cvj.f12197f - 22), cvi.mo8335a(byteArray3), (byte) -68);
                                    Cipher instance = Cipher.getInstance("RSA/ECB/NoPadding");
                                    KeyFactory instance2 = KeyFactory.getInstance("RSA");
                                    BigInteger bigInteger = new BigInteger(1, cvj.f12192a);
                                    BigInteger bigInteger2 = new BigInteger(1, cvj.f12193b);
                                    BigInteger bigInteger3 = new BigInteger(1, cvj.f12194c);
                                    BigInteger bigInteger4 = new BigInteger(1, cvj.f12195d);
                                    BigInteger bigInteger5 = new BigInteger(1, cvj.f12196e);
                                    BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
                                    BigInteger subtract2 = bigInteger2.subtract(BigInteger.ONE);
                                    bArr2 = a2;
                                    BigInteger modInverse = bigInteger3.modInverse(subtract);
                                    cvw2 = cvw;
                                    instance.init(1, (RSAPrivateKey) instance2.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger.multiply(bigInteger2), modInverse, modInverse.modInverse(subtract.multiply(subtract2).divide(subtract.gcd(subtract2))), bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5)));
                                    cva = cuz5.mo8318a(instance.doFinal(b21));
                                } else {
                                    throw new InvalidKeyException("Cannot generate signature without valid ODA key");
                                }
                            } catch (Exception e) {
                                throw new IOException(e);
                            }
                        }
                        cvcArr2[1] = cva;
                        cvcArr2[2] = cuz.APPLICATION_FILE_LOCATOR.mo8318a(cxn.m7838a(a4.mo8409j()));
                        cvcArr2[3] = cuz.APP_TRANSACTION_COUNTER.mo8318a(a4.mo8415p());
                        cvcArr2[4] = cuz.ISSUER_APPLICATION_DATA.mo8318a(bArr);
                        cvcArr2[5] = cuz.CRYPTOGRAM_INFORMATION_DATA.mo8318a(cvw2.f12213e);
                        cvcArr2[6] = cuz.CARD_PROCESSING_REQUIREMENTS.mo8318a(bArr2);
                        return cvv.m7695a(cza, cut.m7621a(cuw.mo8317a(cvcArr2)));
                    }
                    z10 = false;
                    cwn3.mo8365a(1, 8, z10);
                    cwn3.mo8364a(1, 5);
                    a2 = cwn3.mo8368a();
                    a4.mo8397a("CPR", a2);
                    a4.mo8397a("Issuer_Application_Data", bArr);
                    cwf cwf3 = a4.f12405h;
                    if (cvw == cvw.ARQC) {
                    }
                    cwf cwf22 = a4.f12405h;
                    if (cvw == cvw.ARQC) {
                        if (cvw == cvw.TC) {
                        }
                        if (cvw != cvw.TC) {
                            cza a172 = cyz.m7965a(a4, cxc.SUCCESS);
                            cuw cuw22 = cuw.RESPONSE_MESSAGE_TEMPLATE_2;
                            cvc[] cvcArr4 = new cvc[12];
                            cvcArr4[0] = cuz.APPLICATION_INTERCHANGE_PROFILE.mo8318a(a4.mo8411l());
                            cuz cuz32 = cuz.APP_CRYPTOGRAM;
                            if (!c.mo8362a(cwj.CVN_16_FOR_CRYPTOGRAM)) {
                            }
                            cvcArr4[1] = cuz32.mo8318a(a4.mo8418a(a13));
                            cvcArr4[2] = cuz.APP_TRANSACTION_COUNTER.mo8318a(a4.mo8415p());
                            cvcArr4[3] = cuz.ISSUER_APPLICATION_DATA.mo8318a(bArr);
                            cvcArr4[4] = cuz.CRYPTOGRAM_INFORMATION_DATA.mo8318a(cvw.f12213e);
                            cuz cuz42 = cuz.TRACK_2_EQV_DATA;
                            byte[] i52 = cvz.m7734i(a4.f12399b.f12408a.mo8447e());
                            i52[12] = (byte) (i52[12] | 1);
                            cvcArr4[5] = cuz42.mo8318a(i52);
                            cvcArr4[6] = cuz.APP_USAGE_CONTROL.mo8318a(cvz.m7720b(a4.f12399b.f12408a.mo8439a("AUC")));
                            cvcArr4[7] = cuz.ISSUER_COUNTRY_CODE.mo8318a(cvz.m7710a(a4.f12399b.f12408a.mo8439a("Issuer_Country_Code")));
                            cvcArr4[8] = new cva(cuz.PAN_SEQUENCE_NUMBER, cvz.m7728d(cwd.m7754c(a4.f12399b.f12408a.mo8439a("PAN_Seq_NBR"), 2)));
                            cvcArr4[9] = cuz.CARD_PROCESSING_REQUIREMENTS.mo8318a(a2);
                            cvcArr4[10] = cuz.APP_EFFECTIVE_DATE.mo8318a(cvz.m7720b(a4.f12399b.f12408a.mo8439a("Effective_Date")));
                            cvcArr4[11] = cuz.APP_VERSION_NUMBER_CARD.mo8318a(cvz.m7720b(a4.f12399b.f12408a.mo8439a("AVN")));
                            return cvv.m7695a(a172, cut.m7621a(cuw22.mo8317a(cvcArr4)));
                        }
                        cza a182 = cyz.m7965a(a4, cxc.SUCCESS);
                        cuw cuw32 = cuw.RESPONSE_MESSAGE_TEMPLATE_2;
                        cvc[] cvcArr22 = new cvc[7];
                        cvcArr22[0] = cuz.APPLICATION_INTERCHANGE_PROFILE.mo8318a(a4.mo8411l());
                        if (!c.mo8362a(cwj.CVN_16_FOR_CRYPTOGRAM)) {
                        }
                        byte[] a192 = a4.mo8418a(a13);
                        if (cvw.TC == cvw) {
                        }
                        cvcArr22[1] = cva;
                        cvcArr22[2] = cuz.APPLICATION_FILE_LOCATOR.mo8318a(cxn.m7838a(a4.mo8409j()));
                        cvcArr22[3] = cuz.APP_TRANSACTION_COUNTER.mo8318a(a4.mo8415p());
                        cvcArr22[4] = cuz.ISSUER_APPLICATION_DATA.mo8318a(bArr);
                        cvcArr22[5] = cuz.CRYPTOGRAM_INFORMATION_DATA.mo8318a(cvw2.f12213e);
                        cvcArr22[6] = cuz.CARD_PROCESSING_REQUIREMENTS.mo8318a(bArr2);
                        return cvv.m7695a(cza, cut.m7621a(cuw.mo8317a(cvcArr22)));
                    }
                    if (c.mo8362a(cwj.AFL_IN_ONLINE_TXNS)) {
                    }
                    if (cvw != cvw.TC) {
                    }
                    cza a1822 = cyz.m7965a(a4, cxc.SUCCESS);
                    cuw cuw322 = cuw.RESPONSE_MESSAGE_TEMPLATE_2;
                    cvc[] cvcArr222 = new cvc[7];
                    cvcArr222[0] = cuz.APPLICATION_INTERCHANGE_PROFILE.mo8318a(a4.mo8411l());
                    if (!c.mo8362a(cwj.CVN_16_FOR_CRYPTOGRAM)) {
                    }
                    byte[] a1922 = a4.mo8418a(a13);
                    if (cvw.TC == cvw) {
                    }
                    cvcArr222[1] = cva;
                    cvcArr222[2] = cuz.APPLICATION_FILE_LOCATOR.mo8318a(cxn.m7838a(a4.mo8409j()));
                    cvcArr222[3] = cuz.APP_TRANSACTION_COUNTER.mo8318a(a4.mo8415p());
                    cvcArr222[4] = cuz.ISSUER_APPLICATION_DATA.mo8318a(bArr);
                    cvcArr222[5] = cuz.CRYPTOGRAM_INFORMATION_DATA.mo8318a(cvw2.f12213e);
                    cvcArr222[6] = cuz.CARD_PROCESSING_REQUIREMENTS.mo8318a(bArr2);
                    return cvv.m7695a(cza, cut.m7621a(cuw.mo8317a(cvcArr222)));
                }
            }
            z2 = false;
            cuu3.mo8315a(z2);
            cvc = (cvc) a4.f12404g.f12053b.get(cuz.TRANSACTION_TYPE);
            if (cvc == null) {
            }
            if (!c.mo8362a(cwj.DOMESTICITY_BASED_ON_COUNTRY_CODE)) {
            }
            if (b != 32) {
            }
            b2 = a4.mo8419b(cuz.TRANSACTION_CURRENCY_CODE);
            if (b2.equalsIgnoreCase(a4.f12399b.f12408a.mo8440b())) {
            }
            Long l22 = (Long) cwe.mo8353a(a4.mo8417a(cuz.AMOUNT_OTHER_NUMERIC));
            l = (Long) cwe.mo8353a(a4.mo8417a(cuz.AMOUNT_AUTHORISED_NUMERIC));
            if (a4.mo8406g()) {
            }
            boolean a92 = a5.mo8362a(cwk.CVM_ACCUMULATOR_SUPPORTED);
            a = a5.mo8362a(cwk.CVM_COUNTER_SUPPORTED);
            cwn cwn4 = new cwn(8);
            cwn4.mo8365a(2, 8, a6.mo8362a(cxd.ONLINE_CRYPTOGRAM_REQUIRED));
            byte b142 = b3;
            cwn4.mo8365a(2, 7, b142 != 1 ? true : b142 == 9);
            cwn4.mo8365a(2, 6, z5);
            cwn4.mo8365a(2, 5, z4);
            cwn4.mo8365a(2, 4, !z4);
            cwn4.mo8365a(2, 2, a8);
            cwn4.mo8365a(3, 8, a6.mo8362a(cxd.CVM_REQUIRED));
            cwn4.mo8365a(3, 7, a8);
            if (!a) {
            }
            cwn4.mo8365a(3, 6, z6);
            if (!a) {
            }
            cwn4.mo8365a(3, 5, z7);
            cwn4.mo8365a(3, 4, !a92 ? cyq.m7913a(Long.valueOf(a4.f12405h.mo8354a(cuz.CVM_ACCUMULATOR, a4.f12399b.f12408a)), a4.f12399b.mo8434g()) : false);
            cwn4.mo8365a(3, 3, !a92 ? cyq.m7913a(Long.valueOf(a4.f12405h.mo8354a(cuz.CVM_ACCUMULATOR, a4.f12399b.f12408a)), a4.f12399b.mo8434g()) : false);
            cwn4.mo8365a(4, 3, a7.f12275d);
            cwn4.mo8365a(4, 2, a7.mo8372b());
            cwn4.mo8365a(4, 1, a7.mo8371a());
            cwn4.mo8365a(4, 7, a4.mo8420r().mo8362a(cxa.LAST_CONTACTLESS_TRANSACTION_COMPLETED));
            cwn4.mo8365a(4, 8, a4.mo8420r().mo8362a(cxa.ODA_FAILED));
            if (!a5.mo8362a(cwk.CL_COUNTER_SUPPORTED)) {
            }
            cwn4.mo8365a(5, 8, z8);
            if (!a5.mo8362a(cwk.CL_COUNTER_SUPPORTED)) {
            }
            cwn4.mo8365a(5, 7, z9);
            Long valueOf72 = Long.valueOf(a4.f12405h.mo8354a(cuz.CONSECUTIVE_OFFLINE_TRANSACTION, a4.f12399b.f12408a));
            cys = a4.f12399b;
            if (cys.mo8426a(cxb.PROFILE_SPECIFIC_LCOL_UCOL)) {
            }
            if (b4 == null) {
            }
            cwn4.mo8365a(5, 5, cyq.m7912a(valueOf72, num));
            Long valueOf82 = Long.valueOf(a4.f12405h.mo8354a(cuz.CONSECUTIVE_OFFLINE_TRANSACTION, a4.f12399b.f12408a));
            cys2 = a4.f12399b;
            if (cys2.mo8426a(cxb.PROFILE_SPECIFIC_LCOL_UCOL)) {
            }
            if (b5 == null) {
            }
            cwn4.mo8365a(5, 4, cyq.m7912a(valueOf82, num2));
            long a102 = a4.f12405h.mo8354a(cuz.CUMULATIVE_OFFLINE_AMOUNT, a4.f12399b.f12408a);
            cys3 = a4.f12399b;
            if (cys3.mo8426a(cxb.PROFILE_SPECIFIC_LCOA_UCOA)) {
            }
            cwn4.mo8365a(5, 3, cyq.m7911a(a102, Long.valueOf(j)));
            long a112 = a4.f12405h.mo8354a(cuz.CUMULATIVE_OFFLINE_AMOUNT, a4.f12399b.f12408a);
            cys4 = a4.f12399b;
            if (cys4.mo8426a(cxb.PROFILE_SPECIFIC_LCOA_UCOA)) {
            }
            cwn4.mo8365a(5, 2, cyq.m7911a(a112, Long.valueOf(j2)));
            if (a7.mo8371a()) {
            }
            cwn4.mo8363a(6, (byte) (b6 << 4));
            cwn4.mo8363a(6, a7.f12272a);
            cwn4.mo8364a(7, 8);
            cwn4.mo8365a(7, 7, a6.mo8362a(cxd.OFFLINE_ONLY));
            cwn4.mo8364a(7, 6);
            cwn4.mo8365a(7, 5, a6.mo8362a(cxd.SIGNATURE_SUPPORTED));
            cwn4.mo8365a(7, 4, a6.mo8362a(cxd.READER_SUPPORTING_ISSUER_UPDATE_PROCESSING));
            if (l != null) {
            }
            byte[] a122 = cwn4.mo8368a();
            byte[] b152 = a4.f12399b.f12408a.mo8441b("CRM-CAC_Denial");
            byte[] b162 = a4.f12399b.f12408a.mo8441b("CRM-CAC_Online");
            byte[] d32 = a4.f12399b.f12408a.mo8445d("CRM-CAC_Default");
            if (!a7.mo8371a()) {
            }
            cwn4.mo8363a(1, cvw.f12212d);
            byte[] a132 = cwn4.mo8368a();
            if (c.mo8362a(cwj.IDD_IN_IAD)) {
            }
            byte[] b192 = a4.f12399b.f12408a.mo8441b("CVM-CAC_Online-PIN");
            cwn cwn32 = new cwn(cvz.m7720b(a4.f12399b.f12408a.mo8439a("CPR")));
            if (a6.mo8362a(cxd.ONLINE_PIN_SUPPORTED)) {
            }
            z10 = false;
            cwn32.mo8365a(1, 8, z10);
            cwn32.mo8364a(1, 5);
            a2 = cwn32.mo8368a();
            a4.mo8397a("CPR", a2);
            a4.mo8397a("Issuer_Application_Data", bArr);
            cwf cwf32 = a4.f12405h;
            if (cvw == cvw.ARQC) {
            }
            cwf cwf222 = a4.f12405h;
            if (cvw == cvw.ARQC) {
            }
            if (c.mo8362a(cwj.AFL_IN_ONLINE_TXNS)) {
            }
            if (cvw != cvw.TC) {
            }
            cza a18222 = cyz.m7965a(a4, cxc.SUCCESS);
            cuw cuw3222 = cuw.RESPONSE_MESSAGE_TEMPLATE_2;
            cvc[] cvcArr2222 = new cvc[7];
            cvcArr2222[0] = cuz.APPLICATION_INTERCHANGE_PROFILE.mo8318a(a4.mo8411l());
            if (!c.mo8362a(cwj.CVN_16_FOR_CRYPTOGRAM)) {
            }
            byte[] a19222 = a4.mo8418a(a132);
            if (cvw.TC == cvw) {
            }
            cvcArr2222[1] = cva;
            cvcArr2222[2] = cuz.APPLICATION_FILE_LOCATOR.mo8318a(cxn.m7838a(a4.mo8409j()));
            cvcArr2222[3] = cuz.APP_TRANSACTION_COUNTER.mo8318a(a4.mo8415p());
            cvcArr2222[4] = cuz.ISSUER_APPLICATION_DATA.mo8318a(bArr);
            cvcArr2222[5] = cuz.CRYPTOGRAM_INFORMATION_DATA.mo8318a(cvw2.f12213e);
            cvcArr2222[6] = cuz.CARD_PROCESSING_REQUIREMENTS.mo8318a(bArr2);
            return cvv.m7695a(cza, cut.m7621a(cuw.mo8317a(cvcArr2222)));
        } else {
            throw new cvl(cuu.CONDITIONS_OF_USE_NOT_SATISFIED);
        }
    }
}
