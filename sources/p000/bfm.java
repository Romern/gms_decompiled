package p000;

import android.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: bfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfm extends bew {
    /* renamed from: f */
    protected static final boolean m2897f(bfu bfu) {
        bia a = bfu.mo3091a(bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("ICC_KEY_LENGTH_TAG"), true);
        if (a == null) {
            a = bev.m2854a(bev.m2856a(), bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("ICC_KEY_LENGTH_TAG"), true);
        }
        if (!bfu.mo3094b(bgt.m2995b("ICC_CRT_dP1")) || !bfu.mo3094b(bgt.m2995b("ICC_CRT_dQ1")) || !bfu.mo3094b(bgt.m2995b("ICC_CRT_P")) || !bfu.mo3094b(bgt.m2995b("ICC_CRT_Q")) || !bfu.mo3094b(bgt.m2995b("ICC_CRT_PQ")) || !bfu.mo3094b(bgt.m2993a("ICC_DYNAMIC_AUTHENTICATION_DGI")) || a == null || a.f3270h == null) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: g */
    protected static final void m2898g(bfu bfu) {
        bet bet = (bet) bgs.f3191a.mo3119a("DATA_CONTEXT", false);
        bet.f3119a.putAll(bfu.f3130a);
        bet.f3120b.putAll(bfu.f3131b);
        bfu.f3130a.clear();
        bfu.f3131b.clear();
        String valueOf = String.valueOf(bfu.f3131b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
        sb.append("::TokenPersoDelegate::setDataContext::tokenDataHolder::tagMap::");
        sb.append(valueOf);
        sb.toString();
        String valueOf2 = String.valueOf(bfu.f3130a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 63);
        sb2.append("::TokenPersoDelegate::setDataContext::tokenDataHolder::dgiMap::");
        sb2.append(valueOf2);
        sb2.toString();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:148:0x0580 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:254:0x07c4 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:232:0x0716 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List], assign insn: PHI: (r3v10 ?) = (r3v60 ?), (r3v79 ?) binds: [B:146:0x0574, B:127:?] */
    /* JADX WARN: Type inference failed for: r3v11, assign insn: PHI: (r3v11 ?) = (r3v10 ?), (r3v29 ?), (r3v29 ?), (r3v34 ?) binds: [B:148:0x0580, B:254:0x07c4, B:245:0x0797, B:232:0x0716] */
    /* JADX WARN: Type inference failed for: r3v29, assign insn: PHI: (r3v29 ?) = (r3v32 ?), (r3v42 ?), (r3v51 ?) binds: [B:235:0x071a, B:224:0x0705, B:193:0x067d] */
    /* JADX WARN: Type inference failed for: r3v32, assign insn: 0x071a: MOVE  (r3v32 ? I:?[OBJECT, ARRAY]) = (r22v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.String], assign insn: 0x0713: MOVE  (r3v34 ? I:?[OBJECT, ARRAY]) = (r22v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r3v42, assign insn: 0x0705: MOVE  (r3v42 ? I:?[OBJECT, ARRAY]) = (r22v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r3v51, assign insn: 0x067d: MOVE  (r3v51 ? I:?[OBJECT, ARRAY]) = (r22v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r3v60, assign insn: 0x0578: MOVE  (r3v60 ? I:?[OBJECT, ARRAY]) = (r24v0 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r3v79, assign insn: ?: MOVE  (r3v79 ?) = (r3v8 java.util.List) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x06a1, code lost:
        if ((r6 & 31) == 31) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x06a3, code lost:
        r3 = r3 + 1;
        r6 = r6 & 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        r6 = p000.bgx.m3006a(r2, r3);
        r3 = r3 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x06ae, code lost:
        r7 = r2[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x06b2, code lost:
        if (r7 != -127) goto L_0x06bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06b4, code lost:
        r3 = r3 + 1;
        r7 = r2[r3] & 255;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x06bd, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x06c1, code lost:
        if (r7 == -126) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x06c3, code lost:
        r7 = r7 & 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x06c6, code lost:
        r7 = p000.bgx.m3006a(r2, r3);
        r3 = r3 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x06ce, code lost:
        if (r6 == 87) goto L_0x06d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x06d0, code lost:
        if (r4 != false) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x06d2, code lost:
        r3 = r3 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x06d4, code lost:
        r2 = (p000.bgx.m3005a(r2, r3, r7).toUpperCase().indexOf(68) + 1) + ((r3 + r3) + 4);
        r3 = new java.lang.StringBuilder(49);
        r3.append("::TokenPersoDelegate::_iServCdOffset::");
        r3.append(r2);
        r3.toString();
        p000.bev.m2858a("SERVICE_CODE_MS_OFFSET", p000.bia.m3070a(java.lang.String.valueOf(r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0705, code lost:
        r3 = r22;
     */
    /* renamed from: a */
    public void mo3074a() {
        String str;
        bfq bfq;
        int i;
        boolean z;
        String str2;
        String str3;
        byte b;
        String str4;
        String str5;
        ? r3;
        boolean z2;
        String str6 = "core-hceclient";
        bgr bgr = bgs.f3191a;
        try {
            bgl bgl = new bgl();
            bfu bfu = (bfu) bgr.mo3119a("TOKEN_DATA_HOLDER", false);
            String str7 = bfu.mo3091a(bgt.m2993a("RISK_PARAMS_DGI"), bgt.m2993a("STARTING_ATC_TAG"), true).f3270h;
            StringBuilder sb = new StringBuilder(String.valueOf(str7).length() + 1);
            sb.append('2');
            sb.append(str7);
            Object sb2 = sb.toString();
            String valueOf = String.valueOf(sb2);
            if (valueOf.length() == 0) {
                try {
                    new String("::nfclupcTagValue::atc::");
                } catch (bfq e) {
                    bfq = e;
                    str = str6;
                }
            } else {
                "::nfclupcTagValue::atc::".concat(valueOf);
            }
            bia a = bfu.mo3091a(bgt.m2993a("EMV_AIP_DGI"), bgt.m2993a("EMV_AIP_TAG"), true);
            String str8 = "20000";
            if (a != null) {
                String str9 = a.f3270h;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str9).length() + 1);
                sb3.append('2');
                sb3.append(str9);
                str8 = sb3.toString();
            }
            String valueOf2 = String.valueOf(str8);
            if (valueOf2.length() == 0) {
                new String("::TokenPersoDelegate::init::emvAIP::");
            } else {
                "::TokenPersoDelegate::init::emvAIP::".concat(valueOf2);
            }
            String str10 = "PAYMENT_PARAMETERS_DGI";
            String str11 = bfu.mo3091a(bgt.m2993a("RISK_PARAMS_DGI"), bgt.m2993a("CRYPTOGRAM_INFORMATION_DATA_TAG"), true).f3270h;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str11).length() + 1);
            sb4.append('2');
            sb4.append(str11);
            Object sb5 = sb4.toString();
            String valueOf3 = String.valueOf(sb5);
            if (valueOf3.length() == 0) {
                new String("::TokenPersoDelegate::init::cid::");
            } else {
                "::TokenPersoDelegate::init::cid::".concat(valueOf3);
            }
            String str12 = "ISSUER_APPLICATION_DATA_TAG";
            String a2 = bgx.m3002a(bfu.mo3091a(bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("LUPC_THRESHOLD_TAG"), true).f3270h, 1, 1);
            StringBuilder sb6 = new StringBuilder(String.valueOf(a2).length() + 1);
            sb6.append('2');
            sb6.append(a2);
            Object sb7 = sb6.toString();
            String valueOf4 = String.valueOf(sb7);
            if (valueOf4.length() == 0) {
                new String("::TokenPersoDelegate::init::nfcLUPCListSize::");
            } else {
                "::TokenPersoDelegate::init::nfcLUPCListSize::".concat(valueOf4);
            }
            String str13 = "200";
            if (mo3087c(bfu)) {
                String a3 = bgx.m3002a(bfu.mo3091a(bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("LUPC_THRESHOLD_TAG"), true).f3270h, 1, 1);
                StringBuilder sb8 = new StringBuilder(String.valueOf(a3).length() + 1);
                sb8.append('2');
                sb8.append(a3);
                str13 = sb8.toString();
            }
            String valueOf5 = String.valueOf(str13);
            if (valueOf5.length() == 0) {
                new String("::TokenPersoDelegate::init::mstLUPCListSize::");
            } else {
                "::TokenPersoDelegate::init::mstLUPCListSize::".concat(valueOf5);
            }
            byte[] a4 = bgz.m3020a(sb2, str8, "201", sb5, sb7, str13);
            String str14 = new String(a4);
            if (str14.length() == 0) {
                new String("::TokenPersoDelegate::init::srcBuffer::");
            } else {
                "::TokenPersoDelegate::init::srcBuffer::".concat(str14);
            }
            bew.m2863a(new bgl().mo3108c(a4));
            if (m2897f(bfu)) {
                String a5 = bfu.mo3092a(bgt.m2995b("ICC_CRT_dP1"));
                StringBuilder sb9 = new StringBuilder(String.valueOf(a5).length() + 1);
                sb9.append('2');
                sb9.append(a5);
                Object sb10 = sb9.toString();
                String a6 = bfu.mo3092a(bgt.m2995b("ICC_CRT_dQ1"));
                StringBuilder sb11 = new StringBuilder(String.valueOf(a6).length() + 1);
                sb11.append('2');
                sb11.append(a6);
                Object sb12 = sb11.toString();
                String a7 = bfu.mo3092a(bgt.m2995b("ICC_CRT_P"));
                StringBuilder sb13 = new StringBuilder(String.valueOf(a7).length() + 1);
                sb13.append('2');
                sb13.append(a7);
                Object sb14 = sb13.toString();
                String a8 = bfu.mo3092a(bgt.m2995b("ICC_CRT_Q"));
                StringBuilder sb15 = new StringBuilder(String.valueOf(a8).length() + 1);
                sb15.append('2');
                sb15.append(a8);
                Object sb16 = sb15.toString();
                String a9 = bfu.mo3092a(bgt.m2995b("ICC_CRT_PQ"));
                StringBuilder sb17 = new StringBuilder(String.valueOf(a9).length() + 1);
                sb17.append('2');
                sb17.append(a9);
                Object sb18 = sb17.toString();
                String str15 = "0";
                if (bfu.mo3094b(bgt.m2995b("ICC_CRT_MOD"))) {
                    String a10 = bfu.mo3092a(bgt.m2995b("ICC_CRT_MOD"));
                    StringBuilder sb19 = new StringBuilder(String.valueOf(a10).length() + 1);
                    sb19.append('2');
                    sb19.append(a10);
                    str15 = sb19.toString();
                }
                String str16 = bfu.mo3091a(bgt.m2993a("ICC_DYNAMIC_AUTHENTICATION_DGI"), bgt.m2993a("ICC_PUBLIC_KEY_EXPONENT_TAG"), true).f3270h;
                StringBuilder sb20 = new StringBuilder(String.valueOf(str16).length() + 1);
                sb20.append('2');
                sb20.append(str16);
                Object sb21 = sb20.toString();
                byte[] a11 = bgz.m3020a(sb10, sb12, sb14, sb16, sb18, str15, sb21);
                String valueOf6 = String.valueOf(sb10);
                if (valueOf6.length() == 0) {
                    new String("::TokenPersoDelegate::perso::icc_CRT_dP1::");
                } else {
                    "::TokenPersoDelegate::perso::icc_CRT_dP1::".concat(valueOf6);
                }
                String valueOf7 = String.valueOf(sb12);
                if (valueOf7.length() == 0) {
                    new String("::TokenPersoDelegate::perso::icc_CRT_dQ1::");
                } else {
                    "::TokenPersoDelegate::perso::icc_CRT_dQ1::".concat(valueOf7);
                }
                String valueOf8 = String.valueOf(sb14);
                if (valueOf8.length() == 0) {
                    new String("::TokenPersoDelegate::perso::icc_CRT_P::");
                } else {
                    "::TokenPersoDelegate::perso::icc_CRT_P::".concat(valueOf8);
                }
                String valueOf9 = String.valueOf(sb16);
                if (valueOf9.length() == 0) {
                    new String("::TokenPersoDelegate::perso::icc_CRT_Q::");
                } else {
                    "::TokenPersoDelegate::perso::icc_CRT_Q::".concat(valueOf9);
                }
                String valueOf10 = String.valueOf(sb18);
                if (valueOf10.length() == 0) {
                    new String("::TokenPersoDelegate::perso::icc_CRT_PQ::");
                } else {
                    "::TokenPersoDelegate::perso::icc_CRT_PQ::".concat(valueOf10);
                }
                String valueOf11 = String.valueOf(str15);
                if (valueOf11.length() == 0) {
                    new String("::TokenPersoDelegate::perso::iccModulus::");
                } else {
                    "::TokenPersoDelegate::perso::iccModulus::".concat(valueOf11);
                }
                String valueOf12 = String.valueOf(sb21);
                if (valueOf12.length() == 0) {
                    new String("::TokenPersoDelegate::perso::iccPKExponent::");
                } else {
                    "::TokenPersoDelegate::perso::iccPKExponent::".concat(valueOf12);
                }
                String str17 = new String(a11);
                if (str17.length() == 0) {
                    new String("::TokenPersoDelegate::perso::srcBuffer::");
                } else {
                    "::TokenPersoDelegate::perso::srcBuffer::".concat(str17);
                }
                int parseInt = Integer.parseInt(bfu.mo3091a(bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("ICC_KEY_LENGTH_TAG"), true).f3270h, 16);
                StringBuilder sb22 = new StringBuilder(48);
                sb22.append("::TokenPersoDelegate::perso::keyLen::");
                sb22.append(parseInt);
                sb22.toString();
                byte[] a12 = bhb.m3023a();
                String a13 = bhp.m3056a(a12);
                String valueOf13 = String.valueOf(a13);
                if (valueOf13.length() == 0) {
                    new String("::TokenPersoDelegate::perso::lockCode::");
                } else {
                    "::TokenPersoDelegate::perso::lockCode::".concat(valueOf13);
                }
                bia bia = new bia();
                bia.f3270h = a13;
                bfu.f3131b.put(bev.m2859b("LOCK_CODE"), bia);
                bew.m2863a(bgl.mo3101a(parseInt, a11, a12));
            }
            boolean c = mo3087c(bfu);
            StringBuilder sb23 = new StringBuilder(52);
            sb23.append("::TokenPersoDelegate::perso::mstDataAvailable::");
            sb23.append(c);
            sb23.toString();
            bia bia2 = new bia();
            bia2.f3270h = String.valueOf(c);
            bfu.f3131b.put(bev.m2859b("MST_SUPPORTED"), bia2);
            List a14 = bfu.mo3093a(bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"));
            List a15 = bfu.mo3093a(bgt.m2993a("MST_LUPC_DGI"), bgt.m2993a("MST_LUPC_TAG"));
            if (c) {
                z = a14.size() == a15.size();
                i = 5;
            } else {
                z = true;
                i = 4;
            }
            if (z) {
                String[] strArr = new String[(a14.size() * i)];
                int i2 = 0;
                int i3 = 0;
                bhv bhv = null;
                ? r32 = a14;
                while (i2 < r32.size()) {
                    bhw bhw = (bhw) bfu.mo3090a((bhz) r32.get(i2));
                    if (c) {
                        bhv = (bhv) bfu.mo3090a((bhz) a15.get(i2));
                        if (!bhw.f3253b.equals(bhv.f3253b)) {
                            throw new bfq(bha.NFC_ATC_AND_MST_ATC_MISMATCH);
                        }
                    }
                    String b2 = bhw.mo3135b();
                    int i4 = i3 + 1;
                    Object obj = r32;
                    String hexString = Integer.toHexString(b2.length() / 2);
                    List list = a15;
                    str2 = str6;
                    try {
                        StringBuilder sb24 = new StringBuilder(String.valueOf(hexString).length() + 1);
                        sb24.append('2');
                        sb24.append(hexString);
                        strArr[i3] = sb24.toString();
                        int i5 = i4 + 1;
                        StringBuilder sb25 = new StringBuilder(String.valueOf(b2).length() + 1);
                        sb25.append('2');
                        sb25.append(b2);
                        strArr[i4] = sb25.toString();
                        int i6 = i5 + 1;
                        String c2 = bhw.mo3136c();
                        StringBuilder sb26 = new StringBuilder(String.valueOf(c2).length() + 1);
                        sb26.append('2');
                        sb26.append(c2);
                        strArr[i5] = sb26.toString();
                        int i7 = i6 + 1;
                        String str18 = bhw.f3253b;
                        StringBuilder sb27 = new StringBuilder(String.valueOf(str18).length() + 1);
                        sb27.append('2');
                        sb27.append(str18);
                        strArr[i6] = sb27.toString();
                        if (!c) {
                            i3 = i7;
                        } else {
                            int i8 = i7 + 1;
                            String a16 = bhv.mo3133a();
                            StringBuilder sb28 = new StringBuilder(String.valueOf(a16).length() + 1);
                            sb28.append('2');
                            sb28.append(a16);
                            strArr[i7] = sb28.toString();
                            i3 = i8;
                        }
                        i2++;
                        str6 = str2;
                        r32 = obj;
                        a15 = list;
                    } catch (bfq e2) {
                        bfq = e2;
                        str = str2;
                    }
                }
                str2 = str6;
                try {
                    byte[] a17 = bgz.m3020a(strArr);
                    String str19 = new String(a17);
                    if (str19.length() == 0) {
                        new String("::TokenPersoDelegate::update::srcBuffer::");
                    } else {
                        "::TokenPersoDelegate::update::srcBuffer::".concat(str19);
                    }
                    bew.m2863a(bgl.mo3110d(a17));
                    String valueOf14 = String.valueOf(bfu.f3132c);
                    if (valueOf14.length() == 0) {
                        new String("::TokenPersoDelegate::signature::tokenDataHolder.getTlsClearTokenData()::");
                    } else {
                        "::TokenPersoDelegate::signature::tokenDataHolder.getTlsClearTokenData()::".concat(valueOf14);
                    }
                    String a18 = bgw.m2998a(bfu.f3132c, true);
                    StringBuilder sb29 = new StringBuilder(String.valueOf(a18).length() + 1);
                    sb29.append('1');
                    sb29.append(a18);
                    byte[] a19 = bgz.m3020a(sb29.toString());
                    String str20 = new String(a19);
                    if (str20.length() == 0) {
                        new String("::TokenPersoDelegate::signature::srcBuffer::");
                    } else {
                        "::TokenPersoDelegate::signature::srcBuffer::".concat(str20);
                    }
                    byte[] bArr = new byte[bew.m2864b(a19.length)];
                    bew.m2863a(bgl.mo3113f(a19, bArr));
                    if (bgl.m2964b()) {
                        bArr = bgl.mo3114a();
                    }
                    String str21 = new String(bArr);
                    if (str21.length() == 0) {
                        new String("::TokenPersoDelegate::signature::destBuffer::");
                    } else {
                        "::TokenPersoDelegate::signature::destBuffer::".concat(str21);
                    }
                    String obj2 = bgz.m3021a(bArr)[0].toString();
                    String valueOf15 = String.valueOf(obj2);
                    if (valueOf15.length() == 0) {
                        new String("::TokenPersoDelegate::signature::tokenDataSignature::");
                    } else {
                        "::TokenPersoDelegate::signature::tokenDataSignature::".concat(valueOf15);
                    }
                    bgr.mo3121a("TOKEN_DATA_SIGNATURE", obj2);
                    mo3085a(bfu);
                    mo3089e(bfu);
                    m2898g(bfu);
                    mo3084b();
                    String a20 = bgt.m2993a("SFI1_REC1_DGI_MS");
                    if (bev.m2861b().containsKey(a20)) {
                        str3 = (String) bev.m2861b().get(a20);
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        byte[] a21 = bgx.m3011a(str3);
                        int i9 = 0;
                        while (true) {
                            if (i9 >= a21.length) {
                                r3 = str2;
                                break;
                            }
                            if ((a21[i9] & 32) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            while (true) {
                                byte b3 = a21[i9];
                                if (b3 != 0) {
                                    if (b3 != -1) {
                                        break;
                                    }
                                }
                                if (i9 < a21.length - 2) {
                                    i9++;
                                } else {
                                    r32 = str2;
                                    try {
                                        throw new bfq((String) r32, (byte[]) null);
                                    } catch (bfq e3) {
                                        e = e3;
                                        str = r32;
                                        bfq = e;
                                        Log.e(str, "::TokenPersoDelegate::catch::", bfq);
                                        throw bfq;
                                    }
                                }
                            }
                        }
                    } else {
                        r3 = str2;
                    }
                    bia a22 = bev.m2854a(bev.m2856a(), bgt.m2993a("ISSUER_APPLICATION_DATA_MS_DGI"), bgt.m2993a(str12), true);
                    bia a23 = bev.m2854a(bev.m2856a(), bgt.m2993a("ISSUER_APPLICATION_DATA_EMV_DGI"), bgt.m2993a(str12), true);
                    if (a22 != null) {
                        bev.m2858a("MS_CVN_VALUE", bia.m3070a(bgx.m3002a(a22.f3270h, 2, 1)));
                    }
                    if (a23 != null) {
                        bev.m2858a("EMV_CVN_VALUE", bia.m3070a(bgx.m3002a(a23.f3270h, 2, 1)));
                    }
                    bet a24 = bet.m2847a();
                    bhx bhx = (bhx) bev.m2854a(a24.f3120b, bgt.m2993a(str10), bgt.m2993a("PPSE_TAG_V1"), true);
                    bhx bhx2 = (bhx) bev.m2854a(a24.f3120b, bgt.m2993a(str10), bgt.m2993a("PPSE_TAG_V2"), false);
                    String str22 = bhx != null ? bhx.f3260b : "";
                    String str23 = bhx2 != null ? bhx2.f3260b : "";
                    String str24 = (String) a24.f3119a.get(bgt.m2993a("SELECT_AID_DGI"));
                    bia a25 = bev.m2854a(a24.f3120b, bgt.m2993a(str10), bgt.m2993a("PDOL_TAG"), false);
                    if (a25 != null) {
                        String valueOf16 = String.valueOf(bhp.m3058b(a25.f3270h));
                        str4 = valueOf16.length() == 0 ? new String("9F38") : "9F38".concat(valueOf16);
                        b = (byte) (str4.length() / 2);
                    } else {
                        str4 = "";
                        b = 0;
                    }
                    byte[] a26 = bgx.m3011a(str24);
                    String str25 = "";
                    int i10 = 0;
                    while (true) {
                        int length = a26.length;
                        if (i10 < length) {
                            bgv a27 = bhn.m3050a(a26, i10, length, true);
                            String valueOf17 = String.valueOf(a27);
                            StringBuilder sb30 = new StringBuilder(String.valueOf(valueOf17).length() + 50);
                            sb30.append("::TokenPersoDelegate::prepareFCIResponse::dolTag::");
                            sb30.append(valueOf17);
                            sb30.toString();
                            if (a27 != null) {
                                i10 += a27.f3199f;
                                if (a27.f3198e) {
                                    String valueOf18 = String.valueOf(str25);
                                    String valueOf19 = String.valueOf(a27.f3194a.toUpperCase());
                                    String valueOf20 = String.valueOf(valueOf19.length() == 0 ? new String(valueOf18) : valueOf18.concat(valueOf19));
                                    String valueOf21 = String.valueOf(bgx.m3003a(a27.f3195b).toUpperCase());
                                    str25 = valueOf21.length() == 0 ? new String(valueOf20) : valueOf20.concat(valueOf21);
                                } else {
                                    if (a27.f3194a.compareToIgnoreCase("9F38") == 0) {
                                        if (str4.compareToIgnoreCase("") != 0) {
                                            String valueOf22 = String.valueOf(str25);
                                            String valueOf23 = String.valueOf(str4);
                                            str5 = valueOf23.length() == 0 ? new String(valueOf22) : valueOf22.concat(valueOf23);
                                            b = (byte) (b - (a27.f3195b + 3));
                                            i10 += a27.f3195b;
                                            str25 = str5;
                                        }
                                    }
                                    String valueOf24 = String.valueOf(str25);
                                    String valueOf25 = String.valueOf(a27.f3194a.toUpperCase());
                                    String valueOf26 = String.valueOf(valueOf25.length() == 0 ? new String(valueOf24) : valueOf24.concat(valueOf25));
                                    String valueOf27 = String.valueOf(bgx.m3003a(a27.f3195b).toUpperCase());
                                    String valueOf28 = String.valueOf(valueOf27.length() == 0 ? new String(valueOf26) : valueOf26.concat(valueOf27));
                                    String valueOf29 = String.valueOf(a27.f3196c.toUpperCase());
                                    str5 = valueOf29.length() == 0 ? new String(valueOf28) : valueOf28.concat(valueOf29);
                                    i10 += a27.f3195b;
                                    str25 = str5;
                                }
                                String valueOf30 = String.valueOf(str25);
                                if (valueOf30.length() == 0) {
                                    new String("::TokenPersoDelegate::prepareFCIResponse::a5Template::");
                                } else {
                                    "::TokenPersoDelegate::prepareFCIResponse::a5Template::".concat(valueOf30);
                                }
                            } else {
                                throw new bfq(bha.TLV_PARSING_FAILURE);
                            }
                        } else {
                            byte[] a28 = bgx.m3011a(str25);
                            a28[1] = (byte) (a28[1] + b);
                            String a29 = bgx.m3004a(a28);
                            String b4 = bhp.m3058b(str22);
                            StringBuilder sb31 = new StringBuilder(String.valueOf(b4).length() + 2 + String.valueOf(str24).length());
                            sb31.append("84");
                            sb31.append(b4);
                            sb31.append(str24);
                            String valueOf31 = String.valueOf(bhp.m3058b(sb31.toString()));
                            String str26 = valueOf31.length() == 0 ? new String("6F") : "6F".concat(valueOf31);
                            String b5 = bhp.m3058b(str23);
                            StringBuilder sb32 = new StringBuilder(String.valueOf(b5).length() + 2 + String.valueOf(a29).length());
                            sb32.append("84");
                            sb32.append(b5);
                            sb32.append(a29);
                            String valueOf32 = String.valueOf(bhp.m3058b(sb32.toString()));
                            String str27 = valueOf32.length() == 0 ? new String("6F") : "6F".concat(valueOf32);
                            bev.m2858a("PRIMARY_AID_FCI", bia.m3070a(str26));
                            bev.m2858a("ALIAS_AID_FCI", bia.m3070a(str27));
                            String valueOf33 = String.valueOf(str26);
                            if (valueOf33.length() == 0) {
                                new String("::TokenPersoDelegate::prepareFCIResponse::_sPrimaryAIDFCIRes::");
                            } else {
                                "::TokenPersoDelegate::prepareFCIResponse::_sPrimaryAIDFCIRes::".concat(valueOf33);
                            }
                            String valueOf34 = String.valueOf(str27);
                            if (valueOf34.length() == 0) {
                                new String("::TokenPersoDelegate::prepareFCIResponse::_sSecondaryAIDFCIRes::");
                            } else {
                                "::TokenPersoDelegate::prepareFCIResponse::_sSecondaryAIDFCIRes::".concat(valueOf34);
                            }
                            bgd.m2922a(1);
                            return;
                        }
                    }
                } catch (bfq e4) {
                    e = e4;
                    str = str2;
                    bfq = e;
                    Log.e(str, "::TokenPersoDelegate::catch::", bfq);
                    throw bfq;
                }
            } else {
                Log.e(str6, "::TokenPersoDelegate::update::NFC AND MST LUPC COUNT MISMATCH!!");
                throw new bfq(bha.NFC_AND_MST_LUPC_COUNT_MISMATCH);
            }
        } catch (bfq e5) {
            e = e5;
            str = str6;
            bfq = e;
            Log.e(str, "::TokenPersoDelegate::catch::", bfq);
            throw bfq;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3084b() {
        boolean z;
        boolean z2;
        bgr bgr = bgs.f3191a;
        boolean z3 = true;
        bia a = bev.m2854a(bev.m2856a(), bgt.m2993a("CARD_RISK_MANAGEMENT_EMV_DGI"), bgt.m2993a("ISSUER_COUNTRY_CODE"), true);
        if (a == null) {
            a = bev.m2854a(bev.m2856a(), bgt.m2993a("CARD_RISK_MANAGEMENT_MS_DGI"), bgt.m2993a("ISSUER_COUNTRY_CODE"), true);
        }
        bgr.mo3121a("ISSUER_COUNTRY_CODE", a.f3270h);
        byte[] a2 = bgx.m3011a(bev.m2854a(bet.m2847a().f3120b, bgt.m2993a("RISK_PARAMS_DGI"), bgt.m2993a("TAG_XPM_CONFIG"), true).f3270h);
        byte b = a2[3];
        StringBuilder sb = new StringBuilder(76);
        sb.append("::TokenPersoDelegate::setTokenConfiguration::inAppSupportedMask::");
        sb.append((int) (b & 16));
        sb.toString();
        if ((a2[3] & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append("::TokenPersoDelegate::setTokenConfiguration::inAppSupportedMask::");
        sb2.append(z);
        sb2.toString();
        if ((a2[3] & 16) == 16) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("::TokenPersoDelegate::setTokenConfiguration::inAppSupported::true");
            sb3.toString();
            z2 = true;
        } else {
            z2 = false;
        }
        bgr.mo3121a("INAPP_SUPPORTED", String.valueOf(z2));
        byte b2 = a2[4];
        StringBuilder sb4 = new StringBuilder(81);
        sb4.append("::TokenPersoDelegate::setTokenConfiguration::tapPaymentSupportedMask::");
        sb4.append((int) (b2 & 8));
        sb4.toString();
        if ((a2[4] & 8) == 8) {
            StringBuilder sb5 = new StringBuilder(71);
            sb5.append("::TokenPersoDelegate::setTokenConfiguration::tapPaymentSupported::true");
            sb5.toString();
        } else {
            z3 = false;
        }
        bgr.mo3121a("TAP_PAYMENT_SUPPORTED", String.valueOf(z3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo3087c(bfu bfu) {
        byte[] d = mo3088d(bfu);
        byte b = d[4];
        StringBuilder sb = new StringBuilder(57);
        sb.append("::TokenPersoDelegate::init::mstSupportedMask::");
        sb.append((int) (b & 16));
        sb.toString();
        if ((d[4] & 16) != 16 || !bfu.mo3094b(bgt.m2993a("MST_LUPC_DGI"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public byte[] mo3088d(bfu bfu) {
        return bgx.m3011a(bfu.mo3091a(bgt.m2993a("RISK_PARAMS_DGI"), bgt.m2993a("TAG_XPM_CONFIG"), true).f3270h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo3089e(bfu bfu) {
        try {
            String valueOf = String.valueOf(bfu.f3130a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("cleanDGIMap::before::");
            sb.append(valueOf);
            sb.toString();
            bfu.f3130a.remove(bgt.m2993a("NFC_LUPC_DGI"));
            if (m2897f(bfu)) {
                bfu.f3130a.remove(bgt.m2995b("ICC_CRT_dP1"));
                bfu.f3130a.remove(bgt.m2995b("ICC_CRT_dQ1"));
                bfu.f3130a.remove(bgt.m2995b("ICC_CRT_P"));
                bfu.f3130a.remove(bgt.m2995b("ICC_CRT_Q"));
                bfu.f3130a.remove(bgt.m2995b("ICC_CRT_PQ"));
            }
            if (mo3087c(bfu)) {
                bfu.f3130a.remove(bgt.m2993a("MST_LUPC_DGI"));
            }
            String valueOf2 = String.valueOf(bfu.f3130a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb2.append("cleanDGIMap::after::");
            sb2.append(valueOf2);
            sb2.toString();
        } catch (bfq e) {
            String valueOf3 = String.valueOf(e.getMessage());
            Log.e("core-hceclient", valueOf3.length() == 0 ? new String("cleanDGIMap::error::") : "cleanDGIMap::error::".concat(valueOf3));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3086b(bfu bfu) {
        beu.m2851a("RUNNING_ATC", bfu.mo3091a(bgt.m2993a("RISK_PARAMS_DGI"), bgt.m2993a("STARTING_ATC_TAG"), false));
        beu.m2851a("TOKEN_DATA_VERSION", bfu.mo3091a(bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("TOKEN_DATA_VERSION_TAG"), false));
        beu.m2851a("LUPC_THRESHOLD", bfu.mo3091a(bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("LUPC_THRESHOLD_TAG"), false));
        beu.m2851a("TOKEN_STATUS", bfu.mo3091a(bgt.m2993a("TOKEN_METADATA_DGI"), bgt.m2993a("TOKEN_STATUS_TAG"), true));
        for (bhz bhz : beu.m2849a().keySet()) {
            String valueOf = String.valueOf(bhz);
            String valueOf2 = String.valueOf(beu.m2849a().get(bhz));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
            sb.append("::: TokenPersoDelegate  MetaData Map  :::");
            sb.append(valueOf);
            sb.append("-- > ");
            sb.append(valueOf2);
            sb.toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo3085a(bfu bfu) {
        int i;
        int size;
        Map map = bfu.f3131b;
        String valueOf = String.valueOf(map);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("::: TokenPersoDelegate::tagMap::before::");
        sb.append(valueOf);
        sb.toString();
        boolean c = mo3087c(bfu);
        List a = bfu.mo3093a(bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"));
        List a2 = bfu.mo3093a(bgt.m2993a("MST_LUPC_DGI"), bgt.m2993a("MST_LUPC_TAG"));
        beu.m2851a("MAX_ATC", bia.m3070a(((bhw) bfu.mo3091a(bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"), false)).f3253b));
        beu.m2851a("LUPC_COUNT", bia.m3070a(String.valueOf(a.size())));
        if (!c) {
            i = 0;
        } else if (a.size() == a2.size()) {
            i = 0;
        } else {
            Log.e("core-hceclient", "::TokenPersoDelegate::update::NFC AND MST LUPC COUNT MISMATCH!!");
            throw new bfq(bha.NFC_AND_MST_LUPC_COUNT_MISMATCH);
        }
        while (i < a.size()) {
            bhz bhz = (bhz) a.get(i);
            beu.m2849a().put(bhz, (bia) map.remove(bhz));
            if (c) {
                bhz bhz2 = (bhz) a2.get(i);
                beu.m2849a().put(bhz2, (bia) map.remove(bhz2));
            }
            i++;
        }
        String valueOf2 = String.valueOf(map);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
        sb2.append("::: TokenPersoDelegate::tagMap::after::");
        sb2.append(valueOf2);
        sb2.toString();
        mo3086b(bfu);
        List a3 = bev.m2855a(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"));
        List a4 = bev.m2855a(beu.m2849a(), bgt.m2993a("MST_LUPC_DGI"), bgt.m2993a("MST_LUPC_TAG"));
        int parseInt = Integer.parseInt(bgx.m3002a(beu.m2848a("LUPC_THRESHOLD"), 1, 1), 16);
        StringBuilder sb3 = new StringBuilder(73);
        sb3.append("::TokenPersoDelegate::executeLUPCThreshold::nfcLUPCThreshold::");
        sb3.append(parseInt);
        sb3.toString();
        boolean c2 = mo3087c(bfu);
        if (!c2 || a3.size() == a4.size()) {
            int size2 = a3.size();
            if (size2 > parseInt) {
                int i2 = size2 - parseInt;
                for (int i3 = 0; i3 < i2; i3++) {
                    beu.m2850a(bev.m2860b(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG")));
                }
            }
            if (c2 && (size = a4.size()) > parseInt) {
                int i4 = size - parseInt;
                for (int i5 = 0; i5 < i4; i5++) {
                    beu.m2850a(bev.m2860b(beu.m2849a(), bgt.m2993a("MST_LUPC_DGI"), bgt.m2993a("MST_LUPC_TAG")));
                }
            }
            beu.m2851a("RUNNING_ATC", bia.m3070a(((bhw) bev.m2854a(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"), true)).f3253b));
            beu.m2851a("MAX_ATC", bia.m3070a(((bhw) bev.m2854a(beu.m2849a(), bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG"), false)).f3253b));
            for (bhz bhz3 : beu.m2849a().keySet()) {
                String valueOf3 = String.valueOf(bhz3);
                String valueOf4 = String.valueOf(beu.m2849a().get(bhz3));
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 68 + String.valueOf(valueOf4).length());
                sb4.append("::: TokenPersoDelegate  executeLUPCThreshold  MetaData Map  :::");
                sb4.append(valueOf3);
                sb4.append("-- > ");
                sb4.append(valueOf4);
                sb4.toString();
            }
            return;
        }
        Log.e("core-hceclient", "::TokenPersoDelegate::update::NFC AND MST LUPC COUNT MISMATCH!!");
        throw new bfq(bha.NFC_AND_MST_LUPC_COUNT_MISMATCH);
    }
}
