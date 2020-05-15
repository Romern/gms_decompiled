package p000;

import android.view.View;
import com.google.android.gms.mobiledataplan.p055ui.MobileDataPlanDetailChimeraActivity;

/* renamed from: aguc */
public final /* synthetic */ class aguc implements View.OnClickListener {

    /* renamed from: a */
    private final MobileDataPlanDetailChimeraActivity f66567a;

    public aguc(MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity) {
        this.f66567a = mobileDataPlanDetailChimeraActivity;
    }

    public void onClick(View view) {
        MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity = this.f66567a;
        agrl.m54942a().mo35987a(29, mobileDataPlanDetailChimeraActivity.f80323b.getText().toString(), agvn.m55186b(view), bygd.CLICK_CONSENT_CONTINUE, System.currentTimeMillis(), Integer.valueOf(mobileDataPlanDetailChimeraActivity.f80326e));
        if (!mobileDataPlanDetailChimeraActivity.f80325d.pageDown(false)) {
            mobileDataPlanDetailChimeraActivity.mo44112a(true);
        }
    }
}
