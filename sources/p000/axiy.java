package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axiy */
public final /* synthetic */ class axiy implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96029a;

    public axiy(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96029a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96029a;
        transferMoneyChimeraActivity.f110718f.setVisibility(0);
        transferMoneyChimeraActivity.f110715c.setClickable(false);
    }
}
