package p000;

import android.view.View;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;

/* renamed from: agwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agwv extends agxt {
    public agwv(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo36171a(MdpUpsellPlan mdpUpsellPlan) {
        super.mo36171a(mdpUpsellPlan);
        if (this.f201a.getVisibility() == 0) {
            this.f66810s.getViewTreeObserver().addOnGlobalLayoutListener(new agwu(this.f66810s));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36173b(MdpUpsellPlan mdpUpsellPlan, View view) {
        agrl.m54942a().mo35987a(47, mdpUpsellPlan.f80232a, agvn.m55186b(view), bygd.CLICK_CANCEL_REPURCHASE, System.currentTimeMillis(), agvh.m55172b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo36174c(MdpUpsellPlan mdpUpsellPlan, View view) {
        agrl.m54942a().mo35987a(46, mdpUpsellPlan.f80232a, agvn.m55186b(view), bygd.CLICK_CONFIRM_REPURCHASE, System.currentTimeMillis(), agvh.m55172b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36172a(MdpUpsellPlan mdpUpsellPlan, View view) {
        agrl.m54942a().mo35987a(45, mdpUpsellPlan.f80232a, agvn.m55186b(view), bygd.VIEW_REPURCHASE_DETAILS, System.currentTimeMillis(), agvh.m55172b());
    }
}
