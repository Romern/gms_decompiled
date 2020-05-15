package p000;

import java.util.List;

/* renamed from: bgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgd {
    /* renamed from: a */
    public static short m2920a(byte b, byte b2) {
        return (bgx.m3011a(bev.m2854a(((bet) bgs.f3191a.mo3119a("DATA_CONTEXT", false)).f3120b, bgt.m2993a("RISK_PARAMS_DGI"), bgt.m2993a("TAG_XPM_CONFIG"), false).f3270h)[b] & b2) == b2 ? (short) -23238 : 30003;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r2 != 81) goto L_0x0065;
     */
    /* renamed from: b */
    public static void m2924b() {
        if (m2920a((byte) 4, (byte) 1) == -23238) {
            if (((Byte) bes.m2844a("TR_MOB_CVM_STATUS")).byteValue() == -102) {
                m2928d((byte) 0, (byte) 1);
                m2928d((byte) 2, (byte) 2);
                byte byteValue = ((Byte) bes.m2844a("TR_MOB_CVM_TYPE")).byteValue();
                if (byteValue != -104) {
                    if (byteValue != 35) {
                        if (byteValue == 70) {
                            m2927c((byte) 2, (byte) 1);
                            m2925b((byte) 1, (byte) 4);
                            m2927c((byte) 1, (byte) 2);
                        }
                    }
                    m2927c((byte) 2, (byte) 1);
                    m2925b((byte) 1, (byte) 4);
                    m2925b((byte) 1, (byte) 2);
                } else {
                    m2927c((byte) 1, (byte) 4);
                    m2925b((byte) 1, (byte) 2);
                }
            } else {
                m2928d((byte) 0, (byte) 63);
                m2928d((byte) 2, (byte) 0);
            }
            if (((Short) bes.m2844a("TR_MOB_CVM_REQ")).shortValue() == -23238) {
                m2928d((byte) 1, (byte) 3);
            } else {
                m2928d((byte) 1, (byte) 0);
            }
        }
    }

    /* renamed from: c */
    public static int m2926c() {
        int a = bhp.m3053a(bev.m2854a(bet.m2847a().f3120b, bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("TOKEN_STATUS_TAG"), true).f3270h);
        int[] iArr = {1, 2, 3, 4, 5};
        int i = 0;
        while (i < 5) {
            int i2 = iArr[i];
            if (i2 == 0) {
                throw null;
            } else if (a == i2) {
                return i2;
            } else {
                i++;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public static void m2928d(byte b, byte b2) {
        byte[] bArr = (byte[]) bes.m2844a("MOBILE_CVM_RESULTS");
        if (bArr != null) {
            bArr[b] = b2;
            bes.m2845a("MOBILE_CVM_RESULTS", bArr);
        }
    }

    /* renamed from: a */
    public static void m2921a() {
        if (bes.m2844a("TR_NFC_LUPC_OBJ") == null && bes.m2844a("TR_MST_LUPC_OBJ") == null) {
            List a = bev.m2855a(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"));
            List a2 = bev.m2855a(beu.m2849a(), bgt.m2993a("MST_LUPC_DGI"), bgt.m2993a("MST_LUPC_TAG"));
            if (a.size() > 0) {
                bes.m2845a("TR_NFC_LUPC_OBJ", (bhw) bev.m2854a(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"), true));
                beu.m2850a(bev.m2860b(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG")));
            }
            if (a2.size() > 0) {
                bes.m2845a("TR_MST_LUPC_OBJ", (bhv) bev.m2854a(beu.m2849a(), bgt.m2993a("MST_LUPC_DGI"), bgt.m2993a("MST_LUPC_TAG"), true));
                beu.m2850a(bev.m2860b(beu.m2849a(), bgt.m2993a("MST_LUPC_DGI"), bgt.m2993a("MST_LUPC_TAG")));
            }
            if (bev.m2855a(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG")).size() > 0) {
                bhw bhw = (bhw) bev.m2854a(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"), true);
                if (bhw != null) {
                    beu.m2851a("RUNNING_ATC", bia.m3070a(bhw.f3253b));
                    if (bhw.f3253b.compareToIgnoreCase("FFFF") == 0) {
                        m2922a(5);
                        return;
                    }
                    return;
                }
                return;
            }
            bes.m2845a("BLOCK_IN_CLOSE", (short) -23238);
        }
    }

    /* renamed from: c */
    public static void m2927c(byte b, byte b2) {
        byte[] bArr = (byte[]) bes.m2844a("TR_CVR");
        if (bArr != null) {
            bArr[b] = (byte) (b2 | bArr[b]);
            bes.m2845a("TR_CVR", bArr);
        }
    }

    /* renamed from: b */
    public static void m2925b(byte b, byte b2) {
        byte[] bArr = (byte[]) bes.m2844a("TR_CVR");
        if (bArr != null) {
            bArr[b] = (byte) (((byte) (b2 ^ -1)) & bArr[b]);
            bes.m2845a("TR_CVR", bArr);
        }
    }

    /* renamed from: a */
    public static void m2922a(int i) {
        if (m2926c() != 5 && m2926c() != 3) {
            bet a = bet.m2847a();
            bia a2 = bev.m2854a(a.f3120b, bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("TOKEN_STATUS_TAG"), true);
            bhz b = bev.m2860b(a.f3120b, bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("TOKEN_STATUS_TAG"));
            String valueOf = String.valueOf(a2.f3270h);
            if (valueOf.length() == 0) {
                new String("::PaymentUtils::setTokenStatus::tokenStatus::before::");
            } else {
                "::PaymentUtils::setTokenStatus::tokenStatus::before::".concat(valueOf);
            }
            String a3 = bhp.m3055a(i);
            String valueOf2 = String.valueOf(a3);
            if (valueOf2.length() == 0) {
                new String("::PaymentUtils::setTokenStatus::tokenStatus::");
            } else {
                "::PaymentUtils::setTokenStatus::tokenStatus::".concat(valueOf2);
            }
            bev.m2856a().put(b, bia.m3070a(a3));
            String valueOf3 = String.valueOf(beu.m2848a("TOKEN_STATUS"));
            if (valueOf3.length() == 0) {
                new String("::PaymentUtils::setTokenStatus::metaDatatokenStatus::");
            } else {
                "::PaymentUtils::setTokenStatus::metaDatatokenStatus::".concat(valueOf3);
            }
            beu.m2851a("TOKEN_STATUS", bia.m3070a(a3));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    public static void m2923a(bha bha) {
        bgr bgr = bgs.f3191a;
        bgr.mo3119a("OPERATION_STATUS", true);
        bgr.mo3121a("OPERATION_STATUS", bha);
    }
}
