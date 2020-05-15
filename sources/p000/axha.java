package p000;

import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axha */
public final /* synthetic */ class axha implements axls {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95932a;

    /* renamed from: b */
    private final long f95933b;

    /* renamed from: c */
    private final String f95934c;

    /* renamed from: d */
    private final String f95935d;

    public axha(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity, long j, String str, String str2) {
        this.f95932a = completeMoneyTransferChimeraActivity;
        this.f95933b = j;
        this.f95934c = str;
        this.f95935d = str2;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95932a;
        long j = this.f95933b;
        String str = this.f95934c;
        String str2 = this.f95935d;
        axlt axlt = (axlt) obj;
        if (!completeMoneyTransferChimeraActivity.isDestroyed()) {
            completeMoneyTransferChimeraActivity.mo53238P(125);
            bzvu bzvu = axlt.f96158b;
            if (bzvu != null) {
                completeMoneyTransferChimeraActivity.mo60164a(axep.m82424a(completeMoneyTransferChimeraActivity, bzvu));
            } else if (axlt.f96157a == 7) {
                completeMoneyTransferChimeraActivity.mo60165a(new axgt(completeMoneyTransferChimeraActivity, j, str, str2));
            } else {
                completeMoneyTransferChimeraActivity.mo60174j();
            }
        }
    }
}
