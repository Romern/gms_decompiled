package com.google.android.gms.ads.internal.webview;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.webview.x */
final /* synthetic */ class C0714x implements Runnable {

    /* renamed from: a */
    private final C0715y f9089a;

    /* renamed from: b */
    private final String f9090b;

    public C0714x(C0715y yVar, String str) {
        this.f9089a = yVar;
        this.f9090b = str;
    }

    public final void run() {
        C0715y yVar = this.f9089a;
        String str = this.f9090b;
        C0713w wVar = yVar.f9091a;
        Uri parse = Uri.parse(str);
        C0689ae g = wVar.f9088a.mo6923g();
        if (g == null) {
            C0633h.m5668b("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            g.mo6885a(parse);
        }
    }
}
