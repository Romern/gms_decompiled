package com.google.android.gms.ads.internal.webview2;

import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.gms.ads.internal.webview2.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0723g extends WebViewClient {

    /* renamed from: a */
    private static final String[] f9124a = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: b */
    private static final String[] f9125b = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: f */
    public C0726j f9126f;

    /* renamed from: a */
    public void mo6666a(C0724h hVar) {
    }

    /* renamed from: b */
    public boolean mo6667b(C0724h hVar) {
        return false;
    }

    /* renamed from: c */
    public WebResourceResponse mo6985c(C0724h hVar) {
        return null;
    }

    /* renamed from: h */
    public void mo6668h() {
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            if (str.length() == 0) {
                new String("Loading resource: ");
            } else {
                "Loading resource: ".concat(str);
            }
            mo6666a(new C0724h(str));
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            new C0724h(str);
            C0726j jVar = this.f9126f;
            if (jVar != null) {
                jVar.mo7020t();
            } else {
                mo6668h();
            }
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (i < 0) {
            int i2 = (-i) - 1;
            String[] strArr = f9124a;
            if (i2 < strArr.length) {
                String str3 = strArr[i2];
                return;
            }
        }
        String.valueOf(i);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError >= 0) {
                String[] strArr = f9125b;
                if (primaryError < strArr.length) {
                    String str = strArr[primaryError];
                    sslError.getUrl();
                }
            }
            String.valueOf(primaryError);
            sslError.getUrl();
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return mo6985c(new C0724h(webResourceRequest));
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return mo6667b(new C0724h(webResourceRequest));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str != null) {
            return mo6985c(new C0724h(str));
        }
        return null;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str != null) {
            return mo6667b(new C0724h(str));
        }
        return false;
    }
}
