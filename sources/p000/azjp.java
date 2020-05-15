package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.settings.MatchstickSettingsChimeraActivity;

/* renamed from: azjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azjp implements suh {

    /* renamed from: a */
    final /* synthetic */ MatchstickSettingsChimeraActivity f99526a;

    public azjp(MatchstickSettingsChimeraActivity matchstickSettingsChimeraActivity) {
        this.f99526a = matchstickSettingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        this.f99526a.getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(C0126R.C0129id.fragment_container, new azit(), "storage_management_fragment").commitAllowingStateLoss();
    }
}
