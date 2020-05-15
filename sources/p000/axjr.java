package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjr */
public final /* synthetic */ class axjr implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96054a;

    public axjr(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96054a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96054a;
        transferMoneyChimeraActivity.setResult(0);
        transferMoneyChimeraActivity.finish();
    }
}
