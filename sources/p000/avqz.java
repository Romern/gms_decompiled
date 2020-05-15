package p000;

import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.phone.SystemUpdateChimeraActivity;

/* renamed from: avqz */
final /* synthetic */ class avqz implements Runnable {

    /* renamed from: a */
    private final SystemUpdateChimeraActivity f93809a;

    /* renamed from: b */
    private final SystemUpdateStatus f93810b;

    public avqz(SystemUpdateChimeraActivity systemUpdateChimeraActivity, SystemUpdateStatus systemUpdateStatus) {
        this.f93809a = systemUpdateChimeraActivity;
        this.f93810b = systemUpdateStatus;
    }

    public final void run() {
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = this.f93809a;
        systemUpdateChimeraActivity.mo59679a(this.f93810b);
        systemUpdateChimeraActivity.mo59678a(21);
    }
}
