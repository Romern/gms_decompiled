package com.google.android.gms.octarine.p057ui;

import android.accounts.Account;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.octarine.utils.OctarineAuthSmsCodeReceiver;
import com.google.android.gms.octarine.widget.OctarineToolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.octarine.ui.OctarineWebviewChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OctarineWebviewChimeraActivity extends deu implements akwn, akxd, akwi, akxf, akym, akxs {

    /* renamed from: b */
    static final IntentFilter f81372b = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");

    /* renamed from: c */
    static final C1240of f81373c = C1240of.m19758a("gnotswvaction", "close");

    /* renamed from: d */
    static final C1240of f81374d = C1240of.m19758a("wv_action", "close");

    /* renamed from: e */
    public static final sek f81375e = akzt.m60725a("OctarineWebViewActivity");

    /* renamed from: A */
    public String f81376A;

    /* renamed from: B */
    public boolean f81377B;

    /* renamed from: C */
    boolean f81378C;

    /* renamed from: D */
    OctarineAuthSmsCodeReceiver f81379D;

    /* renamed from: E */
    public int f81380E;

    /* renamed from: F */
    public int f81381F;

    /* renamed from: G */
    public int f81382G;

    /* renamed from: H */
    akwx f81383H;

    /* renamed from: I */
    akxt f81384I;

    /* renamed from: J */
    akxe f81385J;

    /* renamed from: K */
    akwo f81386K;

    /* renamed from: L */
    akwu f81387L;

    /* renamed from: M */
    akwc f81388M;

    /* renamed from: N */
    public alaf f81389N;

    /* renamed from: O */
    boolean f81390O;

    /* renamed from: P */
    public int f81391P;

    /* renamed from: f */
    Account f81392f;

    /* renamed from: g */
    akzl f81393g;

    /* renamed from: h */
    becg f81394h;

    /* renamed from: i */
    becg f81395i;

    /* renamed from: j */
    CookieManager f81396j;

    /* renamed from: k */
    InputMethodManager f81397k;

    /* renamed from: l */
    public akzs f81398l;

    /* renamed from: m */
    bqgj f81399m;

    /* renamed from: n */
    public SwipeRefreshLayout f81400n;

    /* renamed from: o */
    akzq f81401o;

    /* renamed from: p */
    public WebView f81402p;

    /* renamed from: q */
    public akzw f81403q;

    /* renamed from: r */
    public FragmentManager f81404r;

    /* renamed from: s */
    public boolean f81405s;

    /* renamed from: t */
    ModuleManager f81406t;

    /* renamed from: u */
    Bundle f81407u;

    /* renamed from: v */
    boolean f81408v;

    /* renamed from: w */
    public boolean f81409w;

    /* renamed from: x */
    public boolean f81410x;

    /* renamed from: y */
    int f81411y;

    /* renamed from: z */
    public String f81412z;

    /* renamed from: a */
    private static boolean m67728a(Uri uri, C1240of ofVar) {
        String queryParameter = uri.getQueryParameter((String) ofVar.f26798a);
        return queryParameter != null && queryParameter.equals(ofVar.f26799b);
    }

    /* renamed from: b */
    private final void m67729b(Intent intent) {
        if (cfri.m142691b() && intent != null && !this.f81393g.mo40018a().equals(intent.getStringExtra("authAccount"))) {
            this.f81410x = true;
            this.f81402p.setImportantForAccessibility(2);
            this.f81393g.mo40020a(new Account(intent.getStringExtra("authAccount"), "com.google"), new akyx(this));
            this.f81401o.mo40028b();
            mo44761a(new akyy(this));
        }
    }

    /* renamed from: h */
    private final boolean m67730h(String str) {
        return this.f81394h.mo58550a(Uri.parse(str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: r */
    private final void m67732r() {
        boolean z;
        alaf alaf = this.f81389N;
        View inflate = alaf.f73207a.getLayoutInflater().inflate((int) C0126R.C0128layout.octarine_webview_app_bar, alaf.f73208b, false);
        if (cfri.m142694e()) {
            int i = Build.VERSION.SDK_INT;
        } else if (inflate instanceof AppBarLayout) {
            ((AppBarLayout) inflate).f150997e = false;
        }
        Bundle a = alaf.mo40039a();
        View findViewWithTag = alaf.f73208b.findViewWithTag("oc_tbc");
        if (findViewWithTag == null || findViewWithTag.getVisibility() == 0) {
            z = false;
        } else {
            z = true;
        }
        alaf.f73208b.removeView(findViewWithTag);
        alaf.f73213g = inflate;
        alaf.f73213g.setTag("oc_tbc");
        if (z) {
            alaf.mo39903a(0L);
        } else {
            alaf.mo39905b(0L);
        }
        alaf.f73208b.addView(alaf.f73213g, 0);
        alaf.f73208b.invalidate();
        alaf.f73214h = (OctarineToolbar) alaf.f73213g.findViewById(C0126R.C0129id.octarine_toolbar);
        alaf.f73214h.setBackgroundColor(adyg.m51405b(alaf.f73207a, C0126R.attr.octBackground, C0126R.color.google_white));
        adyg.m51402a(alaf.f73214h, 3, akvo.f72966a);
        alaf.f73207a.mo8626a(alaf.f73214h);
        C1341rz aW = alaf.f73207a.mo8628aW();
        if (aW != null) {
            aW.mo15841a(16, 24);
            aW.mo15853b(true);
        }
        alaf.mo40040a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo44764c(int i) {
        WebBackForwardList copyBackForwardList = this.f81402p.copyBackForwardList();
        for (int i2 = 1; i2 <= i - this.f81411y; i2++) {
            if (!copyBackForwardList.getItemAtIndex(i - i2).getUrl().equals("about:blank")) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final void mo39988d() {
        if (cfri.m142691b()) {
            setResult(-1, new Intent().putExtra("authAccount", mo44771h()));
        } else {
            setResult(-1);
        }
        if (m67731q()) {
            supportFinishAfterTransition();
        } else {
            finish();
        }
    }

    /* renamed from: e */
    public final void mo39989e() {
        int currentIndex = this.f81402p.copyBackForwardList().getCurrentIndex();
        int c = mo44764c(currentIndex);
        if (mo44773j() && mo44777n()) {
            c += mo44764c(currentIndex - c);
        }
        if (c > 0) {
            this.f81405s = false;
            mo44768f(this.f81402p.copyBackForwardList().getItemAtIndex(currentIndex - c).getUrl());
            this.f81402p.goBackOrForward(-c);
            return;
        }
        mo39988d();
    }

    /* renamed from: f */
    public final void mo39990f() {
        this.f81411y = this.f81402p.copyBackForwardList().getCurrentIndex();
    }

    /* renamed from: g */
    public final Account mo44769g() {
        return cfri.m142691b() ? this.f81393g.mo40023c() : this.f81392f;
    }

    /* renamed from: i */
    public final void mo44772i() {
        Bundle bundle = this.f81407u;
        if (bundle != null) {
            this.f81402p.restoreState(bundle);
            this.f81407u = null;
        } else if (this.f81402p.getUrl() != null) {
            mo44763a(false);
        } else if (m67730h(this.f81412z)) {
            this.f81402p.loadUrl(this.f81412z);
        } else {
            this.f81398l.mo40030a();
            mo44765c(this.f81412z);
            mo39988d();
        }
    }

    /* renamed from: j */
    public final boolean mo44773j() {
        Fragment findFragmentByTag = this.f81404r.findFragmentByTag("error_tag");
        return findFragmentByTag != null && findFragmentByTag.isVisible();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo44774k() {
        alag alag = (alag) this.f81404r.findFragmentByTag("error_tag");
        if (alag != null) {
            return alag.f73222a.getText().toString();
        }
        return null;
    }

    /* renamed from: l */
    public final void mo44775l() {
        this.f81405s = false;
        if (cfri.m142693d()) {
            if (mo44773j()) {
                this.f81402p.goBack();
            } else {
                this.f81402p.reload();
            }
        } else if (mo44777n()) {
            this.f81402p.goBack();
        } else {
            this.f81402p.loadUrl(this.f81412z);
        }
    }

    /* renamed from: m */
    public final void mo44776m() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo44777n() {
        WebBackForwardList copyBackForwardList = this.f81402p.copyBackForwardList();
        return copyBackForwardList.getCurrentIndex() > 0 && copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() + -1).getUrl().equals(this.f81412z);
    }

    /* renamed from: o */
    public final void mo44778o() {
        this.f81401o.mo40028b();
        runOnUiThread(new akyr(this));
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        xqk xqk;
        int i4;
        int i5;
        if (i == 1) {
            this.f81408v = true;
            m67729b(intent);
        } else if (i == 2 && (i5 = this.f81380E) >= 0) {
            akxt akxt = this.f81384I;
            if (akxt.f73078b) {
                akxt.f73077a.evaluateJavascript(String.format(Locale.ROOT, "window.ocTrustAgentCallback(%s)", Integer.valueOf(i5)), null);
            }
        } else if (i == 3 && (i4 = this.f81381F) >= 0) {
            akxe akxe = this.f81385J;
            if (akxe.f73046b) {
                akxe.f73045a.evaluateJavascript(String.format(Locale.ROOT, "window.ocPlayProtectCallback(%s)", Integer.valueOf(i4)), null);
            }
        } else if (i != 5 || (i3 = this.f81391P) < 0) {
            if (i == 10 && i2 == -1) {
                m67729b(intent);
            }
        } else if (this.f81386K.f73009b) {
            if (i2 != -1) {
                xpf xpf = new xpf();
                xpf.mo30001a(ErrorCode.UNKNOWN_ERR);
                xpf.f52860a = "Fido2 response not received";
                xqk = new xqk(xql.ERROR, Integer.valueOf(i3), xpf.mo30000a());
            } else if (intent == null) {
                xpf xpf2 = new xpf();
                xpf2.mo30001a(ErrorCode.UNKNOWN_ERR);
                xpf2.f52860a = "Fido2 intent data is null";
                xqk = new xqk(xql.ERROR, Integer.valueOf(i3), xpf2.mo30000a());
            } else {
                xqk = intent.hasExtra("FIDO2_ERROR_EXTRA") ? new xqk(xql.ERROR, Integer.valueOf(i3), AuthenticatorErrorResponse.m23451a(intent.getByteArrayExtra("FIDO2_ERROR_EXTRA"))) : new xqk(xql.SIGN, Integer.valueOf(i3), AuthenticatorAssertionResponse.m23445a(intent.getByteArrayExtra("FIDO2_RESPONSE_EXTRA")));
            }
            this.f81386K.mo39933a(xqk);
        }
    }

    public final void onBackPressed() {
        mo39989e();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        akzl akzl;
        super.onConfigurationChanged(configuration);
        m67732r();
        if (!cfri.m142691b() || (akzl = this.f81393g) == null) {
            Account account = this.f81392f;
            if (account != null) {
                this.f81389N.mo40047d(account.name);
                return;
            }
            return;
        }
        this.f81389N.mo40047d(akzl.mo40018a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.transition.Transition.excludeTarget(int, boolean):android.transition.Transition}
     arg types: [int, int]
     candidates:
      ClspMth{android.transition.Transition.excludeTarget(android.view.View, boolean):android.transition.Transition}
      ClspMth{android.transition.Transition.excludeTarget(java.lang.Class, boolean):android.transition.Transition}
      ClspMth{android.transition.Transition.excludeTarget(java.lang.String, boolean):android.transition.Transition}
      ClspMth{android.transition.Transition.excludeTarget(int, boolean):android.transition.Transition} */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        akzl akzl;
        int i;
        super.onCreate(bundle);
        if (!cbro.m128201e()) {
            setTheme(C0126R.style.OctarineAppTheme);
        } else if (!cfri.m142692c()) {
            new adyf(this, akvo.f72966a, C0126R.style.OctarineAppTheme, C0126R.style.OctarineAppThemeDark, 1);
        } else {
            bmzi bmzi = akvo.f72966a;
            int intExtra = getIntent().getIntExtra("extra.themeChoice", 0);
            if (intExtra < 0 || intExtra >= adye.m51385a().length) {
                i = 1;
            } else {
                i = adye.m51385a()[intExtra];
            }
            new adyf(this, bmzi, C0126R.style.OctarineAppTheme, C0126R.style.OctarineAppThemeDark, i);
        }
        int i2 = Build.VERSION.SDK_INT;
        getWindow().setStatusBarColor(adyg.m51405b(this, C0126R.attr.octSystemBarColor, C0126R.color.google_white));
        if (m67731q()) {
            Fade fade = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            getWindow().setEnterTransition(fade);
        }
        if (bundle == null) {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("extra.url");
            if (stm.m36302d(stringExtra) || !Patterns.WEB_URL.matcher(stringExtra).matches()) {
                f81375e.mo25412b("Invalid URL passed: %s", stringExtra);
            } else if (stm.m36302d(intent.getStringExtra("extra.accountName"))) {
                f81375e.mo25412b("Empty account name passed", new Object[0]);
            }
            mo44776m();
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        setTitle("");
        setContentView((int) C0126R.C0128layout.octarine_webview);
        int a = bsmo.m115982a(getIntent().getIntExtra("extra.initialTitleType", 1));
        if (a == 0) {
            a = 2;
        }
        int a2 = bsmn.m115981a(getIntent().getIntExtra("extra.initialAccountDisplay", 1));
        if (a2 == 0) {
            a2 = 2;
        }
        if (cfri.m142691b()) {
            this.f81393g = new akzl();
        }
        if (!cfri.m142691b()) {
            akzl = new akzl();
        } else {
            akzl = this.f81393g;
        }
        this.f81389N = new alaf(this, a, a2, akzl);
        m67732r();
        this.f81404r = getSupportFragmentManager();
        this.f81405s = false;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(C0126R.C0129id.octarine_webview_swipe_refresh_layout);
        this.f81400n = swipeRefreshLayout;
        adyg.m51403a(swipeRefreshLayout, akvo.f72966a, (int) C0126R.attr.octBackground);
        this.f81396j = CookieManager.getInstance();
        this.f81399m = snp.m35702a(9);
        this.f81401o = akzq.m60714a();
        this.f81403q = new akzw(findViewById(C0126R.C0129id.octarine_webview_frame));
        this.f81397k = (InputMethodManager) getSystemService("input_method");
        this.f81406t = ModuleManager.get(this);
        this.f81380E = -1;
        this.f81381F = -1;
        this.f81382G = -1;
        this.f81391P = -1;
        this.f81394h = new akzu(Pattern.compile(stm.m36299a(cfrc.f185484a.mo6606a().mo82558p())), Pattern.compile(stm.m36299a(cfrc.f185484a.mo6606a().mo82557o())));
        this.f81395i = new akzu(Pattern.compile(stm.m36299a(cfrc.f185484a.mo6606a().mo82545c())), Pattern.compile(stm.m36299a(cfrc.f185484a.mo6606a().mo82544b())));
        WebView webView = (WebView) findViewById(C0126R.C0129id.octarine_webview);
        this.f81402p = webView;
        webView.setBackgroundColor(adyg.m51405b(this, C0126R.attr.octBackground, C0126R.color.google_white));
        if (cfri.f185506a.mo6606a().mo82563a()) {
            this.f81402p.setFilterTouchesWhenObscured(true);
        }
        this.f81379D = new OctarineAuthSmsCodeReceiver(this.f81402p);
        akze akze = new akze(this, this.f81394h);
        akze.mo58545a(beby.ALLOW_SKIP_RESOURCE_WHITELIST_CHECK);
        this.f81402p.setWebViewClient(akze);
        WebSettings settings = this.f81402p.getSettings();
        String userAgentString = this.f81402p.getSettings().getUserAgentString();
        String a3 = akzx.m60730a(this, this.f81406t);
        StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(a3).length());
        sb.append(userAgentString);
        sb.append(" ");
        sb.append(a3);
        settings.setUserAgentString(sb.toString());
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        this.f81402p.setWebChromeClient(new akzg(this));
        if (cfri.m142691b()) {
            this.f81402p.setOnTouchListener(new akyq(this));
        }
        if (cfri.m142694e()) {
            int i4 = Build.VERSION.SDK_INT;
            this.f81402p.setOnScrollChangeListener(new akyv(this));
        }
        if (bundle == null || bundle.isEmpty()) {
            if (cfri.m142691b()) {
                this.f81393g.mo40019a(new Account(getIntent().getStringExtra("extra.accountName"), "com.google"));
                this.f81398l = new akzs(this, this.f81393g);
            } else {
                this.f81392f = new Account(getIntent().getStringExtra("extra.accountName"), "com.google");
                this.f81398l = new akzs(this, this.f81392f.name);
            }
            this.f81411y = 0;
            this.f81376A = getIntent().getStringExtra("extra.url");
            this.f81389N.mo40040a((Bundle) null);
            this.f81377B = true;
            this.f81390O = getIntent().getBooleanExtra("extra.suppressCookieClearing", false);
        } else {
            if (cfri.m142691b()) {
                this.f81393g.mo40019a((Account) bundle.getParcelable("account"));
                this.f81398l = new akzs(this, this.f81393g);
            } else {
                this.f81392f = (Account) bundle.getParcelable("account");
                this.f81398l = new akzs(this, this.f81392f.name);
            }
            this.f81411y = bundle.getInt("backStopIndex");
            this.f81376A = bundle.getString("currentUrl");
            this.f81377B = bundle.getBoolean("webviewStillBlank");
            this.f81407u = bundle.getBundle("webviewState");
            if (bundle.getBundle("appBar").getInt("accountDisplay") == 3 && !getIntent().getBooleanExtra("allowAccountSwitching", false)) {
                bundle.getBundle("appBar").putInt("accountDisplay", 2);
            }
            this.f81389N.mo40040a(bundle.getBundle("appBar"));
            this.f81390O = false;
        }
        this.f81389N.mo40047d(mo44771h());
        this.f81412z = this.f81376A;
        this.f81388M = new akwc(this.f81389N);
        this.f81385J = new akxe(this, this.f81402p);
        this.f81384I = new akxt(this, this.f81402p);
        this.f81386K = new akwo(this, this.f81402p);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f81388M);
        arrayList.add(this.f81384I);
        arrayList.add(this.f81385J);
        arrayList.add(this.f81386K);
        arrayList.add(new akyn(this));
        arrayList.add(new akwj(this));
        arrayList.add(new akwh(this.f81406t));
        arrayList.add(new akxg(this));
        if (cfri.m142691b()) {
            arrayList.add(new akyf(this, this.f81402p, this.f81393g));
        } else {
            arrayList.add(new akyf(this, this.f81402p, this.f81392f));
        }
        arrayList.add(new akvq(this));
        arrayList.add(new akvr(this));
        arrayList.add(new akwg(getPackageManager(), rfz.m33557a(this), this.f81402p));
        akwu akwu = new akwu(this, this.f81402p);
        this.f81387L = akwu;
        arrayList.add(akwu);
        this.f81383H = new akwx(arrayList, this.f81402p);
        mo44768f(this.f81412z);
        if (cfri.m142693d()) {
            this.f81402p.addOnAttachStateChangeListener(new akzj(this));
            this.f81400n.f1697a = new akyw(this);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        getMenuInflater().inflate(C0126R.C0130menu.octarine_webview, menu);
        boolean z2 = false;
        if (!stm.m36302d(this.f81389N.f73211e) || !stm.m36302d(this.f81389N.f73212f)) {
            z = true;
        } else {
            z = false;
        }
        MenuItem findItem = menu.findItem(C0126R.C0129id.octarine_webview_help);
        findItem.setVisible(z);
        if (z) {
            findItem.setIcon(C1497xt.m20824b().mo16510a(this, (int) C0126R.C0127drawable.quantum_ic_help_vd_theme_24));
        }
        int i = this.f81389N.f73218l;
        if (i == 3 || i == 4) {
            z2 = true;
        }
        MenuItem findItem2 = menu.findItem(C0126R.C0129id.octarine_webview_avatar);
        findItem2.setVisible(z2);
        if (z2) {
            alaf alaf = this.f81389N;
            alaf.f73215i = findItem2;
            alaf.mo40045c();
        }
        return true;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f81387L.mo39940c();
        mo39954b();
        akwx akwx = this.f81383H;
        for (akww akww : akwx.f73031a.keySet()) {
            akwv akwv = (akwv) akwx.f73031a.get(akww);
            if (akwx.mo39944a(akww)) {
                akwx.f73033c.removeJavascriptInterface(akwv.f73028a);
                akww.mo39898b();
                akwx.f73032b.put(akww, false);
            }
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (this.f81389N.f73217k == 2) {
                mo39989e();
            } else {
                mo39988d();
            }
            return true;
        } else if (itemId == C0126R.C0129id.octarine_webview_help) {
            if (!stm.m36302d(this.f81389N.f73211e)) {
                GoogleHelp googleHelp = new GoogleHelp(this.f81389N.f73211e);
                googleHelp.mo43195a(this);
                googleHelp.f78774q = Uri.parse("https://support.google.com/accounts");
                wwu wwu = new wwu();
                wwu.f51496a = mo44771h();
                wwu.mo29491a(wwr.m42392a(getContainerActivity()));
                googleHelp.mo43196a(wwu.mo29490a(), getCacheDir());
                ThemeSettings themeSettings = new ThemeSettings();
                themeSettings.f31623a = 0;
                themeSettings.f31624b = adyg.m51405b(this, C0126R.attr.octOnSurface, C0126R.color.google_grey800);
                googleHelp.f78776s = themeSettings;
                new aarh(this).mo31646a(googleHelp.mo43194a());
            } else {
                String str = this.f81389N.f73212f;
                if (str != null) {
                    mo44765c(str);
                } else {
                    f81375e.mo25412b("Attempting to launch GoogleHelp with empty help context and URL.", new Object[0]);
                }
            }
            return true;
        } else if (itemId != C0126R.C0129id.octarine_webview_avatar) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.f81389N.mo40042a(findViewById(C0126R.C0129id.octarine_webview_avatar), this);
            return true;
        }
    }

    public final void onPause() {
        super.onPause();
        akwu akwu = this.f81387L;
        if (akwu.f73025f) {
            akwu.f73021b.mo30206a(StateUpdate.f31872b);
        }
        this.f81401o.mo40027a(mo44769g());
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (!isFinishing()) {
            this.f81405s = false;
            if (this.f81408v) {
                this.f81408v = false;
                if (this.f81407u != null) {
                    mo44763a(true);
                    this.f81402p.restoreState(this.f81407u);
                    this.f81407u = null;
                } else {
                    this.f81402p.reload();
                }
            } else {
                mo44763a(true);
                if (!this.f81390O && this.f81402p.getUrl() == null) {
                    this.f81396j.removeAllCookie();
                    mo44779p();
                } else if (this.f81401o.mo40029b(mo44769g())) {
                    this.f81401o.mo40028b();
                    mo44779p();
                } else {
                    mo44772i();
                }
            }
            akwu akwu = this.f81387L;
            if (akwu.f73025f) {
                akwu.f73021b.mo30206a(StateUpdate.f31873c);
            }
            this.f81389N.mo40045c();
            this.f81390O = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", mo44769g());
        bundle.putString("currentUrl", this.f81412z);
        bundle.putBoolean("webviewStillBlank", this.f81377B);
        bundle.putInt("backStopIndex", this.f81411y);
        Bundle bundle2 = new Bundle();
        this.f81402p.saveState(bundle2);
        bundle.putBundle("webviewState", bundle2);
        bundle.putBundle("appBar", this.f81389N.mo40039a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo44779p() {
        mo44761a((Runnable) null);
    }

    /* renamed from: q */
    static final boolean m67731q() {
        int i = Build.VERSION.SDK_INT;
        return cbro.m128205i();
    }

    /* renamed from: a */
    public final int mo44760a(String str, boolean z) {
        if (!z) {
            return 1;
        }
        Uri parse = Uri.parse(str);
        return (m67728a(parse, f81373c) || m67728a(parse, f81374d)) ? 2 : 3;
    }

    /* renamed from: f */
    public final void mo44768f(String str) {
        becg becg;
        akwx akwx = this.f81383H;
        Uri parse = Uri.parse(str);
        for (akww akww : akwx.f73031a.keySet()) {
            akwv akwv = (akwv) akwx.f73031a.get(akww);
            if (akwv.f73030c && akwx.f73034d.mo58550a(parse) && ((becg = akwv.f73029b) == null || becg.mo58550a(parse))) {
                if (!akwx.mo39944a(akww)) {
                    akwx.f73033c.addJavascriptInterface(akww, akwv.f73028a);
                    akwx.f73032b.put(akww, true);
                }
                akww.mo39897a(str);
            } else if (akwx.mo39944a(akww)) {
                akwx.f73033c.removeJavascriptInterface(akwv.f73028a);
                akww.mo39898b();
                akwx.f73032b.put(akww, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final aucb mo44770g(String str) {
        akzq akzq = this.f81401o;
        aucb a = aucu.m76780a(akzq.f73180b, new akzo(akzq, mo44769g(), str));
        a.mo50372a(new akyu(this));
        return a;
    }

    /* renamed from: h */
    public final String mo44771h() {
        return cfri.m142691b() ? this.f81393g.mo40018a() : this.f81392f.name;
    }

    /* renamed from: a */
    public final void mo39953a() {
        if (!this.f81378C) {
            registerReceiver(this.f81379D, f81372b);
            this.f81378C = true;
        }
    }

    /* renamed from: c */
    public final void mo39987c() {
        View currentFocus = getWindow().getCurrentFocus();
        if (currentFocus != null) {
            this.f81397k.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public final void mo39946a(int i) {
        this.f81381F = i;
        startActivityForResult(new Intent("com.google.android.gms.settings.VERIFY_APPS_SETTINGS").setPackage("com.google.android.gms"), 3);
    }

    /* renamed from: b */
    public final void mo39954b() {
        if (this.f81378C) {
            unregisterReceiver(this.f81379D);
            this.f81378C = false;
        }
    }

    /* renamed from: d */
    public final void mo44766d(String str) {
        alag alag;
        this.f81402p.setVisibility(8);
        this.f81405s = true;
        this.f81402p.loadUrl("about:blank");
        if (!mo44773j()) {
            FragmentTransaction beginTransaction = this.f81404r.beginTransaction();
            Bundle bundle = new Bundle(3);
            bundle.putCharSequence("message.text", str);
            alag alag2 = new alag();
            alag2.setArguments(bundle);
            beginTransaction.add(C0126R.C0129id.octarine_webview_container, alag2, "error_tag").commitAllowingStateLoss();
        } else if (!stm.m36302d(mo44774k()) && !mo44774k().equals(str) && (alag = (alag) this.f81404r.findFragmentByTag("error_tag")) != null) {
            alag.f73222a.setText(str);
        }
        this.f81403q.mo40033a(C0126R.string.octarine_snackbar_error_setting_loading, C0126R.string.common_try_again, new akzb(this, str));
    }

    /* renamed from: a */
    public final void mo39985a(int i, Map map) {
        Intent putExtra = new Intent().setPackage("com.google.android.gms").putExtra("extra.accountName", mo44771h()).putExtra("extra.screenId", i);
        if (cbro.m128206j()) {
            putExtra.setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P");
            putExtra.putExtra("extra.callingPackageName", getIntent().getStringExtra("extra.callingPackageName"));
        } else {
            putExtra.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String valueOf = String.valueOf((String) entry.getKey());
            bundle.putString(valueOf.length() == 0 ? new String("extra.screen.") : "extra.screen.".concat(valueOf), (String) entry.getValue());
        }
        putExtra.putExtras(bundle);
        startActivityForResult(putExtra, 4);
    }

    /* renamed from: b */
    public final void mo39964b(int i) {
        this.f81380E = i;
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.trustagent.discovery.PromoteScreenLockAndOnbodyActivity");
        intent.putExtra("extra_from_intent", "from_security_advisor");
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo44765c(String str) {
        Bundle bundle = new Bundle();
        int i = Build.VERSION.SDK_INT;
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        try {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", adyg.m51405b(this, C0126R.attr.octLegacyFillSecondary200, C0126R.color.google_grey200));
        } catch (Resources.NotFoundException e) {
        }
        bundle.putString("com.android.browser.application_id", getPackageName());
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        if (!parse.isOpaque() && parse.getQueryParameter("hl") == null) {
            buildUpon.appendQueryParameter("hl", akzn.m60713a().toString());
        }
        String a = stm.m36299a(cfrc.f185484a.mo6606a().mo82543a());
        if (Patterns.WEB_URL.matcher(a).matches() && this.f81395i.mo58550a(parse)) {
            buildUpon = Uri.parse(a).buildUpon().appendQueryParameter("hl", akzn.m60713a().toString()).appendQueryParameter("Email", mo44771h()).appendQueryParameter("continue", buildUpon.build().toString());
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", buildUpon.build()).putExtras(bundle));
        } catch (ActivityNotFoundException e2) {
            this.f81403q.mo40033a(C0126R.string.common_no_browser_found, 17039360, akyz.f73146a);
        }
    }

    /* renamed from: e */
    public final void mo44767e(String str) {
        if (!this.f81396j.hasCookies()) {
            mo44769g();
            aucb g = mo44770g(this.f81412z);
            g.mo50369a(getContainerActivity(), new akzc(this));
            g.mo50368a(getContainerActivity(), new akzd(this, str));
            return;
        }
        mo44775l();
    }

    /* renamed from: b */
    public final void mo39986b(String str) {
        mo44762a(str, mo44760a(str, m67730h(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44761a(Runnable runnable) {
        mo44769g();
        aucb g = mo44770g(this.f81412z);
        g.mo50369a(getContainerActivity(), new akys(this, runnable));
        g.mo50368a(getContainerActivity(), new akyt(this));
    }

    /* renamed from: a */
    public final void mo39927a(String str) {
        this.f81399m.execute(new akzh(this, str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final void mo44762a(String str, int i) {
        String str2;
        int i2;
        int i3 = 2;
        if (i == 2) {
            mo39988d();
        } else if (i != 3) {
            this.f81398l.mo40030a();
            mo44765c(str);
        } else {
            int i4 = this.f81389N.f73218l;
            int i5 = i4 - 1;
            if (i4 != 0) {
                if (i5 == 2) {
                    i3 = 3;
                } else if (i5 == 3) {
                    i3 = 4;
                }
                String h = mo44771h();
                if (cbro.m128206j()) {
                    str2 = getIntent().getStringExtra("extra.callingPackageName");
                } else {
                    str2 = null;
                }
                OctarineToolbar octarineToolbar = this.f81389N.f73214h;
                if (octarineToolbar != null) {
                    i2 = octarineToolbar.f81419x;
                } else {
                    i2 = 1;
                }
                int i6 = i2 - 1;
                if (i2 != 0) {
                    Intent a = akvm.m60560a(str, h, str2, i6, i3 - 1);
                    a.putExtra("extra.suppressCookieClearing", true);
                    if (i3 == 4) {
                        a.putExtra("allowAccountSwitching", true);
                    }
                    startActivityForResult(a, 1);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo39930a(xrx xrx, int i) {
        this.f81391P = i;
        Activity containerActivity = getContainerActivity();
        if (xrx.mo30096a()) {
            containerActivity.startIntentSenderForResult(xrx.f53001a.getIntentSender(), 5, null, 0, 0, 0);
            return;
        }
        throw new IllegalStateException("No PendingIntent available");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44763a(boolean z) {
        this.f81400n.post(new akza(this, z));
    }
}
