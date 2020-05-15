package p000;

import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axgp */
public final /* synthetic */ class axgp implements Runnable {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95917a;

    public axgp(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95917a = completeMoneyTransferChimeraActivity;
    }

    public final void run() {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95917a;
        if (completeMoneyTransferChimeraActivity.f110668m != null) {
            completeMoneyTransferChimeraActivity.f110662e.setText(String.format(completeMoneyTransferChimeraActivity.f110673r.mo53081c(completeMoneyTransferChimeraActivity), completeMoneyTransferChimeraActivity.f110668m.f110821b));
            return;
        }
        completeMoneyTransferChimeraActivity.f110662e.setText(completeMoneyTransferChimeraActivity.f110673r.mo53081c(completeMoneyTransferChimeraActivity));
    }
}
