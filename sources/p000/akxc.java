package p000;

import android.webkit.WebView;

/* renamed from: akxc */
final /* synthetic */ class akxc implements Runnable {

    /* renamed from: a */
    private final WebView f73043a;

    /* renamed from: b */
    private final String f73044b;

    public akxc(WebView webView, String str) {
        this.f73043a = webView;
        this.f73044b = str;
    }

    public final void run() {
        this.f73043a.evaluateJavascript(this.f73044b, null);
    }
}
