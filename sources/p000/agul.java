package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: agul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agul implements View.OnClickListener {

    /* renamed from: a */
    private final agum f66577a;

    public agul(agum agum) {
        this.f66577a = agum;
    }

    public void onClick(View view) {
        agum agum = this.f66577a;
        agpk.m54726a().mo35828a(bygb.OPT_OUT, "CLIENT_MdpUx");
        agrl.m54942a().mo35987a(66, (String) null, "R.layout.settings_fragment", bygd.SETTINGS_REVOKE_CONSENT, System.currentTimeMillis(), Integer.valueOf(agum.f66580c));
        if (!agum.f66579b) {
            agum.startActivity(new Intent("com.google.android.gms.mobiledataplan.ui.DETAIL_SETTINGS_TO_MAIN").setClassName(agum.f66578a, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity"));
        }
        agum.f66578a.setResult(0);
        agum.f66578a.finish();
    }
}
