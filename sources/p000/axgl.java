package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axgl */
public final /* synthetic */ class axgl implements axls {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95912a;

    public axgl(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95912a = completeMoneyTransferChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95912a;
        bzvu bzvu = ((axlt) obj).f96158b;
        if (bzvu == null) {
            completeMoneyTransferChimeraActivity.mo53238P(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
            completeMoneyTransferChimeraActivity.mo60174j();
            return;
        }
        completeMoneyTransferChimeraActivity.mo60164a(axep.m82424a(completeMoneyTransferChimeraActivity, bzvu));
    }
}
