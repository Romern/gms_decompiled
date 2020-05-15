package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjh */
public final /* synthetic */ class axjh implements aubw {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96038a;

    /* renamed from: b */
    private final axkn f96039b;

    /* renamed from: c */
    private final String f96040c;

    /* renamed from: d */
    private final String f96041d;

    /* renamed from: e */
    private final boolean f96042e;

    public axjh(TransferMoneyChimeraActivity transferMoneyChimeraActivity, axkn axkn, String str, String str2, boolean z) {
        this.f96038a = transferMoneyChimeraActivity;
        this.f96039b = axkn;
        this.f96040c = str;
        this.f96041d = str2;
        this.f96042e = z;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96038a;
        axkn axkn = this.f96039b;
        String str = this.f96040c;
        String str2 = this.f96041d;
        boolean z = this.f96042e;
        axnq axnq = (axnq) obj;
        if (transferMoneyChimeraActivity.isDestroyed()) {
            return;
        }
        if (!axnq.f96204a.mo17710c()) {
            transferMoneyChimeraActivity.mo53238P(48);
            int i = axnq.f96204a.f30115i;
            if (i == 7) {
                transferMoneyChimeraActivity.mo60187a(new axjy(transferMoneyChimeraActivity, str, str2, z, axkn));
            } else if (i != 16500) {
                if (i != 16501) {
                    transferMoneyChimeraActivity.mo60199n();
                } else {
                    transferMoneyChimeraActivity.mo60202q();
                }
            } else if (!z) {
                transferMoneyChimeraActivity.mo53238P(58);
                transferMoneyChimeraActivity.f110714b.mo60203a(aux.m2149a(transferMoneyChimeraActivity.getResources(), C0126R.C0127drawable.quantum_ic_error_outline_vd_theme_24, transferMoneyChimeraActivity.getTheme()), transferMoneyChimeraActivity.getString(C0126R.string.walletp2p_invalid_transaction_title), transferMoneyChimeraActivity.getString(C0126R.string.walletp2p_invalid_transaction_single_account_content), transferMoneyChimeraActivity.getString(C0126R.string.close_button_label), new axjs(transferMoneyChimeraActivity), transferMoneyChimeraActivity.getString(C0126R.string.walletp2p_change_accounts), new axjt(transferMoneyChimeraActivity));
                transferMoneyChimeraActivity.f110720h.mo60211b(3);
            } else {
                transferMoneyChimeraActivity.mo60201p();
            }
        } else if (axnq.f96205b.f110819c != null) {
            transferMoneyChimeraActivity.mo53238P(48);
            transferMoneyChimeraActivity.mo60185a(axnq.f96205b.f110819c);
        } else {
            transferMoneyChimeraActivity.mo53238P(47);
            axkn.mo53196a(axnq.f96205b);
        }
    }
}
