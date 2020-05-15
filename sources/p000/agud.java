package p000;

import android.view.View;
import com.google.android.gms.mobiledataplan.p055ui.MobileDataPlanDetailChimeraActivity;

/* renamed from: agud */
public final /* synthetic */ class agud implements View.OnClickListener {

    /* renamed from: a */
    private final MobileDataPlanDetailChimeraActivity f66568a;

    public agud(MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity) {
        this.f66568a = mobileDataPlanDetailChimeraActivity;
    }

    public void onClick(View view) {
        MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity = this.f66568a;
        agrl.m54942a().mo35987a(28, mobileDataPlanDetailChimeraActivity.f80324c.getText().toString(), agvn.m55186b(view), bygd.CLICK_CONSENT_DECLINE, System.currentTimeMillis(), Integer.valueOf(mobileDataPlanDetailChimeraActivity.f80326e));
        mobileDataPlanDetailChimeraActivity.mo44113b(false);
    }
}
