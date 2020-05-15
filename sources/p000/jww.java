package p000;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.security.KeyChain;
import android.webkit.ClientCertRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.login.CustomWebView;
import java.util.Locale;

/* renamed from: jww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jww extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ jwx f23422a;

    public jww(jwx jwx) {
        this.f23422a = jwx;
    }

    /* renamed from: a */
    private static final String m17430a(String str) {
        jwx.f23423a.mo19637a(3);
        return jwx.m17431b(str);
    }

    public final void onPageFinished(WebView webView, String str) {
        jwx.f23423a.mo25414c(String.format(Locale.getDefault(), "onPageFinished: %s", m17430a(str)), new Object[0]);
        jwx jwx = this.f23422a;
        CustomWebView customWebView = jwx.f23425c;
        this.f23422a.mo14198a(jwx.f23424b.mo14226a(str));
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        jwx.f23423a.mo25414c(String.format(Locale.getDefault(), "onPageStarted: %s", m17430a(str)), new Object[0]);
        jwx jwx = this.f23422a;
        jwx.mo14196a(jwx.f23425c, str);
    }

    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        jwx jwx = this.f23422a;
        CustomWebView customWebView = jwx.f23425c;
        if (!gnv.m13574s() || !jwx.isResumed()) {
            clientCertRequest.ignore();
            return;
        }
        Activity activity = jwx.getActivity();
        KeyChain.choosePrivateKeyAlias(activity.getContainerActivity(), new jws(clientCertRequest, activity.getApplicationContext()), clientCertRequest.getKeyTypes(), clientCertRequest.getPrincipals(), clientCertRequest.getHost(), clientCertRequest.getPort(), null);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        jwx.f23423a.mo25416d(String.format(Locale.getDefault(), "onReceivedError - errorCode: %d, description: %s, url: %s", Integer.valueOf(i), str, m17430a(str2)), new Object[0]);
        jwx jwx = this.f23422a;
        CustomWebView customWebView = jwx.f23425c;
        jwx.mo14200c(str);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        jwx.f23423a.mo25416d(String.format(Locale.getDefault(), "onReceivedSslError - error: %d, toString: %s", Integer.valueOf(sslError.getPrimaryError()), sslError.toString()), new Object[0]);
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        jwx jwx = this.f23422a;
        CustomWebView customWebView = jwx.f23425c;
        jwx.mo14194a(sslError);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        cbzf.f178583a.mo6606a();
        return null;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f23422a.mo14199a(webResourceRequest);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f23422a.mo14201d(str);
    }
}
