package com.google.android.gms.tapandpay.account;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AndroidIdValidationIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108309a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        if (intent != null) {
            try {
                asit.m74179a(asjm.m74238a(this), this, askc.m74272b(), asko.m74292a(this).mo49214a());
            } catch (asks | RuntimeException e) {
                bnsl bnsl = (bnsl) f108309a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.tapandpay.account.AndroidIdValidationIntentOperation", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error handling intent");
            }
        }
    }
}
