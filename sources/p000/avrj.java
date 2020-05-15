package p000;

import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.phone.SystemUpdateChimeraActivity;

/* renamed from: avrj */
public final /* synthetic */ class avrj implements Runnable {

    /* renamed from: a */
    private final SystemUpdateStatus f93822a;

    /* renamed from: b */
    private final SystemUpdateChimeraActivity f93823b;

    public avrj(SystemUpdateStatus systemUpdateStatus, SystemUpdateChimeraActivity systemUpdateChimeraActivity) {
        this.f93822a = systemUpdateStatus;
        this.f93823b = systemUpdateChimeraActivity;
    }

    public final void run() {
        SystemUpdateStatus systemUpdateStatus = this.f93822a;
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = this.f93823b;
        SystemUpdateChimeraActivity.f109513a.mo25409a("Received system update status=%d.", Integer.valueOf(systemUpdateStatus.f109461c));
        systemUpdateChimeraActivity.f109515b = true;
        systemUpdateChimeraActivity.mo59679a(systemUpdateStatus);
    }
}
