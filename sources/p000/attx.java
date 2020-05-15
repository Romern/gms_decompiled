package p000;

import android.content.Intent;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attx extends atue {

    /* renamed from: a */
    private static final srn f90892a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public attx(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i2 != -1) {
            if (i2 != 8) {
                bnsl bnsl = (bnsl) f90892a.mo68388c();
                bnsl.mo68432a("attx", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("Add account for wear returned result code %s", i2);
                mo50187b(i2, 9);
                mo50178a();
                return;
            }
            mo50189c();
        } else if (intent != null && intent.hasExtra("extra_account_info")) {
            TokenizePanChimeraActivity tokenizePanChimeraActivity = this.f90898f;
            AccountInfo accountInfo = (AccountInfo) intent.getParcelableExtra("extra_account_info");
            tokenizePanChimeraActivity.f108906c.f90857t = accountInfo;
            tokenizePanChimeraActivity.mo49917k().f90210a = accountInfo;
            atsy.f90839b = 4;
        } else {
            bnsl bnsl2 = (bnsl) f90892a.mo68388c();
            bnsl2.mo68432a("attx", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Select account for wear returned success but no account");
            mo50178a();
        }
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        if (atsy.f90857t.f108326b.isEmpty()) {
            mo50181a(new Intent().setClassName(this.f90898f, "com.google.android.gms.tapandpay.account.SelectAccountActivity").putExtra("extra_calling_package", atsy.f90861x), 14);
        } else {
            mo50180a(4, atsy);
        }
    }
}
