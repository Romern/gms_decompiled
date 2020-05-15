package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;

/* renamed from: atwf */
public final /* synthetic */ class atwf implements View.OnClickListener {

    /* renamed from: a */
    private final WalletTransactionDetailsChimeraActivity f91042a;

    /* renamed from: b */
    private final Uri f91043b;

    public atwf(WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity, Uri uri) {
        this.f91042a = walletTransactionDetailsChimeraActivity;
        this.f91043b = uri;
    }

    public void onClick(View view) {
        this.f91042a.startActivity(new Intent("android.intent.action.VIEW", this.f91043b));
    }
}
