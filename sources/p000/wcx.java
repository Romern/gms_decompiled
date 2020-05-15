package p000;

import android.webkit.WebView;
import org.json.JSONArray;

/* renamed from: wcx */
final /* synthetic */ class wcx implements Runnable {

    /* renamed from: a */
    private final WebView f50519a;

    /* renamed from: b */
    private final String f50520b;

    /* renamed from: c */
    private final JSONArray f50521c;

    public wcx(WebView webView, String str, JSONArray jSONArray) {
        this.f50519a = webView;
        this.f50520b = str;
        this.f50521c = jSONArray;
    }

    public final void run() {
        WebView webView = this.f50519a;
        String str = this.f50520b;
        String valueOf = String.valueOf(this.f50521c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(valueOf).length());
        sb.append("javascript:");
        sb.append(str);
        sb.append("(");
        sb.append(valueOf);
        sb.append(");void(0)");
        webView.loadUrl(sb.toString());
    }
}
