package com.google.android.gms.ads.internal.util;

import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.clearcut.C0327b;
import com.google.android.gms.ads.internal.webview.C0687ac;
import com.google.android.gms.ads.internal.webview.C0699i;
import com.google.android.gms.ads.internal.webview.C0703m;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.t */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0669t extends C0668s {
    /* renamed from: a */
    public final WebResourceResponse mo6871a(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    /* renamed from: a */
    public final C0703m mo6872a(C0699i iVar, C0327b bVar) {
        return new C0687ac(iVar, bVar);
    }
}
