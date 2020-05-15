package com.google.android.gms.tapandpay.account;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountServicesChangedIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108308a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        try {
            if ("com.google.android.gms.auth.ACCOUNT_SERVICES_CHANGED".equals(intent.getAction())) {
                aebi aebi = new aebi();
                aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
                aebi.f63099k = "paymentsdisabledoneoff.sync";
                aebi.mo34004a(0L, 1L);
                aebi.mo34023a(0);
                aebi.mo34024a(0, 0);
                aebi.mo34027b(1);
                aeat.m51532a(this).mo33984a(aebi.mo33974b());
                return;
            }
            intent.getAction();
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f108308a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.account.AccountServicesChangedIntentOperation", "a", 33, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error handling intent: com.google.android.gms.auth.ACCOUNT_SERVICES_CHANGED");
        }
    }
}
