package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;

/* renamed from: atwe */
public final /* synthetic */ class atwe implements View.OnClickListener {

    /* renamed from: a */
    private final WalletTransactionDetailsChimeraActivity f91040a;

    /* renamed from: b */
    private final Uri f91041b;

    public atwe(WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity, Uri uri) {
        this.f91040a = walletTransactionDetailsChimeraActivity;
        this.f91041b = uri;
    }

    public void onClick(View view) {
        this.f91040a.startActivity(new Intent("android.intent.action.VIEW", this.f91041b));
    }
}
