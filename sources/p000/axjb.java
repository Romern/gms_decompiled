package p000;

import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjb */
final /* synthetic */ class axjb implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96032a;

    public axjb(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96032a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96032a;
        ((InputMethodManager) transferMoneyChimeraActivity.getSystemService("input_method")).hideSoftInputFromWindow(transferMoneyChimeraActivity.f110719g.getWindowToken(), 0);
        transferMoneyChimeraActivity.f110725m.f110645d = transferMoneyChimeraActivity.f110719g.getText().toString();
        if (!TextUtils.isEmpty(transferMoneyChimeraActivity.f110725m.f110645d)) {
            transferMoneyChimeraActivity.mo53238P(130);
        } else {
            transferMoneyChimeraActivity.mo53238P(131);
        }
        transferMoneyChimeraActivity.mo60196k();
    }
}
