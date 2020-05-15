package p000;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: abhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abhn extends abho {
    public abhn(aasf aasf) {
        super(aasf);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f57488a.mo32115a(webResourceRequest.getUrl());
    }
}
