package p000;

import android.webkit.WebView;
import java.util.Locale;

/* renamed from: akxr */
final /* synthetic */ class akxr implements Runnable {

    /* renamed from: a */
    private final WebView f73074a;

    /* renamed from: b */
    private final int f73075b;

    /* renamed from: c */
    private final boolean f73076c;

    public akxr(WebView webView, int i, boolean z) {
        this.f73074a = webView;
        this.f73075b = i;
        this.f73076c = z;
    }

    public final void run() {
        WebView webView = this.f73074a;
        int i = this.f73075b;
        boolean z = this.f73076c;
        webView.evaluateJavascript(String.format(Locale.ROOT, "window.ocTrustAgentCallback(%s, %s)", Integer.valueOf(i), Boolean.valueOf(z)), null);
    }
}
