package p000;

import android.app.Activity;
import android.net.Uri;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akwu implements akww {

    /* renamed from: a */
    public static final sek f73020a = akzt.m60725a("OctarineFidoU2fBridge");

    /* renamed from: b */
    public final xwz f73021b;

    /* renamed from: c */
    yai f73022c;

    /* renamed from: d */
    public final Activity f73023d;

    /* renamed from: e */
    public final WebView f73024e;

    /* renamed from: f */
    public boolean f73025f;

    /* renamed from: g */
    private BrowserSignRequestParams f73026g;

    /* renamed from: h */
    private String f73027h;

    public akwu(com.google.android.chimera.Activity activity, WebView webView) {
        sdo.m34959a(activity);
        this.f73023d = activity.getContainerActivity();
        sdo.m34959a(webView);
        this.f73024e = webView;
        this.f73021b = wzk.m42528b(activity);
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("mm", new akzu(Pattern.compile(stm.m36299a(cfrc.f185484a.mo6606a().mo82554l())), Pattern.compile(stm.m36299a(cfrc.f185484a.mo6606a().mo82553k()))), cfrc.m142648b());
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
        this.f73027h = str;
    }

    /* renamed from: b */
    public final void mo39898b() {
        mo39940c();
    }

    /* renamed from: c */
    public final void mo39940c() {
        if (this.f73025f) {
            this.f73021b.mo30206a(StateUpdate.f31874d);
            this.f73025f = false;
        }
    }

    @JavascriptInterface
    public void cancelSecurityKeyAssertionRequest() {
        mo39937a(ErrorCode.TIMEOUT);
    }

    @JavascriptInterface
    public void sendSkUiEvent(String str) {
        if (this.f73025f) {
            try {
                StateUpdate a = StateUpdate.m23567a(new JSONObject(str));
                this.f73021b.mo30206a(a).mo50371a(new akwq(this, a));
            } catch (JSONException e) {
                f73020a.mo25417e("Invalid user action json response.", e, new Object[0]);
                mo39937a(ErrorCode.OTHER_ERROR);
            } catch (xxo e2) {
                f73020a.mo25417e("Unimplemented user action type.", e2, new Object[0]);
            }
        }
    }

    @JavascriptInterface
    public void startSecurityKeyAssertionRequest(String str) {
        if (!this.f73025f) {
            try {
                yai yai = new yai(yah.m43722a(new JSONObject(str)));
                this.f73022c = yai;
                BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) yai.mo30309a(Uri.parse(this.f73027h));
                this.f73026g = browserSignRequestParams;
                this.f73025f = true;
                this.f73021b.mo30207a(browserSignRequestParams, new akwt(this)).mo50371a(new akwp(this));
            } catch (JSONException e) {
                f73020a.mo25417e("Couldn't parse JSON request to SignRequestMessage!", e, new Object[0]);
                mo39937a(ErrorCode.BAD_REQUEST);
            }
        } else {
            f73020a.mo25418e("startSecurityKeyAssertionRequest: there is another request in progress!", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39939b(String str) {
        new adzt(Looper.getMainLooper()).post(new akwr(this, str));
    }

    /* renamed from: a */
    public final void mo39937a(ErrorCode errorCode) {
        mo39938a(new ErrorResponseData(errorCode));
    }

    /* renamed from: a */
    public final void mo39938a(ResponseData responseData) {
        JSONObject jSONObject;
        yai yai = this.f73022c;
        if (yai == null) {
            yae a = yae.m43716a();
            a.mo30300a(responseData);
            jSONObject = a.mo30301b().mo18664a();
        } else {
            jSONObject = yai.mo30310a(responseData).mo18664a();
        }
        this.f73022c = null;
        mo39940c();
        String valueOf = String.valueOf(jSONObject);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("window.setSkResult(");
        sb.append(valueOf);
        sb.append(");");
        mo39939b(sb.toString());
    }
}
