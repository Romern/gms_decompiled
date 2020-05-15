package p000;

import com.google.android.gms.thunderbird.settings.ThunderbirdSettingsChimeraActivity;

/* renamed from: auhe */
final /* synthetic */ class auhe implements Runnable {

    /* renamed from: a */
    private final ThunderbirdSettingsChimeraActivity f91811a;

    /* renamed from: b */
    private final boolean f91812b;

    public auhe(ThunderbirdSettingsChimeraActivity thunderbirdSettingsChimeraActivity, boolean z) {
        this.f91811a = thunderbirdSettingsChimeraActivity;
        this.f91812b = z;
    }

    public final void run() {
        this.f91811a.mo26140c(this.f91812b);
    }
}
