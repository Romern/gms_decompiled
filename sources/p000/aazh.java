package p000;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.WebView;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aazh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aazh {

    /* renamed from: a */
    final /* synthetic */ WebView f56886a;

    /* renamed from: b */
    final /* synthetic */ aazn f56887b;

    public aazh(aazn aazn, WebView webView) {
        this.f56887b = aazn;
        this.f56886a = webView;
    }

    @JavascriptInterface
    public String getGcmRegistrationId() {
        String b = aazt.m47337b(this.f56887b.getContext());
        return TextUtils.isEmpty(b) ? "" : b;
    }

    @JavascriptInterface
    public JSONObject getPsd() {
        aazn aazn = this.f56887b;
        HelpConfig g = aazn.f56894c.mo18626g();
        JSONObject jSONObject = new JSONObject();
        List<abes> a = g.mo43217a(aazn.getContext());
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
        abcx.m47512c(this.f56887b.f56894c, aazn.m47321a(a));
        if (a == 3) {
            HelpConfig g = this.f56887b.f56894c.mo18626g();
            if (aaya.m47228a(ceit.m136953b())) {
                g.mo43223b(str2, this.f56887b.getContext());
                g.mo43219a(str3, this.f56887b.getContext());
            } else {
                g.f78809I = str2;
                g.f78810J = str3;
            }
            ChatRequestAndConversationChimeraService.m66446a(this.f56887b.getContext(), g);
            aazn aazn = this.f56887b;
            aazn.startActivity(ChatConversationChimeraActivity.m66400a(aazn.getContext(), g));
            if (this.f56887b.f56894c instanceof HelpChimeraActivity) {
                this.f56886a.post(new aazg(this));
            }
        }
    }

    @JavascriptInterface
    public void onSubmitError(String str) {
        abcx.m47506b((aasf) this.f56887b.getContext(), aazn.m47321a(abhs.m47721a(str)));
    }
}
