package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;

/* renamed from: atwh */
public final /* synthetic */ class atwh implements View.OnClickListener {

    /* renamed from: a */
    private final WalletTransactionDetailsChimeraActivity f91046a;

    /* renamed from: b */
    private final String f91047b;

    public atwh(WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity, String str) {
        this.f91046a = walletTransactionDetailsChimeraActivity;
        this.f91047b = str;
    }

    public void onClick(View view) {
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity = this.f91046a;
        String str = this.f91047b;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        walletTransactionDetailsChimeraActivity.startActivity(intent);
    }
}
