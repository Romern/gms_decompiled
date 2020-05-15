package p000;

import android.webkit.WebView;

/* renamed from: akyc */
final /* synthetic */ class akyc implements Runnable {

    /* renamed from: a */
    private final WebView f73098a;

    /* renamed from: b */
    private final String f73099b;

    public akyc(WebView webView, String str) {
        this.f73098a = webView;
        this.f73099b = str;
    }

    public final void run() {
        WebView webView = this.f73098a;
        String str = this.f73099b;
        sek sek = akyf.f73106d;
        webView.evaluateJavascript(str, null);
    }
}
