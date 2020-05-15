package p000;

import android.view.View;
import com.google.android.gms.mobiledataplan.p055ui.MobileDataPlanDetailChimeraActivity;

/* renamed from: ague */
public final /* synthetic */ class ague implements View.OnClickListener {

    /* renamed from: a */
    private final MobileDataPlanDetailChimeraActivity f66569a;

    public ague(MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity) {
        this.f66569a = mobileDataPlanDetailChimeraActivity;
    }

    public void onClick(View view) {
        MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity = this.f66569a;
        agrl.m54942a().mo35987a(30, mobileDataPlanDetailChimeraActivity.f80323b.getText().toString(), agvn.m55186b(view), bygd.CLICK_CONSENT_AGREE, System.currentTimeMillis(), Integer.valueOf(mobileDataPlanDetailChimeraActivity.f80326e));
        mobileDataPlanDetailChimeraActivity.mo44113b(true);
    }
}
