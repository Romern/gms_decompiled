package p000;

import android.webkit.WebView;

/* renamed from: akwf */
final /* synthetic */ class akwf implements Runnable {

    /* renamed from: a */
    private final WebView f72991a;

    /* renamed from: b */
    private final String f72992b;

    public akwf(WebView webView, String str) {
        this.f72991a = webView;
        this.f72992b = str;
    }

    public final void run() {
        WebView webView = this.f72991a;
        String str = this.f72992b;
        sek sek = akwg.f72993b;
        webView.evaluateJavascript(str, null);
    }
}
