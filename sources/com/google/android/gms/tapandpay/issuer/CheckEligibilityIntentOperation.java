package com.google.android.gms.tapandpay.issuer;

import android.content.Intent;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckEligibilityIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108566a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        askf askf = new askf((AccountInfo) intent.getParcelableExtra("extra_account_info"), askc.m74272b(), this);
        btkb btkb = (btkb) btkc.f149218n.mo74144da();
        btmr a = atvf.m76450a(this);
        if (btkb.f164950c) {
            btkb.mo74035c();
            btkb.f164950c = false;
        }
        btkc btkc = (btkc) btkb.f164949b;
        a.getClass();
        btkc.f149221b = a;
        btkc.f149224e = btna.m116942a(5);
        btkb.mo70823c(atrp.f90735d);
        btkb.mo70822b(atrp.f90732a);
        String packageName = getPackageName();
        if (btkb.f164950c) {
            btkb.mo74035c();
            btkb.f164950c = false;
        }
        packageName.getClass();
        ((btkc) btkb.f164949b).f149227h = packageName;
        btkb.mo70821a(aszs.m75257a());
        if (intent.hasExtra("extra_client_provisioning_session_id")) {
            String stringExtra = intent.getStringExtra("extra_client_provisioning_session_id");
            if (btkb.f164950c) {
                btkb.mo74035c();
                btkb.f164950c = false;
            }
            stringExtra.getClass();
            ((btkc) btkb.f164949b).f149223d = stringExtra;
        }
        if (intent.hasExtra("extra_server_provisioning_session_id")) {
            String stringExtra2 = intent.getStringExtra("extra_server_provisioning_session_id");
            if (btkb.f164950c) {
                btkb.mo74035c();
                btkb.f164950c = false;
            }
            stringExtra2.getClass();
            ((btkc) btkb.f164949b).f149232m = stringExtra2;
        }
        try {
            atff.m75759a(askf, "t/cardtokenization/checkeligibility", btkb.mo74062i(), btkd.f149233h);
        } catch (atfh | IOException e) {
            bnsl bnsl = (bnsl) f108566a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Exception while calling check eligibility");
        }
    }
}
