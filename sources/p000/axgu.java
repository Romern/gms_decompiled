package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axgu */
public final /* synthetic */ class axgu implements axib {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95925a;

    public axgu(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95925a = completeMoneyTransferChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53144a(boolean z) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95925a;
        if (z) {
            completeMoneyTransferChimeraActivity.mo53238P(MfiClientException.TYPE_CARD_NOT_CACHED);
            completeMoneyTransferChimeraActivity.f110661d.mo60211b(0);
            completeMoneyTransferChimeraActivity.mo60171g();
            return;
        }
        completeMoneyTransferChimeraActivity.mo53238P(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION);
        completeMoneyTransferChimeraActivity.setResult(0);
        completeMoneyTransferChimeraActivity.finish();
    }
}
