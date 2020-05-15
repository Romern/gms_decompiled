package p000;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: jdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdb extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ jdc f22208a;

    public jdb(jdc jdc) {
        this.f22208a = jdc;
    }

    public final void onPageFinished(WebView webView, String str) {
        jdc.f22209a.mo25412b("onPageFinished", new Object[0]);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        sek sek = jdc.f22209a;
        StringBuilder sb = new StringBuilder(52);
        sb.append("WebViewClient.onReceivedError: errorCode:");
        sb.append(i);
        sek.mo25416d(sb.toString(), new Object[0]);
        jdg.m16541a(4);
        this.f22208a.f22210b.f22200a.mo2450b((Object) 0);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sek sek = jdc.f22209a;
        String valueOf = String.valueOf(sslError);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("onReceivedSslError: sslError: ");
        sb.append(valueOf);
        sek.mo25416d(sb.toString(), new Object[0]);
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }
}
