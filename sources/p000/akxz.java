package p000;

import android.webkit.WebView;
import com.google.android.gms.location.reporting.ReportingState;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akxz */
final /* synthetic */ class akxz implements aubw {

    /* renamed from: a */
    private final akyf f73092a;

    /* renamed from: b */
    private final int f73093b;

    public akxz(akyf akyf, int i) {
        this.f73092a = akyf;
        this.f73093b = i;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        akyf akyf = this.f73092a;
        int i = this.f73093b;
        ReportingState reportingState = (ReportingState) obj;
        try {
            WebView webView = akyf.f73109b;
            JSONObject jSONObject = new JSONObject();
            Integer num = reportingState.f79602c;
            if (num != null) {
                jSONObject.put("deviceTag", num.intValue());
                jSONObject.put("expectedOptInStatusCode", reportingState.mo43733d());
                akyf.m60678a(webView, jSONObject.toString(), i);
                return;
            }
            throw new SecurityException("Device tag restricted to approved apps");
        } catch (JSONException e) {
            akyf.f73106d.mo25417e("converting to JSON failed", e, new Object[0]);
            akyf.m60676a(akyf.f73109b, i);
        } catch (SecurityException e2) {
            akyf.f73106d.mo25417e("could not read device tag", e2, new Object[0]);
            akyf.m60676a(akyf.f73109b, i);
        }
    }
}
