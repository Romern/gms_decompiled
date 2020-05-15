package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjs */
final /* synthetic */ class axjs implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96055a;

    public axjs(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96055a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96055a;
        transferMoneyChimeraActivity.setResult(0);
        transferMoneyChimeraActivity.finish();
    }
}
