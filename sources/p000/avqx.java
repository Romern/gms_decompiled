package p000;

import com.google.android.gms.update.phone.SystemUpdateChimeraActivity;

/* renamed from: avqx */
final /* synthetic */ class avqx implements Runnable {

    /* renamed from: a */
    private final aucb f93806a;

    /* renamed from: b */
    private final SystemUpdateChimeraActivity f93807b;

    public avqx(aucb aucb, SystemUpdateChimeraActivity systemUpdateChimeraActivity) {
        this.f93806a = aucb;
        this.f93807b = systemUpdateChimeraActivity;
    }

    public final void run() {
        aucb aucb = this.f93806a;
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = this.f93807b;
        if (((Boolean) aucb.mo50386d()).booleanValue()) {
            systemUpdateChimeraActivity.mo51540g().mo51341a().mo50373a(new avra(systemUpdateChimeraActivity));
        } else {
            systemUpdateChimeraActivity.mo59678a(22);
        }
    }
}
