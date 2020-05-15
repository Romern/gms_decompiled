package p000;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: akzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akzf extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ WebView f73155a;

    /* renamed from: b */
    final /* synthetic */ akzg f73156b;

    public akzf(akzg akzg, WebView webView) {
        this.f73156b = akzg;
        this.f73155a = webView;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f73156b.f73157a.mo39986b(str);
        this.f73155a.destroy();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f73156b.f73157a.mo39986b(str);
        this.f73155a.destroy();
        return true;
    }
}
