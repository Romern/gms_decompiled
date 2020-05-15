package p000;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: bjxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjxw extends WebView {
    public bjxw(Context context) {
        super(context);
        super.getSettings().setAllowContentAccess(false);
        super.getSettings().setCacheMode(2);
    }

    /* renamed from: a */
    public final void mo65617a(bjya bjya) {
        super.setWebViewClient(bjya);
    }

    public final void addJavascriptInterface(Object obj, String str) {
    }

    public final WebSettings getSettings() {
        return null;
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
    }
}
