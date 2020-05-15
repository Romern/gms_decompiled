package com.google.android.gms.ads.internal.webview;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.webview.ab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0686ab extends C0703m {
    public C0686ab(C0699i iVar) {
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo6881a(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof C0699i)) {
            C0633h.m5672d("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        C0699i iVar = (C0699i) webView;
        if ("mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (iVar.mo6923g() != null) {
                iVar.mo6923g().mo6888d();
            }
            iVar.mo6922f();
            if (iVar.mo6932l()) {
                str2 = (String) C0371o.f8255h.mo6604a();
            } else {
                str2 = (String) C0371o.f8254g.mo6604a();
            }
            return C0387d.m5363a().mo6859b(iVar.getContext(), iVar.mo6930j().f8949a, str2);
        }
        if (map == null) {
            map = Collections.emptyMap();
        }
        return super.mo6948a(str, map);
    }
}
