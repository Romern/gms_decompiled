package p000;

import android.util.Log;
import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.util.List;

/* renamed from: bgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgf extends bga {

    /* renamed from: c */
    private static final byte[] f3170c = {5, 1, 38, 8};

    /* renamed from: b */
    private final byte[] f3171b = {-97, 39, 1, 0, -97, 54, 2, 0, 0};

    /* JADX WARN: Failed to insert an additional move for type inference into block B:126:0x028a */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:261:0x05bf */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:300:0x0710 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:252:0x05a8 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:129:0x02f4 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: bfr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: bfr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: bfr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: bfr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: bfr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: bfr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: bfr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: bfr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v101, resolved type: bfr} */
    /* JADX WARN: Type inference failed for: r1v0, types: [bga], assign insn: 0x0000: MOVE  (r1v0 ? I:?[OBJECT, ARRAY]) = (r24v0 'this' bgf A[THIS]) */
    /* JADX WARN: Type inference failed for: r3v4, assign insn: PHI: (r3v4 ?) = (r3v28 ?), (r3v18 ?), (r3v46 ?), (r3v51 ?), (r3v52 ?) binds: [B:300:0x0710, B:261:0x05bf, B:252:0x05a8, B:126:0x028a, B:129:0x02f4] */
    /* JADX WARN: Type inference failed for: r1v15, assign insn: PHI: (r1v15 ?) = (r1v33 ?), (r1v34 ?), (r1v47 ?), (r1v0 ?), (r1v0 ?) binds: [B:300:0x0710, B:261:0x05bf, B:252:0x05a8, B:126:0x028a, B:129:0x02f4] */
    /* JADX WARN: Type inference failed for: r3v5, assign insn: PHI: (r3v5 ?) = (r3v28 ?), (r3v18 ?), (r3v51 ?), (r3v52 ?), (r3v53 ? I:?[int, float, short, byte, char]) binds: [B:300:0x0710, B:261:0x05bf, B:126:0x028a, B:129:0x02f4, B:252:0x05a8] */
    /* JADX WARN: Type inference failed for: r1v16, assign insn: PHI: (r1v16 ?) = (r1v33 ?), (r1v34 ?), (r1v47 ?), (r1v0 ?), (r1v0 ?) binds: [B:300:0x0710, B:261:0x05bf, B:252:0x05a8, B:126:0x028a, B:129:0x02f4] */
    /* JADX WARN: Type inference failed for: r3v18, types: [int], assign insn: 0x0397: INVOKE  (r3v18 ? I:int) = (r3v17 bgl), (r13v8 byte[]), (r6v15 byte[]) type: INTERFACE call: bgj.c(byte[], byte[]):int */
    /* JADX WARN: Type inference failed for: r1v31, assign insn: PHI: (r1v31 ?) = (r1v33 ?), (r1v34 ?), (r1v34 ?) binds: [B:296:0x06e8, B:261:0x05bf, B:281:0x06a0] */
    /* JADX WARN: Type inference failed for: r1v32, assign insn: PHI: (r1v32 ?) = (r1v33 ?), (r1v33 ?), (r1v33 ?), (r1v34 ?), (r1v34 ?), (r1v34 ?), (r1v34 ?), (r1v47 ?), (r1v47 ?) binds: [B:296:0x06e8, B:294:0x06e6, B:295:?, B:261:0x05bf, B:281:0x06a0, B:277:0x0693, B:278:?, B:252:0x05a8, B:253:?] */
    /* JADX WARN: Type inference failed for: r1v33, assign insn: PHI: (r1v33 ?) = (r1v34 ?), (r1v47 ?) binds: [B:287:0x06ba, B:253:?] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.String], assign insn: 0x070e: MOVE  (r3v28 ? I:?[OBJECT, ARRAY]) = (r19v4 java.lang.String) */
    /* JADX WARN: Type inference failed for: r1v34, types: [bfr], assign insn: 0x05bb: MOVE  (r1v34 ? I:?[OBJECT, ARRAY]) = (r23v2 bfr) */
    /* JADX WARN: Type inference failed for: r1v36, assign insn: PHI: (r1v36 ?) = (r1v33 ?), (r1v33 ?), (r1v34 ?), (r1v34 ?), (r1v47 ?), (r1v47 ?) binds: [B:294:0x06e6, B:295:?, B:277:0x0693, B:278:?, B:252:0x05a8, B:253:?] */
    /* JADX WARN: Type inference failed for: r3v46, assign insn: 0x059b: CONST  (r3v46 ? I:?[int, float, short, byte, char]) = (8 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r1v47, types: [bfr], assign insn: 0x05a6: MOVE  (r1v47 ? I:?[OBJECT, ARRAY]) = (r23v2 bfr) */
    /* JADX WARN: Type inference failed for: r3v51, assign insn: 0x0288: MOVE  (r3v51 ? I:?[OBJECT, ARRAY]) = (r17v8 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object, java.lang.String], assign insn: 0x028a: CHECK_CAST  (r3v52 ? I:java.lang.String) = (java.lang.String) (r3v51 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v53, assign insn: 0x059b: CONST  (r3v53 ? I:?[int, float, short, byte, char]) = (8 ?[int, float, short, byte, char]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgx.a(byte[], short, byte):short
     arg types: [byte[], int, byte]
     candidates:
      bgx.a(java.lang.String, int, int):java.lang.String
      bgx.a(byte[], int, int):java.lang.String
      bgx.a(byte[], short, short):short
      bgx.a(byte[], byte[], short):short
      bgx.a(byte[], short, byte):short */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgx.a(byte[], short, short):short
     arg types: [byte[], int, int]
     candidates:
      bgx.a(java.lang.String, int, int):java.lang.String
      bgx.a(byte[], int, int):java.lang.String
      bgx.a(byte[], short, byte):short
      bgx.a(byte[], byte[], short):short
      bgx.a(byte[], short, short):short */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgx.a(byte[], short, short):short
     arg types: [byte[], int, short]
     candidates:
      bgx.a(java.lang.String, int, int):java.lang.String
      bgx.a(byte[], int, int):java.lang.String
      bgx.a(byte[], short, byte):short
      bgx.a(byte[], byte[], short):short
      bgx.a(byte[], short, short):short */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgx.a(byte[], short, short):short
     arg types: [byte[], short, int]
     candidates:
      bgx.a(java.lang.String, int, int):java.lang.String
      bgx.a(byte[], int, int):java.lang.String
      bgx.a(byte[], short, byte):short
      bgx.a(byte[], byte[], short):short
      bgx.a(byte[], short, short):short */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0734, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0735, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0736, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0773, code lost:
        r3 = r19;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07d8, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x07e7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x07e8, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:252:0x05a8, B:261:0x05bf] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0733 A[Catch:{ bfq -> 0x07d5, DigestException -> 0x07d3 }, ExcHandler: DigestException (e java.security.DigestException), PHI: r1 10  PHI: (r1v32 ?) = (r1v33 ?), (r1v33 ?), (r1v33 ?), (r1v34 ?), (r1v34 ?), (r1v34 ?), (r1v34 ?), (r1v47 ?), (r1v47 ?) binds: [B:296:0x06e8, B:294:0x06e6, B:295:?, B:261:0x05bf, B:281:0x06a0, B:277:0x0693, B:278:?, B:252:0x05a8, B:253:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:252:0x05a8] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0772 A[Catch:{ bfq -> 0x07d5, DigestException -> 0x07d3 }, ExcHandler: DigestException (e java.security.DigestException), PHI: r19 r23 10  PHI: (r19v3 java.lang.String) = (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String), (r19v5 java.lang.String) binds: [B:147:0x036c, B:179:0x0418, B:180:?, B:199:0x0471, B:200:?, B:244:0x057c, B:245:?, B:213:0x04b4, B:207:0x0480, B:203:0x0479, B:204:?, B:183:0x0429, B:175:0x0410, B:169:0x0402, B:167:0x03ee, B:158:0x03b1, B:156:0x03ab, B:157:?, B:152:0x0394, B:150:0x038e, B:151:?, B:143:0x0361, B:144:?, B:138:0x034b, B:134:0x0336, B:129:0x02f4] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r23v1 bfr) = (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v2 bfr), (r23v3 bfr) binds: [B:147:0x036c, B:179:0x0418, B:180:?, B:199:0x0471, B:200:?, B:244:0x057c, B:245:?, B:213:0x04b4, B:207:0x0480, B:203:0x0479, B:204:?, B:183:0x0429, B:175:0x0410, B:169:0x0402, B:167:0x03ee, B:158:0x03b1, B:156:0x03ab, B:157:?, B:152:0x0394, B:150:0x038e, B:151:?, B:143:0x0361, B:144:?, B:138:0x034b, B:134:0x0336, B:129:0x02f4] A[DONT_GENERATE, DONT_INLINE], Splitter:B:199:0x0471] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x07d7 A[ExcHandler: DigestException (e java.security.DigestException), Splitter:B:1:0x000d] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011d A[Catch:{ bfq -> 0x005f, DigestException -> 0x07d7 }] */
    /* renamed from: a */
    public final bfr mo3097a(bfz bfz) {
        bfq bfq;
        bfr bfr;
        bfr bfr2;
        List list;
        char c;
        char c2;
        byte b;
        byte b2;
        ? r3;
        String str;
        bfr bfr3;
        bfr bfr4;
        String str2;
        String str3;
        byte b3;
        String str4;
        byte[] bArr;
        int i;
        String str5;
        byte b4;
        boolean z;
        int i2;
        byte[] bArr2;
        short s;
        int i3;
        bfr bfr5;
        String str6;
        short s2;
        String str7;
        String str8;
        bfr bfr6 = this;
        bfz bfz2 = bfz;
        String str9 = "TR_APP_STATE";
        bfr bfr7 = new bfr();
        try {
            byte b5 = (byte) (bfz2.f3147c & -64);
            byte byteValue = ((Byte) bes.m2844a("TR_TERMINAL_MODE")).byteValue();
            byte[] bArr3 = (byte[]) bes.m2844a("TR_ACTIVE_AIP");
            if (bgd.m2926c() != 4) {
                if (bgd.m2926c() != 5) {
                    if (((Short) bes.m2844a(str9)).shortValue() == 31357) {
                        byte b6 = bfz2.f3147c;
                        byte b7 = (byte) (b6 & -64);
                        if (bfz2.f3148d == 0) {
                            if ((b6 & 47) == 0 && b7 != -64) {
                                if (byteValue != 83) {
                                    list = (List) bes.m2844a("MS_CDOL_LIST");
                                } else {
                                    list = (List) bes.m2844a("EMV_CDOL_LIST");
                                }
                                if (bgu.m2997a(bgx.m3004a(bfz2.f3150f), list) == 30003) {
                                    throw new bfq((short) 26368);
                                } else if (bfz2.f3149e == ((Short) bes.m2844a("DOL_TOTAL_LEN")).shortValue()) {
                                    if ((bfz2.f3147c & 16) != 16) {
                                        if (bgp.OPERATION.f3179b.equals(bgq.TAP_PAYMENT) && bgd.m2920a((byte) 4, (byte) 8) == -23238) {
                                            if (bgx.m3007a(bArr3, (short) 0, (byte) 1) != -23238) {
                                                c = 30003;
                                            } else if (b5 != 0) {
                                                throw new bfq((short) 27014);
                                            }
                                        }
                                        c = 30003;
                                    } else {
                                        c = 42298;
                                    }
                                    if (c == 42298) {
                                        if (bgx.m3007a(bArr3, (short) 0, (byte) 1) == 30003) {
                                            throw new bfq((short) 27013);
                                        }
                                    }
                                    if (((Byte) bes.m2844a("TR_TXN_AMNT_STATUS")).byteValue() == -68) {
                                        if (((Byte) bes.m2844a("TR_TERMINAL_TYPE")).byteValue() == 119) {
                                            if (byteValue == 83 && bgx.m3007a(bgx.m3011a((String) bes.m2844a("95")), (short) 2, Byte.MIN_VALUE) == -23238) {
                                                bes.m2845a("TR_TXN_AMNT_STATUS", (byte) -7);
                                                if (byteValue == 66) {
                                                    bes.m2845a("TR_TXN_AMNT_STATUS", (byte) -7);
                                                }
                                            }
                                        }
                                        bes.m2845a("TR_TXN_AMNT_STATUS", (byte) -45);
                                        if (byteValue == 66) {
                                        }
                                    }
                                    bia a = bev.m2854a(bfr6.f3155a.f3120b, bgt.m2993a("RISK_PARAMS_DGI"), bgt.m2993a("TAG_APP_CURRENCY_CD"), false);
                                    bia a2 = bev.m2854a(bfr6.f3155a.f3120b, bgt.m2993a("RISK_PARAMS_DGI"), bgt.m2993a("TAG_MOB_CVM_REQ_LIMIT"), false);
                                    if (byteValue == 83) {
                                        if (a != null) {
                                            if (bgx.m3006a(bgx.m3011a(a.f3270h), 0) != bgx.m3006a(bgx.m3011a((String) bes.m2844a("5F2A")), 0)) {
                                                bes.m2845a("TR_TXN_AMNT_STATUS", (byte) -7);
                                            }
                                        }
                                        if (a2 != null && new BigInteger(a2.f3270h, 16).compareTo(new BigInteger((String) bes.m2844a("9F02"), 16)) == -1) {
                                            bes.m2845a("TR_TXN_AMNT_STATUS", (byte) -7);
                                        }
                                    } else if (b5 == 64) {
                                        b5 = Byte.MIN_VALUE;
                                    }
                                    if (((Short) bes.m2844a("TR_TERMINAL_ONLINE_CAPABILITY")).shortValue() == 30003) {
                                        c2 = 4402;
                                    } else {
                                        c2 = 258;
                                    }
                                    if (((Byte) bes.m2844a("TR_MOB_CVM_STATUS")).byteValue() == 117) {
                                        if (((Byte) bes.m2844a("TR_TXN_AMNT_STATUS")).byteValue() == -7 || ((Short) bes.m2844a("TR_ABORT_IN_GAC")).shortValue() == -23238) {
                                            c2 |= 16576;
                                        }
                                    }
                                    if ((c2 & 49344) != 16576) {
                                        if ((c2 & 12336) == 4144) {
                                            b = 0;
                                        } else {
                                            b = b5 != 0 ? Byte.MIN_VALUE : 0;
                                        }
                                        if (b != 0) {
                                            bgd.m2927c((byte) 1, (byte) 32);
                                        } else {
                                            bgd.m2925b((byte) 1, (byte) 48);
                                            c = 30003;
                                        }
                                        if (c != 42298) {
                                            b2 = 2;
                                        } else {
                                            b2 = 2;
                                            bgd.m2927c((byte) 3, (byte) 2);
                                        }
                                        if (byteValue == 66) {
                                            bgd.m2925b(b2, (byte) -2);
                                            bgd.m2925b((byte) 3, (byte) -1);
                                        }
                                        if (byteValue == 66) {
                                            bArr = new byte[(bfz2.f3149e + 7)];
                                            str4 = (String) bes.m2844a("9F37");
                                            str = str9;
                                            str3 = "TR_TXN_AMNT_STATUS";
                                            bfr4 = bfr7;
                                            b3 = b;
                                            str2 = "9F37";
                                        } else {
                                            String str10 = (String) bes.m2844a("9F02");
                                            String str11 = (String) bes.m2844a("9F03");
                                            String str12 = (String) bes.m2844a("9F1A");
                                            String str13 = (String) bes.m2844a("95");
                                            byte[] bArr4 = new byte[(bfz2.f3149e + 9)];
                                            String str14 = (String) bes.m2844a("5F2A");
                                            str = str9;
                                            r3 = bes.m2844a("9A");
                                            try {
                                                r3 = (String) r3;
                                                str3 = "TR_TXN_AMNT_STATUS";
                                                str7 = (String) bes.m2844a("9C");
                                                str2 = "9F37";
                                                str8 = (String) bes.m2844a("9F37");
                                                bfr4 = bfr7;
                                                b3 = b;
                                            } catch (bfq e) {
                                                e = e;
                                                bfr bfr8 = bfr7;
                                                str9 = str;
                                                bfr = bfr8;
                                                bfq = e;
                                                bfr6 = bfr;
                                                bes.m2845a(str9, (short) 14161);
                                                bfr6.f3127b = bfq.f3125b;
                                                return bfr6;
                                            } catch (DigestException e2) {
                                                bfr3 = bfr7;
                                                str9 = str;
                                                bfr2 = bfr3;
                                                bes.m2845a(str9, (short) 14161);
                                                bfr6.f3127b = 28416;
                                                return bfr6;
                                            }
                                            try {
                                                StringBuilder sb = new StringBuilder(String.valueOf(str10).length() + String.valueOf(str11).length() + String.valueOf(str12).length() + String.valueOf(str13).length() + String.valueOf(str14).length() + String.valueOf((Object) r3).length() + String.valueOf(str7).length() + String.valueOf(str8).length());
                                                sb.append(str10);
                                                sb.append(str11);
                                                sb.append(str12);
                                                sb.append(str13);
                                                sb.append(str14);
                                                sb.append((String) r3);
                                                sb.append(str7);
                                                sb.append(str8);
                                                str4 = sb.toString();
                                                bArr = bArr4;
                                            } catch (bfq e3) {
                                                e = e3;
                                                str9 = str;
                                                bfr = bfr4;
                                                bfq = e;
                                                bfr6 = bfr;
                                                bes.m2845a(str9, (short) 14161);
                                                bfr6.f3127b = bfq.f3125b;
                                                return bfr6;
                                            } catch (DigestException e4) {
                                            }
                                        }
                                        bArr[0] = bfz2.f3149e;
                                        System.arraycopy(bgx.m3011a(str4), 0, bArr, 1, bfz2.f3149e);
                                        int i4 = bfz2.f3149e + 1;
                                        bhw bhw = (bhw) bes.m2844a("TR_NFC_LUPC_OBJ");
                                        if (bhw == null) {
                                            try {
                                                i = bhp.m3057b(bgx.m3011a(beu.m2848a("RUNNING_ATC")));
                                            } catch (bfq e5) {
                                                bfq = e5;
                                                str9 = str;
                                                bfr6 = bfr4;
                                            } catch (DigestException e42) {
                                            }
                                        } else {
                                            i = bhp.m3057b(bgx.m3011a(bhw.f3253b));
                                        }
                                        byte[] bArr5 = (byte[]) bes.m2844a("TR_CVR");
                                        if (byteValue == 83) {
                                            int length = bArr3.length;
                                            System.arraycopy(bArr3, 0, bArr, i4, length);
                                            i4 = (short) (i4 + length);
                                        }
                                        System.arraycopy(bArr5, 0, bArr, bgx.m3008a(bArr, (short) i4, (short) i), bArr5.length);
                                        bgl bgl = new bgl();
                                        byte[] bArr6 = new byte[8];
                                        String valueOf = String.valueOf(bgx.m3004a(bArr));
                                        if (valueOf.length() == 0) {
                                            new String("::FirstCardActionAnalysisProcess::computeAC::_baCryptogramInData::");
                                        } else {
                                            "::FirstCardActionAnalysisProcess::computeAC::_baCryptogramInData::".concat(valueOf);
                                        }
                                        r3 = bgl.mo3109c(bArr, bArr6);
                                        String valueOf2 = String.valueOf(bgx.m3004a(bArr6));
                                        if (valueOf2.length() == 0) {
                                            new String("::FirstCardActionAnalysisProcess::computeAC::_baAC::");
                                        } else {
                                            "::FirstCardActionAnalysisProcess::computeAC::_baAC::".concat(valueOf2);
                                        }
                                        StringBuilder sb2 = new StringBuilder(66);
                                        sb2.append("::FirstCardActionAnalysisProcess::computeAC::iUsedATC::");
                                        sb2.append((int) r3);
                                        sb2.toString();
                                        if (r3 < 0) {
                                            throw new bfq((short) 27013);
                                        } else if (r3 != 65535) {
                                            String valueOf3 = String.valueOf(bhw);
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 43);
                                            sb3.append("::FirstCardActionAnalysisProcess::nfcLupc::");
                                            sb3.append(valueOf3);
                                            sb3.toString();
                                            if (bhw == null) {
                                                str5 = beu.m2852b(String.format("%04x", Integer.valueOf((int) r3)));
                                            } else {
                                                str5 = bhw.f3256e;
                                            }
                                            String c3 = bev.m2862c("MS_CVN_VALUE");
                                            if (byteValue == 83) {
                                                c3 = bev.m2862c("EMV_CVN_VALUE");
                                            }
                                            if (str5 != null) {
                                                if (c3 != null) {
                                                    byte b8 = bgx.m3011a(str5)[0];
                                                    byte b9 = bgx.m3011a(c3)[0];
                                                    if (byteValue == 83) {
                                                        bArr2 = bgx.m3011a((String) bfr6.f3155a.f3119a.get(bgt.m2993a("ISSUER_APPLICATION_DATA_EMV_DGI")));
                                                        int length2 = bArr2.length;
                                                        if (length2 >= 11) {
                                                            byte b10 = bArr2[10];
                                                            if (b10 != 1) {
                                                                b4 = b10;
                                                                i2 = 8;
                                                                z = false;
                                                            } else if (length2 - 11 > 0) {
                                                                i2 = length2 + 16;
                                                                b4 = b10;
                                                                z = true;
                                                            } else {
                                                                i2 = 27;
                                                                b4 = b10;
                                                                z = false;
                                                            }
                                                        } else {
                                                            throw new bfq((short) 28416);
                                                        }
                                                    } else {
                                                        bArr2 = null;
                                                        i2 = 7;
                                                        z = false;
                                                        b4 = 2;
                                                    }
                                                    if (c == 42298) {
                                                        i2 += 3;
                                                    }
                                                    byte[] bArr7 = new byte[i2];
                                                    if (c != 42298) {
                                                        bArr7[0] = (byte) (i2 - 1);
                                                        s = 1;
                                                    } else {
                                                        int a3 = bgx.m3008a(bArr7, (short) 0, (short) -24816);
                                                        int i5 = (short) (a3 + 1);
                                                        bArr7[a3] = (byte) (i2 - 3);
                                                        s = (short) (i5 + 1);
                                                        bArr7[i5] = (byte) (i2 - 4);
                                                    }
                                                    int i6 = (short) (s + 1);
                                                    bArr7[s] = b8;
                                                    int i7 = (short) (i6 + 1);
                                                    bArr7[i6] = b9;
                                                    System.arraycopy((byte[]) bes.m2844a("TR_CVR"), 0, bArr7, i7, 4);
                                                    int i8 = (short) (i7 + 4);
                                                    if (byteValue == 83) {
                                                        int i9 = (short) (i8 + 1);
                                                        bArr7[i8] = b4;
                                                        if (b4 == 1) {
                                                            bhw bhw2 = (bhw) bes.m2844a("TR_NFC_LUPC_OBJ");
                                                            if (bhw2 == null) {
                                                                String a4 = beu.m2848a("RUNNING_ATC");
                                                                bhz bhz = new bhz();
                                                                bhz.f3263a = bgt.m2993a("NFC_LUPC_DGI");
                                                                bhz.f3264b = bgt.m2993a("NFC_LUPC_TAG");
                                                                bhz.f3266d = Integer.parseInt(a4, 16);
                                                                bhw bhw3 = (bhw) beu.m2849a().get(bhz);
                                                                str6 = bhw3 != null ? bhw3.f3257f : null;
                                                            } else {
                                                                str6 = bhw2.f3257f;
                                                            }
                                                            if (str6 == null) {
                                                                s2 = (short) (i9 + 1);
                                                                bArr7[i9] = 0;
                                                            } else {
                                                                byte[] a5 = bgx.m3011a(str6);
                                                                int i10 = (short) (i9 + 1);
                                                                int length3 = a5.length;
                                                                bArr7[i9] = (byte) length3;
                                                                System.arraycopy(a5, 0, bArr7, i10, length3);
                                                                s2 = (short) (i10 + 16);
                                                            }
                                                            short s3 = (short) (s2 + 1);
                                                            bArr7[s2] = 1;
                                                            if (((Byte) bes.m2844a("TR_MOB_CVM_STATUS")).byteValue() == -102) {
                                                                byte byteValue2 = ((Byte) bes.m2844a("TR_MOB_CVM_TYPE")).byteValue();
                                                                if (byteValue2 == -104) {
                                                                    bArr7[s3] = 2;
                                                                    s3 = (short) (s3 + 1);
                                                                } else if (byteValue2 == 35) {
                                                                    bArr7[s3] = 1;
                                                                    s3 = (short) (s3 + 1);
                                                                } else if (byteValue2 == 70) {
                                                                    bArr7[s3] = 5;
                                                                    s3 = (short) (s3 + 1);
                                                                } else if (byteValue2 == 81) {
                                                                    bArr7[s3] = 3;
                                                                    s3 = (short) (s3 + 1);
                                                                }
                                                            } else {
                                                                bArr7[s3] = 0;
                                                                s3 = (short) (s3 + 1);
                                                            }
                                                            if (z) {
                                                                System.arraycopy(bArr2, 11, bArr7, s3, bArr2[11] + 1);
                                                            }
                                                        }
                                                    }
                                                    bgd.m2921a();
                                                    if (c == 30003) {
                                                        int i11 = i2 + 13;
                                                        try {
                                                            byte[] bArr8 = new byte[i11];
                                                            bArr8[0] = Byte.MIN_VALUE;
                                                            bArr8[1] = (byte) (i11 - 2);
                                                            bArr8[2] = b3;
                                                            int a6 = bgx.m3008a(bArr8, (short) 3, (short) r3);
                                                            r3 = 8;
                                                            r3 = 8;
                                                            System.arraycopy(bArr6, 0, bArr8, a6, 8);
                                                            System.arraycopy(bArr7, 0, bArr8, (short) (a6 + 8), i2);
                                                            bfr6 = bfr4;
                                                            try {
                                                                bfr6.f3126a = bArr8;
                                                            } catch (bfq e6) {
                                                                e = e6;
                                                                bfr5 = bfr6;
                                                            } catch (DigestException e7) {
                                                            }
                                                        } catch (bfq e8) {
                                                            e = e8;
                                                            bfr5 = bfr4;
                                                            bfq = e;
                                                            str9 = str;
                                                            bfr6 = bfr5;
                                                            bes.m2845a(str9, (short) 14161);
                                                            bfr6.f3127b = bfq.f3125b;
                                                            return bfr6;
                                                        } catch (DigestException e9) {
                                                            bfr3 = bfr4;
                                                            str9 = str;
                                                            bfr2 = bfr3;
                                                            bes.m2845a(str9, (short) 14161);
                                                            bfr6.f3127b = 28416;
                                                            return bfr6;
                                                        }
                                                    } else {
                                                        bfr6 = bfr4;
                                                        MessageDigest messageDigest = (MessageDigest) bes.m2844a("TR_CDA_TXN_HASH_OBJ");
                                                        messageDigest.update(bfz2.f3150f);
                                                        bia a7 = bev.m2854a(this.f3155a.f3120b, bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("ICC_KEY_LENGTH_TAG"), true);
                                                        bia a8 = bev.m2853a(this.f3155a.f3120b, bev.m2859b("LOCK_CODE"));
                                                        if (a7 != null) {
                                                            if (a8 != null) {
                                                                int parseInt = Integer.parseInt(a7.f3270h, 16) / 8;
                                                                byte[] a9 = bgx.m3011a(a8.f3270h);
                                                                int i12 = i2 + 9;
                                                                byte[] bArr9 = new byte[i12];
                                                                byte[] bArr10 = new byte[(parseInt - 2)];
                                                                byte[] bArr11 = this.f3171b;
                                                                System.arraycopy(bArr11, 0, bArr9, 0, bArr11.length);
                                                                bArr9[3] = b3;
                                                                short s4 = (short) r3;
                                                                int a10 = bgx.m3008a(bArr9, (short) 7, s4);
                                                                System.arraycopy(bArr7, 0, bArr9, a10, i2);
                                                                messageDigest.update(bArr9, 0, (short) (a10 + i2));
                                                                messageDigest.digest(bArr10, 21, 20);
                                                                System.arraycopy(f3170c, 0, bArr10, 0, f3170c.length);
                                                                bgx.m3010a(bArr10, 4, 8, (byte) 0);
                                                                bgx.m3008a(bArr10, (short) 10, s4);
                                                                bArr10[12] = b3;
                                                                System.arraycopy(bArr6, 0, bArr10, 13, 8);
                                                                bgx.m3010a(bArr10, 41, (short) (parseInt - 63), (byte) -69);
                                                                System.arraycopy(bgx.m3011a((String) bes.m2844a(str2)), 0, bArr10, (short) (parseInt - 22), 4);
                                                                byte[] bArr12 = new byte[parseInt];
                                                                int a11 = new bgl().mo3105a(bArr10, bArr12, a9);
                                                                if (a11 >= 0) {
                                                                    int i13 = parseInt + 14 + i2;
                                                                    if (parseInt > 127) {
                                                                        i13 += 2;
                                                                    } else if (i13 - 2 > 127) {
                                                                        i13++;
                                                                    }
                                                                    byte[] bArr13 = new byte[i13];
                                                                    bArr13[0] = 119;
                                                                    int i14 = i13 - 2;
                                                                    if (i14 > 127) {
                                                                        bArr13[1] = -127;
                                                                        bArr13[2] = (byte) (i13 - 3);
                                                                        i3 = 3;
                                                                    } else {
                                                                        i3 = 2;
                                                                        bArr13[1] = (byte) i14;
                                                                    }
                                                                    System.arraycopy(bArr9, 0, bArr13, i3, i12);
                                                                    short a12 = bgx.m3008a(bArr13, (short) (i3 + i12), (short) -24757);
                                                                    if (parseInt > 127) {
                                                                        bArr13[a12] = -127;
                                                                        a12 = (short) (a12 + 1);
                                                                    }
                                                                    bArr13[a12] = (byte) a11;
                                                                    System.arraycopy(bArr12, 0, bArr13, (short) (a12 + 1), a11);
                                                                    bfr6.f3126a = bArr13;
                                                                } else {
                                                                    throw new bfq((short) 27013);
                                                                }
                                                            }
                                                        }
                                                        Log.e("core-hceclient", "FirstCardActionAnalysisProcess::process::ICC Key Len / Lock Code Not Found");
                                                        throw new bfq((short) 28416);
                                                    }
                                                    if (((Byte) bes.m2844a(str3)).byteValue() != -68) {
                                                        bha bha = bha.TXN_AMOUNT_HIGH;
                                                        if (((Byte) bes.m2844a(str3)).byteValue() == -45) {
                                                            bha = bha.TXN_AMOUNT_LOW;
                                                        }
                                                        bgd.m2923a(bha);
                                                    }
                                                    bes.m2845a("APPLICATION_CYPTOGRAM", bgx.m3004a(bArr6));
                                                    bes.m2845a("UNPREDICTABLE_NUMBER", (String) bes.m2844a(str2));
                                                    bes.m2845a("TID", bhc.m3024a(byteValue));
                                                    r3 = str;
                                                    try {
                                                        bes.m2845a(r3, (short) 26772);
                                                    } catch (bfq e10) {
                                                        e = e10;
                                                        str9 = r3;
                                                        bfr = bfr6;
                                                        bfq = e;
                                                        bfr6 = bfr;
                                                        bes.m2845a(str9, (short) 14161);
                                                        bfr6.f3127b = bfq.f3125b;
                                                        return bfr6;
                                                    } catch (DigestException e11) {
                                                        str9 = r3;
                                                        bfr2 = bfr6;
                                                        bes.m2845a(str9, (short) 14161);
                                                        bfr6.f3127b = 28416;
                                                        return bfr6;
                                                    }
                                                    return bfr6;
                                                }
                                            }
                                            Log.e("core-hceclient", "::FirstCardActionAnalysisProcess::process::DKI or CVN not available");
                                            throw new bfq((short) 28416);
                                        } else {
                                            bgd.m2922a(5);
                                            Log.e("core-hceclient", "::FirstCardActionAnalysisProcess::computeAC::HIGHEST ATC REACHED - APPLICATION TERMINATED!!");
                                            throw new bfq((short) 27013);
                                        }
                                    } else {
                                        bgd.m2923a(bha.FURTHER_ACTION_REQUIRED);
                                        throw new bfq((short) 27012);
                                    }
                                } else {
                                    throw new bfq((short) 26368);
                                }
                            }
                        }
                        throw new bfq((short) 27270);
                    }
                }
                throw new bfq((short) 27013);
            }
            throw new bfq((short) 27014);
        } catch (bfq e12) {
            bfq = e12;
            bfr6 = bfr7;
        } catch (DigestException e13) {
        }
    }
}
