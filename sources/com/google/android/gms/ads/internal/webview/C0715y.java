package com.google.android.gms.ads.internal.webview;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.C0658o;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.webview.y */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0715y {

    /* renamed from: a */
    public final C0713w f9091a;

    /* renamed from: b */
    private final C0716z f9092b;

    public C0715y(C0716z zVar, C0713w wVar) {
        this.f9091a = wVar;
        this.f9092b = zVar;
    }

    /* renamed from: a */
    public static C0715y m5857a(C0699i iVar) {
        return new C0715y(iVar, new C0713w(iVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.ads.internal.webview.ad, com.google.android.gms.ads.internal.webview.z], assign insn: 0x0008: IGET  (r2v2 ? I:com.google.android.gms.ads.internal.webview.z) = (r1v0 'this' com.google.android.gms.ads.internal.webview.y A[THIS]) com.google.android.gms.ads.internal.webview.y.b com.google.android.gms.ads.internal.webview.z */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str) || this.f9092b.mo6883i() == null) {
            return "";
        }
        throw null;
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            C0633h.m5672d("URL is empty, ignoring message");
        } else {
            C0658o.f9012a.post(new C0714x(this, str));
        }
    }
}
