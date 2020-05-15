package p000;

import com.android.volley.Response;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atla */
final /* synthetic */ class atla implements Response.Listener {

    /* renamed from: a */
    private final NotificationSettingsChimeraActivity f90434a;

    public atla(NotificationSettingsChimeraActivity notificationSettingsChimeraActivity) {
        this.f90434a = notificationSettingsChimeraActivity;
    }

    public final void onResponse(Object obj) {
        NotificationSettingsChimeraActivity notificationSettingsChimeraActivity = this.f90434a;
        notificationSettingsChimeraActivity.f108670j--;
        bzuk bzuk = ((bzuo) obj).f171445a;
        if (bzuk == null) {
            bzuk = bzuk.f171430b;
        }
        notificationSettingsChimeraActivity.mo59403a(bzuk);
    }
}
