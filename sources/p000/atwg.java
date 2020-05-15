package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;

/* renamed from: atwg */
public final /* synthetic */ class atwg implements View.OnClickListener {

    /* renamed from: a */
    private final WalletTransactionDetailsChimeraActivity f91044a;

    /* renamed from: b */
    private final Uri f91045b;

    public atwg(WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity, Uri uri) {
        this.f91044a = walletTransactionDetailsChimeraActivity;
        this.f91045b = uri;
    }

    public void onClick(View view) {
        this.f91044a.startActivity(new Intent("android.intent.action.DIAL", this.f91045b));
    }
}
