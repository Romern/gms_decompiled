package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atkr */
final /* synthetic */ class atkr implements Response.ErrorListener {

    /* renamed from: a */
    private final NotificationSettingsChimeraActivity f90425a;

    public atkr(NotificationSettingsChimeraActivity notificationSettingsChimeraActivity) {
        this.f90425a = notificationSettingsChimeraActivity;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f90425a.mo59404a((Exception) volleyError);
    }
}
