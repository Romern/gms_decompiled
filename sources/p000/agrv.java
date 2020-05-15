package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrv {

    /* renamed from: a */
    private static final srn f66330a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public static boolean m55020a(Context context) {
        if (!cfmj.m140156e() || agpk.m54726a().mo35843c() != null || agyq.m55295p(context).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m55021a(Context context, Integer num) {
        bygb bygb;
        bygb bygb2;
        Integer num2 = num;
        if (!cfmj.m140156e()) {
            ((bnsl) f66330a.mo68388c()).mo68405a("CONSENT_STATUS_CONVERSION_FAILURE_FLAG_DISABLED. Consent status conversion");
            agrl.m54942a().mo36005a(bygd.CONSENT_STATUS_CONVERSION_FAILURE_FLAG_DISABLED, num2);
            return true;
        } else if (agyq.m55287h(context) == null) {
            agrl.m54942a().mo36005a(bygd.CONSENT_STATUS_CONVERSION_ABORTED_NO_SUPPORTED_MCC_MNC, num2);
            return true;
        } else {
            agpk a = agpk.m54726a();
            bxzx c = a.mo35843c();
            bygb bygb3 = null;
            if (c != null) {
                agrl a2 = agrl.m54942a();
                bygd bygd = bygd.CONSENT_STATUS_CONVERSION_ABORTED_ALREADY_CONVERTED;
                bygb a3 = bygb.m124774a(c.f165204f);
                if (a3 == null) {
                    a3 = bygb.UNRECOGNIZED;
                }
                a2.mo36007a(bygd, (List) null, a3, num2);
                return true;
            }
            List<agzc> p = agyq.m55295p(context);
            if (!p.isEmpty()) {
                bxwc bxwc = cfmj.f184370a.mo6606a().mo81485h().f165797a;
                ArrayList a4 = bnkn.m109661a();
                bxzx bxzx = null;
                boolean z = false;
                for (agzc agzc : p) {
                    if (bxwc.contains(agzc.mo36194b())) {
                        a4.add(agzc.m55318a(agzc.mo36193a(), agzc.mo36194b(), agzc.mo36195c(), agzc.mo36196d(), null));
                        z = true;
                    } else {
                        bxzx j = a.mo35850j(agzc.mo36193a());
                        if (j != null) {
                            bygb bygb4 = bygb.CONSENT_UNSPECIFIED;
                            bygb a5 = bygb.m124774a(j.f165204f);
                            if (a5 == null) {
                                a5 = bygb.UNRECOGNIZED;
                            }
                            if (!bygb4.equals(a5)) {
                                String a6 = agzc.mo36193a();
                                String b = agzc.mo36194b();
                                long c2 = agzc.mo36195c();
                                boolean d = agzc.mo36196d();
                                bygb a7 = bygb.m124774a(j.f165204f);
                                if (a7 != null) {
                                    bygb2 = a7;
                                } else {
                                    bygb2 = bygb.UNRECOGNIZED;
                                }
                                a4.add(new agyp(a6, b, c2, d, bygb2, Long.valueOf(j.f165205g), null));
                                if (bxzx == null || j.f165205g > bxzx.f165205g) {
                                    bygb3 = bygb.m124774a(j.f165204f);
                                    if (bygb3 == null) {
                                        bygb3 = bygb.UNRECOGNIZED;
                                    }
                                    bxzx = j;
                                }
                            }
                        }
                    }
                }
                if (bygb.NOT_ASKED.equals(bygb3)) {
                    bygb = bygb.INITIALIZED;
                } else if (!bygb.NOT_REQUIRED.equals(bygb3) && !bygb.CONSENTED.equals(bygb3)) {
                    bygb = (!bygb.DECLINED.equals(bygb3) && !bygb.REVOKED.equals(bygb3)) ? !z ? bygb.INITIALIZED : bygb.OPT_IN : bygb.OPT_OUT;
                } else {
                    bygb = bygb.OPT_IN;
                }
                String str = (bygb.OPT_IN == bygb || bygb.OPT_OUT == bygb) ? "AIzaSyAxmTFlJLw9-uEJ1pFJUzw8LX7veGxGUoI" : "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4";
                bxvd da = bxzx.f165197j.mo74144da();
                String str2 = agqe.m54828a().mo35930a(str).f66263c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxzx bxzx2 = (bxzx) da.f164949b;
                str2.getClass();
                bxzx2.f165201c = str2;
                bxzx2.f165204f = bygb.mo3214a();
                if (!a.mo35827a((bxzx) da.mo74062i())) {
                    ((bnsl) f66330a.mo68388c()).mo68405a("FAILURE_SAVING_DEVICE_CONSENT_STATUS. Consent status conversion");
                    agrl.m54942a().mo36007a(bygd.CONSENT_STATUS_CONVERSION_FAILURE_SAVING_STATUS, a4, bygb, num2);
                    return false;
                }
                agrl.m54942a().mo36007a(bygd.CONSENT_STATUS_CONVERSION_EXECUTED, a4, bygb, num2);
                return true;
            }
            ((bnsl) f66330a.mo68388c()).mo68405a("FAILURE_NO_SIM_CARDS. Consent status conversion");
            agrl.m54942a().mo36005a(bygd.CONSENT_STATUS_CONVERSION_FAILURE_NO_SIM_CARDS, num2);
            return true;
        }
    }
}
