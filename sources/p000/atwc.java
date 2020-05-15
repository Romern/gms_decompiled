package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;

/* renamed from: atwc */
public final /* synthetic */ class atwc implements View.OnClickListener {

    /* renamed from: a */
    private final WalletTransactionDetailsChimeraActivity f91037a;

    public atwc(WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity) {
        this.f91037a = walletTransactionDetailsChimeraActivity;
    }

    public void onClick(View view) {
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity = this.f91037a;
        Intent intent = new Intent("com.google.commerce.tapandpay.android.cardlist.START_GOOGLE_PAY");
        if (atxn.m76506a(walletTransactionDetailsChimeraActivity, intent)) {
            walletTransactionDetailsChimeraActivity.startActivity(intent);
        }
        bnsl bnsl = (bnsl) WalletTransactionDetailsChimeraActivity.f108938b.mo68390d();
        bnsl.mo68432a("com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity", "a", 343, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("User closing WalletTransactionDetailsActivity.");
        walletTransactionDetailsChimeraActivity.finish();
    }
}
