package p000;

import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axfe */
final /* synthetic */ class axfe implements axls {

    /* renamed from: a */
    private final axhe f95878a;

    public axfe(axhe axhe) {
        this.f95878a = axhe;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        axhe axhe = this.f95878a;
        axlt axlt = (axlt) obj;
        int i = axlt.f96157a;
        bzvu bzvu = axlt.f96158b;
        if (!axhe.f95941b.isDestroyed()) {
            axhe.f95941b.mo53238P(69);
            if (i == 7) {
                axhe.f95941b.mo60165a(new axhd(axhe, axhe.f95940a));
            } else if (bzvu != null) {
                CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = axhe.f95941b;
                completeMoneyTransferChimeraActivity.mo60164a(axep.m82424a(completeMoneyTransferChimeraActivity, bzvu));
            } else {
                axhe.f95941b.mo60174j();
            }
        }
    }
}
