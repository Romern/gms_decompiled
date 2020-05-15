package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atkx */
public final /* synthetic */ class atkx implements rkl {

    /* renamed from: a */
    private final NotificationSettingsChimeraActivity f90431a;

    public atkx(NotificationSettingsChimeraActivity notificationSettingsChimeraActivity) {
        this.f90431a = notificationSettingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        NotificationSettingsChimeraActivity notificationSettingsChimeraActivity = this.f90431a;
        Status status = (Status) rkk;
        if (!status.mo17710c()) {
            notificationSettingsChimeraActivity.mo59404a(new IllegalStateException(status.f30116j));
        }
    }
}
