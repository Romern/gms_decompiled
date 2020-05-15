package com.google.android.gms.constellation.p038ui;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* renamed from: com.google.android.gms.constellation.ui.ConstellationWebSettingsChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConstellationWebSettingsChimeraActivity extends deu implements tbg {

    /* renamed from: b */
    public static final sek f30567b = tea.m36798a("web_settings");

    /* renamed from: c */
    public WebView f30568c;

    /* renamed from: d */
    protected tam f30569d;

    /* renamed from: e */
    private Context f30570e;

    /* renamed from: f */
    private tds f30571f;

    /* renamed from: g */
    private tdx f30572g;

    /* renamed from: h */
    private LinearLayout f30573h;

    /* renamed from: a */
    public static String m22811a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            f30567b.mo25417e("Couldn't url encode parameters", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo17983b(String str) {
        if (this.f30568c != null) {
            runOnUiThread(new tbc(this, str));
        }
    }

    /* renamed from: e */
    public final void mo17984e() {
        runOnUiThread(new tbd(this));
    }

    /* renamed from: g */
    public final void mo17985g() {
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.f30568c, 1);
    }

    /* renamed from: h */
    public final void mo17986h() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f30568c.getWindowToken(), 0);
    }

    public final void onBackPressed() {
        WebView webView = this.f30568c;
        if (webView == null || !webView.canGoBack()) {
            finish();
        } else {
            this.f30568c.goBack();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.c11n_web_settings);
        f30567b.mo25412b("Creating activity", new Object[0]);
        this.f30570e = getApplicationContext();
        this.f30572g = new tdx(UUID.randomUUID().toString(), null);
        this.f30571f = tds.m36774a(this.f30570e);
        this.f30568c = (WebView) findViewById(C0126R.C0129id.c11n_settings_webview);
        this.f30573h = (LinearLayout) findViewById(C0126R.C0129id.c11n_web_error_view);
        C1341rz aW = mo8628aW();
        tdi.m36751a(this);
        if (tdi.m36752b(this)) {
            if (aW != null) {
                aW.mo15862e();
            }
            this.f30573h.setVisibility(8);
            this.f30568c.setVisibility(0);
            this.f30571f.mo26406a(this.f30572g, 28);
            this.f30568c.getSettings().setJavaScriptEnabled(true);
            this.f30568c.setWebViewClient(new tbf(this));
            this.f30569d = new tam(getApplicationContext(), this, this.f30572g);
            new tbe(this.f30570e, this.f30568c, this.f30569d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        if (aW != null) {
            aW.mo15859d();
        }
        this.f30571f.mo26406a(this.f30572g, 32);
        this.f30568c.setVisibility(8);
        this.f30573h.setVisibility(0);
        this.f30573h.setOnClickListener(new tbb(this));
    }
}
