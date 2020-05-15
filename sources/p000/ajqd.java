package p000;

import android.support.p002v7.widget.SwitchCompat;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajqd */
public final /* synthetic */ class ajqd implements aubw {

    /* renamed from: a */
    private final SettingsChimeraActivity f71139a;

    public ajqd(SettingsChimeraActivity settingsChimeraActivity) {
        this.f71139a = settingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        int i;
        SettingsChimeraActivity settingsChimeraActivity = this.f71139a;
        Boolean bool = (Boolean) obj;
        if (settingsChimeraActivity.f80964c.isChecked() != bool.booleanValue()) {
            settingsChimeraActivity.f80964c.setChecked(bool.booleanValue());
        }
        SwitchCompat switchCompat = settingsChimeraActivity.f80964c;
        if (!bool.booleanValue()) {
            i = C0126R.string.sharing_settings_toggle_off;
        } else {
            i = C0126R.string.sharing_settings_toggle_on;
        }
        switchCompat.setText(i);
    }
}
