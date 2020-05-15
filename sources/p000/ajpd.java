package p000;

import android.transition.TransitionManager;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpd */
public final /* synthetic */ class ajpd implements aubw {

    /* renamed from: a */
    private final SettingsChimeraActivity f71084a;

    /* renamed from: b */
    private final boolean f71085b;

    public ajpd(SettingsChimeraActivity settingsChimeraActivity, boolean z) {
        this.f71084a = settingsChimeraActivity;
        this.f71085b = z;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71084a;
        Integer num = (Integer) obj;
        if (this.f71085b) {
            TransitionManager.beginDelayedTransition((ViewGroup) settingsChimeraActivity.findViewById(16908290));
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            settingsChimeraActivity.f80971j.setText((int) C0126R.string.sharing_visibility_option_hidden);
        } else if (intValue == 1) {
            settingsChimeraActivity.f80971j.setText((int) C0126R.string.sharing_all_contacts);
        } else if (intValue == 2) {
            ajty ajty = settingsChimeraActivity.f80963b;
            ajik ajik = new ajik();
            ajik.mo38679b(true);
            ajty.mo38896a(ajik.f70715a).mo50373a(new ajpf(settingsChimeraActivity));
        }
    }
}
