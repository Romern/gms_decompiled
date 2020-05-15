package com.google.android.gms.ads.internal.webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.clearcut.C0327b;

/* renamed from: com.google.android.gms.ads.internal.webview.ac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0687ac extends C0686ab {
    public C0687ac(C0699i iVar, C0327b bVar) {
        super(iVar);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return mo6881a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
