package p000;

import android.content.Context;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: agso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agso implements Callable {

    /* renamed from: e */
    private static final srn f66372e = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    private final Context f66373a;

    /* renamed from: b */
    private final Integer f66374b;

    /* renamed from: c */
    private final Long f66375c;

    /* renamed from: d */
    private final String f66376d;

    public agso(Context context, String str, Integer num) {
        this.f66373a = context;
        this.f66376d = str;
        this.f66374b = Integer.valueOf(num == null ? agrl.m54949c() : num.intValue());
        this.f66375c = Long.valueOf(agrl.m54947b());
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        boolean z2;
        agrl a = agrl.m54943a(this.f66373a);
        a.mo35983a(11, bygd.BACKGROUND_CONSENT_REQUEST, this.f66374b, this.f66375c);
        int i = 4;
        try {
            if (cfmd.m140084d()) {
                agpk a2 = agpk.m54726a();
                Long b = a2.mo35839b(this.f66376d);
                if (b != null && b.longValue() >= 0) {
                    GetConsentInformationResponse a3 = agrz.m55030a(this.f66373a, cfmv.m140318q(), "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", (int) cfmv.m140319r()).mo36042a(b, 7, this.f66374b, this.f66375c);
                    ConsentAgreementText consentAgreementText = a3.f80277b;
                    if (consentAgreementText == null || a3.f80276a == null) {
                        i = 7;
                    } else {
                        if (!a2.mo35830a(b, consentAgreementText) || !a2.mo35829a(b, a3.f80276a.mo44081a())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        agrl a4 = agrl.m54943a(this.f66373a);
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
                        a4.mo35992a((booc) da.mo74062i(), "MDP_PeriodicService", this.f66374b);
                        int i2 = 0;
                        int i3 = 0;
                        for (String str : a2.mo35840b()) {
                            if (b.equals(a2.mo35839b(str))) {
                                i3++;
                                bxzx j = a2.mo35850j(str);
                                if (j != null && j.f165206h < consentAgreementText.f80268g) {
                                    HashSet a5 = bnpf.m110050a(1, 3);
                                    bygb a6 = bygb.m124774a(j.f165204f);
                                    if (a6 == null) {
                                        a6 = bygb.UNRECOGNIZED;
                                    }
                                    if (a5.contains(Integer.valueOf(a6.mo3214a()))) {
                                        i2++;
                                    }
                                }
                            }
                        }
                        if (z) {
                            agrl a7 = agrl.m54943a(this.f66373a);
                            if (a3.f80276a.f80270a != 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            a7.mo36016a(z2, consentAgreementText.f80268g, consentAgreementText.f80269h, i2, i3, this.f66374b, this.f66375c);
                            i = 3;
                        } else {
                            i = 8;
                        }
                    }
                }
            } else {
                i = 5;
            }
        } catch (chuw | gid e) {
            bnsl a8 = f66372e.mo26019b(agyt.m55307c());
            a8.mo68437a(e);
            a8.mo68405a("RPC call failed when attempting to cache consent text");
            i = 6;
        }
        if (i == 3) {
            return null;
        }
        a.mo35985a(i, this.f66374b, this.f66375c);
        throw new agsn(i);
    }
}
