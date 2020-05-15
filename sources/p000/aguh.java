package p000;

import android.content.DialogInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.p055ui.MobileDataPlanSettingsChimeraActivity;

/* renamed from: aguh */
public final /* synthetic */ class aguh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final MobileDataPlanSettingsChimeraActivity f66572a;

    public aguh(MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity) {
        this.f66572a = mobileDataPlanSettingsChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agve.a(agtw, boolean):void
     arg types: [agtw, int]
     candidates:
      agve.a(java.lang.String, agtw):void
      agve.a(agtw, boolean):void */
    public final void onClick(DialogInterface dialogInterface, int i) {
        MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity = this.f66572a;
        agrl.m54942a().mo35987a(31, (String) null, (String) null, bygd.CLICK_STOP_SYNCING_PLAN, System.currentTimeMillis(), agvh.m55172b());
        if (agqg.m54865t().booleanValue()) {
            agve.m55161a(mobileDataPlanSettingsChimeraActivity.f80332c, false);
        }
        mobileDataPlanSettingsChimeraActivity.mo44115a(new rjp(new Status(27023)));
    }
}
