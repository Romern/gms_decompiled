package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: azwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azwg extends azrk {

    /* renamed from: c */
    private final azuc f100116c;

    public azwg(Context context, azuc azuc) {
        super(context);
        this.f100116c = azuc;
    }

    /* renamed from: a */
    private final void m86294a(azwc azwc) {
        String str;
        String str2;
        String str3;
        this.f100116c.mo55076b();
        azuc azuc = this.f100116c;
        azpy.m86121a();
        azpy.m86122a("WebAppFragment", "Web app UI displayed", new Object[0]);
        Activity activity = ((Fragment) azuc).getActivity();
        if (activity != null) {
            azph.m85998a(activity).mo55125a(1475);
            int a = azwc.mo55241a();
            azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.Overall.HandleChatIntentToDisplayWebApp.Time");
            azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.LoadUrlToDisplayWebApp.Time");
            if (!cfgs.m139400f() && !cfgs.m139417w()) {
                azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.OnCreateToDisplayWebApp.Time");
                azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.OnNewIntentToDisplayWebApp.Time");
                azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.NewConversationIdToDisplayWebApp.Time");
                azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.LoadWebAppToDisplayWebApp.Time");
            }
            if (cfgs.m139400f()) {
                azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.Aidl.OnCreateToDisplayWebApp.Time");
                azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.Aidl.OnNewIntentToDisplayWebApp.Time");
                azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.Aidl.NewConversationIdToDisplayWebApp.Time");
                azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.Aidl.LoadWebAppToDisplayWebApp.Time");
            }
            if (cfgs.m139417w()) {
                azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.Prebundle.OnCreateToDisplayWebApp.Time");
            }
            if (a != 1) {
                str = a != 2 ? !cfgs.m139400f() ? "Matchstick.Latency.Lighter.OnCreateToDisplayWebApp.SourceUnknown.Time" : "Matchstick.Latency.Lighter.Aidl.OnCreateToDisplayWebApp.SourceUnknown.Time" : !cfgs.m139400f() ? "Matchstick.Latency.Lighter.OnCreateToDisplayWebApp.WithoutCache.Time" : "Matchstick.Latency.Lighter.Aidl.OnCreateToDisplayWebApp.WithoutCache.Time";
            } else {
                str = !cfgs.m139400f() ? "Matchstick.Latency.Lighter.OnCreateToDisplayWebApp.WithCache.Time" : "Matchstick.Latency.Lighter.Aidl.OnCreateToDisplayWebApp.WithCache.Time";
            }
            azpk.m86089a(activity).mo55187e(str);
            azpk.m86089a(activity).mo55183c("Matchstick.Latency.Lighter.AbandonLaunch.Time");
            azqf.m86130a(activity);
            long a2 = azqf.m86129a(activity.getIntent());
            if (a2 > 0) {
                azpk.m86089a(activity).mo55178a("Matchstick.Latency.Lighter.Overall.LuToDisplayWebApp.Time", a2);
                if (a != 1) {
                    str2 = a != 2 ? "Matchstick.Latency.Lighter.Overall.LuToDisplayWebApp.UnknownLoadSource.Time" : "Matchstick.Latency.Lighter.Overall.LuToDisplayWebApp.WithoutSWCache.Time";
                } else {
                    str2 = "Matchstick.Latency.Lighter.Overall.LuToDisplayWebApp.WithSWCache.Time";
                }
                azpk.m86089a(activity).mo55178a(str2, a2);
                int i = ((azmx) azuc).mo55070a().f100103a;
                if (i == 1) {
                    str3 = "Matchstick.Latency.Lighter.Overall.LuToDisplayWebApp.Activity.WarmStart.Time";
                } else if (i != 2) {
                    str3 = "Matchstick.Latency.Lighter.Overall.LuToDisplayWebApp.Activity.Unknown.Time";
                } else {
                    if (a == 1) {
                        azpk.m86089a(activity).mo55178a("Matchstick.Latency.Lighter.Overall.LuToDisplayWebApp.Activity.ColdStart.Time.WithSWCache", a2);
                    } else if (a == 2) {
                        azpk.m86089a(activity).mo55178a("Matchstick.Latency.Lighter.Overall.LuToDisplayWebApp.Activity.ColdStart.Time.WithoutSWCache", a2);
                    }
                    str3 = "Matchstick.Latency.Lighter.Overall.LuToDisplayWebApp.Activity.ColdStart.Time";
                }
                azpk.m86089a(activity).mo55178a(str3, a2);
            }
            if (cfeo.f183719a.mo6606a().mo81019bZ() && azwc.mo55242b()) {
                ((InputMethodManager) activity.getSystemService("input_method")).toggleSoftInput(1, 1);
            }
            azpy.m86121a().mo55205a(bopw.WEB_APP_UI_DISPLAYED_ALL_DONE, System.currentTimeMillis());
            azpy.m86121a().mo55204a(activity.getApplicationContext());
            azpy.m86121a().mo55206b();
        }
        azph.m85998a(this.f99942a).mo55125a(1574);
    }

    /* renamed from: a */
    public final String mo55250a() {
        return "System";
    }

    @JavascriptInterface
    @azqt
    public String allowAllIncomingNotifications() {
        if (this.f100116c.mo55075a(null)) {
            azqf.m86130a(this.f99942a);
            return azqf.m86145b("Success");
        }
        azqf.m86130a(this.f99942a);
        return azqf.m86138a("Could not unbind conversation ID to allow notifications", new Object[0]);
    }

    @JavascriptInterface
    @azqt
    public String areNotificationsEnabled() {
        azph.m85998a(this.f99942a).mo55125a(1840);
        Context context = ((Fragment) this.f100116c).getContext();
        boolean z = false;
        if (context == null) {
            azoj.m85933c("WebAppFragment", "Context is null.", new Object[0]);
        } else {
            z = azan.m85141a(context).mo54542b();
        }
        azqf.m86130a(this.f99942a);
        return azqf.m86141a(z);
    }

    @JavascriptInterface
    @azqt
    public String cancelLoadingUI() {
        azph.m85998a(this.f99942a).mo55125a(1558);
        this.f100116c.mo55076b();
        azqf.m86130a(this.f99942a);
        return azqf.m86145b("Success");
    }

    @JavascriptInterface
    @azqt
    public String cancelNotificationForConversation(String str) {
        azph.m85998a(this.f99942a).mo55168b(1561, str);
        azqf.m86130a(this.f99942a);
        bmxv b = azqf.m86144b(str, azwf.f100115a);
        if (!b.mo66813a()) {
            azoj.m85933c("WebAppSysInt", "Could not parse Web app query %s", str);
            azph.m85998a(this.f99942a).mo55126a(1562, 60);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Could not parse %s", str);
        }
        azan a = azan.m85141a(this.f99942a);
        azpw.m86109a(this.f99942a);
        a.mo54544d(((ConversationId) b.mo66814b()).toString());
        azqf.m86130a(this.f99942a);
        return azqf.m86145b("Success");
    }

    @JavascriptInterface
    @azqt
    public String createBitmapFromUri(String str) {
        bmxv a = azqf.m86130a(this.f99942a).mo55212a(str);
        if (a.mo66813a()) {
            azqf.m86130a(this.f99942a);
            return azqf.m86145b((String) a.mo66814b());
        }
        azqf.m86130a(this.f99942a);
        return azqf.m86138a("can not create bitmap from %s", str);
    }

    @JavascriptInterface
    @azqt
    public String exitActivity() {
        Fragment fragment = (Fragment) this.f100116c;
        if (fragment.getActivity() != null) {
            fragment.getActivity().finish();
            azph.m85998a(this.f99942a).mo55125a(1566);
            azqf.m86130a(this.f99942a);
            return azqf.m86145b("Success");
        }
        azoj.m85933c("WebAppFragment", "Could not find activity", new Object[0]);
        azoj.m85933c("WebAppSysInt", "Could not exit activity", new Object[0]);
        azph.m85998a(this.f99942a).mo55125a(1567);
        azqf.m86130a(this.f99942a);
        return azqf.m86138a("Could not exit activity", new Object[0]);
    }

    @JavascriptInterface
    @azqt
    public String getIntentMetadata() {
        JSONObject jSONObject;
        azph.m85998a(this.f99942a).mo55125a(1808);
        azqf.m86130a(this.f99942a);
        bmxv bmxv = ((azmx) this.f100116c).mo55070a().f100104d;
        if (bmxv.mo66813a()) {
            jSONObject = (JSONObject) bmxv.mo66814b();
        } else {
            azoj.m85932b("WebAppFragment", "No metadata found from intent", new Object[0]);
            jSONObject = new JSONObject();
        }
        return azqf.m86140a(jSONObject);
    }

    @JavascriptInterface
    @azqt
    public String getSystemInfo() {
        bmxv bmxv;
        azph.m85998a(this.f99942a).mo55125a(1536);
        azqf a = azqf.m86130a(this.f99942a);
        Fragment fragment = (Fragment) this.f100116c;
        if (fragment.getActivity() != null) {
            azqf.m86130a(fragment.getActivity());
            bmxv = azqf.m86143b(fragment.getActivity());
        } else {
            bmxv = bmvz.f131120a;
        }
        Map a2 = a.mo55214a(bmxv);
        if (a2.isEmpty()) {
            azoj.m85933c("WebAppSysInt", "Empty system info map", new Object[0]);
            azph.m85998a(this.f99942a).mo55126a(1537, 36);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Failed to get system information", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject(a2);
        azph.m85998a(this.f99942a).mo55172c(1538, jSONObject.toString());
        azqf.m86130a(this.f99942a);
        return azqf.m86140a(jSONObject);
    }

    @JavascriptInterface
    @azqt
    @Deprecated
    public void logClientLatencyTimers() {
        onWebAppUIDisplayed(0);
    }

    @JavascriptInterface
    @azqt
    public void onWebAppLoaded() {
        azuc azuc = this.f100116c;
        azpy.m86121a();
        azpy.m86122a("WebAppFragment", "Web app loaded", new Object[0]);
        Fragment fragment = (Fragment) azuc;
        if (fragment.getContext() != null) {
            if (cfgs.m139417w()) {
                azpk.m86089a(fragment.getContext()).mo55187e("Matchstick.Latency.Lighter.Prebundle.LoadUrlToLoadWebApp.Time");
                azpk.m86089a(fragment.getContext()).mo55187e("Matchstick.Latency.Lighter.Prebundle.LoadJsBundle.Time");
            } else {
                azpk.m86089a(fragment.getContext()).mo55187e("Matchstick.Latency.Lighter.LoadUrlToLoadWebApp.Time");
                azpk.m86089a(fragment.getContext()).mo55187e("Matchstick.Latency.Lighter.LoadJsBundle.Time");
            }
            if (cfgs.m139400f()) {
                azpk.m86089a(fragment.getContext()).mo55185d("Matchstick.Latency.Lighter.Aidl.LoadWebAppToDisplayWebApp.Time");
            } else {
                azpk.m86089a(fragment.getContext()).mo55185d("Matchstick.Latency.Lighter.LoadWebAppToDisplayWebApp.Time");
            }
        }
        azpy.m86121a().mo55205a(bopw.WEB_APP_LOADED_JS_STARTED, System.currentTimeMillis());
        azmx azmx = (azmx) azuc;
        if (azmx.f99682p.mo66813a()) {
            azmx.f99676j.mo55290b((String) azmx.f99682p.mo66814b());
        }
        if (cfgs.m139388H() && azmx.mo55070a().f100105e.mo66813a()) {
            azmx.f99676j.mo55282a((bcoh) azmx.mo55070a().f100105e.mo66814b());
        }
        if (azmx.f99681o.mo66813a()) {
            azmx.f99676j.mo55286a((ConversationId) azmx.f99681o.mo66814b());
        }
        azph.m85998a(this.f99942a).mo55125a(1573);
    }

    @JavascriptInterface
    @azqt
    @Deprecated
    public void onWebAppUIDisplayed(int i) {
        azwb c = azwc.m86291c();
        c.mo55316a(i);
        c.mo55317a(true);
        m86294a(c.mo55315a());
    }

    @JavascriptInterface
    @azqt
    public void onWebAppUIReady(String str) {
        azqf.m86130a(this.f99942a);
        bmxv b = azqf.m86144b(str, azwe.f100114a);
        if (!b.mo66813a()) {
            azoj.m85933c("WebAppSysInt", "Could not parse web app startup context %s", str);
            return;
        }
        m86294a((azwc) b.mo66814b());
    }

    @JavascriptInterface
    @azqt
    public String setStyle(String str) {
        boolean z;
        azph.m85998a(this.f99942a).mo55125a(1559);
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z2 = true;
            if (jSONObject.has("status_bar_color")) {
                azuc azuc = this.f100116c;
                int i = jSONObject.getInt("status_bar_color");
                Activity activity = ((Fragment) azuc).getActivity();
                if (activity != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    activity.getWindow().setStatusBarColor(i);
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (jSONObject.has("window_ui_visibility")) {
                azuc azuc2 = this.f100116c;
                int i3 = jSONObject.getInt("window_ui_visibility");
                Activity activity2 = ((Fragment) azuc2).getActivity();
                if (activity2 != null) {
                    activity2.getWindow().getDecorView().setSystemUiVisibility(i3);
                } else {
                    z2 = false;
                }
                z &= z2;
            }
            if (!z) {
                azqf.m86130a(this.f99942a);
                return azqf.m86138a("Could not set one or more requested styles", new Object[0]);
            }
            azqf.m86130a(this.f99942a);
            return azqf.m86145b("Success");
        } catch (JSONException e) {
            azoj.m85931a("WebAppSysInt", e, "Failed to set requested style", new Object[0]);
            azph.m85998a(this.f99942a).mo55126a(1560, 58);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Could not set style", new Object[0]);
        }
    }

    @JavascriptInterface
    @azqt
    public String startActivity(String str, int i) {
        azph.m85998a(this.f99942a).mo55125a(1563);
        try {
            Intent parseUri = Intent.parseUri(str, i);
            Activity activity = ((Fragment) this.f100116c).getActivity();
            if ("com.google.android.gms".equals(parseUri.getPackage())) {
                azoj.m85932b("WebAppFragment", "Attempted to open GmsCore", new Object[0]);
                azph.m85998a(activity).mo55125a(1811);
            } else if (activity != null) {
                activity.startActivity(parseUri);
                azqf.m86130a(this.f99942a);
                return azqf.m86145b("Success");
            }
            azph.m85998a(this.f99942a).mo55126a(1564, 51);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("System could not start external activity", new Object[0]);
        } catch (URISyntaxException e) {
            Integer valueOf = Integer.valueOf(i);
            azoj.m85931a("WebAppSysInt", e, "Failed to parse intent %s with flag %d", str, valueOf);
            azph.m85998a(this.f99942a).mo55126a(1564, 52);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Could not parse intent %s with flag %d", str, valueOf);
        }
    }

    @JavascriptInterface
    @azqt
    public String suppressNotificationsForConversation(String str) {
        azqf.m86130a(this.f99942a);
        bmxv b = azqf.m86144b(str, azwd.f100113a);
        if (!b.mo66813a()) {
            azoj.m85933c("WebAppSysInt", "Could not parse Web app query %s", str);
            azph.m85998a(this.f99942a).mo55126a(1812, 60);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Could not parse %s", str);
        }
        ConversationId conversationId = (ConversationId) b.mo66814b();
        new Object[1][0] = conversationId;
        if (this.f100116c.mo55075a(conversationId)) {
            azqf.m86130a(this.f99942a);
            return azqf.m86145b("Success");
        }
        azqf.m86130a(this.f99942a);
        return azqf.m86138a("Could not bind conversation ID to suppress notifications", new Object[0]);
    }
}
