package p000;

import android.webkit.WebView;
import java.util.Locale;

/* renamed from: akxi */
final /* synthetic */ class akxi implements Runnable {

    /* renamed from: a */
    private final WebView f73054a;

    /* renamed from: b */
    private final int f73055b;

    public akxi(WebView webView, int i) {
        this.f73054a = webView;
        this.f73055b = i;
    }

    public final void run() {
        WebView webView = this.f73054a;
        int i = this.f73055b;
        webView.evaluateJavascript(String.format(Locale.ROOT, "window.ocTrustAgentCallback(%s, %s, %s)", Integer.valueOf(i), false, true), null);
    }
}
