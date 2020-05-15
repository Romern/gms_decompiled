package p000;

import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;

/* renamed from: tav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tav implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45585a;

    public tav(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity) {
        this.f45585a = constellationSettingsChimeraActivity;
    }

    public final void run() {
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45585a;
        Logger Logger = ConstellationSettingsChimeraActivity.f30536b;
        synchronized (constellationSettingsChimeraActivity.f30539C) {
            this.f45585a.mo17980g();
        }
    }
}
