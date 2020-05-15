package p000;

import android.view.View;
import com.google.android.gms.trustagent.TrustAgentOnboardingChimeraActivity;
import com.google.android.gms.trustagent.common.p070ui.ConfirmUserCredentialAndStartChimeraActivity;

/* renamed from: auld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auld implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TrustAgentOnboardingChimeraActivity f92024a;

    public auld(TrustAgentOnboardingChimeraActivity trustAgentOnboardingChimeraActivity) {
        this.f92024a = trustAgentOnboardingChimeraActivity;
    }

    public void onClick(View view) {
        this.f92024a.mo59549a(37);
        TrustAgentOnboardingChimeraActivity trustAgentOnboardingChimeraActivity = this.f92024a;
        if (trustAgentOnboardingChimeraActivity.f109131g) {
            this.f92024a.startActivity(ConfirmUserCredentialAndStartChimeraActivity.m93423a(trustAgentOnboardingChimeraActivity.f109129e, trustAgentOnboardingChimeraActivity.f109130f));
            this.f92024a.finish();
            return;
        }
        this.f92024a.startActivityForResult(aupm.m77568a(trustAgentOnboardingChimeraActivity.f109129e), 1);
    }
}
