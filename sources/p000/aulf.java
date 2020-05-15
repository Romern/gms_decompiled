package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.trustagent.TrustAgentOnboardingChimeraActivity;

/* renamed from: aulf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aulf implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ TrustAgentOnboardingChimeraActivity f92026a;

    public aulf(TrustAgentOnboardingChimeraActivity trustAgentOnboardingChimeraActivity) {
        this.f92026a = trustAgentOnboardingChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new aumg(this.f92026a, 3, bundle);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        aume aume = (aume) obj;
        Bundle bundle = aume.f92072b;
        if (aume.f92071a.f30115i == 0) {
            this.f92026a.f109128d = bundle.getBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key");
            TrustAgentOnboardingChimeraActivity.f109125b.mo50711a("Trustagent result return, isStarted: %s", Boolean.valueOf(this.f92026a.f109128d));
            TrustAgentOnboardingChimeraActivity trustAgentOnboardingChimeraActivity = this.f92026a;
            if (!trustAgentOnboardingChimeraActivity.f109128d) {
                trustAgentOnboardingChimeraActivity.mo59549a(40);
            }
            trustAgentOnboardingChimeraActivity.mo59550a(false);
            trustAgentOnboardingChimeraActivity.mo59551e();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
