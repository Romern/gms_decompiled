package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjw */
public final /* synthetic */ class axjw implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96059a;

    public axjw(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96059a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96059a;
        transferMoneyChimeraActivity.setResult(0);
        transferMoneyChimeraActivity.finish();
    }
}
