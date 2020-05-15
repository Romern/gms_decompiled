package com.google.android.gms.auth.login;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import com.felicanetworks.mfc.C0126R;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrowserChimeraActivity extends jem implements View.OnFocusChangeListener, jff {

    /* renamed from: A */
    private ArrayList f10971A = null;

    /* renamed from: B */
    private imy f10972B;

    /* renamed from: C */
    private AsyncTask f10973C;

    /* renamed from: a */
    public String f10974a;

    /* renamed from: m */
    public String f10975m;

    /* renamed from: n */
    public String f10976n;

    /* renamed from: o */
    public String f10977o;

    /* renamed from: p */
    public Map f10978p;

    /* renamed from: q */
    public CustomWebView f10979q;

    /* renamed from: r */
    public CookieManager f10980r;

    /* renamed from: s */
    public String f10981s = null;

    /* renamed from: t */
    public String f10982t = null;

    /* renamed from: u */
    private String f10983u;

    /* renamed from: v */
    private boolean f10984v;

    /* renamed from: w */
    private String f10985w;

    /* renamed from: x */
    private boolean f10986x = false;

    /* renamed from: y */
    private boolean f10987y = false;

    /* renamed from: z */
    private boolean f10988z = false;

    /* renamed from: a */
    public static Intent m6653a(String str, String str2, String str3, boolean z, ArrayList arrayList, String str4, String str5) {
        Intent className = new Intent().setClassName(rpr.m34216b(), "com.google.android.gms.auth.login.BrowserActivity");
        className.putExtra("account_name", str);
        className.putExtra("url", str2);
        className.putExtra("access_token", str3);
        className.putExtra("creating_account", z);
        className.putStringArrayListExtra("allowed_domains", arrayList);
        if (!TextUtils.isEmpty(str4)) {
            className.putExtra("purchaser_email", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            className.putExtra("purchaser_name", str5);
        }
        return className;
    }

    /* renamed from: b */
    public static String m6655b(String str) {
        if (str == null) {
            return "null";
        }
        try {
            URI uri = new URI(str);
            String host = uri.getHost();
            String path = uri.getPath();
            StringBuilder sb = new StringBuilder(String.valueOf(host).length() + 13 + String.valueOf(path).length());
            sb.append("Host: ");
            sb.append(host);
            sb.append(" Path: ");
            sb.append(path);
            return sb.toString();
        } catch (URISyntaxException e) {
            return str;
        }
    }

    /* renamed from: c */
    public final void mo7727c(String str) {
        jyl a = jym.m17513a().mo14226a(str);
        String str2 = a.f23530a;
        if (str2 != null) {
            this.f10986x = true;
        }
        if (this.f10986x && !this.f10987y) {
            this.f10987y = true;
            this.f10983u = str2;
            this.f10979q.setVisibility(8);
            jen jen = new jen(new Bundle());
            jen.f22297a.putString("authorization_code", a.f23530a);
            jen.f22297a.putString("obfuscated_gaia_id", a.f23531b);
            setResult(-1, new Intent().putExtras(jen.f22297a));
            finish();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        CustomWebView customWebView;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0 || (customWebView = this.f10979q) == null || !customWebView.canGoBack()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f10979q.goBack();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 1) {
            setResult(1);
        } else {
            setResult(0);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Locale locale = Locale.getDefault();
        this.f10976n = locale.getLanguage();
        this.f10977o = locale.getCountry();
        String language = locale.getLanguage();
        this.f10985w = language;
        if (!language.isEmpty()) {
            if (!this.f10977o.isEmpty()) {
                String valueOf = String.valueOf(this.f10985w);
                String str = this.f10977o;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
                sb.append(valueOf);
                sb.append("-");
                sb.append(str);
                this.f10985w = sb.toString();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            linkedHashMap.put("Accept-Language", this.f10985w);
            this.f10978p = Collections.unmodifiableMap(linkedHashMap);
        } else {
            this.f10978p = null;
        }
        this.f10972B = imy.m15745a(gnv.m13526aH());
        setContentView((int) C0126R.C0128layout.auth_browser_add_account_activity);
        if (bundle != null) {
            this.f10986x = bundle.getBoolean("interactivity_completed", false);
            this.f10988z = bundle.getBoolean("waiting_for_network", false);
            this.f10987y = bundle.getBoolean("background_task_started", false);
            mo7724a(bundle);
        } else {
            mo7724a(getIntent().getExtras());
        }
        CustomWebView customWebView = (CustomWebView) findViewById(C0126R.C0129id.activity_root).findViewById(C0126R.C0129id.webview);
        this.f10979q = customWebView;
        customWebView.clearCache(true);
        this.f10979q.mo7732a();
        CookieSyncManager.createInstance(this);
        this.f10980r = CookieManager.getInstance();
        this.f10979q.setWebViewClient(new jfg(this, this.f10972B));
        this.f10979q.setWebChromeClient(new jep(this));
        WebSettings settings = this.f10979q.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setLightTouchEnabled(false);
        settings.setNeedInitialFocus(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        this.f10979q.setMapTrackballToArrowKeys(false);
        this.f10979q.setFocusable(true);
        this.f10979q.setFocusableInTouchMode(true);
        this.f10979q.getSettings().setUseWideViewPort(false);
        jeo jeo = new jeo(this);
        this.f10973C = jeo;
        jeo.execute(new Void[0]);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f10973C;
        if (asyncTask != null) {
            asyncTask.cancel(false);
            this.f10973C = null;
        }
    }

    public final void onFocusChange(View view, boolean z) {
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 0) {
            setResult(0);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("access_token", this.f10983u);
        bundle.putString("account_name", this.f10974a);
        bundle.putBoolean("creating_account", this.f10984v);
        bundle.putStringArrayList("allowed_domains", this.f10971A);
        bundle.putString("purchaser_email", this.f10981s);
        bundle.putString("purchaser_name", this.f10982t);
        bundle.putString("url", this.f10975m);
        bundle.putBoolean("interactivity_completed", this.f10986x);
        bundle.putBoolean("waiting_for_network", this.f10988z);
        bundle.putBoolean("background_task_started", this.f10987y);
    }

    /* renamed from: b */
    public final void mo7726b() {
        mo13660h();
    }

    /* renamed from: a */
    public static boolean m6654a(String str, imy imy) {
        if (str != null) {
            try {
                String path = new URI(str).getPath();
                if (path == null || !imy.mo13153b(str) || !path.startsWith("/EmbeddedSetup")) {
                    return false;
                }
                return true;
            } catch (URISyntaxException e) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo7723a() {
        mo13659g();
    }

    /* renamed from: a */
    public final void mo7724a(Bundle bundle) {
        this.f10974a = bundle.getString("account_name");
        this.f10975m = bundle.getString("url");
        this.f10983u = bundle.getString("access_token");
        this.f10984v = bundle.getBoolean("creating_account");
        this.f10971A = bundle.getStringArrayList("allowed_domains");
        this.f10981s = bundle.getString("purchaser_email");
        this.f10982t = bundle.getString("purchaser_name");
    }

    /* renamed from: a */
    public final void mo7725a(izj izj) {
        boolean z;
        String str = this.f10974a;
        boolean z2 = this.f10984v;
        if (this.f10971A == null) {
            z = true;
        } else {
            z = false;
        }
        startActivityForResult(ShowErrorChimeraActivity.m6683a(str, null, izj, z2, true, z), 1009);
    }
}
