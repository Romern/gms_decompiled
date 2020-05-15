package p000;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: abco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abco {

    /* renamed from: a */
    private final WeakReference f57038a;

    public abco(HelpChimeraActivity helpChimeraActivity) {
        this.f57038a = new WeakReference(helpChimeraActivity);
    }

    /* renamed from: a */
    static final bzps m47449a(int i) {
        int i2 = i - 2;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    return bzps.CHAT;
                }
                if (i2 == 2) {
                    return bzps.HANGOUTS;
                }
                if (i2 == 3) {
                    return bzps.C2C;
                }
                if (i2 != 50) {
                    return bzps.UNKNOWN_CONTACT_MODE;
                }
            }
            return bzps.EMAIL;
        }
        throw null;
    }

    @JavascriptInterface
    public String getGcmRegistrationId() {
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.f57038a.get();
        if (helpChimeraActivity == null) {
            return "";
        }
        String b = aazt.m47337b(helpChimeraActivity);
        if (TextUtils.isEmpty(b)) {
            return "";
        }
        return b;
    }

    @JavascriptInterface
    public JSONObject getPsd() {
        if (((HelpChimeraActivity) this.f57038a.get()) == null) {
            return new JSONObject();
        }
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.f57038a.get();
        JSONObject jSONObject = new JSONObject();
        List<abes> a = helpChimeraActivity.f56986y.mo43217a(helpChimeraActivity);
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
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.f57038a.get();
        if (helpChimeraActivity != null) {
            int a = abhs.m47721a(str);
            abcx.m47512c(helpChimeraActivity, m47449a(a));
            if (a == 3) {
                HelpConfig helpConfig = helpChimeraActivity.f56986y;
                if (!aaya.m47228a(ceit.m136953b())) {
                    helpConfig.f78809I = str2;
                    helpConfig.f78810J = str3;
                } else {
                    helpConfig.mo43223b(str2, helpChimeraActivity);
                    helpConfig.mo43219a(str3, helpChimeraActivity);
                }
                ChatRequestAndConversationChimeraService.m66446a(helpChimeraActivity, helpConfig);
                helpChimeraActivity.startActivity(ChatConversationChimeraActivity.m66400a(helpChimeraActivity, helpConfig));
                helpChimeraActivity.runOnUiThread(new abcn(helpChimeraActivity));
            }
        }
    }

    @JavascriptInterface
    public void onSubmitError(String str) {
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.f57038a.get();
        if (helpChimeraActivity != null) {
            abcx.m47506b(helpChimeraActivity, m47449a(abhs.m47721a(str)));
        }
    }
}
