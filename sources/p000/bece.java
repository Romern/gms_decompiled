package p000;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: bece */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bece extends WebViewClient {

    /* renamed from: a */
    private final becg f106897a;

    /* renamed from: b */
    private final becg f106898b;

    /* renamed from: c */
    private boolean f106899c = false;

    static {
        bnsp.m110328a("SaferWebViewClient");
    }

    public bece(becg becg, becg becg2) {
        bmxy.m108581a(becg);
        this.f106897a = becg;
        bmxy.m108581a(becg2);
        this.f106898b = becg2;
    }

    /* renamed from: a */
    private static WebResourceResponse m91761a(boolean z) {
        if (z) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not whitelisted", null, null);
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo36088b(String str) {
        return false;
    }

    @Deprecated
    /* renamed from: c */
    public boolean mo40007c(String str) {
        return false;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z = true;
        if (!this.f106899c && !m91762a(webResourceRequest.getUrl())) {
            z = false;
        }
        return m91761a(z);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z;
        boolean a = this.f106897a.mo58550a(webResourceRequest.getUrl());
        if (!a) {
            z = mo29311a(webResourceRequest);
        } else {
            z = mo40007c(webResourceRequest.getUrl().toString());
        }
        return m91763a(webView, a, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        boolean z = true;
        if (!this.f106899c && !m91762a(Uri.parse(str))) {
            z = false;
        }
        return m91761a(z);
    }

    /* renamed from: a */
    private final boolean m91762a(Uri uri) {
        boolean z = true;
        if (!becf.f106900a.matcher(uri.toString()).find() && !this.f106898b.mo58550a(uri)) {
            z = false;
        }
        if (!z) {
            becf.m91769a(uri);
        }
        return z;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        boolean a = this.f106897a.mo58550a(Uri.parse(str));
        if (!a) {
            z = mo29312a(str);
        } else {
            z = mo40007c(str);
        }
        return m91763a(webView, a, z);
    }

    /* renamed from: a */
    private static boolean m91763a(WebView webView, boolean z, boolean z2) {
        if (z2) {
            return true;
        }
        if (z) {
            return false;
        }
        webView.loadUrl("about:invalid#zSaferWebViewz");
        return true;
    }

    /* renamed from: a */
    public final void mo58545a(beby beby) {
        bmxy.m108581a(beby);
        this.f106899c = true;
    }

    /* renamed from: a */
    public boolean mo29311a(WebResourceRequest webResourceRequest) {
        return mo36088b(webResourceRequest.getUrl().toString());
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo29312a(String str) {
        return mo36088b(str);
    }
}
