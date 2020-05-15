package p000;

import android.util.Log;
import java.util.List;

/* renamed from: bfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfp extends bfm {
    /* JADX WARN: Failed to insert an additional move for type inference into block B:1:0x000c */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:108:0x04ec */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String], assign insn: 0x0004: CONST_STR  (r2v0 ? I:java.lang.String) =  "core-hceclient" */
    /* JADX WARN: Type inference failed for: r2v2, assign insn: PHI: (r2v2 ?) = (r2v0 ?), (r2v7 ?), (r2v39 ?) binds: [B:1:0x000c, B:108:0x04ec, B:17:0x0174] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String], assign insn: 0x04ea: MOVE  (r2v7 ? I:?[OBJECT, ARRAY]) = (r20v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v39, assign insn: 0x0173: CONST  (r2v39 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007c, code lost:
        if (r9 == false) goto L_0x007e;
     */
    /* renamed from: a */
    public final void mo3074a() {
        String str;
        String str2;
        int i;
        boolean z;
        ? r2 = "core-hceclient";
        String str3 = "NFC_LUPC_TAG";
        bgr bgr = bgs.f3191a;
        try {
            bgl bgl = new bgl();
            bfu bfu = (bfu) bgr.mo3119a("TOKEN_DATA_HOLDER", false);
            int parseInt = Integer.parseInt(((bhw) bev.m2854a(bfu.f3131b, bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a(str3), true)).f3253b, 16);
            int parseInt2 = Integer.parseInt(beu.m2848a("MAX_ATC"), 16);
            StringBuilder sb = new StringBuilder(67);
            sb.append("::TokenUpdateDelegate::updateMetaDataMap::newLowestATC::");
            sb.append(parseInt);
            sb.toString();
            StringBuilder sb2 = new StringBuilder(73);
            sb2.append("::TokenUpdateDelegate::updateMetaDataMap::existingHighestATC::");
            sb2.append(parseInt2);
            sb2.toString();
            if (parseInt > parseInt2) {
                boolean c = mo3087c(bfu);
                boolean booleanValue = Boolean.valueOf(bev.m2862c("MST_SUPPORTED")).booleanValue();
                if (!booleanValue || c) {
                    if (booleanValue) {
                    }
                    if (bfm.m2897f(bfu)) {
                        String a = bfu.mo3092a(bgt.m2995b("ICC_CRT_dP1"));
                        StringBuilder sb3 = new StringBuilder(String.valueOf(a).length() + 1);
                        sb3.append('2');
                        sb3.append(a);
                        Object sb4 = sb3.toString();
                        String a2 = bfu.mo3092a(bgt.m2995b("ICC_CRT_dQ1"));
                        StringBuilder sb5 = new StringBuilder(String.valueOf(a2).length() + 1);
                        sb5.append('2');
                        sb5.append(a2);
                        Object sb6 = sb5.toString();
                        String a3 = bfu.mo3092a(bgt.m2995b("ICC_CRT_P"));
                        StringBuilder sb7 = new StringBuilder(String.valueOf(a3).length() + 1);
                        sb7.append('2');
                        sb7.append(a3);
                        Object sb8 = sb7.toString();
                        String a4 = bfu.mo3092a(bgt.m2995b("ICC_CRT_Q"));
                        StringBuilder sb9 = new StringBuilder(String.valueOf(a4).length() + 1);
                        sb9.append('2');
                        sb9.append(a4);
                        Object sb10 = sb9.toString();
                        String a5 = bfu.mo3092a(bgt.m2995b("ICC_CRT_PQ"));
                        StringBuilder sb11 = new StringBuilder(String.valueOf(a5).length() + 1);
                        sb11.append('2');
                        sb11.append(a5);
                        Object sb12 = sb11.toString();
                        String str4 = "0";
                        if (bfu.mo3094b(bgt.m2995b("ICC_CRT_MOD"))) {
                            String a6 = bfu.mo3092a(bgt.m2995b("ICC_CRT_MOD"));
                            StringBuilder sb13 = new StringBuilder(String.valueOf(a6).length() + 1);
                            sb13.append('2');
                            sb13.append(a6);
                            str4 = sb13.toString();
                        }
                        str2 = r2;
                        r2 = 1;
                        try {
                            String str5 = bfu.mo3091a(bgt.m2993a("ICC_DYNAMIC_AUTHENTICATION_DGI"), bgt.m2993a("ICC_PUBLIC_KEY_EXPONENT_TAG"), true).f3270h;
                            StringBuilder sb14 = new StringBuilder(String.valueOf(str5).length() + 1);
                            sb14.append('2');
                            sb14.append(str5);
                            Object sb15 = sb14.toString();
                            byte[] a7 = bgz.m3020a(sb4, sb6, sb8, sb10, sb12, str4, sb15);
                            String valueOf = String.valueOf(sb4);
                            if (valueOf.length() == 0) {
                                new String("::TokenUpdateDelegate::perso::icc_CRT_dP1::");
                            } else {
                                "::TokenUpdateDelegate::perso::icc_CRT_dP1::".concat(valueOf);
                            }
                            String valueOf2 = String.valueOf(sb6);
                            if (valueOf2.length() == 0) {
                                new String("::TokenUpdateDelegate::perso::icc_CRT_dQ1::");
                            } else {
                                "::TokenUpdateDelegate::perso::icc_CRT_dQ1::".concat(valueOf2);
                            }
                            String valueOf3 = String.valueOf(sb8);
                            if (valueOf3.length() == 0) {
                                new String("::TokenUpdateDelegate::perso::icc_CRT_P::");
                            } else {
                                "::TokenUpdateDelegate::perso::icc_CRT_P::".concat(valueOf3);
                            }
                            String valueOf4 = String.valueOf(sb10);
                            if (valueOf4.length() == 0) {
                                new String("::TokenUpdateDelegate::perso::icc_CRT_Q::");
                            } else {
                                "::TokenUpdateDelegate::perso::icc_CRT_Q::".concat(valueOf4);
                            }
                            String valueOf5 = String.valueOf(sb12);
                            if (valueOf5.length() == 0) {
                                new String("::TokenUpdateDelegate::perso::icc_CRT_PQ::");
                            } else {
                                "::TokenUpdateDelegate::perso::icc_CRT_PQ::".concat(valueOf5);
                            }
                            String valueOf6 = String.valueOf(str4);
                            if (valueOf6.length() == 0) {
                                new String("::TokenUpdateDelegate::perso::iccModulus::");
                            } else {
                                "::TokenUpdateDelegate::perso::iccModulus::".concat(valueOf6);
                            }
                            String valueOf7 = String.valueOf(sb15);
                            if (valueOf7.length() == 0) {
                                new String("::TokenUpdateDelegate::perso::iccPKExponent::");
                            } else {
                                "::TokenUpdateDelegate::perso::iccPKExponent::".concat(valueOf7);
                            }
                            String str6 = new String(a7);
                            if (str6.length() == 0) {
                                new String("::TokenUpdateDelegate::perso::srcBuffer::");
                            } else {
                                "::TokenUpdateDelegate::perso::srcBuffer::".concat(str6);
                            }
                            int parseInt3 = Integer.parseInt(bev.m2854a(bev.m2856a(), bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("ICC_KEY_LENGTH_TAG"), true).f3270h, 16);
                            StringBuilder sb16 = new StringBuilder(49);
                            sb16.append("::TokenUpdateDelegate::perso::keyLen::");
                            sb16.append(parseInt3);
                            sb16.toString();
                            byte[] a8 = bhb.m3023a();
                            String a9 = bhp.m3056a(a8);
                            String valueOf8 = String.valueOf(a9);
                            if (valueOf8.length() == 0) {
                                new String("::TokenUpdateDelegate::perso::lockCode::");
                            } else {
                                "::TokenUpdateDelegate::perso::lockCode::".concat(valueOf8);
                            }
                            bia bia = new bia();
                            bia.f3270h = a9;
                            bev.m2858a("LOCK_CODE", bia);
                            bew.m2863a(bgl.mo3101a(parseInt3, a7, a8));
                        } catch (bfq e) {
                            e = e;
                            str = str2;
                            Log.e(str, "::TokenUpdateDelegate::catch::", e);
                            throw e;
                        }
                    } else {
                        str2 = r2;
                    }
                    List a10 = bfu.mo3093a(bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a(str3));
                    List a11 = bfu.mo3093a(bgt.m2993a("MST_LUPC_DGI"), bgt.m2993a("MST_LUPC_TAG"));
                    if (c) {
                        z = a10.size() == a11.size();
                        i = 5;
                    } else {
                        z = true;
                        i = 4;
                    }
                    if (z) {
                        String[] strArr = new String[(a10.size() * i)];
                        bhv bhv = null;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < a10.size()) {
                            bhw bhw = (bhw) bfu.mo3090a((bhz) a10.get(i2));
                            if (c) {
                                bhv = (bhv) bfu.mo3090a((bhz) a11.get(i2));
                                if (!bhw.f3253b.equals(bhv.f3253b)) {
                                    throw new bfq(bha.NFC_ATC_AND_MST_ATC_MISMATCH);
                                }
                            }
                            String b = bhw.mo3135b();
                            int i4 = i3 + 1;
                            List list = a10;
                            String hexString = Integer.toHexString(b.length() / 2);
                            List list2 = a11;
                            String str7 = str3;
                            StringBuilder sb17 = new StringBuilder(String.valueOf(hexString).length() + 1);
                            sb17.append('2');
                            sb17.append(hexString);
                            strArr[i3] = sb17.toString();
                            int i5 = i4 + 1;
                            StringBuilder sb18 = new StringBuilder(String.valueOf(b).length() + 1);
                            sb18.append('2');
                            sb18.append(b);
                            strArr[i4] = sb18.toString();
                            int i6 = i5 + 1;
                            String c2 = bhw.mo3136c();
                            StringBuilder sb19 = new StringBuilder(String.valueOf(c2).length() + 1);
                            sb19.append('2');
                            sb19.append(c2);
                            strArr[i5] = sb19.toString();
                            int i7 = i6 + 1;
                            String str8 = bhw.f3253b;
                            StringBuilder sb20 = new StringBuilder(String.valueOf(str8).length() + 1);
                            sb20.append('2');
                            sb20.append(str8);
                            strArr[i6] = sb20.toString();
                            if (c) {
                                String a12 = bhv.mo3133a();
                                StringBuilder sb21 = new StringBuilder(String.valueOf(a12).length() + 1);
                                sb21.append('2');
                                sb21.append(a12);
                                strArr[i7] = sb21.toString();
                                i7++;
                            }
                            i2++;
                            i3 = i7;
                            str3 = str7;
                            a10 = list;
                            a11 = list2;
                        }
                        String str9 = str3;
                        byte[] a13 = bgz.m3020a(strArr);
                        String str10 = new String(a13);
                        if (str10.length() == 0) {
                            new String("::TokenUpdateDelegate::update::srcBuffer::");
                        } else {
                            "::TokenUpdateDelegate::update::srcBuffer::".concat(str10);
                        }
                        bew.m2863a(bgl.mo3110d(a13));
                        String valueOf9 = String.valueOf(bfu.f3132c);
                        if (valueOf9.length() == 0) {
                            new String("::TokenUpdateDelegate::signature::tokenDataHolder.getTlsClearTokenData()::");
                        } else {
                            "::TokenUpdateDelegate::signature::tokenDataHolder.getTlsClearTokenData()::".concat(valueOf9);
                        }
                        String a14 = bgw.m2998a(bfu.f3132c, true);
                        StringBuilder sb22 = new StringBuilder(String.valueOf(a14).length() + 1);
                        sb22.append('1');
                        sb22.append(a14);
                        byte[] a15 = bgz.m3020a(sb22.toString());
                        String str11 = new String(a15);
                        if (str11.length() == 0) {
                            new String("::TokenUpdateDelegate::signature::srcBuffer::");
                        } else {
                            "::TokenUpdateDelegate::signature::srcBuffer::".concat(str11);
                        }
                        byte[] bArr = new byte[bew.m2864b(a15.length)];
                        bew.m2863a(bgl.mo3113f(a15, bArr));
                        if (bgl.m2964b()) {
                            bArr = bgl.mo3114a();
                        }
                        String str12 = new String(bArr);
                        if (str12.length() == 0) {
                            new String("::TokenUpdateDelegate::signature::destBuffer::");
                        } else {
                            "::TokenUpdateDelegate::signature::destBuffer::".concat(str12);
                        }
                        bgr.mo3121a("TOKEN_DATA_SIGNATURE", bgz.m3021a(bArr)[0].toString());
                        mo3085a(bfu);
                        mo3089e(bfu);
                        bfm.m2898g(bfu);
                        if (bev.m2855a(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a(str9)).size() <= 0) {
                            return;
                        }
                        if (bgd.m2926c() == 4 || bgd.m2926c() == 2) {
                            bgd.m2922a(1);
                            return;
                        }
                        return;
                    }
                    r2 = str2;
                    Log.e(r2, "::TokenUpdateDelegate::update::NFC AND MST LUPC COUNT MISMATCH!!");
                    throw new bfq(bha.NFC_AND_MST_LUPC_COUNT_MISMATCH);
                }
                throw new bfq(bha.MST_DATA_NOT_PRESENT_IN_PROVISIONED_OR_UPDATE_DATA);
            }
            throw new bfq(bha.NEW_ATC_IS_LESS_THAN_CURRENT_HIGHEST_ATC);
        } catch (bfq e2) {
            e = e2;
            str = r2;
            Log.e(str, "::TokenUpdateDelegate::catch::", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo3086b(bfu bfu) {
        bia bia = new bia();
        bia.f3270h = "false";
        beu.m2849a().put(bev.m2859b("REFRESH_REQUIRED"), bia);
        bia bia2 = new bia();
        bia2.f3270h = ((bhw) bev.m2854a(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"), true)).f3253b;
        beu.m2849a().put(bev.m2859b("RUNNING_ATC"), bia2);
        for (bhz bhz : beu.m2849a().keySet()) {
            String valueOf = String.valueOf(bhz);
            String valueOf2 = String.valueOf(beu.m2849a().get(bhz));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
            sb.append("::: TokenUpdateDelegate  MetaData Map  ::AFTER::");
            sb.append(valueOf);
            sb.append("-- > ");
            sb.append(valueOf2);
            sb.toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final byte[] mo3088d(bfu bfu) {
        return bgx.m3011a(bev.m2854a(bet.m2847a().f3120b, bgt.m2993a("RISK_PARAMS_DGI"), bgt.m2993a("TAG_XPM_CONFIG"), true).f3270h);
    }
}
