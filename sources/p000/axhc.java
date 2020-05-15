package p000;

import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axhc */
public final /* synthetic */ class axhc implements axls {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95937a;

    public axhc(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95937a = completeMoneyTransferChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95937a;
        axlt axlt = (axlt) obj;
        completeMoneyTransferChimeraActivity.mo53238P(173);
        if (axlt.f96157a != 7) {
            bzvu bzvu = axlt.f96158b;
            if (bzvu != null) {
                completeMoneyTransferChimeraActivity.mo60164a(axep.m82424a(completeMoneyTransferChimeraActivity, bzvu));
            } else {
                completeMoneyTransferChimeraActivity.mo60174j();
            }
        } else {
            completeMoneyTransferChimeraActivity.mo60165a(new axfo(completeMoneyTransferChimeraActivity));
        }
    }
}
