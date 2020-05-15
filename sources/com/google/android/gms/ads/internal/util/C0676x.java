package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.clearcut.C0327b;
import com.google.android.gms.ads.internal.webview.C0685aa;
import com.google.android.gms.ads.internal.webview.C0699i;
import com.google.android.gms.ads.internal.webview.C0703m;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.x */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0676x {
    /* renamed from: a */
    public WebResourceResponse mo6871a(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: a */
    public String mo6868a(Context context) {
        return "";
    }

    /* renamed from: b */
    public void mo6870b(Context context) {
    }

    /* renamed from: a */
    public C0703m mo6872a(C0699i iVar, C0327b bVar) {
        return new C0685aa(iVar, bVar);
    }

    /* renamed from: a */
    public void mo6869a(Context context, WebSettings webSettings) {
        C0616an.m5619a(context, new C0659p(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
    }
}
