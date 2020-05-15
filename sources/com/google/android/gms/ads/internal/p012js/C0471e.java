package com.google.android.gms.ads.internal.p012js;

import android.net.Uri;
import android.webkit.JavascriptInterface;

/* renamed from: com.google.android.gms.ads.internal.js.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0471e {

    /* renamed from: a */
    private final C0493k f8459a;

    public C0471e(C0493k kVar) {
        this.f8459a = kVar;
    }

    @JavascriptInterface
    public void notify(String str) {
        C0493k kVar = this.f8459a;
        if (str != null) {
            ((C0496n) kVar).mo6687a(Uri.parse(str));
        }
    }
}
