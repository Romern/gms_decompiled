package p000;

import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axiw */
public final /* synthetic */ class axiw implements aubw {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96027a;

    public axiw(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96027a = transferMoneyChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96027a;
        rjr rjr = (rjr) obj;
        if (!transferMoneyChimeraActivity.isFinishing() && !transferMoneyChimeraActivity.isDestroyed()) {
            if (!rjr.f43155b) {
                transferMoneyChimeraActivity.mo53238P(149);
                if (transferMoneyChimeraActivity.f110725m.f110653l == 9) {
                    transferMoneyChimeraActivity.mo60184a(transferMoneyChimeraActivity.getIntent().getData());
                } else {
                    transferMoneyChimeraActivity.mo60200o();
                }
            } else {
                transferMoneyChimeraActivity.mo53238P(148);
                transferMoneyChimeraActivity.f110727o = true;
                transferMoneyChimeraActivity.mo60191e();
            }
        }
    }
}
