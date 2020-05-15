package com.google.android.gms.family.webview;

import android.accounts.Account;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.config.ModuleManager;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FamilyWebViewChimeraActivity extends Activity {

    /* renamed from: a */
    public String f31471a;

    /* renamed from: b */
    public WebView f31472b;

    /* renamed from: c */
    private Account f31473c;

    /* renamed from: d */
    private wrn f31474d;

    /* renamed from: e */
    private View f31475e;

    /* renamed from: a */
    public final void mo18569a() {
        setResult(0);
        finish();
    }

    public final void onBackPressed() {
        if (this.f31472b.canGoBack()) {
            this.f31472b.goBack();
            return;
        }
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        NetworkInfo activeNetworkInfo;
        int i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            wgn.m41924d("FamilyWebViewChimeraActivity", "FamilyWebViewChimeraActivity called with no intent", new Object[0]);
            mo18569a();
            return;
        }
        setContentView((int) C0126R.C0128layout.fm_webview);
        this.f31472b = (WebView) findViewById(C0126R.C0129id.webview);
        this.f31475e = findViewById(C0126R.C0129id.no_connection);
        this.f31474d = wrn.m42183a();
        this.f31473c = new Account(intent.getStringExtra("accountName"), "com.google");
        String stringExtra = intent.getStringExtra("webviewUrl");
        this.f31471a = stringExtra;
        if (stringExtra == null) {
            mo18569a();
            return;
        }
        this.f31472b.clearCache(true);
        this.f31472b.setWebViewClient(new wrk(getContainerActivity()));
        WebSettings settings = this.f31472b.getSettings();
        String userAgentString = settings.getUserAgentString();
        ModuleManager moduleManager = ModuleManager.get(this);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject put = jSONObject.put("os", "Android").put("osVersion", String.valueOf(Build.VERSION.SDK_INT)).put("app", "com.google.android.gms");
            try {
                i = moduleManager.getCurrentModule().moduleVersion;
            } catch (Exception e) {
                Object[] objArr = new Object[0];
                if (wgn.f50624a.mo25370a(6)) {
                    wgn.f50624a.mo25378c("Family", wgn.m41920a("UserAgentHelper", "Unable to determine module version.", objArr), e);
                }
                i = 0;
            }
            put.put("appVersion", String.valueOf(i));
        } catch (JSONException e2) {
        }
        String format = String.format(Locale.US, "FmIdWebView (%s)", jSONObject.toString().replaceAll("\\(|\\)", "_"));
        StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(format).length());
        sb.append(userAgentString);
        sb.append(" ");
        sb.append(format);
        settings.setUserAgentString(sb.toString());
        settings.setJavaScriptEnabled(true);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            this.f31472b.setVisibility(8);
            findViewById(C0126R.C0129id.fm_webview_loading_screen).setVisibility(8);
            this.f31475e.setVisibility(0);
            return;
        }
        this.f31475e.setVisibility(8);
        Account account = this.f31473c;
        String str = this.f31471a;
        wrn wrn = this.f31474d;
        aucb a = aucu.m76780a(wrn.f51191b, new wrl(wrn, account, str));
        a.mo50372a(wrj.f51180a);
        a.mo50369a(getContainerActivity(), new wrh(this));
        a.mo50368a(getContainerActivity(), new wri(this));
    }
}
