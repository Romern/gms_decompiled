package p000;

import android.util.Log;

/* renamed from: bgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgo implements bgm {
    /* renamed from: a */
    public static final bha m2983a(Exception exc) {
        bha bha;
        bha bha2 = bha.UNEXPECTED_ERROR;
        String valueOf = String.valueOf(exc.getClass().getSimpleName());
        if (valueOf.length() == 0) {
            new String("::AmexPayImpl::getOperationStatus::");
        } else {
            "::AmexPayImpl::getOperationStatus::".concat(valueOf);
        }
        return (!(exc instanceof bfq) || (bha = ((bfq) exc).f3124a) == null) ? bha2 : bha;
    }

    /* renamed from: a */
    public static final void m2984a(bfw bfw, bha bha, String str) {
        String str2;
        String replace = "2.1.0".replace(".", "");
        String str3 = bha.f3219r;
        StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + str.length() + String.valueOf(str3).length());
        sb.append(replace);
        sb.append(str);
        sb.append(str3);
        bha.f3220s = sb.toString();
        bfw.f3134c = bha.f3219r;
        bfw.f3135d = bha.f3220s;
        String str4 = bha.f3221t;
        if (str.compareToIgnoreCase("07") == 0) {
            String str5 = (String) bes.m2846b("9F4E");
            String str6 = (String) bes.m2846b("9F15");
            if (!(((Short) bes.m2844a("TR_RETURN_AMNT_IN_GAC")).shortValue() != -23238 || (str2 = (String) bes.m2846b("9F02")) == null || str2.compareToIgnoreCase("") == 0)) {
                if (str2.length() == 0) {
                    new String("::AmexPayImple::setStatusInResponse::sAmount::");
                } else {
                    "::AmexPayImple::setStatusInResponse::sAmount::".concat(str2);
                }
                String valueOf = String.valueOf(str4);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8 + str2.length());
                sb2.append(valueOf);
                sb2.append(",AMOUNT=");
                sb2.append(str2);
                str4 = sb2.toString();
                bes.m2845a("TR_RETURN_AMNT_IN_GAC", (short) 30003);
            }
            if (!(str5 == null || str5.compareToIgnoreCase("") == 0)) {
                if (str5.length() == 0) {
                    new String("::AmexPayImple::setStatusInResponse::sMerchantName::");
                } else {
                    "::AmexPayImple::setStatusInResponse::sMerchantName::".concat(str5);
                }
                String valueOf2 = String.valueOf(str4);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 15 + str5.length());
                sb3.append(valueOf2);
                sb3.append(",MERCHANT_NAME=");
                sb3.append(str5);
                str4 = sb3.toString();
                bes.m2845a("TR_RETURN_AMNT_IN_GAC", (short) -23238);
            }
            if (!(str6 == null || str6.compareToIgnoreCase("") == 0)) {
                if (str6.length() == 0) {
                    new String("::AmexPayImple::setStatusInResponse::sMerchantCode::");
                } else {
                    "::AmexPayImple::setStatusInResponse::sMerchantCode::".concat(str6);
                }
                String valueOf3 = String.valueOf(str4);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 15 + str6.length());
                sb4.append(valueOf3);
                sb4.append(",MERCHANT_CODE=");
                sb4.append(str6);
                str4 = sb4.toString();
                bes.m2845a("TR_RETURN_AMNT_IN_GAC", (short) -23238);
            }
        }
        bfw.f3136e = str4;
        String str7 = bfw.f3134c;
        String str8 = bfw.f3135d;
        String str9 = bfw.f3136e;
        StringBuilder sb5 = new StringBuilder(String.valueOf(str7).length() + 69 + String.valueOf(str8).length() + String.valueOf(str9).length());
        sb5.append("::setStatusInResponse::Reason Code::");
        sb5.append(str7);
        sb5.append("::Detail Code::");
        sb5.append(str8);
        sb5.append("::Detail Message::");
        sb5.append(str9);
        sb5.toString();
    }

    /* renamed from: a */
    public final bft mo3115a() {
        StringBuilder sb;
        String str;
        bha bha = bha.NO_FURTHER_ACTION_REQUIRED;
        bgr bgr = bgs.f3191a;
        bft bft = new bft();
        try {
            if (bgp.OPERATION.f3179b != null) {
                new bfb().mo3074a();
                bft.f3129a = (String) bes.m2844a("TID");
                m2984a(bft, bha, "02");
                bgr.mo3122b();
                bgp.OPERATION.mo3118a();
                str = String.valueOf(bgp.OPERATION.f3179b);
                sb = new StringBuilder(String.valueOf(str).length() + 44);
                sb.append("::tokenClose::finally::after release mode:: ");
                sb.append(str);
                sb.toString();
                return bft;
            }
            throw new bfq(bha.OPERATION_NOT_SUPPORTED);
        } catch (Exception e) {
            Log.e("core-hceclient", "::tokenClose::catch::", e);
            m2984a(bft, m2983a(e), "02");
            bgr.mo3122b();
            bgp.OPERATION.mo3118a();
            str = String.valueOf(bgp.OPERATION.f3179b);
            sb = new StringBuilder(String.valueOf(str).length() + 44);
        } catch (Throwable th) {
            m2984a(bft, bha, "02");
            bgr.mo3122b();
            bgp.OPERATION.mo3118a();
            String valueOf = String.valueOf(bgp.OPERATION.f3179b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb2.append("::tokenClose::finally::after release mode:: ");
            sb2.append(valueOf);
            sb2.toString();
            throw th;
        }
    }

    /* renamed from: a */
    public final bfw mo3116a(bgq bgq, String str) {
        bew bew;
        Log.i("core-hceclient", "::SDK Build Version::1.0.0");
        bha bha = bha.NO_FURTHER_ACTION_REQUIRED;
        bfw bfw = new bfw();
        try {
            String valueOf = String.valueOf(bgq.name());
            if (valueOf.length() == 0) {
                new String("::tokenOpen::operationMode::");
            } else {
                "::tokenOpen::operationMode::".concat(valueOf);
            }
            if (str.length() == 0) {
                new String("::tokenOpen::tokenRefId::");
            } else {
                "::tokenOpen::tokenRefId::".concat(str);
            }
            bgp bgp = bgp.OPERATION;
            if (bgp.f3179b != null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bgp.f3181d > bgp.f3179b.f3189f) {
                    bgp.f3181d = currentTimeMillis;
                    bgp.f3179b = bgq;
                    bgs.f3191a.mo3122b();
                } else {
                    throw new bfq(String.valueOf(bgq.name()).concat(" is in progress!!"));
                }
            } else {
                bgp.f3181d = System.currentTimeMillis();
                bgp.f3179b = bgq;
            }
            bgp.OPERATION.f3180c = str;
            if (bgq.equals(bgq.PROVISION)) {
                bew = new bfi();
            } else if (bgq.equals(bgq.REFRESH)) {
                bew = new bfk();
            } else {
                if (!bgq.equals(bgq.PAYMENT)) {
                    if (!bgq.equals(bgq.TAP_PAYMENT)) {
                        bew = bgq.equals(bgq.LCM) ? new bfe() : null;
                    }
                }
                bew = new bfg();
            }
            bew.mo3074a();
        } catch (Exception e) {
            Log.e("core-hceclient", "::tokenOpen::catch::", e);
            bha = m2983a(e);
            bgp.OPERATION.mo3118a();
        } catch (Throwable th) {
            th = th;
            m2984a(bfw, bha, "01");
            throw th;
        }
        m2984a(bfw, bha, "01");
        return bfw;
    }

    /* renamed from: a */
    public final bfy mo3117a(long j, String str) {
        long j2;
        bha bha = bha.NO_FURTHER_ACTION_REQUIRED;
        bgr bgr = bgs.f3191a;
        bfy bfy = new bfy();
        try {
            String valueOf = String.valueOf(bgp.OPERATION.f3179b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("::tokenRefreshStatus::before:if::");
            sb.append(valueOf);
            sb.toString();
            if (bgp.OPERATION.f3179b != null) {
                String valueOf2 = String.valueOf(bgp.OPERATION.f3180c);
                if (valueOf2.length() == 0) {
                    new String("::tokenRefreshStatus::tokenRefID");
                } else {
                    "::tokenRefreshStatus::tokenRefID".concat(valueOf2);
                }
                throw new bfq(bha.OPERATION_NOT_SUPPORTED);
            }
            String valueOf3 = String.valueOf(bgp.OPERATION.f3179b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 32);
            sb2.append("::tokenRefreshStatus::after:if::");
            sb2.append(valueOf3);
            sb2.toString();
            bgp.OPERATION.f3180c = str;
            bgp.OPERATION.f3182e = j;
            new bfn().mo3074a();
            String valueOf4 = String.valueOf(bet.m2847a());
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 35);
            sb3.append("::tokenRefreshStatus::DataContext::");
            sb3.append(valueOf4);
            sb3.toString();
            String valueOf5 = String.valueOf(beu.m2849a());
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 38);
            sb4.append("::tokenRefreshStatus::getMetaDataMap::");
            sb4.append(valueOf5);
            sb4.toString();
            String valueOf6 = String.valueOf(beu.m2848a("MAX_ATC"));
            if (valueOf6.length() == 0) {
                new String("::tokenRefreshStatus::MAX_ATC::");
            } else {
                "::tokenRefreshStatus::MAX_ATC::".concat(valueOf6);
            }
            String valueOf7 = String.valueOf(beu.m2848a("LUPC_COUNT"));
            if (valueOf7.length() == 0) {
                new String("::tokenRefreshStatus::LUPC_COUNT::");
            } else {
                "::tokenRefreshStatus::LUPC_COUNT::".concat(valueOf7);
            }
            bfy.f3140f = Integer.parseInt(beu.m2848a("MAX_ATC"), 16);
            bfy.f3138a = Integer.parseInt(beu.m2848a("LUPC_COUNT"));
            bfy.f3139b = Boolean.valueOf(beu.m2848a("REFRESH_REQUIRED")).booleanValue();
            if (beu.m2848a("LUPC_REFRESH_CHECK_BACK") != null) {
                j2 = Long.parseLong(beu.m2848a("LUPC_REFRESH_CHECK_BACK"));
            } else {
                j2 = -1;
            }
            bfy.f3141g = j2;
            bfy.f3143i = "2.1.0-1.0.0";
            bfy.f3142h = beu.m2848a("TOKEN_DATA_VERSION");
            bfy.f3144j = beu.m2848a("TOKEN_STATUS");
            bgr.mo3122b();
            bgp.OPERATION.mo3118a();
            return bfy;
        } catch (Exception e) {
            bqye.m113758a(e);
            Log.e("core-hceclient", "::tokenRefreshStatus::catch::", e);
            bha = m2983a(e);
        } finally {
            m2984a(bfy, bha, "11");
        }
    }
}
