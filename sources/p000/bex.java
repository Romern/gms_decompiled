package p000;

import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bex extends bew {
    /* renamed from: a */
    private static final void m2866a(bfu bfu, String str, String str2, boolean z) {
        bia a = bev.m2854a(bfu.f3131b, bgt.m2993a(str), bgt.m2993a(str2), true);
        if (a == null) {
            Log.e("core-hceclient", "::SecureChannelUnwrapDelegate::runAFLChecks::GPO Response DGI inconsistent::");
            return;
        }
        byte[] a2 = bgx.m3011a(a.f3270h);
        int i = 0;
        while (i < a2.length) {
            int i2 = i + 1;
            int i3 = a2[i] >> 3;
            int i4 = i2 + 1;
            byte b = a2[i4];
            for (byte b2 = a2[i2]; b2 <= b; b2 = (byte) (b2 + 1)) {
                String valueOf = String.valueOf(bhp.m3054a((byte) i3));
                String valueOf2 = String.valueOf(bhp.m3054a(b2));
                String str3 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                if (str3.compareToIgnoreCase("0101") == 0) {
                    if (!z) {
                        str3 = bgt.m2993a("SFI1_REC1_DGI_MS");
                    } else {
                        str3 = bgt.m2993a("SFI1_REC1_DGI_EMV");
                    }
                }
                if (!bfu.mo3094b(str3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 89);
                    sb.append("::SecureChannelUnwrapDelegate::checkRecordsForAFL::Record ");
                    sb.append(str3);
                    sb.append(" not found corresponding to AFL");
                    Log.e("core-hceclient", sb.toString());
                    Log.e("core-hceclient", "::SecureChannelUnwrapDelegate::runAFLChecks::AFL Inconsistent with record data present in perso::");
                    return;
                }
            }
            i = i4 + 2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a4, code lost:
        if (r0 == '9') goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ec, code lost:
        if (r0 == '9') goto L_0x01ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a3 A[Catch:{ bfq -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a4 A[Catch:{ bfq -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b1 A[Catch:{ bfq -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e1 A[Catch:{ bfq -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0249 A[Catch:{ bfq -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0259 A[Catch:{ bfq -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x025c A[Catch:{ bfq -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025d A[Catch:{ bfq -> 0x027d }] */
    /* renamed from: a */
    public final void mo3074a() {
        String str;
        boolean z;
        boolean booleanValue;
        boolean z2;
        char c;
        bgr bgr = bgs.f3191a;
        try {
            bgr bgr2 = bgs.f3191a;
            bgl bgl = new bgl();
            byte[] bytes = ((String) bgr2.mo3119a("TOKEN_DATA", true)).getBytes();
            int length = bytes.length;
            int i = length + 1024;
            byte[] bArr = new byte[i];
            bew.m2863a(bgl.mo3100a(0, bytes, length, bArr, i));
            if (bgl.m2964b()) {
                bArr = bgl.mo3114a();
            }
            String str2 = new String(bArr);
            if (str2.length() == 0) {
                new String("::SecureChannelUnwrapDelegate::unwrap::destBuffer::");
            } else {
                "::SecureChannelUnwrapDelegate::unwrap::destBuffer::".concat(str2);
            }
            String obj = bgz.m3021a(bArr)[0].toString();
            bfu bfu = new bfu();
            Matcher matcher = Pattern.compile("(#S[\\d]{4}#)").matcher(obj);
            Matcher matcher2 = Pattern.compile("(#E[\\d]{4}#)").matcher(obj);
            Map map = bfu.f3130a;
            Map map2 = bfu.f3131b;
            List a = bgt.m2994a();
            String valueOf = String.valueOf(a);
            String str3 = "ISSUER_APPLICATION_DATA_EMV_DGI";
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb.append("CardProfileParser::parseTokenData::encryptedDGIs::");
            sb.append(valueOf);
            sb.toString();
            while (matcher.find() && matcher2.find()) {
                String substring = obj.substring(obj.indexOf(matcher.group()) + 7, obj.indexOf(matcher2.group()));
                String substring2 = substring.substring(0, 4);
                Matcher matcher3 = matcher;
                if (!"FF".equalsIgnoreCase(substring.substring(4, 6))) {
                    str = substring.substring(6);
                    map.put(substring2, str);
                } else {
                    str = substring.substring(10);
                    map.put(substring2, str);
                }
                if (!a.contains(substring2)) {
                    map2.putAll(bhn.m3052a(bhn.m3051a(bgx.m3011a(str), substring2, true)));
                    matcher = matcher3;
                } else {
                    matcher = matcher3;
                }
            }
            bgr2.mo3121a("TOKEN_DATA_HOLDER", bfu);
            bfu.f3132c = obj;
            Map map3 = bfu.f3130a;
            Map map4 = bfu.f3131b;
            String a2 = bhf.m3035a(map3);
            String a3 = bhf.m3035a(map4);
            String valueOf2 = String.valueOf(a2);
            if (valueOf2.length() == 0) {
                new String("::SecureChannelUnwrapDelegate::dgiJson::");
            } else {
                "::SecureChannelUnwrapDelegate::dgiJson::".concat(valueOf2);
            }
            String valueOf3 = String.valueOf(a3);
            if (valueOf3.length() == 0) {
                new String("::SecureChannelUnwrapDelegate::tagJson::");
            } else {
                "::SecureChannelUnwrapDelegate::tagJson::".concat(valueOf3);
            }
            bfu bfu2 = (bfu) bgr.mo3119a("TOKEN_DATA_HOLDER", false);
            if (bfu2.mo3094b(bgt.m2993a("EMV_AIP_DGI"))) {
                if (bfu2.mo3094b(bgt.m2993a("MS_AIP_DGI"))) {
                    m2866a(bfu2, "EMV_AIP_DGI", "EMV_AFL_TAG", true);
                    m2866a(bfu2, "MS_AIP_DGI", "MS_AFL_TAG", false);
                    c = '9';
                    if (c != 65463) {
                    }
                    if (!bfu2.mo3094b(bgt.m2993a(str3))) {
                        byte[] a4 = bgx.m3011a((String) bfu2.f3130a.get(bgt.m2993a(str3)));
                        if (a4.length < 11) {
                            Log.e("core-hceclient", "::SecureChannelUnwrapDelegate::isPersoValid::EMV IAD Length not correct::");
                            z = false;
                        } else {
                            byte b = a4[10];
                            if (!(b == 1 || b == 2)) {
                                Log.e("core-hceclient", "::SecureChannelUnwrapDelegate::isPersoValid::IAD Format is not correct::");
                                z = false;
                            }
                            if (c == 65473) {
                            }
                            if (!bfu2.mo3094b(bgt.m2993a("ISSUER_APPLICATION_DATA_MS_DGI"))) {
                                Log.e("core-hceclient", "::SecureChannelUnwrapDelegate::isPersoValid::IAD not present::");
                                z = false;
                            } else if (bfu2.mo3091a(bgt.m2993a("RISK_PARAMS_DGI"), bgt.m2993a("TAG_XPM_CONFIG"), true) == null) {
                                Log.e("core-hceclient", "::SecureChannelUnwrapDelegate::isPersoValid::XPM CONFIGURATION NOT PRESENT::");
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                    } else {
                        Log.e("core-hceclient", "::SecureChannelUnwrapDelegate::isPersoValid::EMV IAD is missing::");
                        z = false;
                    }
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("::SecureChannelUnwrapDelegate::isPersoValid::");
                    sb2.append(z);
                    sb2.toString();
                    booleanValue = ((Boolean) bgr.mo3119a("IS_ALREADY_PROVSIONED", false)).booleanValue();
                    if (!bfu2.mo3094b(bgt.m2993a("SFI1_REC1_DGI_EMV"))) {
                        z2 = bfu2.mo3094b(bgt.m2993a("SFI1_REC1_DGI_MS"));
                    } else {
                        z2 = true;
                    }
                    if (booleanValue) {
                        if (z2) {
                            throw new bfq(bha.TOKEN_REF_ID_ALREADY_PROVISIONED);
                        } else if (z) {
                            throw new bfq(bha.TOKEN_REF_ID_ALREADY_PROVISIONED);
                        }
                    }
                    bgr.mo3121a("IS_PROVISIONING_FLOW", Boolean.valueOf(z));
                }
            }
            if (bfu2.mo3094b(bgt.m2993a("EMV_AIP_DGI"))) {
                m2866a(bfu2, "EMV_AIP_DGI", "EMV_AFL_TAG", true);
                c = 65463;
            } else if (!bfu2.mo3094b(bgt.m2993a("MS_AIP_DGI"))) {
                Log.e("core-hceclient", "::SecureChannelUnwrapDelegate::isPersoValid::GPO NOT PRESENT::");
                z = false;
                StringBuilder sb22 = new StringBuilder(50);
                sb22.append("::SecureChannelUnwrapDelegate::isPersoValid::");
                sb22.append(z);
                sb22.toString();
                booleanValue = ((Boolean) bgr.mo3119a("IS_ALREADY_PROVSIONED", false)).booleanValue();
                if (!bfu2.mo3094b(bgt.m2993a("SFI1_REC1_DGI_EMV"))) {
                }
                if (booleanValue) {
                }
                bgr.mo3121a("IS_PROVISIONING_FLOW", Boolean.valueOf(z));
            } else {
                m2866a(bfu2, "MS_AIP_DGI", "MS_AFL_TAG", false);
                c = 65473;
            }
            if (c != 65463) {
            }
            if (!bfu2.mo3094b(bgt.m2993a(str3))) {
            }
            StringBuilder sb222 = new StringBuilder(50);
            sb222.append("::SecureChannelUnwrapDelegate::isPersoValid::");
            sb222.append(z);
            sb222.toString();
            booleanValue = ((Boolean) bgr.mo3119a("IS_ALREADY_PROVSIONED", false)).booleanValue();
            if (!bfu2.mo3094b(bgt.m2993a("SFI1_REC1_DGI_EMV"))) {
            }
            if (booleanValue) {
            }
            bgr.mo3121a("IS_PROVISIONING_FLOW", Boolean.valueOf(z));
        } catch (bfq e) {
            Log.e("core-hceclient", "::SecureChannelUnwrapDelegate::catch::", e);
            throw e;
        }
    }
}
