package p000;

import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;

/* renamed from: tax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tax implements Runnable {

    /* renamed from: a */
    final /* synthetic */ tay f45588a;

    public tax(tay tay) {
        this.f45588a = tay;
    }

    public final void run() {
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45588a.f45590b;
        Logger Logger = ConstellationSettingsChimeraActivity.f30536b;
        synchronized (constellationSettingsChimeraActivity.f30539C) {
            ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity2 = this.f45588a.f45590b;
            constellationSettingsChimeraActivity2.f30566z.mo26406a(constellationSettingsChimeraActivity2.f30537A, 30);
            ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity3 = this.f45588a.f45590b;
            constellationSettingsChimeraActivity3.f30541E = true;
            constellationSettingsChimeraActivity3.mo17980g();
        }
    }
}
