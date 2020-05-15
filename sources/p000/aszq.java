package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

/* renamed from: aszq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aszq {

    /* renamed from: a */
    private static final srn f89922a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static void m75253a(askf askf, bmuw bmuw, Intent intent) {
        Context context = askf.f89126d;
        String string = context.getString(C0126R.string.tp_finish_adding_your_card_notification_title, bmuw.f130981e);
        C1102je a = atbg.m75368a(context, atbf.ALERTS);
        atbg.m75376b(a, string);
        C1102je a2 = atbg.m75368a(context, atbf.ALERTS);
        a2.mo13640e(context.getString(C0126R.string.tp_finish_adding_your_card_notification_title_sensitive));
        a.f22273y = a2.mo13629b();
        Intent a3 = RequestTokenizeChimeraActivity.m93053a(askf, intent, bmuw);
        a3.addFlags(268468224);
        a.f22254f = PendingIntent.getActivity(context, bmuw.f130977a.hashCode(), a3, 134217728);
        atbg.m75378d(a, bmuw.f130986j);
        a.mo13627a(true);
        f89922a.mo26019b(aske.m74275a()).mo68405a("Notifying user to complete web tokenization");
        atbg.m75371a(context, "web_push_provisioning_notification_id", a);
    }
}
