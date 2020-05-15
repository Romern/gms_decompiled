package p000;

import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axgv */
final /* synthetic */ class axgv implements Runnable {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95926a;

    public axgv(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95926a = completeMoneyTransferChimeraActivity;
    }

    public final void run() {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95926a;
        if (!completeMoneyTransferChimeraActivity.isDestroyed()) {
            completeMoneyTransferChimeraActivity.mo60172h();
        }
    }
}
