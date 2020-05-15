package p000;

import android.os.Build;
import android.telephony.SubscriptionManager;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;

/* renamed from: agqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqx extends SubscriptionManager.OnSubscriptionsChangedListener {

    /* renamed from: a */
    private static final srn f66300a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    public final void onSubscriptionsChanged() {
        f66300a.mo26019b(agyt.m55307c()).mo68425a("Subscription state changed; listener enabled: %s, periodic service enabled: %s, SDK %d", Boolean.valueOf(cfmv.m140312k()), Boolean.valueOf(cfmv.m140313l()), Integer.valueOf(Build.VERSION.SDK_INT));
        if (cfmv.m140312k()) {
            int i = Build.VERSION.SDK_INT;
            SubscriptionManager subscriptionManager = (SubscriptionManager) rpr.m34216b().getSystemService("telephony_subscription_service");
            if (subscriptionManager == null) {
                ((bnsl) f66300a.mo68388c()).mo68405a("Failed to get system subscription manager. Unable to respond to SIM change");
                return;
            }
            if (cfmq.m140241l()) {
                agrl.m54942a().mo35982a(4, bygd.DEVICE_STATUS_SUBSCRIPTIONS_CHANGED);
            }
            try {
                if (subscriptionManager.getActiveSubscriptionInfoCount() <= 0) {
                    ((bnsl) f66300a.mo68388c()).mo68405a("No active subscriptions found.");
                } else if (!cfmz.m140473d() || agyq.m55296q(rpr.m34216b())) {
                    ChimeraPeriodicUpdaterService.m67285a(rpr.m34216b(), cfmv.m140301D(), cfmv.m140299B(), boom.ACTIVE_SIM_SWITCH_EVENT);
                    if (cflr.m139933j() && cflr.f184273a.mo6606a().mo81400n()) {
                        agsl.m55046a().mo36056b();
                    }
                    f66300a.mo26019b(agyt.m55307c()).mo68435a("Subscription state changed. Periodic service enabled? %b Periodic fetch enabled? %b", cfmv.m140313l(), cfmv.m140317p());
                }
            } catch (SecurityException e) {
                bnsl bnsl = (bnsl) f66300a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Security exception when counting active subscriptions");
            }
        }
    }
}
