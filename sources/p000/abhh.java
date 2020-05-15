package p000;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: abhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abhh {

    /* renamed from: a */
    final /* synthetic */ GoogleHelpRenderingApiWebViewChimeraActivity f57478a;

    public abhh(GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity) {
        this.f57478a = googleHelpRenderingApiWebViewChimeraActivity;
    }

    @JavascriptInterface
    public String getGcmRegistrationId() {
        String b = aazt.m47337b(this.f57478a);
        return TextUtils.isEmpty(b) ? "" : b;
    }

    @JavascriptInterface
    public JSONObject getPsd() {
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = this.f57478a;
        HelpConfig helpConfig = googleHelpRenderingApiWebViewChimeraActivity.f56986y;
        JSONObject jSONObject = new JSONObject();
        List<abes> a = helpConfig.mo43217a(googleHelpRenderingApiWebViewChimeraActivity);
        if (a != null && !a.isEmpty()) {
            try {
                for (abes abes : a) {
                    jSONObject.put(abes.f57290b, abes.f57291c);
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return jSONObject;
    }

    @JavascriptInterface
    public void onSubmit(String str, String str2, String str3) {
        int a = abhs.m47721a(str);
        abcx.m47512c(this.f57478a, GoogleHelpRenderingApiWebViewChimeraActivity.m66624a(a));
        if (a == 3) {
            if (aaya.m47228a(ceit.m136953b())) {
                GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = this.f57478a;
                googleHelpRenderingApiWebViewChimeraActivity.f56986y.mo43223b(str2, googleHelpRenderingApiWebViewChimeraActivity);
                GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity2 = this.f57478a;
                googleHelpRenderingApiWebViewChimeraActivity2.f56986y.mo43219a(str3, googleHelpRenderingApiWebViewChimeraActivity2);
            } else {
                HelpConfig helpConfig = this.f57478a.f56986y;
                helpConfig.f78809I = str2;
                helpConfig.f78810J = str3;
            }
            GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity3 = this.f57478a;
            ChatRequestAndConversationChimeraService.m66446a(googleHelpRenderingApiWebViewChimeraActivity3, googleHelpRenderingApiWebViewChimeraActivity3.f56986y);
            GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity4 = this.f57478a;
            googleHelpRenderingApiWebViewChimeraActivity4.startActivity(ChatConversationChimeraActivity.m66400a(googleHelpRenderingApiWebViewChimeraActivity4, googleHelpRenderingApiWebViewChimeraActivity4.f56986y));
            this.f57478a.finish();
        }
    }

    @JavascriptInterface
    public void onSubmitError(String str) {
        abcx.m47506b(this.f57478a, GoogleHelpRenderingApiWebViewChimeraActivity.m66624a(abhs.m47721a(str)));
    }
}
