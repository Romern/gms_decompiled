package com.google.android.gms.ads.internal.webview2;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.webview2.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class C0722f extends WebView {
    public C0722f(Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        int i = Build.VERSION.SDK_INT;
        settings.setMixedContentMode(2);
        C0387d.m5364b().mo6869a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C0633h.m5669b("Unable to enable Javascript.", e);
        }
    }

    public final void addJavascriptInterface(Object obj, String str) {
        int i = Build.VERSION.SDK_INT;
        super.addJavascriptInterface(obj, str);
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            C0387d.m5366d().mo6783a(e, "CoreWebView.loadUrl");
            C0633h.m5675e("#007 Could not call remote method.", e);
        }
    }
}
