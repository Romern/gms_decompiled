package p000;

import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqc */
public final /* synthetic */ class ajqc implements aubw {

    /* renamed from: a */
    private final SettingsChimeraActivity f71138a;

    public ajqc(SettingsChimeraActivity settingsChimeraActivity) {
        this.f71138a = settingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.f71138a;
        if (!((Boolean) obj).booleanValue()) {
            settingsChimeraActivity.startActivityForResult(SetupChimeraActivity.m67552a(settingsChimeraActivity), 1000);
        }
    }
}
