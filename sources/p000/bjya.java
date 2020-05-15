package p000;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;

/* renamed from: bjya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjya extends WebViewClient {

    /* renamed from: a */
    public bjxz f123618a;

    /* renamed from: a */
    private final void m104879a(String str) {
        if (bmwb.m108442a(str).startsWith("https://emv3ds/challenge")) {
            bjxz bjxz = this.f123618a;
            if (bjxz != null) {
                bjxz.mo65408f(str);
                return;
            }
            throw new IllegalArgumentException("An HtmlSnippetWebViewLocationChangeListener is required if you want to handle intercepted request");
        }
        String path = Uri.parse(str).getPath();
        throw new IllegalArgumentException(String.format(Locale.US, "Intercepted location change %s does not match 3DS2 challenge target.", path));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        m104879a(webResourceRequest.getUrl().toString());
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        m104879a(str);
        return true;
    }
}
