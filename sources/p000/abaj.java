package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.EmailChimeraActivity;

/* renamed from: abaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abaj implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ EmailChimeraActivity f56943a;

    public abaj(EmailChimeraActivity emailChimeraActivity) {
        this.f56943a = emailChimeraActivity;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f56943a.mo43314a(false);
        EmailChimeraActivity emailChimeraActivity = this.f56943a;
        abae a = abag.m47347a();
        a.f56926b = C0126R.string.gh_server_failure_dialog_message;
        a.f56927c = C0126R.string.common_send;
        a.f56928d = 17039360;
        a.mo31968a().show(emailChimeraActivity.getSupportFragmentManager(), "error_handler_dialog");
    }
}
