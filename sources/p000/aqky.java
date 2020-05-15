package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.signin.activity.BrowserConsentFragment$HiddenApiActivityIntentBlockingContext;

/* renamed from: aqky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqky extends Fragment implements aqkz {

    /* renamed from: a */
    public static final Logger f86318a = aqom.m71874a("BrowserConsentFragment");

    /* renamed from: b */
    public final bqgy f86319b = bqgy.m112818c();

    /* renamed from: c */
    public WebView f86320c;

    /* renamed from: d */
    private View f86321d;

    /* renamed from: a */
    public final void mo47956a() {
        WebView webView = this.f86320c;
        if (webView != null) {
            webView.setVisibility(0);
            this.f86321d.setVisibility(8);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        bmxy.m108581a(arguments);
        String string = arguments.getString("url");
        bmxy.m108581a(string);
        RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate((int) C0126R.C0128layout.browser_consent_view, (ViewGroup) null);
        this.f86321d = relativeLayout.findViewById(C0126R.C0129id.progress_bar_container);
        Activity activity = getActivity();
        bmxy.m108581a(activity);
        WebView webView = new WebView(new BrowserConsentFragment$HiddenApiActivityIntentBlockingContext(activity.getApplicationContext()));
        webView.setWebViewClient(new aqkx(this));
        webView.setWebChromeClient(new aqkw());
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        webView.setMapTrackballToArrowKeys(false);
        WebSettings settings = webView.getSettings();
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
        Context context = getContext();
        bmxy.m108581a(context);
        webView.addJavascriptInterface(new aqla(context.getApplicationContext(), this), "OAuthConsent");
        webView.loadUrl(string);
        webView.setVisibility(4);
        webView.setScrollbarFadingEnabled(false);
        relativeLayout.addView(webView);
        this.f86320c = webView;
        return relativeLayout;
    }

    public final void onDestroyView() {
        WebView webView = this.f86320c;
        if (webView != null) {
            webView.destroy();
            this.f86320c = null;
        }
        super.onDestroyView();
    }
}
