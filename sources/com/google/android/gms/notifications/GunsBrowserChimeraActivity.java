package com.google.android.gms.notifications;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GunsBrowserChimeraActivity extends Activity implements LoaderManager.LoaderCallbacks, akoa {

    /* renamed from: a */
    public static final srn f81201a = srn.m36127a(sgj.GUNS);

    /* renamed from: f */
    private static final IntentFilter f81202f = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");

    /* renamed from: b */
    public final Set f81203b;

    /* renamed from: c */
    public WebView f81204c;

    /* renamed from: d */
    public boolean f81205d;

    /* renamed from: e */
    public ProgressBar f81206e;

    /* renamed from: g */
    private final Set f81207g;

    /* renamed from: h */
    private blcs f81208h;

    /* renamed from: i */
    private bldb f81209i;

    /* renamed from: j */
    private akob f81210j;

    /* renamed from: k */
    private boolean f81211k;

    /* renamed from: l */
    private String f81212l;

    /* renamed from: m */
    private GunsSmsReceiver f81213m;

    /* renamed from: n */
    private Handler f81214n;

    public GunsBrowserChimeraActivity() {
        HashSet hashSet = new HashSet();
        if (cfqb.f185420a.mo6606a().mo82502o()) {
            hashSet.addAll(Arrays.asList("adssettings.google.com", "myaccount.google.com", "security.google.com", "www.google.com", "accounts.google.com", "accounts.google.net", "accounts.google.org", "accounts.google.biz", "accounts.google.info", "accounts.google.mobi", "accounts.google.name", "accounts.google.pro", "accounts.google.us", "accounts.google.ag", "accounts.google.ba", "accounts.google.ca", "accounts.google.co.cr", "accounts.google.co.uk", "accounts.g.cn", "accounts.google.cn", "accounts.google.com.cn", "accounts.guge.com", "accounts.guge.com.cn", "accounts.guge.cn", "accounts.googel.cn", "accounts.xn--flW351E.cn", "accounts.google.al", "accounts.google.org.uk", "accounts.google.cl", "accounts.google.de", "accounts.google.ec", "accounts.google.ee", "accounts.google.fi", "accounts.google.fr", "accounts.google.gd", "accounts.google.ge", "accounts.google.gy", "accounts.google.com.gy", "accounts.google.ie", "accounts.google.in", "accounts.google.net.in", "accounts.google.org.in", "accounts.google.it", "accounts.google.co.nz", "accounts.google.org.nz", "accounts.google.net.nz", "accounts.google.co.at", "accounts.google.com.af", "accounts.google.org.af", "accounts.google.at", "accounts.google.com.au", "accounts.google.com.br", "accounts.google.com.gt", "accounts.google.com.mx", "accounts.google.mx", "accounts.google.co.ma", "accounts.google.jobs", "accounts.google.cz", "accounts.google.hu", "accounts.google.co.hu", "accounts.google.nl", "accounts.google.is", "accounts.google.dk", "accounts.google.pf", "accounts.google.com.pg", "accounts.google.pl", "accounts.google.com.pl", "accounts.google.com.ph", "accounts.google.com.pr", "accounts.google.ro", "accounts.google.se", "accounts.google.ch", "accounts.google.gm", "accounts.xn--2e0b0k.kr", "accounts.google.co.kr", "accounts.google.kr", "accounts.google.jp", "accounts.google.co.jp", "accounts.google.ne.jp", "accounts.google.co.je", "accounts.google.com.ar", "accounts.google.am", "accounts.google.be", "accounts.google.fm", "accounts.google.tv", "accounts.google.vg", "accounts.google.bi", "accounts.google.cc", "accounts.google.cd", "accounts.google.co.il", "accounts.google.kz", "accounts.google.la", "accounts.google.lv", "accounts.google.lt", "accounts.google.md", "accounts.google.mw", "accounts.google.mr", "accounts.google.ms", "accounts.google.nr", "accounts.google.nu", "accounts.google.ps", "accounts.google.com.ps", "accounts.google.com.nf", "accounts.google.com.pa", "accounts.google.com.py", "accounts.google.ru", "accounts.google.com.ru", "accounts.xn--c1aay4a.xn--p1ai", "accounts.google.rw", "accounts.google.sh", "accounts.google.com.ec", "accounts.google.co.gg", "accounts.google.li", "accounts.google.com.ua", "accounts.google.ua", "accounts.google.co.ua", "accounts.google.as", "accounts.google.ws", "accounts.google.sg", "accounts.google.co.th", "accounts.google.ae", "accounts.google.gr", "accounts.google.com.gr", "accounts.google.no", "accounts.google.com.pt", "accounts.google.pt", "accounts.google.com.sg", "accounts.google.io", "accounts.google.td", "accounts.google.tw", "accounts.google.com.hk", "accounts.google.hk", "accounts.google.com.pe", "accounts.google.com.tw", "accounts.google.je", "accounts.google.com.tr", "accounts.google.ac", "accounts.google.ad", "accounts.google.it.ao", "accounts.google.aw", "accounts.google.az", "accounts.google.bf", "accounts.google.bg", "accounts.google.bj", "accounts.google.bm", "accounts.google.bn", "accounts.google.bo", "accounts.google.bs", "accounts.google.bt", "accounts.google.by", "accounts.google.bz", "accounts.google.cat", "accounts.google.cf", "accounts.google.cg", "accounts.google.ci", "accounts.google.cm", "accounts.google.co.ao", "accounts.google.co.ba", "accounts.google.co.bi", "accounts.google.co.bw", "accounts.google.co.ci", "accounts.google.co.ck", "accounts.google.co.gl", "accounts.google.co.gy", "accounts.google.co.id", "accounts.google.co.im", "accounts.google.co.in", "accounts.google.co.it", "accounts.google.co.ke", "accounts.google.co.ls", "accounts.google.co.mu", "accounts.google.co.mw", "accounts.google.co.mz", "accounts.google.co.pn", "accounts.google.co.rs", "accounts.google.co.tt", "accounts.google.co.tz", "accounts.google.co.ug", "accounts.google.co.uz", "accounts.google.co.ve", "accounts.google.co.vi", "accounts.google.co.za", "accounts.google.co.zm", "accounts.google.co.zw", "accounts.google.com.ag", "accounts.google.com.ai", "accounts.google.com.az", "accounts.google.com.bd", "accounts.google.com.bh", "accounts.google.com.bi", "accounts.google.com.bn", "accounts.google.com.bo", "accounts.google.com.bs", "accounts.google.com.by", "accounts.google.com.bz", "accounts.google.com.cy", "accounts.google.com.dz", "accounts.google.com.eg", "accounts.google.com.er", "accounts.google.com.et", "accounts.google.com.ge", "accounts.google.com.gh", "accounts.google.com.gi", "accounts.google.com.gl", "accounts.google.com.gp", "accounts.google.com.hn", "accounts.google.com.hr", "accounts.google.com.ht", "accounts.google.com.iq", "accounts.google.com.jm", "accounts.google.com.jo", "accounts.google.com.kg", "accounts.google.com.kh", "accounts.google.com.ki", "accounts.google.com.kw", "accounts.google.com.kz", "accounts.google.com.lb", "accounts.google.com.lc", "accounts.google.com.lk", "accounts.google.com.lv", "accounts.google.com.ly", "accounts.google.com.mk", "accounts.google.com.mm", "accounts.google.com.mt", "accounts.google.com.mu", "accounts.google.com.mw", "accounts.google.com.my", "accounts.google.com.na", "accounts.google.com.nc", "accounts.google.com.ng", "accounts.google.com.ni", "accounts.google.com.np", "accounts.google.com.nr", "accounts.google.com.om", "accounts.google.com.pk", "accounts.google.com.qa", "accounts.google.com.sa", "accounts.google.com.sb", "accounts.google.com.sc", "accounts.google.com.sl", "accounts.google.com.sv", "accounts.google.com.tj", "accounts.google.com.tm", "accounts.google.com.tn", "accounts.google.com.tt", "accounts.google.com.uy", "accounts.google.com.uz", "accounts.google.com.vc", "accounts.google.com.vi", "accounts.google.com.vn", "accounts.google.com.ws", "accounts.google.com.cu", "accounts.google.cv", "accounts.google.cx", "accounts.google.dj", "accounts.google.dm", "accounts.google.do", "accounts.google.dz", "accounts.google.es", "accounts.google.eu", "accounts.google.nom.es", "accounts.google.org.es", "accounts.google.ga", "accounts.google.gf", "accounts.google.gg", "accounts.google.gl", "accounts.google.gp", "accounts.google.gw", "accounts.google.hn", "accounts.google.hr", "accounts.google.ht", "accounts.google.im", "accounts.google.in.rs", "accounts.google.iq", "accounts.google.jo", "accounts.google.kg", "accounts.google.ki", "accounts.google.km", "accounts.google.kn", "accounts.google.lk", "accounts.google.lu", "accounts.google.ma", "accounts.google.me", "accounts.google.mg", "accounts.google.mh", "accounts.google.mk", "accounts.google.ml", "accounts.google.mn", "accounts.google.mu", "accounts.google.mv", "accounts.google.ne", "accounts.google.nf", "accounts.google.ng", "accounts.google.off.ai", "accounts.google.ph", "accounts.google.pk", "accounts.google.pn", "accounts.google.pr", "accounts.google.qa", "accounts.google.re", "accounts.google.rs", "accounts.google.sc", "accounts.google.si", "accounts.google.sk", "accounts.google.sl", "accounts.google.sm", "accounts.google.sn", "accounts.google.so", "accounts.google.sr", "accounts.google.st", "accounts.google.sz", "accounts.google.tk", "accounts.google.tg", "accounts.google.tm", "accounts.google.tn", "accounts.google.to", "accounts.google.tt", "accounts.google.ug", "accounts.google.uz", "accounts.google.vc", "accounts.google.vn", "accounts.google.vu", "accounts.google.yt", "accounts.google.af", "accounts.google.com.ve", "accounts.google.tel", "accounts.google.tp", "accounts.google.tl", "accounts.google.com.do", "accounts.google.com.co", "accounts.google.com.fj", "accounts.youtube.com"));
        }
        for (String str : aknm.m60091a(cfqb.f185420a.mo6606a().mo82489b())) {
            if (m67662e(str)) {
                hashSet.add(str);
            }
        }
        for (String str2 : aknm.m60091a(cfqb.f185420a.mo6606a().mo82493f())) {
            hashSet.remove(str2);
        }
        this.f81207g = hashSet;
        HashSet hashSet2 = new HashSet();
        for (String str3 : aknm.m60091a(cfqb.f185420a.mo6606a().mo82495h())) {
            if (m67662e(str3)) {
                hashSet2.add(str3);
            }
        }
        for (String str4 : aknm.m60091a(cfqb.f185420a.mo6606a().mo82494g())) {
            if (m67662e(str4)) {
                hashSet2.add(str4);
            }
        }
        this.f81203b = hashSet2;
    }

    /* renamed from: a */
    private final String m67658a() {
        bldb bldb = this.f81209i;
        if (bldb == null) {
            return null;
        }
        bldc bldc = bldb.f126039b;
        if (bldc == null) {
            bldc = bldc.f126041c;
        }
        if (bldc.f126043a.isEmpty()) {
            return null;
        }
        bldc bldc2 = this.f81209i.f126039b;
        if (bldc2 == null) {
            bldc2 = bldc.f126041c;
        }
        if (!bldc2.f126044b || TextUtils.isEmpty(this.f81212l)) {
            return null;
        }
        bldc bldc3 = this.f81209i.f126039b;
        if (bldc3 == null) {
            bldc3 = bldc.f126041c;
        }
        return bldc3.f126043a;
    }

    /* renamed from: b */
    private final String m67660b() {
        blcs blcs = this.f81208h;
        if (blcs == null) {
            return null;
        }
        blco blco = blcs.f125978c;
        if (blco == null) {
            blco = blco.f125949g;
        }
        if (blco.f125953c.isEmpty()) {
            return null;
        }
        blco blco2 = this.f81208h.f125978c;
        if (blco2 == null) {
            blco2 = blco.f125949g;
        }
        return blco2.f125953c;
    }

    /* renamed from: d */
    private final void m67661d(String str) {
        CookieManager.getInstance().removeAllCookie();
        if (TextUtils.isEmpty(str)) {
            str = m67658a();
        }
        this.f81204c.loadUrl(str);
    }

    /* renamed from: e */
    private static boolean m67662e(String str) {
        return !TextUtils.isEmpty(str) && Patterns.DOMAIN_NAME.matcher(str).matches();
    }

    /* renamed from: c */
    public final void mo44697c(String str) {
        if (this.f81204c != null) {
            this.f81214n.post(new aknp(this, str));
        }
    }

    public final void onBackPressed() {
        if (this.f81204c.canGoBack()) {
            this.f81204c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f81214n = new adzt();
        setContentView((int) C0126R.C0128layout.guns_web_view);
        WebView webView = (WebView) findViewById(C0126R.C0129id.gunsWebView);
        this.f81204c = webView;
        WebSettings settings = webView.getSettings();
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setSupportZoom(true);
        String userAgentString = settings.getUserAgentString();
        StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 22);
        sb.append(userAgentString);
        sb.append(" GnotsGcoreWebView/1.1");
        settings.setUserAgentString(sb.toString());
        int i = Build.VERSION.SDK_INT;
        settings.setDisabledActionModeMenuItems(7);
        this.f81204c.setWebViewClient(new aknt(this));
        this.f81206e = (ProgressBar) findViewById(C0126R.C0129id.gunsProgressBar);
        this.f81210j = null;
        this.f81211k = false;
        this.f81213m = new GunsSmsReceiver(this.f81204c);
        m67659a(getIntent());
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i != 0) {
            return null;
        }
        String a = m67658a();
        if (!TextUtils.isEmpty(a)) {
            return new akok(this, this.f81212l, a);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Bundle bundle = (Bundle) obj;
        if (loader.getId() == 0) {
            if (bundle.getBoolean("WebLoginUrlLoader.hadError", false)) {
                m67661d(null);
            } else {
                m67661d(bundle.getString("WebloginUrlLoader.authenticatedUrl"));
            }
            if (cfqh.f185459a.mo6606a().mo82525a()) {
                getSupportLoaderManager().destroyLoader(0);
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m67659a(intent);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (this.f81211k) {
            unregisterReceiver(this.f81213m);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (this.f81211k) {
            registerReceiver(this.f81213m, f81202f);
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.f81205d) {
            finish();
        }
    }

    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    public final boolean mo44696b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Set set = this.f81207g;
        return set != null && set.contains(parse.getHost()) && "https".equals(parse.getScheme());
    }

    /* renamed from: a */
    private final void m67659a(Intent intent) {
        String str = this.f81212l;
        String a = m67658a();
        String b = m67660b();
        this.f81208h = akoc.m60116a(intent);
        this.f81209i = akoc.m60121b(intent);
        this.f81212l = intent.getStringExtra("com.google.android.gms.notifications.intents.accountName");
        String a2 = m67658a();
        String b2 = m67660b();
        if (soz.m35812h(getApplicationContext(), this.f81212l)) {
            if (a == null || str == null || b == null || !str.equals(this.f81212l) || !a.equals(a2) || !b.equals(b2)) {
                if (TextUtils.isEmpty(a2)) {
                    ((bnsl) f81201a.mo68387b()).mo68405a("Trying to navigate to null/empty url/accountname");
                    finish();
                    return;
                } else if (!mo44696b(a2)) {
                    mo44694a(a2);
                    return;
                } else {
                    this.f81205d = false;
                    getSupportLoaderManager().destroyLoader(0);
                    getSupportLoaderManager().initLoader(0, null, this);
                }
            }
            int i = Build.VERSION.SDK_INT;
            String string = getString(C0126R.string.guns_lock_screen_content_title);
            blcs blcs = this.f81208h;
            if (blcs != null) {
                blda blda = blcs.f125980e;
                if (blda == null) {
                    blda = blda.f126015t;
                }
                if (!blda.f126033q.isEmpty()) {
                    blda blda2 = this.f81208h.f125980e;
                    if (blda2 == null) {
                        blda2 = blda.f126015t;
                    }
                    string = blda2.f126033q;
                }
            }
            setTaskDescription(new ActivityManager.TaskDescription(string));
            return;
        }
        finish();
    }

    /* renamed from: a */
    public final void mo44694a(String str) {
        if (!TextUtils.isEmpty(str)) {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
            if (str.equals(m67658a())) {
                mo44695a(false);
                finish();
            }
        }
    }

    /* renamed from: a */
    public final void mo44695a(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (!z) {
            if (this.f81211k) {
                this.f81204c.removeJavascriptInterface("mm");
                unregisterReceiver(this.f81213m);
                this.f81211k = false;
            }
        } else if (!this.f81211k) {
            if (this.f81210j == null) {
                this.f81210j = new akob(this, this, this.f81204c);
            }
            this.f81204c.addJavascriptInterface(this.f81210j, "mm");
            registerReceiver(this.f81213m, f81202f);
            this.f81211k = true;
        }
    }
}
