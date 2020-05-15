package p000;

import com.google.android.gms.thunderbird.settings.ThunderbirdSettingsChimeraActivity;

/* renamed from: auhd */
public final /* synthetic */ class auhd implements Runnable {

    /* renamed from: a */
    private final ThunderbirdSettingsChimeraActivity f91810a;

    public auhd(ThunderbirdSettingsChimeraActivity thunderbirdSettingsChimeraActivity) {
        this.f91810a = thunderbirdSettingsChimeraActivity;
    }

    public final void run() {
        ThunderbirdSettingsChimeraActivity thunderbirdSettingsChimeraActivity = this.f91810a;
        thunderbirdSettingsChimeraActivity.runOnUiThread(new auhe(thunderbirdSettingsChimeraActivity, auhf.m77066a(thunderbirdSettingsChimeraActivity)));
    }
}
