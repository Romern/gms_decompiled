package p000;

import com.android.volley.Response;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atky */
public final /* synthetic */ class atky implements Response.Listener {

    /* renamed from: a */
    private final NotificationSettingsChimeraActivity f90432a;

    public atky(NotificationSettingsChimeraActivity notificationSettingsChimeraActivity) {
        this.f90432a = notificationSettingsChimeraActivity;
    }

    public final void onResponse(Object obj) {
        NotificationSettingsChimeraActivity notificationSettingsChimeraActivity = this.f90432a;
        bzuk bzuk = ((bzuj) obj).f171429a;
        if (bzuk == null) {
            bzuk = bzuk.f171430b;
        }
        notificationSettingsChimeraActivity.mo59403a(bzuk);
    }
}
