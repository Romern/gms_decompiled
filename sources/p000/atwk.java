package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;

/* renamed from: atwk */
public final /* synthetic */ class atwk implements View.OnClickListener {

    /* renamed from: a */
    private final WalletTransactionDetailsChimeraActivity f91050a;

    public atwk(WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity) {
        this.f91050a = walletTransactionDetailsChimeraActivity;
    }

    public void onClick(View view) {
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity = this.f91050a;
        walletTransactionDetailsChimeraActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(String.format("tel:%s", walletTransactionDetailsChimeraActivity.f108943g))));
    }
}
