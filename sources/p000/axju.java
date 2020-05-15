package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axju */
public final /* synthetic */ class axju implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96057a;

    public axju(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96057a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96057a;
        transferMoneyChimeraActivity.setResult(0);
        transferMoneyChimeraActivity.finish();
    }
}
