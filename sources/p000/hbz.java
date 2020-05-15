package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: hbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hbz extends adcf implements hca {

    /* renamed from: a */
    public static final sek f19451a = ght.m13172b("AuthorizationConsentFragment");

    /* renamed from: f */
    private static final int f19452f = C0126R.style.CredentialsDialogTheme;

    /* renamed from: b */
    public WebView f19453b;

    /* renamed from: c */
    public hdi f19454c;

    /* renamed from: d */
    public boolean f19455d;

    /* renamed from: e */
    public boolean f19456e;

    /* renamed from: g */
    private LinearLayout f19457g;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        hdi hdi = (hdi) adcj.m50161a(getActivity()).mo3444a(hdi.class);
        this.f19454c = hdi;
        if (!this.f19456e) {
            hdi.f19528g.mo2445a(this, new hbv(this));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new C1416ut(getActivity(), f19452f));
        setRetainInstance(true);
        this.f19457g = (LinearLayout) cloneInContext.inflate((int) C0126R.C0128layout.credentials_authorization_consent_fragment, viewGroup, false);
        if (this.f19453b == null) {
            Activity activity = getActivity();
            bmxy.m108581a(activity);
            WebView webView = new WebView(new hby(activity.getApplicationContext()));
            this.f19453b = webView;
            webView.setWebViewClient(new hbx(this));
            this.f19453b.setWebChromeClient(new hbw());
            this.f19453b.setFocusable(true);
            this.f19453b.setFocusableInTouchMode(true);
            this.f19453b.setMapTrackballToArrowKeys(false);
            WebSettings settings = this.f19453b.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(false);
            settings.setSaveFormData(false);
            settings.setSavePassword(false);
            settings.setAllowFileAccess(false);
            settings.setDatabaseEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setNeedInitialFocus(false);
            settings.setSupportZoom(false);
            settings.setUseWideViewPort(false);
            int i = Build.VERSION.SDK_INT;
            settings.setDisabledActionModeMenuItems(7);
            this.f19453b.addJavascriptInterface(new hcb(getContext().getApplicationContext(), this), "OAuthConsent");
            this.f19453b.setScrollbarFadingEnabled(false);
        }
        this.f19457g.addView(this.f19453b);
        return this.f19457g;
    }

    public final void onDestroyView() {
        LinearLayout linearLayout;
        WebView webView = this.f19453b;
        if (!(webView == null || (linearLayout = this.f19457g) == null)) {
            linearLayout.removeView(webView);
        }
        super.onDestroyView();
    }
}
