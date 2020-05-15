package p000;

import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axgm */
final /* synthetic */ class axgm implements aubw {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95913a;

    public axgm(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95913a = completeMoneyTransferChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95913a;
        axnn axnn = (axnn) obj;
        if (!axnn.f96202a.mo17710c()) {
            completeMoneyTransferChimeraActivity.mo53238P(109);
            completeMoneyTransferChimeraActivity.mo60174j();
        } else if (completeMoneyTransferChimeraActivity.isDestroyed()) {
        } else {
            if (axnn.f96203b.f110813b != null) {
                completeMoneyTransferChimeraActivity.mo53238P(109);
                completeMoneyTransferChimeraActivity.mo60164a(axnn.f96203b.f110813b);
                return;
            }
            completeMoneyTransferChimeraActivity.mo53238P(108);
            awlb awlb = new awlb(completeMoneyTransferChimeraActivity);
            awlb.mo52187a(axmb.m82713a(axmb.m82712a()) ? 1 : 0);
            awlb.mo52188a(completeMoneyTransferChimeraActivity.f110671p);
            awlb.mo52191b();
            awlb.mo52231a(axnn.f96203b.f110812a);
            awlb.mo52190a(axmh.m82720a());
            awlb.mo52192b(3);
            completeMoneyTransferChimeraActivity.startActivityForResult(awlb.mo52186a(), 1);
        }
    }
}
