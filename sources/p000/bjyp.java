package p000;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: bjyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjyp extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ bjyq f123651a;

    public bjyp(bjyq bjyq) {
        this.f123651a = bjyq;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        bjyq bjyq = this.f123651a;
        Uri url = webResourceRequest.getUrl();
        int i = bjyq.f123652b;
        bjyq.mo65648a(url);
        webView.destroy();
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        bjyq bjyq = this.f123651a;
        Uri parse = Uri.parse(str);
        int i = bjyq.f123652b;
        bjyq.mo65648a(parse);
        webView.destroy();
        return true;
    }
}
