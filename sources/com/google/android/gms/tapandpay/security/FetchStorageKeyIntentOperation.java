package com.google.android.gms.tapandpay.security;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FetchStorageKeyIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108656a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        try {
            Context applicationContext = getApplicationContext();
            if (intent != null && "com.google.android.gms.tapandpay.security.FETCH_STORAGE_KEY_ACTION".equals(intent.getAction())) {
                if (new athq().mo49998a(applicationContext, askc.m74272b()) == 2) {
                    aebi aebi = new aebi();
                    aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
                    aebi.mo34023a(0);
                    aebi.mo34004a(0L, 1L);
                    aebi.mo34027b(1);
                    aebi.f63099k = "fetch_storage_key";
                    aeat.m51532a(applicationContext).mo33984a(aebi.mo33974b());
                    return;
                }
                atcj.m75548a(applicationContext);
            }
        } catch (asks | RuntimeException e) {
            bnsl bnsl = (bnsl) f108656a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.security.FetchStorageKeyIntentOperation", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error handling intent");
        }
    }
}
