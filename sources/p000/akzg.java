package p000;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.gms.octarine.p057ui.OctarineWebviewChimeraActivity;

/* renamed from: akzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzg extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ OctarineWebviewChimeraActivity f73157a;

    public akzg(OctarineWebviewChimeraActivity octarineWebviewChimeraActivity) {
        this.f73157a = octarineWebviewChimeraActivity;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (message == null || !(message.obj instanceof WebView.WebViewTransport)) {
            return super.onCreateWindow(webView, z, z2, message);
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new akzf(this, webView2));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
