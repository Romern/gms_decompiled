package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

/* renamed from: bjyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjyq extends WebChromeClient {

    /* renamed from: b */
    public static final /* synthetic */ int f123652b = 0;

    /* renamed from: a */
    public ProgressBar f123653a;

    /* renamed from: c */
    private final Context f123654c;

    /* renamed from: d */
    private boolean f123655d;

    /* renamed from: e */
    private int f123656e;

    public bjyq(Context context) {
        this.f123654c = context;
    }

    /* renamed from: a */
    public final void mo65647a() {
        ProgressBar progressBar = this.f123653a;
        if (progressBar != null) {
            int i = 4;
            if (this.f123656e != 100 && this.f123655d) {
                i = 0;
            }
            progressBar.setVisibility(i);
        }
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (message == null) {
            return false;
        }
        Message obtainMessage = webView.getHandler().obtainMessage();
        webView.requestFocusNodeHref(obtainMessage);
        String string = obtainMessage.getData().getString("url");
        if (!TextUtils.isEmpty(string)) {
            mo65648a(Uri.parse(string));
            return true;
        }
        WebView webView2 = new WebView(this.f123654c);
        webView2.setWebViewClient(new bjyp(this));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        this.f123656e = i;
        ProgressBar progressBar = this.f123653a;
        if (progressBar != null) {
            progressBar.setProgress(i);
            mo65647a();
        }
    }

    /* renamed from: a */
    public final void mo65648a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        this.f123654c.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo65649a(boolean z) {
        this.f123655d = z;
        mo65647a();
    }
}
