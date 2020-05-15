package com.google.android.gms.ads.internal.webview2;

import android.os.Build;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.ads.internal.webview2.k */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0727k {

    /* renamed from: a */
    static Boolean f9134a;

    private C0727k() {
    }

    /* renamed from: a */
    public static void m5911a(WebView webView, String str) {
        boolean booleanValue;
        int i = Build.VERSION.SDK_INT;
        synchronized (C0727k.class) {
            if (f9134a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f9134a = true;
                } catch (IllegalStateException e) {
                    f9134a = false;
                }
            }
            booleanValue = f9134a.booleanValue();
        }
        if (!booleanValue) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() == 0 ? new String("javascript:") : "javascript:".concat(valueOf));
            return;
        }
        webView.evaluateJavascript(str, null);
    }
}
