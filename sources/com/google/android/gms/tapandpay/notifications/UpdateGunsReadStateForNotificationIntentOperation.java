package com.google.android.gms.tapandpay.notifications;

import android.content.Intent;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateGunsReadStateForNotificationIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108617a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        String stringExtra = intent.getStringExtra("account_name");
        if (stringExtra == null) {
            bnsl bnsl = (bnsl) f108617a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.tapandpay.notifications.UpdateGunsReadStateForNotificationIntentOperation", "a", 36, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Provided intent contained no account name, finishing");
            return;
        }
        String stringExtra2 = intent.getStringExtra("account_id");
        if (stringExtra2 == null) {
            bnsl bnsl2 = (bnsl) f108617a.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.tapandpay.notifications.UpdateGunsReadStateForNotificationIntentOperation", "a", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Provided intent missing account id, finishing");
            return;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("coalesced_notification");
        if (byteArrayExtra == null) {
            bnsl bnsl3 = (bnsl) f108617a.mo68388c();
            bnsl3.mo68432a("com.google.android.gms.tapandpay.notifications.UpdateGunsReadStateForNotificationIntentOperation", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Provided intent missing CoalescedNotification, finishing");
            return;
        }
        int intExtra = intent.getIntExtra("read_state", -1);
        if (intExtra == -1) {
            bnsl bnsl4 = (bnsl) f108617a.mo68388c();
            bnsl4.mo68432a("com.google.android.gms.tapandpay.notifications.UpdateGunsReadStateForNotificationIntentOperation", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Provided intent missing readState, finishing");
            return;
        }
        askf askf = new askf(stringExtra2, stringExtra, askc.m74272b(), this);
        int a = blch.m107015a(intExtra);
        try {
            new atav(askf, (blci) bxvk.m124016a(blci.f125923f, byteArrayExtra, bxus.m123744c()), a).mo49773a();
        } catch (bxwf e) {
            bnsl bnsl5 = (bnsl) f108617a.mo68388c();
            bnsl5.mo68437a(e);
            bnsl5.mo68432a("com.google.android.gms.tapandpay.notifications.UpdateGunsReadStateForNotificationIntentOperation", "a", 69, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Provided intent contained an invalid CoalescedNotification, finishing");
        } catch (RuntimeException e2) {
            bnsl bnsl6 = (bnsl) f108617a.mo68387b();
            bnsl6.mo68437a(e2);
            bnsl6.mo68432a("com.google.android.gms.tapandpay.notifications.UpdateGunsReadStateForNotificationIntentOperation", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Error handling intent");
        }
        CardInfo cardInfo = (CardInfo) intent.getParcelableExtra("card_info");
        if (cardInfo == null) {
            bnsl bnsl7 = (bnsl) f108617a.mo68388c();
            bnsl7.mo68432a("com.google.android.gms.tapandpay.notifications.UpdateGunsReadStateForNotificationIntentOperation", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("Provided intent missing cardInfo");
        }
        atam atam = new atam(askf);
        int i = a - 1;
        btml btml = btml.UNKNOWN_SETUP_STEP_TYPE;
        btnv btnv = btnv.UNKNOWN_ACTIVATION_METHOD_TYPE;
        if (a == 0) {
            throw null;
        } else if (i == 2) {
            atam.mo49741a(atam.mo49735a(67, cardInfo));
        } else if (i == 4) {
            atam.mo49741a(atam.mo49735a(22, cardInfo));
        } else if (i == 5) {
            atam.mo49741a(atam.mo49735a(66, cardInfo));
        }
    }
}
