package p000;

import java.util.List;

/* renamed from: bge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bge extends bga {

    /* renamed from: b */
    private static final byte[] f3169b = {50, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 48, 49};

    /* renamed from: a */
    public final bfr mo3097a(bfz bfz) {
        byte[] bArr;
        bia bia;
        bfr bfr = new bfr();
        try {
            byte b = bfz.f3148d;
            if ((b & 2) == 2) {
                throw new bfq((short) 27266);
            } else if (bfz.f3147c == 4 && b == 0) {
                byte b2 = bfz.f3149e;
                if (b2 < 5 || b2 > 16) {
                    throw new bfq((short) 26368);
                }
                bgc bgc = (bgc) bes.m2844a("TR_CUR_PPSE_RES_OBJ");
                if (bgc != null) {
                    if (bgx.m3009a(bfz.f3150f, f3169b, bfz.f3149e) == -23238) {
                        bArr = bgx.m3011a(bgc.f3167b);
                        bes.m2845a("TR_APP_STATE", (short) -23174);
                        bes.m2845a("TR_ACTIVE_APP", (short) -26794);
                    } else {
                        byte[] bArr2 = bfz.f3150f;
                        String[] split = bgc.f3166a.split("=");
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            int i3 = 1;
                            if (i >= split.length) {
                                break;
                            }
                            if (split[i].compareToIgnoreCase("") != 0) {
                                if (bgx.m3009a(bArr2, bgx.m3011a(split[i].substring(2)), (short) bArr2.length) == -23238) {
                                    if (split[i].startsWith("00")) {
                                        i3 = -127;
                                    }
                                    split[i].substring(2);
                                    i2 = i3;
                                }
                            }
                            i++;
                        }
                        if (i2 != 0) {
                            if (((byte) (i2 & -128)) == Byte.MIN_VALUE) {
                                bes.m2845a("TR_ACTIVE_APP", (short) 9509);
                                bArr = bgx.m3011a(bev.m2862c("PRIMARY_AID_FCI"));
                            } else {
                                bes.m2845a("TR_ACTIVE_APP", (short) -31176);
                                bArr = bgx.m3011a(bev.m2862c("ALIAS_AID_FCI"));
                            }
                            List list = null;
                            if (((Short) bes.m2844a("TR_ACTIVE_APP")).shortValue() == -31176) {
                                bia = bev.m2854a(this.f3155a.f3120b, bgt.m2993a("PAYMENT_PARAMETERS_DGI"), bgt.m2993a("PDOL_TAG"), true);
                            } else {
                                bia = null;
                            }
                            if (bia == null) {
                                bia = bev.m2854a(this.f3155a.f3120b, bgt.m2993a("SELECT_AID_DGI"), bgt.m2993a("PDOL_TAG"), true);
                            }
                            if (bia != null) {
                                list = bgu.m2996a(bia.f3270h);
                            }
                            bes.m2845a("PDOL_LIST", list);
                            int c = bgd.m2926c();
                            if (c != 4) {
                                if (c != 5) {
                                    bes.m2845a("TR_APP_STATE", (short) 13141);
                                }
                            }
                            bfr.f3127b = 25219;
                            bes.m2845a("TR_APP_STATE", (short) 13141);
                        } else {
                            throw new bfq((short) 27266);
                        }
                    }
                    bfr.f3126a = bArr;
                    return bfr;
                }
                throw new bfq((short) 27013);
            } else {
                throw new bfq((short) 27270);
            }
        } catch (bfq e) {
            bes.m2845a("TR_APP_STATE", (short) 14161);
            short s = e.f3125b;
            if (s == 0) {
                bfr.f3127b = 28416;
            } else {
                bfr.f3127b = s;
            }
        }
    }
}
