package com.google.android.gms.ads.internal.webview2;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.webview2.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0724h {

    /* renamed from: a */
    public final String f9127a;

    /* renamed from: b */
    public final Uri f9128b;

    /* renamed from: c */
    public final Map f9129c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public C0724h(WebResourceRequest webResourceRequest) {
        this(r0, r1, webResourceRequest.getRequestHeaders());
        String uri = webResourceRequest.getUrl().toString();
        Uri url = webResourceRequest.getUrl();
        webResourceRequest.getMethod();
    }

    public C0724h(String str) {
        this(str, Uri.parse(str), null);
    }

    private C0724h(String str, Uri uri, Map map) {
        this.f9127a = str;
        this.f9128b = uri;
        this.f9129c = map == null ? Collections.emptyMap() : map;
    }
}
