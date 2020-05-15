package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.WebViewLayout;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: axcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class axcs extends bkjc implements LoaderManager.LoaderCallbacks, axct {

    /* renamed from: a */
    WebView f95794a;

    /* renamed from: b */
    boolean f95795b;

    /* renamed from: a */
    public final Intent mo53020a(Context context, bmkd bmkd, String str, int i, LogContext logContext) {
        Intent intent = new Intent(context, StartAndroidAppRedirectActivity.class);
        intent.putExtra("startAndroidAppIntent", bjva.m104681a(bmkd, str));
        bjvp.m104735a(intent, "androidAppInfo", bmkd);
        intent.putExtra("activityThemeResId", i);
        intent.putExtra("logToken", (byte[]) null);
        intent.putExtra("parentLogContext", logContext);
        intent.setClassName(context, "com.google.android.gms.wallet.redirect.StartAndroidAppRedirectProxyActivity");
        intent.putExtra("buyFlowConfig", (BuyFlowConfig) getArguments().getParcelable("buyFlowConfig"));
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo53022m() {
        bjym bjym;
        bmki bmki = (bmki) this.f124069w;
        if ((bmki.f129804a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
            bmac bmac = bmki.f129823t;
            if (bmac == null) {
                bmac = bmac.f128430c;
            }
            if (!bmac.f128432a.isEmpty() && !this.f95795b) {
                return;
            }
        }
        if (super.mo66075v() && this.f124368j) {
            WebViewLayout webViewLayout = this.f124361c;
            bmki bmki2 = (bmki) this.f124069w;
            String str = bmki2.f129806c;
            String str2 = bmki2.f129807d;
            String str3 = null;
            IllegalArgumentException illegalArgumentException = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    bjym = new bjym(DataParser.CONNECT_TYPE_POST, str2);
                } catch (IllegalArgumentException e) {
                    illegalArgumentException = e;
                    bjym = null;
                }
                if (illegalArgumentException == null && bjym.mo65641c()) {
                    str3 = bjym.mo65639a();
                } else if (((Boolean) bjwe.f123489j.mo54082a()).booleanValue()) {
                    String valueOf = String.valueOf(str2);
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid initial post body: ") : "Invalid initial post body: ".concat(valueOf), illegalArgumentException);
                } else {
                    throw new IllegalArgumentException("Invalid initial post body.");
                }
            }
            webViewLayout.mo72119a(str, str3);
            mo52808n(true);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bmki bmki = (bmki) this.f124069w;
        if ((bmki.f129804a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
            bmac bmac = bmki.f129823t;
            if (bmac == null) {
                bmac = bmac.f128430c;
            }
            if (!bmac.f128432a.isEmpty() && !this.f95795b) {
                LoaderManager loaderManager = getLoaderManager();
                if (loaderManager.getLoader(0) != null) {
                    loaderManager.restartLoader(0, null, this);
                } else {
                    loaderManager.initLoader(0, null, this);
                }
            }
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i != 0) {
            return null;
        }
        Account cn = mo51878cn();
        int aw = mo65983aw();
        bmac bmac = ((bmki) this.f124069w).f129823t;
        if (bmac == null) {
            bmac = bmac.f128430c;
        }
        return new aweb(cn, aw, bmac.f128432a, getActivity());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjst.a(com.google.android.wallet.clientlog.LogContext, boolean):void
     arg types: [com.google.android.wallet.clientlog.LogContext, int]
     candidates:
      bjst.a(java.lang.String, int):bxvd
      bjst.a(com.google.android.wallet.clientlog.LogContext, long):com.google.android.wallet.clientlog.LogContext
      bjst.a(awfj, boolean):com.google.android.wallet.clientlog.Session
      bjst.a(com.google.android.wallet.clientlog.LogContext, int):com.google.android.wallet.clientlog.TimedEvent
      bjst.a(awfj, com.google.android.wallet.clientlog.Session):void
      bjst.a(com.google.android.wallet.clientlog.LogContext, com.google.android.wallet.clientlog.TimedEvent):void
      bjst.a(com.google.android.wallet.clientlog.Session, bwfr):void
      bjst.a(com.google.android.wallet.clientlog.Session, bwfe):boolean
      bjst.a(com.google.android.wallet.clientlog.LogContext, boolean):void */
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        String str = (String) obj;
        if (!isAdded()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            bjst.m104527a(mo65980at(), true);
            CookieManager instance = CookieManager.getInstance();
            axcr axcr = new axcr(this, str);
            int i = Build.VERSION.SDK_INT;
            instance.removeAllCookies(axcr);
            return;
        }
        bjst.m104527a(mo65980at(), false);
        Log.w("GcoreRedirectFragment", "Login url is empty, show login error dialog.");
        bmac bmac = ((bmki) this.f124069w).f129823t;
        if (bmac == null) {
            bmac = bmac.f128430c;
        }
        bmnr bmnr = bmac.f128433b;
        if (bmnr == null) {
            bmnr = bmnr.f130153o;
        }
        bxvd bxvd = (bxvd) bmnr.mo74142c(5);
        bxvd.mo73625a((bxvk) bmnr);
        mo66073a(bxvd);
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authObtainedStatus", this.f95795b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjst.b(com.google.android.wallet.clientlog.LogContext, boolean):void
     arg types: [com.google.android.wallet.clientlog.LogContext, int]
     candidates:
      bjst.b(com.google.android.wallet.clientlog.LogContext, long):void
      bjst.b(com.google.android.wallet.clientlog.LogContext, boolean):void */
    /* renamed from: t */
    public final void mo53023t() {
        bjst.m104534b(mo65980at(), false);
        bmac bmac = ((bmki) this.f124069w).f129823t;
        if (bmac == null) {
            bmac = bmac.f128430c;
        }
        bmnr bmnr = bmac.f128433b;
        if (bmnr == null) {
            bmnr = bmnr.f130153o;
        }
        bxvd bxvd = (bxvd) bmnr.mo74142c(5);
        bxvd.mo73625a((bxvk) bmnr);
        mo66073a(bxvd);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjst.b(com.google.android.wallet.clientlog.LogContext, boolean):void
     arg types: [com.google.android.wallet.clientlog.LogContext, int]
     candidates:
      bjst.b(com.google.android.wallet.clientlog.LogContext, long):void
      bjst.b(com.google.android.wallet.clientlog.LogContext, boolean):void */
    /* renamed from: u */
    public final void mo53024u() {
        bjst.m104534b(mo65980at(), true);
        this.f95795b = true;
        mo53022m();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fragment_redirect, viewGroup, false);
        this.f124361c = (WebViewLayout) inflate.findViewById(C0126R.C0129id.web_view_layout);
        if (bundle != null) {
            this.f124369k = (bmkd) bjvp.m104730a(bundle, "launchedAppRedirectInfo", (bxxk) bmkd.f129781l.mo74142c(7));
        }
        if (this.f124369k != null || !super.mo66075v()) {
            super.mo66072C();
        } else {
            if (!((bmki) this.f124069w).f129815l.isEmpty()) {
                WebViewLayout webViewLayout = this.f124361c;
                webViewLayout.f152238a.getSettings().setUserAgentString(((bmki) this.f124069w).f129815l);
            }
            WebViewLayout webViewLayout2 = this.f124361c;
            webViewLayout2.f152246i = ((bmki) this.f124069w).f129808e;
            TextView textView = webViewLayout2.f152244g;
            if (textView != null) {
                textView.setText(webViewLayout2.f152246i);
                TextView textView2 = webViewLayout2.f152244g;
                if (!TextUtils.isEmpty(webViewLayout2.f152246i)) {
                    i = 0;
                } else {
                    i = 8;
                }
                textView2.setVisibility(i);
            }
            WebViewLayout webViewLayout3 = this.f124361c;
            String str = ((bmki) this.f124069w).f129817n;
            webViewLayout3.f152247j = str;
            TextView textView3 = webViewLayout3.f152241d;
            if (textView3 != null) {
                textView3.setText(str);
            }
            WebViewLayout webViewLayout4 = this.f124361c;
            int i2 = 2;
            webViewLayout4.f152249l = 2;
            WebView webView = webViewLayout4.f152238a;
            if (webView != null) {
                webView.setLayoutParams(webViewLayout4.mo72120b());
            }
            WebViewLayout webViewLayout5 = this.f124361c;
            int a = bmkh.m108116a(((bmki) this.f124069w).f129825v);
            if (a != 0) {
                i2 = a;
            }
            webViewLayout5.f152250m = i2;
            Activity activity = getActivity();
            WebView webView2 = this.f124361c.f152238a;
            bmki bmki = (bmki) this.f124069w;
            this.f124362d = new bjxt(activity, webView2, bmki.f129809f, bmki.f129810g, bmki.f129813j, (String[]) bmki.f129814k.toArray(new String[0]), ((bmki) this.f124069w).f129822s, mo65980at());
            bjxt bjxt = this.f124362d;
            bjxt.f123642k = this;
            bjxt.f123605e = this;
            mo53021a(bundle);
            bjyl bjyl = this.f124362d;
            bjyl bjyl2 = bjyl;
            if (bjyl != null) {
                int i3 = Build.VERSION.SDK_INT;
                bjxt bjxt2 = this.f124362d;
                bjxt2.f123604d = this.f124370l;
                bjyl2 = bjxt2;
            }
            WebViewLayout webViewLayout6 = this.f124361c;
            bjyl bjyl3 = bjyl2;
            if (bjyl2 == null) {
                bjyl3 = new bjyl();
            }
            webViewLayout6.f152248k = bjyl3;
            bjyl bjyl4 = webViewLayout6.f152248k;
            bjyl4.f123645l = webViewLayout6;
            WebView webView3 = webViewLayout6.f152238a;
            if (webView3 != null) {
                webView3.setWebViewClient(bjyl4);
            }
            if (((bmki) this.f124069w).f129824u) {
                int i4 = Build.VERSION.SDK_INT;
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.f124361c.f152238a, true);
            }
            Activity activity2 = getActivity();
            if (!bjxo.f123597a) {
                aptm.m70977a(activity2.getApplicationContext(), new bjxn(this));
            } else {
                mo47595a();
            }
        }
        mo52808n(false);
        bmki bmki2 = (bmki) this.f124069w;
        if ((bmki2.f129804a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
            bmac bmac = bmki2.f129823t;
            if (bmac == null) {
                bmac = bmac.f128430c;
            }
            if (!bmac.f128432a.isEmpty() && !this.f95795b) {
                WebView webView4 = new WebView(getActivity());
                this.f95794a = webView4;
                webView4.getSettings().setJavaScriptEnabled(true);
                sdo.m34966a(this, "HiddenWebViewClient requires a LoadAuthTokenListener");
                webView4.setWebViewClient(new awyw(this));
            }
        }
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53021a(Bundle bundle) {
        if (bundle != null) {
            this.f95795b = bundle.getBoolean("authObtainedStatus");
        }
    }
}
