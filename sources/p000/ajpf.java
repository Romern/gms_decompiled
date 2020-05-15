package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpf */
final /* synthetic */ class ajpf implements aubw {

    /* renamed from: a */
    private final SettingsChimeraActivity f71087a;

    public ajpf(SettingsChimeraActivity settingsChimeraActivity) {
        this.f71087a = settingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71087a;
        Integer num = (Integer) obj;
        settingsChimeraActivity.f80971j.setText(settingsChimeraActivity.getResources().getQuantityString(C0126R.plurals.sharing_settings_button_select_contacts_description, num.intValue(), num));
    }
}
