package p000;

import android.app.Activity;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akwt implements xxm {

    /* renamed from: a */
    final /* synthetic */ akwu f73019a;

    public akwt(akwu akwu) {
        this.f73019a = akwu;
    }

    /* renamed from: a */
    public final void mo14253a() {
        xhy a;
        Activity activity = this.f73019a.f73023d;
        if (activity != null && (a = xhy.m42973a(activity.getApplicationContext())) != null) {
            a.mo29773a(this.f73019a.f73023d);
        }
    }

    /* renamed from: a */
    public final void mo14254a(ErrorResponseData errorResponseData) {
        this.f73019a.mo39938a(errorResponseData);
    }

    /* renamed from: a */
    public final void mo14255a(SignResponseData signResponseData) {
        this.f73019a.mo39938a(signResponseData);
    }

    /* renamed from: a */
    public final void mo14256a(String str) {
        try {
            ViewOptions a = ViewOptions.m23647a(new JSONObject(str));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "select_view");
                jSONObject.put("data", a.mo18664a());
                this.f73019a.mo39939b(String.format("window.setSkUiEvent(%s);", jSONObject.toString()));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            akwu.f73020a.mo25417e("Invalid ViewOptions json.", e2, new Object[0]);
            this.f73019a.mo39937a(ErrorCode.OTHER_ERROR);
        }
    }

    /* renamed from: a */
    public final void mo14257a(xhx xhx, int i) {
        if (this.f73019a.f73023d != null) {
            akws akws = new akws(xhx);
            xhy a = xhy.m42973a(this.f73019a.f73023d.getApplicationContext());
            if (a != null) {
                a.mo29774a(this.f73019a.f73023d, akws, i);
            }
        }
    }
}
