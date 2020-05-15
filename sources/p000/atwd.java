package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;

/* renamed from: atwd */
public final /* synthetic */ class atwd implements View.OnClickListener {

    /* renamed from: a */
    private final WalletTransactionDetailsChimeraActivity f91038a;

    /* renamed from: b */
    private final Uri f91039b;

    public atwd(WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity, Uri uri) {
        this.f91038a = walletTransactionDetailsChimeraActivity;
        this.f91039b = uri;
    }

    public void onClick(View view) {
        this.f91038a.startActivity(new Intent("android.intent.action.VIEW", this.f91039b));
    }
}
