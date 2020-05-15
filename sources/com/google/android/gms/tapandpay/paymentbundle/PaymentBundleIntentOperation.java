package com.google.android.gms.tapandpay.paymentbundle;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentBundleIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108618a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        try {
            if ("com.google.android.gms.tapandpay.paymentbundle.SCHEDULE_REFRESHES_ACTION".equals(intent.getAction())) {
                new atbq().mo49783a(this, askc.m74272b());
            }
        } catch (asks | RuntimeException e) {
            bnsl bnsl = (bnsl) f108618a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.paymentbundle.PaymentBundleIntentOperation", "a", 39, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error handling intent");
        }
    }
}
