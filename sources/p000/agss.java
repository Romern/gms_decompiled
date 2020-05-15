package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: agss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agss implements Callable {

    /* renamed from: a */
    public static final srn f66387a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    private final Context f66388b;

    /* renamed from: c */
    private final Integer f66389c;

    /* renamed from: d */
    private final Long f66390d;

    public agss(Context context, Integer num) {
        this.f66388b = context;
        this.f66389c = Integer.valueOf(num == null ? agrl.m54949c() : num.intValue());
        this.f66390d = Long.valueOf(agrl.m54947b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x000e A[SYNTHETIC] */
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        for (agzc agzc : agyq.m55295p(this.f66388b)) {
            String a = agzc.mo36193a();
            agpk a2 = agpk.m54726a();
            if (TextUtils.isEmpty(a)) {
                ((bnsl) f66387a.mo68388c()).mo68420a("%s: Device lists SIM card without ICCID, cannot execute GetConsent gRPC on it.", "BgTaskGetConsent");
            } else {
                Long b = a2.mo35839b(a);
                if (b == null) {
                    f66387a.mo26019b(agyt.m55307c()).mo68420a("%s: Device lists SIM card without carrierId, cannot execute GetConsent gRPC on it.", "BgTaskGetConsent");
                } else {
                    bxyk c = a2.mo35842c(b);
                    if (c == null || (System.currentTimeMillis() / 1000) - c.f165097a >= cflr.f184273a.mo6606a().mo81408v()) {
                        String a3 = agzc.mo36193a();
                        agrl a4 = agrl.m54943a(this.f66388b);
                        a4.mo35983a(11, bygd.BACKGROUND_CONSENT_REQUEST, this.f66389c, this.f66390d);
                        int i = 4;
                        try {
                            if (cflr.m139930g()) {
                                agpk a5 = agpk.m54726a();
                                Long b2 = a5.mo35839b(a3);
                                if (b2 != null && b2.longValue() >= 0) {
                                    GetConsentInformationResponse a6 = agrz.m55030a(this.f66388b, cfmv.m140318q(), "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", (int) cfmv.m140319r()).mo36042a(b2, 7, this.f66389c, this.f66390d);
                                    ConsentAgreementText consentAgreementText = a6.f80277b;
                                    if (consentAgreementText == null || a6.f80276a == null) {
                                        i = 7;
                                    } else {
                                        if (!a5.mo35830a(b2, consentAgreementText) || !a5.mo35829a(b2, a6.f80276a.mo44081a())) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        agrl a7 = agrl.m54943a(this.f66388b);
                                        bxvd da = booc.f133888c.mo74144da();
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((booc) da.f164949b).f133890a = boob.m111380a(11);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((booc) da.f164949b).f133891b = z;
                                        a7.mo35992a((booc) da.mo74062i(), "MDP_PeriodicService", this.f66389c);
                                        int i2 = 0;
                                        int i3 = 0;
                                        for (String str : a5.mo35840b()) {
                                            if (a5.mo35839b(str) != null && b2.equals(a5.mo35839b(str))) {
                                                i3++;
                                                bxzx j = a5.mo35850j(str);
                                                if (j != null && j.f165206h < consentAgreementText.f80268g) {
                                                    Integer[] numArr = new Integer[2];
                                                    try {
                                                        numArr[0] = 1;
                                                        numArr[1] = 3;
                                                        HashSet a8 = bnpf.m110050a(numArr);
                                                        bygb a9 = bygb.m124774a(j.f165204f);
                                                        if (a9 == null) {
                                                            a9 = bygb.UNRECOGNIZED;
                                                        }
                                                        if (a8.contains(Integer.valueOf(a9.mo3214a()))) {
                                                            i2++;
                                                        }
                                                    } catch (chuw | gid e) {
                                                        i = 6;
                                                        if (i != 3) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (z) {
                                            f66387a.mo26019b(agyt.m55307c()).mo68425a("%s: Fetched consent with ICCID %s for carrier ID %d", "BgTaskGetConsent", a3, b2);
                                            agrl a10 = agrl.m54943a(this.f66388b);
                                            if (a6.f80276a.f80270a != 3) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            a10.mo36016a(z2, consentAgreementText.f80268g, consentAgreementText.f80269h, i2, i3, this.f66389c, this.f66390d);
                                            i = 3;
                                        } else {
                                            i = 8;
                                        }
                                    }
                                }
                            } else {
                                i = 5;
                            }
                        } catch (chuw | gid e2) {
                            i = 6;
                            if (i != 3) {
                            }
                        }
                        if (i != 3) {
                            ((bnsl) f66387a.mo68388c()).mo68425a("%s: Consent fetch failed for SIM card with ICCID: %s\nResult: %s", "BgTaskGetConsent", a3, Integer.valueOf(boof.m111384a(i)));
                            a4.mo35985a(i, this.f66389c, this.f66390d);
                            z3 = false;
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z3);
    }
}
