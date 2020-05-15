package p000;

import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.List;

/* renamed from: kfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kfa extends keo {

    /* renamed from: a */
    private final SubscriptionManager f23966a;

    /* renamed from: b */
    private final kra f23967b;

    public kfa(SubscriptionManager subscriptionManager, kra kra) {
        this.f23966a = subscriptionManager;
        this.f23967b = kra;
    }

    /* renamed from: a */
    public final bqgg mo14429a(kej kej) {
        kdf a;
        List<SubscriptionInfo> activeSubscriptionInfoList = this.f23966a.getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null) {
            return bqga.m112775a(new kek(bnon.f131923a));
        }
        bnia j = bnic.m109500j();
        for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
            String number = subscriptionInfo.getNumber();
            if (!(number == null || (a = this.f23967b.mo14821a(number)) == null)) {
                j.mo67629b(kct.m17647a(a, kcs.m17644a("android_telephony", a.f23866a)));
            }
        }
        return bqga.m112775a(new kek(j.mo67751a()));
    }
}
