package p000;

import android.net.http.SslError;
import android.os.Message;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: srt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class srt extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ sru f45053a;

    public srt(sru sru) {
        this.f45053a = sru;
    }

    public final void onPageFinished(WebView webView, String str) {
        this.f45053a.mo26030a(true);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f45053a.mo26030a(false);
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f45053a.mo26030a(false);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f45053a.mo26030a(false);
    }

    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        this.f45053a.mo26030a(false);
    }
}
