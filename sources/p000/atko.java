package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atko */
final /* synthetic */ class atko implements Response.ErrorListener {

    /* renamed from: a */
    private final NotificationSettingsChimeraActivity f90422a;

    public atko(NotificationSettingsChimeraActivity notificationSettingsChimeraActivity) {
        this.f90422a = notificationSettingsChimeraActivity;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        NotificationSettingsChimeraActivity notificationSettingsChimeraActivity = this.f90422a;
        notificationSettingsChimeraActivity.f108670j--;
        notificationSettingsChimeraActivity.mo59404a((Exception) volleyError);
    }
}
