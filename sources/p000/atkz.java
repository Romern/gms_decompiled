package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atkz */
public final /* synthetic */ class atkz implements Response.ErrorListener {

    /* renamed from: a */
    public static final Response.ErrorListener f90433a = new atkz();

    private atkz() {
    }

    public final void onErrorResponse(VolleyError volleyError) {
        bnsl bnsl = (bnsl) NotificationSettingsChimeraActivity.f108662b.mo68387b();
        bnsl.mo68437a(volleyError);
        bnsl.mo68432a("com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity", "a", 380, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Email setting request failed");
    }
}
