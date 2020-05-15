package p000;

import android.telephony.SubscriptionManager;
import com.google.android.gms.mobiledataplan.service.MobileDataPlanModuleInitIntentOperation;

/* renamed from: agsb */
public final /* synthetic */ class agsb implements Runnable {

    /* renamed from: a */
    public static final Runnable f66346a = new agsb();

    private agsb() {
    }

    public final void run() {
        srn srn = MobileDataPlanModuleInitIntentOperation.f80317a;
        SubscriptionManager subscriptionManager = (SubscriptionManager) rpr.m34216b().getSystemService("telephony_subscription_service");
        if (subscriptionManager != null) {
            try {
                subscriptionManager.addOnSubscriptionsChangedListener(new agqx());
                MobileDataPlanModuleInitIntentOperation.f80317a.mo26019b(agyt.m55307c()).mo68420a("%s: registered subscription change listener", "ModuleInit");
            } catch (SecurityException e) {
                bnsl bnsl = (bnsl) MobileDataPlanModuleInitIntentOperation.f80317a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Security exception when registering subscription change listener");
            }
        } else {
            ((bnsl) MobileDataPlanModuleInitIntentOperation.f80317a.mo68388c()).mo68405a("Couldn't register subscription change listener because SubscriptionManager is null");
        }
    }
}
