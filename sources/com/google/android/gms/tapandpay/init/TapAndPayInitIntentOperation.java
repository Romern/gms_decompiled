package com.google.android.gms.tapandpay.init;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayInitIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f108520a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public final void onHandleIntent(Intent intent) {
        try {
            if (!"com.google.android.gms.tapandpay.init.INIT_ACTION".equals(intent.getAction())) {
                bnsl bnsl = (bnsl) f108520a.mo68388c();
                bnsl.mo68432a("com.google.android.gms.tapandpay.init.TapAndPayInitIntentOperation", "onHandleIntent", 26, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Invalid action: %s", intent.getAction());
                return;
            }
            if (intent.getBooleanExtra("is_boot", false)) {
                aswf.m74927b(this);
            }
            aswf.m74926a(this);
        } catch (RuntimeException e) {
            bnsl bnsl2 = (bnsl) f108520a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("com.google.android.gms.tapandpay.init.TapAndPayInitIntentOperation", "onHandleIntent", 35, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Error handling intent");
        }
    }
}
