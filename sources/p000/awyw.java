package p000;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: awyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awyw extends WebViewClient {

    /* renamed from: a */
    private final axct f95333a;

    public awyw(axct axct) {
        this.f95333a = axct;
    }

    public final void onPageFinished(WebView webView, String str) {
        this.f95333a.mo53024u();
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f95333a.mo53023t();
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f95333a.mo53023t();
    }
}
