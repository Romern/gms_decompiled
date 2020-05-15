package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axke */
public final /* synthetic */ class axke implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96072a;

    public axke(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96072a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96072a;
        transferMoneyChimeraActivity.mo53238P(180);
        transferMoneyChimeraActivity.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(chlq.f188754a.mo6606a().mo85334c())));
    }
}
