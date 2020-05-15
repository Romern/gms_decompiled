package p000;

import android.accounts.Account;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.login.CustomWebView;

/* renamed from: jxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jxr extends jwx implements LoaderManager.LoaderCallbacks, jxs {

    /* renamed from: d */
    public static final imr f23470d = imr.m15727a("account");

    /* renamed from: e */
    public static final imr f23471e = imr.m15727a("url");

    /* renamed from: f */
    public static final imr f23472f = imr.m15727a("cookies");

    /* renamed from: h */
    private static final Logger f23473h = ght.m13171a("BrowserConsentFragment");

    /* renamed from: g */
    public jxq f23474g;

    /* renamed from: i */
    private imy f23475i;

    /* renamed from: j */
    private jxt f23476j;

    /* renamed from: k */
    private boolean f23477k;

    /* renamed from: l */
    private Account f23478l;

    /* renamed from: m */
    private String f23479m;

    /* renamed from: n */
    private BrowserResolutionCookie[] f23480n = new BrowserResolutionCookie[0];

    /* renamed from: b */
    private final void m17478b(CustomWebView customWebView, String str) {
        if (!this.f23475i.mo13153b(str)) {
            if (this.f23477k) {
                customWebView.removeJavascriptInterface("OAuthConsent");
                this.f23477k = false;
            }
        } else if (!this.f23477k) {
            customWebView.addJavascriptInterface(this.f23476j, "OAuthConsent");
            this.f23477k = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14195a(CustomWebView customWebView) {
        WebSettings settings = customWebView.getSettings();
        String userAgentString = settings.getUserAgentString();
        String a = stn.m36304a("gms.auth.useragent", "");
        StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(a).length());
        sb.append(userAgentString);
        sb.append(" ");
        sb.append(a);
        settings.setUserAgentString(sb.toString());
        jym.m17513a().mo14229b();
        CookieManager instance = CookieManager.getInstance();
        BrowserResolutionCookie[] browserResolutionCookieArr = this.f23480n;
        for (BrowserResolutionCookie browserResolutionCookie : browserResolutionCookieArr) {
            if (TextUtils.isEmpty(browserResolutionCookie.f9921c) || TextUtils.isEmpty(browserResolutionCookie.f9919a) || TextUtils.isEmpty(browserResolutionCookie.f9920b)) {
                f23473h.mo25416d("Invalid browser resolution cookie.", new Object[0]);
            } else {
                String a2 = ghx.m13173a(browserResolutionCookie.f9921c, Boolean.valueOf(browserResolutionCookie.f9924f));
                String a3 = ghx.m13174a(browserResolutionCookie.f9919a, browserResolutionCookie.f9920b, browserResolutionCookie.f9921c, browserResolutionCookie.f9922d, Boolean.valueOf(browserResolutionCookie.f9925g), Boolean.valueOf(browserResolutionCookie.f9924f), Long.valueOf(browserResolutionCookie.f9923e));
                Logger Logger = f23473h;
                String valueOf = String.valueOf(a2);
                Logger.mo25412b(valueOf.length() == 0 ? new String("Setting browser resolution cookie for url: ") : "Setting browser resolution cookie for url: ".concat(valueOf), new Object[0]);
                instance.setCookie(a2, a3);
            }
        }
        getActivity().getSupportLoaderManager().restartLoader(0, null, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14198a(jyl jyl) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo14201d(String str) {
        if (this.f23475i.mo13153b(str)) {
            return false;
        }
        this.f23474g.mo7897b(str);
        return true;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f23474g = (jxq) activity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        this.f23476j = new jxt(this);
        this.f23475i = imy.m15745a((String) gnv.f18738i.mo58455c());
        this.f23478l = (Account) mo14207b().mo13146a(f23470d);
        this.f23479m = (String) mo14207b().mo13146a(f23471e);
        Parcelable[] parcelableArr = (Parcelable[]) mo14207b().mo13146a(f23472f);
        if (parcelableArr != null) {
            this.f23480n = new BrowserResolutionCookie[parcelableArr.length];
            for (int i2 = 0; i2 < parcelableArr.length; i2++) {
                this.f23480n[i2] = (BrowserResolutionCookie) parcelableArr[i2];
            }
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new jxl(getActivity(), this.f23478l, new String[]{this.f23479m});
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        CustomWebView customWebView;
        if (((Boolean) obj).booleanValue()) {
            Logger Logger = f23473h;
            String valueOf = String.valueOf(this.f23478l);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Updated credentials for account: ");
            sb.append(valueOf);
            Logger.mo25414c(sb.toString(), new Object[0]);
            if (gnv.m13512V() && (customWebView = this.f23425c) != null) {
                m17478b(customWebView, this.f23479m);
            }
            mo14197a(this.f23479m);
            return;
        }
        Logger logger2 = f23473h;
        String valueOf2 = String.valueOf(this.f23478l);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
        sb2.append("Failed to get login token for account: ");
        sb2.append(valueOf2);
        logger2.mo25416d(sb2.toString(), new Object[0]);
        this.f23474g.mo7860c();
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14196a(CustomWebView customWebView, String str) {
        if (!gnv.m13512V()) {
            m17478b(customWebView, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14199a(WebResourceRequest webResourceRequest) {
        if (this.f23475i.mo13153b(webResourceRequest.getUrl().toString())) {
            return false;
        }
        this.f23474g.mo7897b(webResourceRequest.getUrl().toString());
        return true;
    }
}
