package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axfy */
public final /* synthetic */ class axfy implements axls {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95895a;

    public axfy(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95895a = completeMoneyTransferChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95895a;
        completeMoneyTransferChimeraActivity.mo53238P(MfiClientException.TYPE_MFICLIENT_NOT_FOUND);
        if (((axlt) obj).f96157a == 7) {
            completeMoneyTransferChimeraActivity.mo60165a(new axgw(completeMoneyTransferChimeraActivity));
        } else {
            completeMoneyTransferChimeraActivity.mo60174j();
        }
    }
}
