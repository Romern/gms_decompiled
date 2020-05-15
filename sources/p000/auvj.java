package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyChimeraActivity;

/* renamed from: auvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auvj implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ PromoteScreenLockAndOnbodyChimeraActivity f92599a;

    public auvj(PromoteScreenLockAndOnbodyChimeraActivity promoteScreenLockAndOnbodyChimeraActivity) {
        this.f92599a = promoteScreenLockAndOnbodyChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new aumg(this.f92599a, 3, bundle);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        aume aume = (aume) obj;
        this.f92599a.getSupportLoaderManager().destroyLoader(0);
        Bundle bundle = aume.f92072b;
        if (aume.f92071a.f30115i == 0) {
            boolean z = bundle.getBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key");
            PromoteScreenLockAndOnbodyChimeraActivity.f109232a.mo50711a("Trustagent result return, isStarted: %s", Boolean.valueOf(z));
            this.f92599a.f109234b.mo50953a(z);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
