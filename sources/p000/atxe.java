package p000;

import android.view.View;
import com.felicanetworks.mfc.mfi.MfiClient;
import com.google.android.chimera.Activity;

/* renamed from: atxe */
final /* synthetic */ class atxe implements View.OnClickListener {

    /* renamed from: a */
    private final atxg f91072a;

    public atxe(atxg atxg) {
        this.f91072a = atxg;
    }

    public void onClick(View view) {
        Activity activity = this.f91072a.getActivity();
        if (activity != null && !activity.isFinishing()) {
            atxg.m76498a(activity, 51);
            atxm atxm = new atxm();
            atxm.f91082a = "GmsCoreWarmWelcome";
            atxm.mo50305a(MfiClient.ACCOUNT_ISSUER_GOOGLE, "no_app", "tp2_gms_core_warm_welcome");
            activity.startActivity(atxm.mo50304a());
            activity.finish();
        }
    }
}
