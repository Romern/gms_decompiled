package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: asvq */
final /* synthetic */ class asvq implements rkl {

    /* renamed from: a */
    private final aswe f89820a;

    public asvq(aswe aswe) {
        this.f89820a = aswe;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        bngx bngx;
        aswe aswe = this.f89820a;
        asmj asmj = (asmj) rkk;
        Activity activity = aswe.getActivity();
        if (activity == null) {
            return;
        }
        if (asmj == null || !asmj.mo7183bo().mo17710c()) {
            activity.finish();
            return;
        }
        aswe.f89852o = asmj.mo49241b();
        CardInfo[] cardInfoArr = asmj.mo49241b().f108369a;
        if (cardInfoArr == null) {
            bngx = bngx.m109376e();
        } else {
            bngs bngs = new bngs();
            for (CardInfo cardInfo : cardInfoArr) {
                if (cardInfo.f108345f.f108459b != 1) {
                    bngs.mo67668c(cardInfo);
                }
            }
            bngx = bngs.mo67664a();
        }
        aswe.f89851n = bngx;
        aswe.mo49540a(activity);
    }
}
