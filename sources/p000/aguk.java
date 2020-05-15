package p000;

import android.view.View;
import com.google.android.gms.mobiledataplan.p055ui.MobileDataPlanSettingsChimeraActivity;

/* renamed from: aguk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aguk implements View.OnClickListener {

    /* renamed from: a */
    private final agtw f66576a;

    public aguk(agtw agtw) {
        this.f66576a = agtw;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agve.a(agtw, boolean):void
     arg types: [agtw, int]
     candidates:
      agve.a(java.lang.String, agtw):void
      agve.a(agtw, boolean):void */
    public void onClick(View view) {
        MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity = this.f66576a.f66529a;
        if (mobileDataPlanSettingsChimeraActivity != null) {
            mobileDataPlanSettingsChimeraActivity.mo44118g();
        }
        agrl.m54942a().mo35987a(70, (String) null, "R.id.error_layout", bygd.CLICK_OPT_IN, System.currentTimeMillis(), agvh.m55172b());
        this.f66576a.mo36098b(true);
        agve.m55161a(this.f66576a, true);
    }
}
