package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import com.google.android.libraries.matchstick.p091ui.WebAppFragment$3;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: azmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azmx extends adcf implements azuc, aztx, azue {

    /* renamed from: a */
    WebView f99667a;

    /* renamed from: b */
    View f99668b;

    /* renamed from: c */
    public azto f99669c;

    /* renamed from: d */
    azvv f99670d;

    /* renamed from: e */
    public azun f99671e;

    /* renamed from: f */
    Set f99672f;

    /* renamed from: g */
    Set f99673g;

    /* renamed from: h */
    final Map f99674h = new HashMap();

    /* renamed from: i */
    azvw f99675i;

    /* renamed from: j */
    public aztu f99676j;

    /* renamed from: k */
    azfc f99677k;

    /* renamed from: l */
    azez f99678l;

    /* renamed from: m */
    public azev f99679m;

    /* renamed from: n */
    aacn f99680n;

    /* renamed from: o */
    public bmxv f99681o = bmvz.f131120a;

    /* renamed from: p */
    public bmxv f99682p = bmvz.f131120a;

    /* renamed from: q */
    private final ServiceConnection f99683q = new azmt(this, "matchstick");

    /* renamed from: r */
    private final ServiceConnection f99684r = new azmu(this, "matchstick");

    /* renamed from: a */
    public static String m85837a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        return cfgs.f183989a.mo6606a().mo81176ae() ? jSONObject2.replace("\\/", "/") : jSONObject2;
    }

    /* renamed from: b */
    public final void mo55076b() {
        this.f99668b.post(new azmj(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        azpy.m86121a();
        azpy.m86122a("WebAppFragment", "onCreateView", new Object[0]);
        azpy.m86121a().mo55205a(bopw.ON_CREATE_VIEW_WEB_APP_FRAGMENT, System.currentTimeMillis());
        azph.m85998a(getActivity()).mo55125a(382);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.ms_full_screen_web_view, viewGroup, false);
        this.f99667a = (WebView) inflate.findViewById(C0126R.C0129id.web_content_view);
        this.f99668b = inflate.findViewById(C0126R.C0129id.loading_ui);
        this.f99676j = new aztu(getActivity(), this);
        if (cfgs.m139383C() && cfgs.m139400f()) {
            this.f99669c = new azto(getContext(), this.f99676j);
            this.f99671e = new azun(getContext());
            this.f99670d = new azvv(getContext(), this.f99676j);
        }
        if (cfeo.f183719a.mo6606a().mo80971ae()) {
            inflate.findViewById(C0126R.C0129id.placeholder_ui).setVisibility(0);
            inflate.findViewById(C0126R.C0129id.general_progress).setVisibility(8);
        }
        Activity activity = getActivity();
        WebSettings settings = this.f99667a.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        if (cfgs.f183989a.mo6606a().mo81173ab()) {
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        }
        azqf.m86130a(activity);
        Locale b = azqf.m86147b(activity.getIntent());
        azqg a = azqg.m86158a(activity);
        azph a2 = azph.m85998a(a.f99882b);
        int i = Build.VERSION.SDK_INT;
        a2.mo55172c(1856, b.toLanguageTag());
        if (!cfgs.m139417w()) {
            azph.m85998a(a.f99882b).mo55165b(1862);
        } else if (cfgs.m139416v()) {
            if (a.f99881a.containsKey(b)) {
                azph.m85998a(a.f99882b).mo55165b(1859);
            } else {
                azph.m85998a(a.f99882b).mo55165b(1860);
            }
        } else if (b.equals(Locale.US)) {
            azph.m85998a(a.f99882b).mo55165b(1857);
        } else {
            azph.m85998a(a.f99882b).mo55165b(1858);
        }
        this.f99667a.setLongClickable(true);
        this.f99667a.setWebViewClient(new azmw(this, b));
        this.f99667a.setWebChromeClient(new WebChromeClient());
        this.f99667a.setVisibility(0);
        if (!cfgs.f183989a.mo6606a().mo81169Y()) {
            azpy.m86121a();
            azpy.m86122a("WebAppFragment", "Not requesting WebView focus", new Object[0]);
            azph.m85998a(activity).mo55169c(1853);
        } else {
            azpy.m86121a();
            azpy.m86122a("WebAppFragment", "Requesting WebView focus", new Object[0]);
            this.f99667a.requestFocus();
            azph.m85998a(activity).mo55169c(1852);
        }
        cfgs.m139395O();
        azph.m85998a(activity).mo55125a(1476);
        azpy.m86121a();
        azpy.m86122a("WebAppFragment", "Configured WebView", new Object[0]);
        this.f99672f = new HashSet();
        this.f99673g = new HashSet();
        this.f99672f.add(new azwg(activity, this));
        if (!cfgs.m139400f()) {
            this.f99669c = new azto(activity, this.f99676j);
            this.f99670d = new azvv(activity, this.f99676j);
            this.f99672f.add(this.f99669c);
            this.f99672f.add(new azun(activity));
            this.f99672f.add(this.f99670d);
            if (cfeo.m138890u()) {
                this.f99672f.add(new azwa(activity, (bcve) azbj.m85193a(activity).mo54565e().mo66814b()));
            }
            if (cfgs.m139411q()) {
                bmxv i2 = azbj.m85193a(activity).mo54569i();
                if (i2.mo66813a()) {
                    this.f99672f.add(new azwn(activity, (bbpv) i2.mo66814b(), this.f99676j));
                }
            }
        }
        for (azrk azrk : this.f99672f) {
            this.f99667a.addJavascriptInterface(azrk, azrk.mo55250a());
        }
        if (cfgs.m139401g()) {
            soc soc = new soc(8, 9);
            azmv azmv = new azmv(this);
            for (azrk azrk2 : this.f99672f) {
                azql azql = new azql(activity, String.valueOf(azrk2.mo55250a()).concat("Async"), azmv, azrk2, soc);
                azql.mo55224a();
                this.f99673g.add(azql);
            }
        }
        if (!cfgs.m139400f()) {
            mo55072a(activity, activity.getIntent());
        }
        Activity activity2 = getActivity();
        WebAppFragment$3 webAppFragment$3 = new WebAppFragment$3(this, activity2);
        this.f99680n = webAppFragment$3;
        activity2.registerReceiver(webAppFragment$3, new IntentFilter("com.google.android.apps.libraries.matchstick.action.messages_for_conversation_updated"));
        if (cfgs.m139397c()) {
            activity2.registerReceiver(this.f99680n, new IntentFilter("com.google.android.apps.libraries.matchstick.action.conversation_updated"));
        }
        activity2.registerReceiver(this.f99680n, new IntentFilter("com.google.android.apps.libraries.matchstick.action.UPDATE_WEB_APP"));
        if (cfgs.m139400f()) {
            activity2.registerReceiver(this.f99680n, new IntentFilter("com.google.android.apps.libraries.matchstick.action.AIDL_FALLBACK"), "com.google.android.gms.matchstick.permission.BROADCAST_LIGHTER_WEB_INFO", null);
        }
        azpy.m86121a().mo55205a(bopw.REGISTERED_BROADCAST_RECEIVERS, System.currentTimeMillis());
        mo55071a(getActivity());
        Activity activity3 = getActivity();
        int i3 = Build.VERSION.SDK_INT;
        Bitmap decodeResource = BitmapFactory.decodeResource(activity3.getResources(), C0126R.C0127drawable.business_message_icon);
        String string = activity3.getResources().getString(C0126R.string.business_message_product_title);
        if (decodeResource != null) {
            activity3.setTaskDescription(new ActivityManager.TaskDescription(string, decodeResource));
        } else {
            azoj.m85933c("WebAppFragment", "can not set icon because of null bitmap", new Object[0]);
        }
        return inflate;
    }

    public final void onDestroyView() {
        azph.m85998a(getActivity()).mo55125a(384);
        if (this.f99667a != null) {
            for (azrk azrk : this.f99672f) {
                this.f99667a.removeJavascriptInterface(azrk.mo55250a());
            }
        }
        if (cfgs.m139401g()) {
            for (azql azql : this.f99673g) {
                azql.mo55226b();
            }
            this.f99673g.clear();
        }
        if (this.f99680n != null) {
            getActivity().unregisterReceiver(this.f99680n);
            this.f99680n = null;
        }
        azfc azfc = this.f99677k;
        if (azfc != null) {
            try {
                azfc.mo54858a(null);
            } catch (RemoteException e) {
                azoj.m85931a("WebAppFragment", e, "Unable to unset conversation id with the service.", new Object[0]);
            }
        }
        skh.m35531a().mo25689a(getContext(), this.f99683q);
        this.f99677k = null;
        aztu aztu = this.f99676j;
        if (aztu != null) {
            aztu.f100029a = null;
        }
        if (cfgs.m139400f()) {
            azez azez = this.f99678l;
            if (azez != null) {
                try {
                    azez.mo54855a();
                } catch (RemoteException e2) {
                    azoj.m85931a("WebAppFragment", e2, "Unable to destroy LighterWebService.", new Object[0]);
                }
            }
            if (this.f99667a != null) {
                for (String str : this.f99674h.keySet()) {
                    this.f99667a.removeJavascriptInterface(str);
                }
                this.f99674h.clear();
            }
            skh.m35531a().mo25689a(getContext(), this.f99684r);
            this.f99678l = null;
            this.f99679m = null;
        }
        super.onDestroyView();
    }

    public final void onPause() {
        azpk.m86089a(getContext()).mo55184d();
        azph.m85998a(getContext()).mo55125a(393);
        MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.close_bind_connection_action"), getActivity());
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        azpy.m86121a();
        azpy.m86122a("WebAppFragment", "onResume()", new Object[0]);
        azpy.m86121a().mo55205a(bopw.ON_RESUME_WEB_APP_FRAGMENT, System.currentTimeMillis());
        if (cfgs.m139413s() && getActivity().getIntent().hasExtra("lighter_conversation_id")) {
            aztu aztu = this.f99676j;
            String stringExtra = getActivity().getIntent().getStringExtra("lighter_conversation_id");
            aztu.mo55291c(String.format("onNewConversationId(%s)", stringExtra));
            azph.m85998a(aztu.f100030b).mo55168b(1568, stringExtra);
        }
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.open_bind_connection_action");
        intent.putExtra("launch_session_id", azpk.m86089a(getActivity()).mo55179b());
        int e = azpk.m86089a(getActivity()).mo55186e();
        int i = e - 1;
        if (e != 0) {
            intent.putExtra("launch_entry_intent", i);
            intent.putExtra("launch_entry_point", azpk.m86089a(getActivity()).mo55182c());
            if (cfgs.m139414t()) {
                intent.putExtra("android.intent.extra.INTENT", getActivity().getIntent());
            }
            MessagingService.m94557b(intent, getActivity());
            azph.m85998a(getActivity()).mo55125a(383);
            new soa(9, new azmh(this)).start();
            int i2 = mo55070a().f100103a;
            if (i2 == 0) {
                mo55070a().f100103a = 2;
            } else if (i2 == 2) {
                mo55070a().f100103a = 1;
            }
        } else {
            throw null;
        }
    }

    public final void onStart() {
        super.onStart();
        azpy.m86121a();
        azpy.m86122a("WebAppFragment", "onStart()", new Object[0]);
        if (cfgs.m139420z()) {
            this.f99676j.mo55289a(true);
        }
        if (cfgs.f183989a.mo6606a().mo81164T()) {
            Activity activity = getActivity();
            MessagingService.m94556a(new Intent("com.google.android.apps.libraries.matchstick.action.RESTORE_BIND"), activity);
            azph.m85998a(activity).mo55125a(1816);
        }
    }

    public final void onStop() {
        if (cfgs.m139420z()) {
            this.f99676j.mo55289a(false);
        }
        azph.m85998a(getActivity()).mo55125a(1545);
        if (cfgs.m139419y()) {
            MessagingService.m94557b(new Intent("com.google.android.apps.libraries.matchstick.action.RENOTIFY_LIGHTER_CONVERSATIONS"), getActivity());
        }
        super.onStop();
    }

    /* renamed from: b */
    public final void mo55077b(String str) {
        this.f99682p = bmxv.m108566b(str);
        this.f99676j.mo55290b(str);
    }

    /* renamed from: a */
    public static void m85838a(Context context, Intent intent, boolean z) {
        Intent intent2 = new Intent("com.google.android.gms.matchstick.handle_external_chat_intent_action");
        intent2.putExtras(intent);
        intent2.putExtra("original_intent_action", intent.getAction());
        intent2.setData(intent.getData());
        intent2.putExtra("launch_session_id", azpk.m86089a(context).mo55179b());
        int e = azpk.m86089a(context).mo55186e();
        int i = e - 1;
        if (e != 0) {
            intent2.putExtra("launch_entry_intent", i);
            intent2.putExtra("launch_entry_point", azpk.m86089a(context).mo55182c());
            if (cfgs.m139387G()) {
                intent2.putExtra("broadcast_account_conversation_id", z);
            }
            azpy.m86121a();
            azpy.m86122a("WebAppFragment", "Starting GMS Process to check registration", new Object[0]);
            SilentRegisterIntentOperation.m94594b(intent2, context);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fa, code lost:
        if ((p000.cfgs.m139416v() ? r0.f99881a.containsKey(r10) : java.util.Locale.US.equals(r10)) == false) goto L_0x0119;
     */
    /* renamed from: a */
    public final WebResourceResponse mo55069a(String str, Locale locale) {
        bmxv bmxv;
        if (!azpj.m86088a(str)) {
            if (getContext() != null) {
                azph.m85998a(getContext()).mo55166b(1470, 51);
            }
            return azrm.f99947a;
        } else if (getContext() == null) {
            azoj.m85932b("WebAppFragment", "Unable to check for cached files due to null context", new Object[0]);
            return null;
        } else if (!cfgs.m139417w()) {
            return null;
        } else {
            if (cfgs.f183989a.mo6606a().mo81146B()) {
                azqf.m86130a(getActivity());
                bmxv b = azqf.m86143b(getActivity());
                if (!b.mo66813a() || ((long) ((Integer) b.mo66814b()).intValue()) < cfgs.f183989a.mo6606a().mo81163S()) {
                    return null;
                }
            }
            azpy.m86121a();
            azpy.m86122a("WebAppFragment", "Attempting to load resource from cache", new Object[0]);
            azqg a = azqg.m86158a(getContext());
            if (!cfgs.f183989a.mo6606a().mo81168X()) {
                if (!cfgs.m139417w()) {
                    bmxv = bmvz.f131120a;
                } else {
                    if (!cfgs.m139382B()) {
                        azqf.m86130a(a.f99882b);
                        if (!azqf.m86146b().equals(Locale.US)) {
                            azpk.m86089a(a.f99882b).mo55183c("Matchstick.Latency.Lighter.Prebundle.OnCreateToDisplayWebApp.Time");
                            bmxv = bmvz.f131120a;
                        }
                    }
                    bmxv = a.mo55217a(str, Locale.US);
                }
            } else if (!cfgs.m139417w()) {
                azpk.m86089a(a.f99882b).mo55183c("Matchstick.Latency.Lighter.Prebundle.OnCreateToDisplayWebApp.Time");
                bmxv = bmvz.f131120a;
            } else {
                if (cfgs.m139417w()) {
                    if (!cfgs.m139382B()) {
                    }
                    if (cfgs.m139382B()) {
                        bmxv = a.mo55217a(str, Locale.US);
                    } else {
                        bmxv = a.mo55217a(str, (Locale) a.f99881a.getOrDefault(locale, Locale.US));
                    }
                }
                new Object[1][0] = locale;
                azpy.m86121a().mo55205a(bopw.SKIP_PREBUNDLE_UNSUPPORTED_LOCALE, System.currentTimeMillis());
                azpk.m86089a(a.f99882b).mo55183c("Matchstick.Latency.Lighter.Prebundle.OnCreateToDisplayWebApp.Time");
                bmxv = bmvz.f131120a;
            }
            return (WebResourceResponse) bmxv.mo66815c();
        }
    }

    /* renamed from: a */
    public final azvw mo55070a() {
        if (this.f99675i == null) {
            bmxy.m108588a(true);
            adci g = mo33311g();
            bmxy.m108581a(g);
            C0060br a = g.mo33312a();
            bmxy.m108581a(a);
            this.f99675i = (azvw) a.mo3444a(azvw.class);
        }
        return this.f99675i;
    }

    /* renamed from: a */
    public final void mo55071a(Context context) {
        azpy.m86121a().mo55205a(bopw.BIND_WITH_MESSAGING_SERVICE, System.currentTimeMillis());
        skh.m35531a().mo25690a(context, new Intent().setClassName(context, "com.google.android.gms.matchstick.net.MessagingService"), this.f99683q, 1);
        if (cfgs.m139400f()) {
            azpy.m86121a();
            azpy.m86122a("WebAppFragment", "Attempting to bind to MessagingService for LighterWeb IPC", new Object[0]);
            skh.m35531a().mo25690a(context, new Intent().setAction(azez.class.getName()).setClassName(context, "com.google.android.gms.matchstick.net.MessagingService"), this.f99684r, 1);
        }
    }

    /* renamed from: a */
    public final void mo55072a(Context context, Intent intent) {
        String ao = cfeo.f183719a.mo6606a().mo80981ao();
        if (intent.hasExtra("web_url")) {
            String stringExtra = intent.getStringExtra("web_url");
            if (!TextUtils.isEmpty(stringExtra)) {
                ao = stringExtra;
            }
        }
        if (!TextUtils.isEmpty(cfgs.m139394N())) {
            ao = cfgs.m139394N();
        }
        azqf a = azqf.m86130a(context);
        azqf.m86130a(context);
        bmxv b = azqf.m86143b(context);
        Uri.Builder buildUpon = Uri.parse(ao).buildUpon();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                if (!TextUtils.equals(str, "hl")) {
                    buildUpon.appendQueryParameter(str, extras.get(str).toString());
                }
            }
        }
        Locale b2 = azqf.m86147b(intent);
        int i = Build.VERSION.SDK_INT;
        buildUpon.appendQueryParameter("hl", b2.toLanguageTag());
        Map a2 = a.mo55214a(b);
        for (String str2 : a2.keySet()) {
            buildUpon.appendQueryParameter(str2, ((Integer) a2.get(str2)).toString());
        }
        String uri = buildUpon.build().toString();
        if (!TextUtils.isEmpty(cfgs.m139396b())) {
            String valueOf = String.valueOf(uri);
            String valueOf2 = String.valueOf(String.format("&%s", cfgs.m139396b()));
            uri = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        if (!azpj.m86088a(uri)) {
            azpi.m86068a(context, context.getString(C0126R.string.message_not_available_text));
            azph.m85998a(context).mo55166b(1470, 35);
            azoj.m85933c("WebAppFragment", "Webview invalid URL blocked, [%s]", uri);
            getActivity().finish();
            return;
        }
        azpk.m86089a(context).mo55187e("Matchstick.Latency.Lighter.Fragment.HandleChatIntentToLoadUrl.Time");
        azqf.m86130a(context);
        long a3 = azqf.m86129a(intent);
        if (a3 > 0) {
            azpk.m86089a(context).mo55178a("Matchstick.Latency.Lighter.Fragment.LuToLoadUrl.Time", a3);
        }
        azpy.m86121a();
        azpy.m86122a("WebAppFragment", "Loading url: %s", uri);
        azph.m85998a(context).mo55125a(1577);
        if (cfgs.m139400f()) {
            azpk.m86089a(context).mo55187e("Matchstick.Latency.Lighter.Aidl.OnCreateToLoadUrl.Time");
        } else {
            azpk.m86089a(context).mo55187e("Matchstick.Latency.Lighter.OnCreateToLoadUrl.Time");
        }
        if (cfgs.m139417w()) {
            azpk.m86089a(context).mo55185d("Matchstick.Latency.Lighter.Prebundle.LoadUrlToLoadWebApp.Time");
        } else {
            azpk.m86089a(context).mo55185d("Matchstick.Latency.Lighter.LoadUrlToLoadWebApp.Time");
        }
        azpk.m86089a(context).mo55185d("Matchstick.Latency.Lighter.LoadUrlToDisplayWebApp.Time");
        azpy.m86121a().mo55205a(bopw.WEBVIEW_LOAD_URL_INDEX_PAGE, System.currentTimeMillis());
        this.f99667a.loadUrl(uri);
    }

    /* renamed from: a */
    public final void mo55073a(Context context, ConversationId conversationId) {
        bmxv bmxv;
        azpy.m86121a();
        azpy.m86122a("WebAppFragment", "onConversationIdReceived()", new Object[0]);
        azpk.m86089a(context).mo55187e("Matchstick.Latency.Lighter.CheckRegistrationToNewConversationId.Time");
        if (cfgs.m139400f()) {
            azpk.m86089a(context).mo55185d("Matchstick.Latency.Lighter.Aidl.NewConversationIdToDisplayWebApp.Time");
        } else {
            azpk.m86089a(context).mo55185d("Matchstick.Latency.Lighter.NewConversationIdToDisplayWebApp.Time");
        }
        azpy.m86121a().mo55205a(bopw.CONVERSATION_ID_RECEIVED, System.currentTimeMillis());
        this.f99681o = bmxv.m108566b(conversationId);
        this.f99676j.mo55286a(conversationId);
        if ((!cfgs.m139400f() || cfgs.m139383C()) && cfeo.f183719a.mo6606a().mo80948aH()) {
            azph.m85998a(context).mo55146a(1712, conversationId);
            bmxv g = conversationId.mo60498a().mo60552g();
            if (g.mo66813a()) {
                String a = m85837a((JSONObject) g.mo66814b());
                new soa(9, new azmm(this, a)).start();
                if (conversationId.mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
                    bmxv g2 = conversationId.mo60558e().mo60552g();
                    if (g2.mo66813a()) {
                        new soa(9, new azmn(this, a, g2)).start();
                    } else {
                        azoj.m85933c("WebAppFragment", "Failed to convert other participant of conversationId to JSON %s", conversationId.mo60558e());
                    }
                } else {
                    azoj.m85932b("WebAppFragment", "Monitor initialization for group conversations not yet implemented.", new Object[0]);
                }
            } else {
                azoj.m85933c("WebAppFragment", "Failed to convert owner of conversationId to JSON %s", conversationId.mo60498a());
            }
            bmxv g3 = conversationId.mo60559g();
            if (g3.mo66813a()) {
                String a2 = m85837a((JSONObject) g3.mo66814b());
                if (cfeo.f183719a.mo6606a().mo80949aI()) {
                    if (mo55070a().f100105e.mo66813a()) {
                        bmxv = ((bcoh) mo55070a().f100105e.mo66814b()).mo57062g();
                    } else {
                        bmxv = bmvz.f131120a;
                    }
                    if (bmxv.mo66813a()) {
                        new soa(9, new azmo(this, ((JSONObject) bmxv.mo66814b()).toString(), a2)).start();
                    } else {
                        azoj.m85932b("WebAppFragment", "Failed to pre-warm messages monitor because of missing account context.", new Object[0]);
                    }
                }
                new soa(9, new azmp(this, a2)).start();
                new soa(9, new azmq(this, a2)).start();
                return;
            }
            azoj.m85933c("WebAppFragment", "Failed to convert conversationId to JSON %s", conversationId);
        }
    }

    /* renamed from: a */
    public final void mo55074a(bcoh bcoh) {
        azpy.m86121a().mo55205a(bopw.ACCOUNT_CONTEXT_RECEIVED, System.currentTimeMillis());
        if (cfgs.m139388H()) {
            mo55070a().f100105e = bmxv.m108566b(bcoh);
            this.f99676j.mo55282a(bcoh);
        }
    }

    /* renamed from: a */
    public final void mo54821a(String str) {
        new Object[1][0] = str;
        WebView webView = this.f99667a;
        if (webView == null) {
            azoj.m85933c("WebAppFragment", "Could not evaluate Javascript on null WebView", new Object[0]);
            if (getContext() != null) {
                azph.m85998a(getContext()).mo55126a(1837, 51);
                return;
            }
            return;
        }
        webView.post(new azms(this, str));
    }

    /* renamed from: a */
    public final void mo54822a(String[] strArr) {
        azpy.m86121a().mo55205a(bopw.ADD_JS_INTERFACES, System.currentTimeMillis());
        if (getActivity() != null) {
            WebView webView = this.f99667a;
            if (webView == null) {
                azoj.m85933c("WebAppFragment", "Could not add JavascriptInterface to null WebView", new Object[0]);
                azph.m85998a(getActivity()).mo55126a(1916, 51);
                return;
            }
            webView.post(new azmi(this, strArr));
            return;
        }
        azoj.m85933c("WebAppFragment", "Could not get activity when adding JavascriptInterface", new Object[0]);
    }

    /* renamed from: a */
    public final boolean mo55075a(ConversationId conversationId) {
        String str;
        new Object[1][0] = conversationId;
        azfc azfc = this.f99677k;
        if (azfc != null) {
            if (conversationId != null) {
                try {
                    str = conversationId.toString();
                } catch (RemoteException e) {
                    azoj.m85931a("WebAppFragment", e, "Unable to set conversation id with the service.", new Object[0]);
                    this.f99677k = null;
                    if (getContext() != null) {
                        azph.m85998a(getContext()).mo55126a(1565, 51);
                    }
                }
            } else {
                str = null;
            }
            azfc.mo54858a(str);
            return true;
        }
        azoj.m85933c("WebAppFragment", "Service not bound", new Object[0]);
        return false;
    }
}
