package p000;

import java.security.MessageDigest;
import java.util.List;

/* renamed from: bgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgg extends bga {
    /* JADX WARN: Failed to insert an additional move for type inference into block B:224:0x0077 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:225:0x0073 */
    /* JADX WARN: Type inference failed for: r12v48, assign insn: 0x0057: CONST  (r12v48 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r12v49, types: [int], assign insn: PHI: (r12v49 ?) = (r12v48 ?), (r12v53 ?) binds: [B:20:0x0056, B:27:0x0073] */
    /* JADX WARN: Type inference failed for: r12v50, assign insn: PHI: (r12v50 ?) = (r12v52 ?), (r12v49 ?) binds: [B:225:0x0073, B:226:0x0073] */
    /* JADX WARN: Type inference failed for: r12v52, types: [short], assign insn: 0x0072: CAST  (r12v52 ? I:short) = (short) (r12v51 int) */
    /* JADX WARN: Type inference failed for: r12v53, assign insn: ?: MOVE  (r12v53 ?) = (r12v50 ?) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04c4 A[Catch:{ bfq -> 0x0562 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04c5 A[Catch:{ bfq -> 0x0562 }] */
    /* renamed from: a */
    public final bfr mo3097a(bfz bfz) {
        byte b;
        boolean z;
        byte[] bArr;
        byte b2;
        byte b3;
        byte b4;
        byte[] bArr2;
        bfz bfz2 = bfz;
        bfr bfr = new bfr();
        try {
            if (bgd.m2926c() == 4) {
                throw new bfq((short) 27014);
            } else if (bgd.m2926c() == 5) {
                throw new bfq((short) 27013);
            } else if (((Short) bes.m2844a("TR_APP_STATE")).shortValue() != 13141) {
                throw new bfq((short) 27013);
            } else if (bfz2.f3147c == 0 && bfz2.f3148d == 0) {
                byte[] bArr3 = bfz2.f3150f;
                if (bArr3[0] == -125 && bfz2.f3149e == ((byte) (bArr3[1] + 2))) {
                    List list = (List) bes.m2844a("PDOL_LIST");
                    if (list == null || list.size() <= 0) {
                        b = 2;
                    } else {
                        int i = 0;
                        b = 2;
                        while (i < list.size()) {
                            bgv bgv = (bgv) list.get(i);
                            if (bgv.f3194a.compareToIgnoreCase("DOL_TOTAL_LEN") == 0) {
                                b = (short) (b + bgv.f3195b);
                            }
                            i++;
                            b = b;
                        }
                    }
                    if (b > 2) {
                        if (bfz2.f3149e <= 2) {
                            throw new bfq((short) 27013);
                        }
                    }
                    byte b5 = bfz2.f3149e;
                    if (b5 != b) {
                        throw new bfq((short) 26368);
                    } else if (bgu.m2997a(bgx.m3005a(bfz2.f3150f, 2, b5 - 2), list) == 30003) {
                        throw new bfq((short) 26368);
                    } else if (bhp.m3057b(bgx.m3011a(beu.m2848a("RUNNING_ATC"))) != 65535) {
                        String str = (String) bes.m2844a("9F35");
                        String str2 = (String) bes.m2844a("9F6E");
                        if (str == null || str.compareToIgnoreCase("") == 0) {
                            if (str2 != null) {
                                if (str2.compareToIgnoreCase("") != 0) {
                                    bArr = bgx.m3011a(str2);
                                    z = true;
                                }
                            }
                            bArr = bgx.m3011a("B0");
                            z = false;
                        } else {
                            bArr = bgx.m3011a(str);
                            z = false;
                        }
                        if (z) {
                            b3 = bArr[0];
                            b2 = bArr[2];
                            b4 = bArr[1];
                        } else {
                            b3 = bArr[0];
                            b2 = b3;
                            b4 = 0;
                        }
                        bes.m2845a("TR_TERMINAL_ONLINE_CAPABILITY", (short) 30003);
                        bes.m2845a("TR_CVR", new byte[]{3, Byte.MIN_VALUE, 0, 0});
                        if (bgp.OPERATION.f3179b.equals(bgq.PAYMENT)) {
                            if (((Byte) bes.m2844a("TR_MOB_CVM_STATUS")).byteValue() == 117) {
                                bes.m2845a("TR_MOB_CVM_STATUS", (byte) -102);
                                bes.m2845a("TR_MOB_CVM_TYPE", (byte) 35);
                            }
                        }
                        if (!z) {
                            byte b6 = b2 & 7;
                            if (b6 == 1 || b6 == 2 || b6 == 4 || b6 == 5) {
                                bes.m2845a("TR_TERMINAL_ONLINE_CAPABILITY", (short) -23238);
                            }
                            if ((b3 & 8) != 8) {
                                bes.m2845a("TR_MOB_CVM_REQ", (short) 30003);
                            } else {
                                bes.m2845a("TR_MOB_CVM_REQ", (short) -23238);
                            }
                            byte b7 = (byte) (b3 & -64);
                            if (b7 == Byte.MIN_VALUE) {
                                bes.m2845a("TR_TERMINAL_MODE", (byte) 83);
                                bes.m2845a("TR_TERMINAL_TYPE", (byte) 119);
                                if (bgd.m2920a((byte) 2, (byte) 1) == -23238 || ((Byte) bes.m2844a("TR_APP_CAPABILITY")).byteValue() == -63) {
                                    bes.m2845a("TR_TERMINAL_MODE", (byte) 66);
                                }
                                bes.m2845a("TR_MOB_CVM_REQ", (short) 30003);
                            } else if (b7 == -64) {
                                bes.m2845a("TR_TERMINAL_MODE", (byte) 83);
                                bes.m2845a("TR_TERMINAL_TYPE", (byte) 51);
                                if (bgd.m2920a((byte) 2, (byte) 1) == -23238 || ((Byte) bes.m2844a("TR_APP_CAPABILITY")).byteValue() == -63) {
                                    bes.m2845a("TR_TERMINAL_MODE", (byte) 66);
                                }
                            } else if (b7 == 0) {
                                bes.m2845a("TR_TERMINAL_MODE", (byte) 66);
                                bes.m2845a("TR_TERMINAL_TYPE", (byte) 88);
                                bes.m2845a("TR_MOB_CVM_REQ", (short) 30003);
                            } else if (b7 == 64) {
                                bes.m2845a("TR_TERMINAL_MODE", (byte) 66);
                                if (((Short) bes.m2844a("TR_MOB_CVM_REQ")).shortValue() != -23238) {
                                    bes.m2845a("TR_TERMINAL_TYPE", (byte) 119);
                                } else {
                                    bes.m2845a("TR_TERMINAL_TYPE", (byte) 51);
                                }
                            } else {
                                throw new bfq((short) 27013);
                            }
                            bgd.m2924b();
                        } else {
                            if (((byte) (b2 & Byte.MIN_VALUE)) == 0) {
                                bes.m2845a("TR_TERMINAL_ONLINE_CAPABILITY", (short) -23238);
                            }
                            if ((b2 & 64) == 64 && ((byte) (b4 & Byte.MIN_VALUE)) == Byte.MIN_VALUE) {
                                bes.m2845a("TR_MOB_CVM_REQ", (short) -23238);
                            } else {
                                bes.m2845a("TR_MOB_CVM_REQ", (short) 30003);
                            }
                            if ((b3 & 8) != 8) {
                                bes.m2845a("TR_TERMINAL_TYPE", (byte) 119);
                            } else {
                                bes.m2845a("TR_TERMINAL_TYPE", (byte) 51);
                            }
                            if ((b3 & 16) == 16) {
                                bes.m2845a("TR_TERMINAL_MODE", (byte) 83);
                                if (bgd.m2920a((byte) 2, (byte) 1) == -23238 || ((Byte) bes.m2844a("TR_APP_CAPABILITY")).byteValue() == -63) {
                                    bes.m2845a("TR_TERMINAL_MODE", (byte) 66);
                                }
                            } else {
                                bes.m2845a("TR_TERMINAL_MODE", (byte) 66);
                            }
                        }
                        String a = bgt.m2993a("MS_AIP_DGI");
                        if (((Byte) bes.m2844a("TR_TERMINAL_MODE")).byteValue() == 83) {
                            a = bgt.m2993a("EMV_AIP_DGI");
                            if (((Short) bes.m2844a("TR_ACTIVE_APP")).shortValue() == -31176) {
                                a = bgt.m2993a("PAYMENT_PARAMETERS_DGI");
                            }
                        }
                        if (bgp.OPERATION.f3179b.equals(bgq.TAP_PAYMENT) && bgd.m2920a((byte) 4, (byte) 8) == -23238) {
                            if (((Byte) bes.m2844a("TR_TERMINAL_MODE")).byteValue() != 83) {
                                throw new bfq((short) 27014);
                            }
                        }
                        bia a2 = bev.m2854a(this.f3155a.f3120b, a, bgt.m2993a("EMV_AIP_TAG"), true);
                        bia a3 = bev.m2854a(this.f3155a.f3120b, a, bgt.m2993a("EMV_AFL_TAG"), true);
                        if (a2 == null || a3 == null) {
                            throw new bfq((short) 27013);
                        }
                        String str3 = a2.f3270h;
                        String str4 = a3.f3270h;
                        byte[] a4 = bgx.m3011a(str3);
                        byte[] a5 = bgx.m3011a(str4);
                        if (bgd.m2920a((byte) 4, (byte) 4) == 30003) {
                            a4[0] = (byte) (a4[0] & -2);
                        }
                        bgd.m2923a(bha.NO_FURTHER_ACTION_REQUIRED);
                        byte byteValue = ((Byte) bes.m2844a("TR_TERMINAL_TYPE")).byteValue();
                        if (byteValue != 51) {
                            if (byteValue == 88) {
                                a4[0] = (byte) (a4[0] & 124);
                                a4[1] = 0;
                                bes.m2845a("TR_TXN_AMNT_STATUS", (byte) -7);
                            } else if (byteValue == 119) {
                                if (((Byte) bes.m2844a("TR_TERMINAL_MODE")).byteValue() == 66) {
                                    bes.m2845a("TR_TXN_AMNT_STATUS", (byte) -7);
                                }
                            }
                        } else if (((Short) bes.m2844a("TR_MOB_CVM_REQ")).shortValue() != -23238) {
                            bes.m2845a("TR_TXN_AMNT_STATUS", (byte) -45);
                        } else {
                            bes.m2845a("TR_TXN_AMNT_STATUS", (byte) -7);
                        }
                        String a6 = bgx.m3004a(a4);
                        String a7 = bgx.m3004a(a5);
                        if (((Byte) bes.m2844a("TR_TERMINAL_TYPE")).byteValue() == 51) {
                            if (bgd.m2920a((byte) 4, (byte) 1) == -23238) {
                                String a8 = bgx.m3004a((byte[]) bes.m2844a("MOBILE_CVM_RESULTS"));
                                StringBuilder sb = new StringBuilder();
                                String valueOf = String.valueOf(bhp.m3058b(a6));
                                String str5 = valueOf.length() == 0 ? new String("82") : "82".concat(valueOf);
                                String valueOf2 = String.valueOf(bhp.m3058b(a7));
                                String str6 = valueOf2.length() == 0 ? new String("94") : "94".concat(valueOf2);
                                String valueOf3 = String.valueOf(bhp.m3058b(a8));
                                String str7 = valueOf3.length() == 0 ? new String("9F71") : "9F71".concat(valueOf3);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length());
                                sb2.append(str5);
                                sb2.append(str6);
                                sb2.append(str7);
                                String b8 = bhp.m3058b(sb2.toString());
                                sb.append("77");
                                sb.append(b8);
                                bArr2 = bgx.m3011a(sb.toString());
                                if (((Byte) bes.m2844a("TR_TXN_AMNT_STATUS")).byteValue() != -7) {
                                    if (((Byte) bes.m2844a("TR_MOB_CVM_STATUS")).byteValue() == 117) {
                                        bgd.m2923a(bha.FURTHER_ACTION_REQUIRED);
                                        if (((Byte) bes.m2844a("TR_TERMINAL_TYPE")).byteValue() == 51) {
                                            bes.m2845a("TR_ABORT_IN_GAC", (short) -23238);
                                        }
                                    }
                                }
                                bfr.f3126a = bArr2;
                                bes.m2845a("TR_APP_STATE", (short) 31357);
                                bes.m2845a("TR_ACTIVE_AFL", a5);
                                bes.m2845a("TR_ACTIVE_AIP", a4);
                                MessageDigest a9 = bgw.m2999a();
                                byte[] bArr4 = bfz2.f3150f;
                                a9.update(bArr4, 2, bArr4[1]);
                                bes.m2845a("TR_CDA_TXN_HASH_OBJ", a9);
                                return bfr;
                            }
                        }
                        String valueOf4 = String.valueOf(a6);
                        String valueOf5 = String.valueOf(a7);
                        String valueOf6 = String.valueOf(bhp.m3058b(valueOf5.length() == 0 ? new String(valueOf4) : valueOf4.concat(valueOf5)));
                        bArr2 = bgx.m3011a(valueOf6.length() == 0 ? new String("80") : "80".concat(valueOf6));
                        if (((Byte) bes.m2844a("TR_TXN_AMNT_STATUS")).byteValue() != -7) {
                        }
                        bfr.f3126a = bArr2;
                        bes.m2845a("TR_APP_STATE", (short) 31357);
                        bes.m2845a("TR_ACTIVE_AFL", a5);
                        bes.m2845a("TR_ACTIVE_AIP", a4);
                        MessageDigest a92 = bgw.m2999a();
                        byte[] bArr42 = bfz2.f3150f;
                        a92.update(bArr42, 2, bArr42[1]);
                        bes.m2845a("TR_CDA_TXN_HASH_OBJ", a92);
                        return bfr;
                    } else {
                        throw new bfq((short) 27013);
                    }
                } else {
                    throw new bfq((short) 27013);
                }
            } else {
                throw new bfq((short) 27270);
            }
        } catch (bfq e) {
            short s = e.f3125b;
            if (s == 0) {
                bfr.f3127b = 28416;
            } else {
                bfr.f3127b = s;
            }
            bes.m2845a("TR_APP_STATE", (short) 14161);
        }
    }
}
