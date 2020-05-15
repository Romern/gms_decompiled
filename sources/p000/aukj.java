package p000;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: aukj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aukj implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aukk f91979a;

    public aukj(aukk aukk) {
        this.f91979a = aukk;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new aumg(this.f91979a.getActivity(), 3, bundle);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        aume aume = (aume) obj;
        Bundle bundle = aume.f92072b;
        if (aume.f92071a.f30115i == 0) {
            boolean z = bundle.getBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key");
            aukk.f91980c.mo50711a("Trustagent result return, isStarted: %s", Boolean.valueOf(z));
            aukk aukk = this.f91979a;
            if (z) {
                aukk.getFragmentManager().beginTransaction().replace(16908290, new aukv(), "PersonalUnlockingSettingsFragment").commitAllowingStateLoss();
                return;
            }
            aukk.f91981d.mo59548a(40);
            ((TextView) aukk.f91981d.findViewById(C0126R.C0129id.check_trustagent_started_hint)).setVisibility(0);
            ((TextView) aukk.f91981d.findViewById(C0126R.C0129id.check_trustagent_started_title)).setVisibility(0);
            ((LinearLayout) aukk.f91981d.findViewById(C0126R.C0129id.check_trustagent_started_spinner)).setVisibility(8);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
