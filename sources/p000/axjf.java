package p000;

import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjf */
public final /* synthetic */ class axjf implements aubw {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96036a;

    public axjf(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96036a = transferMoneyChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96036a;
        axoc axoc = (axoc) obj;
        if (transferMoneyChimeraActivity.isDestroyed()) {
            return;
        }
        if (!axoc.f96207a.mo17710c()) {
            transferMoneyChimeraActivity.mo53238P(118);
            if (axoc.f96207a.f30115i == 7) {
                transferMoneyChimeraActivity.mo60187a(new axjz(transferMoneyChimeraActivity));
            } else {
                transferMoneyChimeraActivity.mo60199n();
            }
        } else if (axoc.f96208b.f110855g != null) {
            transferMoneyChimeraActivity.mo53238P(118);
            transferMoneyChimeraActivity.mo60185a(axoc.f96208b.f110855g);
        } else {
            transferMoneyChimeraActivity.mo53238P(119);
            transferMoneyChimeraActivity.f110734v = axoc.f96208b;
            transferMoneyChimeraActivity.mo60195j();
        }
    }
}
