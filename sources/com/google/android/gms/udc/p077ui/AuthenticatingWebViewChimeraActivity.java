package com.google.android.gms.udc.p077ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.udc.ui.AuthenticatingWebViewChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticatingWebViewChimeraActivity extends deu implements avir {

    /* renamed from: b */
    public static final srn f109384b = srn.m36124a();

    /* renamed from: c */
    public String f109385c;

    /* renamed from: d */
    public boolean f109386d;

    /* renamed from: e */
    public ProgressBar f109387e;

    /* renamed from: f */
    public String f109388f;

    /* renamed from: g */
    private Pattern f109389g;

    /* renamed from: h */
    private WebView f109390h;

    /* renamed from: i */
    private FrameLayout f109391i;

    /* renamed from: g */
    public static Pattern m93670g() {
        String m = chbe.f188233a.mo6606a().mo84917m();
        if (m == null) {
            m = "";
        }
        try {
            return Pattern.compile(m);
        } catch (PatternSyntaxException e) {
            bnsl bnsl = (bnsl) f109384b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.udc.ui.AuthenticatingWebViewChimeraActivity", "g", 290, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("failed to compile whitelist pattern");
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: h */
    private final void m93671h() {
        setContentView((int) C0126R.C0128layout.common_auth_webcontent);
        this.f109391i = (FrameLayout) findViewById(C0126R.C0129id.common_auth_web_container);
        this.f109387e = (ProgressBar) findViewById(C0126R.C0129id.common_auth_web_progress_bar);
        if (this.f109390h == null) {
            CookieSyncManager.createInstance(this);
            CookieManager.getInstance().removeAllCookie();
            WebView webView = new WebView(this);
            this.f109390h = webView;
            webView.setFocusable(true);
            this.f109390h.setFocusableInTouchMode(true);
            this.f109390h.clearCache(true);
            WebSettings settings = this.f109390h.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(false);
            settings.setSaveFormData(false);
            settings.setAllowFileAccess(false);
            settings.setDatabaseEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setCacheMode(1);
            settings.setUseWideViewPort(true);
            settings.setAppCacheEnabled(false);
            avgo avgo = new avgo(this, new becd(bngx.m109356a(this.f109389g)));
            avgo.mo58545a(beby.ALLOW_SKIP_RESOURCE_WHITELIST_CHECK);
            this.f109390h.setWebViewClient(avgo);
            this.f109390h.setWebChromeClient(new avgp(this));
            if (TextUtils.isEmpty(this.f109385c)) {
                this.f109390h.loadUrl(this.f109388f);
            } else {
                String str = this.f109385c;
                String str2 = this.f109388f;
                sdo.m34969a(str2, (Object) "Url must be set");
                new avip(this, str, str2, this).execute(new Void[0]);
            }
        }
        this.f109391i.addView(this.f109390h);
    }

    /* renamed from: a */
    public final void mo51280a(String str) {
        this.f109390h.loadUrl(str);
    }

    /* renamed from: e */
    public final void mo51281e() {
        finish();
    }

    public final void onBackPressed() {
        if (this.f109390h.canGoBack()) {
            this.f109390h.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (this.f109390h != null) {
            this.f109391i.removeAllViews();
        }
        super.onConfigurationChanged(configuration);
        m93671h();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (!"com.google.android.gms".equals(spn.m35852a((Activity) this))) {
            setResult(0);
            finish();
            return;
        }
        Intent intent = getIntent();
        sdo.m34959a(intent.getData());
        this.f109388f = intent.getData().toString();
        this.f109385c = intent.getStringExtra("AuthWebviewAccountName");
        this.f109386d = intent.getBooleanExtra("AuthWebviewShowProgressBar", false);
        this.f109389g = m93670g();
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("AuthWebviewTitle");
        boolean booleanExtra = intent.getBooleanExtra("AuthWebviewHomeAsUpEnabled", false);
        if (!TextUtils.isEmpty(charSequenceExtra)) {
            z = true;
        } else {
            z = booleanExtra;
        }
        C1341rz aW = mo8628aW();
        if (z) {
            aW.mo15853b(booleanExtra);
            if (TextUtils.isEmpty(charSequenceExtra)) {
                aW.mo15858c(false);
            } else {
                aW.mo15858c(true);
                aW.mo15845a(charSequenceExtra);
            }
            aW.mo15859d();
        } else {
            aW.mo15862e();
        }
        m93671h();
        setResult(-1);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f109390h.restoreState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f109390h.saveState(bundle);
    }
}
