package p000;

import android.graphics.Bitmap;
import android.os.Message;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: bjyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjyl extends WebViewClient {

    /* renamed from: l */
    public bjyk f123645l;

    public bjyl() {
    }

    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        bjyk bjyk = this.f123645l;
        if (bjyk != null) {
            bjyk.mo65389a(message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        bjyk bjyk = this.f123645l;
        if (bjyk != null) {
            bjyk.mo65390a(webView);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        bjyk bjyk = this.f123645l;
        if (bjyk != null) {
            bjyk.mo65393b(webView);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        bjyk bjyk = this.f123645l;
        if (bjyk != null) {
            bjyk.mo65391a(webView, str);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        bjyk bjyk = this.f123645l;
        if (bjyk != null) {
            bjyk.mo65388a();
        }
    }

    public bjyl(bjyk bjyk) {
        this.f123645l = bjyk;
    }
}
