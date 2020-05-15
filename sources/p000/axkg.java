package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axkg */
public final /* synthetic */ class axkg implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96074a;

    public axkg(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96074a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96074a;
        transferMoneyChimeraActivity.f110735w = transferMoneyChimeraActivity.f110733u.f96136d;
        transferMoneyChimeraActivity.f110717e.setText(transferMoneyChimeraActivity.f110736x.mo53074a(transferMoneyChimeraActivity, transferMoneyChimeraActivity.f110735w.f110821b));
        transferMoneyChimeraActivity.f110717e.setContentDescription(transferMoneyChimeraActivity.getString(C0126R.string.walletp2p_selected_payment_method_cd, new Object[]{transferMoneyChimeraActivity.f110735w.f110821b}));
        if (!stm.m36302d(transferMoneyChimeraActivity.f110735w.f110824e)) {
            transferMoneyChimeraActivity.f110716d.mo60205a(transferMoneyChimeraActivity.f110735w.f110824e, axkz.m82688a(), false, false);
        }
        transferMoneyChimeraActivity.onBackPressed();
    }
}
