package p000;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.auth.login.BrowserChimeraActivity;

/* renamed from: jfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jfg extends WebViewClient {

    /* renamed from: a */
    private final jff f22364a;

    /* renamed from: b */
    private final imy f22365b;

    public jfg(jff jff, imy imy) {
        this.f22364a = jff;
        this.f22365b = imy;
    }

    public final void onPageFinished(WebView webView, String str) {
        String b = BrowserChimeraActivity.m6655b(str);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 19);
        sb.append("onPageFinished( ");
        sb.append(b);
        sb.append(" ).");
        sb.toString();
        this.f22364a.mo7727c(str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String b = BrowserChimeraActivity.m6655b(str);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 18);
        sb.append("onPageStarted( ");
        sb.append(b);
        sb.append(" ).");
        sb.toString();
        if (BrowserChimeraActivity.m6654a(str, this.f22365b)) {
            this.f22364a.mo7723a();
        } else {
            this.f22364a.mo7726b();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Log.w("GLSActivity", String.format("onReceivedError: errorCode %d, description: %s, url: %s", Integer.valueOf(i), str, str2));
        this.f22364a.mo7725a(izj.SERVER_ERROR);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Log.w("GLSActivity", String.format("onReceivedSslError: sslError: %s", sslError.toString()));
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Deprecated
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        Log.e("GLSActivity", "onTooManyRedirects");
        this.f22364a.mo7725a(izj.SERVER_ERROR);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
