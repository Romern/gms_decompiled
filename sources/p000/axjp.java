package p000;

import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjp */
public final /* synthetic */ class axjp implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96051a;

    public axjp(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96051a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96051a;
        if (transferMoneyChimeraActivity.f110715c.mo70852a() == 0) {
            transferMoneyChimeraActivity.f110715c.mo70857b();
            transferMoneyChimeraActivity.f110715c.announceForAccessibility(transferMoneyChimeraActivity.getString(C0126R.string.walletp2p_invalid_amount));
        } else if (transferMoneyChimeraActivity.f110725m.mo60155b() && TextUtils.isEmpty(transferMoneyChimeraActivity.f110725m.f110645d)) {
            transferMoneyChimeraActivity.mo60196k();
        } else if (transferMoneyChimeraActivity.f110736x.mo53094l()) {
            transferMoneyChimeraActivity.f110720h.mo60211b(4);
            ((Toolbar) transferMoneyChimeraActivity.findViewById(C0126R.C0129id.memo_toolbar)).mo1684c((int) C0126R.string.common_back);
            transferMoneyChimeraActivity.f110719g.setHint(String.format(transferMoneyChimeraActivity.getString(C0126R.string.walletp2p_memo_hint_text), "🍔 🍕"));
            if (transferMoneyChimeraActivity.getResources().getConfiguration().orientation == 1) {
                transferMoneyChimeraActivity.f110719g.requestFocus();
                transferMoneyChimeraActivity.f110719g.setLongClickable(false);
                ((InputMethodManager) transferMoneyChimeraActivity.getSystemService("input_method")).toggleSoftInput(2, 1);
                transferMoneyChimeraActivity.f110719g.announceForAccessibility(transferMoneyChimeraActivity.getString(C0126R.string.walletp2p_memo_title));
            }
            Button button = (Button) transferMoneyChimeraActivity.findViewById(C0126R.C0129id.memo_transfer_button);
            if (chlq.m148935b()) {
                button.setText(transferMoneyChimeraActivity.f110736x.mo53075a(transferMoneyChimeraActivity));
            } else {
                button.setText((int) C0126R.string.common_done);
            }
            button.setOnClickListener(new axjb(transferMoneyChimeraActivity));
        } else {
            transferMoneyChimeraActivity.mo60196k();
        }
    }
}
