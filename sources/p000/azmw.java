package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;

/* renamed from: azmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azmw extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ azmx f99665a;

    /* renamed from: b */
    private final Locale f99666b;

    public azmw(azmx azmx, Locale locale) {
        this.f99665a = azmx;
        this.f99666b = locale;
    }

    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        azpy.m86121a();
        azpy.m86122a("WebAppFragment", "loading resource: %s", str);
        if (this.f99665a.getContext() != null && str != null) {
            if (azqg.m86161b(str) || str.contains(cfgs.m139398d()) || str.contains("app_bundle.js")) {
                if (!cfgs.m139417w()) {
                    azpk.m86089a(this.f99665a.getContext()).mo55187e("Matchstick.Latency.Lighter.LoadIndexPage.Time");
                    azpk.m86089a(this.f99665a.getContext()).mo55185d("Matchstick.Latency.Lighter.LoadJsBundle.Time");
                }
                azpy.m86121a().mo55205a(bopw.WEBVIEW_LOADING_RES_JS_BUNDLE, System.currentTimeMillis());
            } else if (azqg.m86160a(str)) {
                if (!cfgs.m139417w()) {
                    azpk.m86089a(this.f99665a.getContext()).mo55185d("Matchstick.Latency.Lighter.LoadIndexPage.Time");
                }
                azpy.m86121a().mo55205a(bopw.WEBVIEW_LOADING_RES_INDEX_PAGE, System.currentTimeMillis());
            }
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Context context = this.f99665a.getContext();
        if (context != null) {
            azph.m85998a(context).mo55125a(1475);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Context context = this.f99665a.getContext();
        if (context != null) {
            azph.m85998a(context).mo55125a(1474);
        }
        new Object[1][0] = str;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        azoj.m85933c("WebAppFragment", "Webview received resource error", new Object[0]);
        Context context = this.f99665a.getContext();
        if (context != null) {
            azph.m85998a(context).mo55126a(1453, 51);
        }
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Context context = this.f99665a.getContext();
        if (context != null) {
            azph.m85998a(context).mo55126a(1478, 51);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f99665a.mo55069a(webResourceRequest.getUrl().toString(), this.f99666b);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f99665a.mo55069a(str, this.f99666b);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        azoj.m85933c("WebAppFragment", "Webview received resource error %d : %s for %s", Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription(), webResourceRequest.getUrl());
        Context context = this.f99665a.getContext();
        if (context != null) {
            azph.m85998a(context).mo55126a(1453, 51);
        }
    }
}
