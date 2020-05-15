package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.ClickToCallChimeraActivity;

/* renamed from: abai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abai implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ String f56939a;

    /* renamed from: b */
    final /* synthetic */ String f56940b;

    /* renamed from: c */
    final /* synthetic */ String f56941c;

    /* renamed from: d */
    final /* synthetic */ ClickToCallChimeraActivity f56942d;

    public abai(ClickToCallChimeraActivity clickToCallChimeraActivity, String str, String str2, String str3) {
        this.f56942d = clickToCallChimeraActivity;
        this.f56939a = str;
        this.f56940b = str2;
        this.f56941c = str3;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        int i;
        boolean z = false;
        this.f56942d.mo43313a(false);
        ClickToCallChimeraActivity clickToCallChimeraActivity = this.f56942d;
        String str = this.f56939a;
        String str2 = this.f56940b;
        String str3 = this.f56941c;
        NetworkResponse networkResponse = volleyError.networkResponse;
        int i2 = 17039360;
        int i3 = C0126R.string.gh_c2c_action_text;
        int i4 = -1;
        if (networkResponse == null) {
            i = C0126R.string.gh_network_not_connected;
            z = true;
        } else {
            int i5 = networkResponse.statusCode;
            if (i5 == 406) {
                clickToCallChimeraActivity.mo43312a(clickToCallChimeraActivity.f78925b, C0126R.string.gh_c2c_invalid_phone_number_error);
                return;
            } else if (i5 != 403) {
                i = i5 != 408 ? C0126R.string.gh_server_failure_dialog_message : C0126R.string.gh_c2c_timeout_dialog_message;
                z = true;
            } else {
                i = C0126R.string.gh_c2c_not_available_dialog_message;
                i3 = 17039370;
                i2 = -1;
                i4 = C0126R.string.gh_c2c_not_available_dialog_title;
            }
        }
        abcx.m47469a(clickToCallChimeraActivity, 22, bzps.C2C);
        abae a = abag.m47347a();
        a.f56925a = i4;
        a.f56926b = i;
        a.f56927c = i3;
        a.f56928d = i2;
        if (z) {
            a.f56929e = ClickToCallChimeraActivity.m66510a(str, str2, str3);
        }
        a.mo31968a().show(clickToCallChimeraActivity.getSupportFragmentManager(), "error_handler_dialog");
    }
}
