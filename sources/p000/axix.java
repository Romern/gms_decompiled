package p000;

import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axix */
public final /* synthetic */ class axix implements aubt {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96028a;

    public axix(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96028a = transferMoneyChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96028a;
        transferMoneyChimeraActivity.mo53238P(149);
        if (transferMoneyChimeraActivity.f110725m.f110653l == 9) {
            transferMoneyChimeraActivity.mo60184a(transferMoneyChimeraActivity.getIntent().getData());
        } else {
            transferMoneyChimeraActivity.mo60200o();
        }
    }
}
