package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: ajpe */
public final /* synthetic */ class ajpe implements aubw {

    /* renamed from: a */
    private final SettingsChimeraActivity f71086a;

    public ajpe(SettingsChimeraActivity settingsChimeraActivity) {
        this.f71086a = settingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71086a;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 1) {
            settingsChimeraActivity.f80972k.setText((int) C0126R.string.sharing_settings_data_usage_item_never);
            settingsChimeraActivity.f80973l.setText((int) C0126R.string.sharing_settings_data_usage_item_never_description);
        } else if (intValue == 2) {
            settingsChimeraActivity.f80972k.setText((int) C0126R.string.sharing_settings_data_usage_item_always);
            settingsChimeraActivity.f80973l.setText((int) C0126R.string.sharing_settings_data_usage_item_always_description);
        } else if (intValue == 3) {
            settingsChimeraActivity.f80972k.setText((int) C0126R.string.sharing_settings_data_usage_item_wifi);
            settingsChimeraActivity.f80973l.setText((int) C0126R.string.sharing_settings_data_usage_item_wifi_description);
        }
    }
}
