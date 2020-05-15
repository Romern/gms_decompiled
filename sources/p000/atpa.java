package p000;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.AcceptTosChimeraActivity;

/* renamed from: atpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atpa extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ AcceptTosChimeraActivity f90622a;

    /* renamed from: b */
    private long f90623b = 0;

    public atpa(AcceptTosChimeraActivity acceptTosChimeraActivity) {
        this.f90622a = acceptTosChimeraActivity;
    }

    public final void onPageFinished(WebView webView, String str) {
        this.f90623b = System.currentTimeMillis();
        this.f90622a.f108746d.evaluateJavascript("(function androidPayInit() {    var checkScrollPosition = function() {        if ((window.innerHeight + window.scrollY) >= document.body.offsetHeight) {            androidPayPageHandler.onBottomReached();        }    };    window.addEventListener('scroll', checkScrollPosition);    checkScrollPosition();})();", null);
        this.f90622a.f108746d.evaluateJavascript("function androidPay_scrollToBottom(duration) {    if (androidPay_scrollToBottom.androidPay_animating) {        return;    }    androidPay_scrollToBottom.androidPay_animating = true;    var start = window.scrollY;    var to = document.body.scrollHeight - window.innerHeight;    var change = to - start;    var startTime = performance.now();    var easeOutCubic = function (t, b, c, d) {        t /= d / 2;        if (t < 1) {            return c / 2 * Math.pow(t, 3) + b;        }        t -= 2;        return c / 2 * (Math.pow(t, 3) + 2) + b;    };    var animate = function(timestamp) {        var currentTime = timestamp - startTime;        var val = easeOutCubic(currentTime, start, change, duration);        document.body.scrollTop = val;        if (currentTime < duration) {            window.requestAnimationFrame(animate);        } else {            androidPay_scrollToBottom.androidPay_animating = false;        }    };    window.requestAnimationFrame(animate);}", null);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i;
        if (this.f90623b == 0 || System.currentTimeMillis() - this.f90623b < 100) {
            AcceptTosChimeraActivity acceptTosChimeraActivity = this.f90622a;
            if (!acceptTosChimeraActivity.f108744b) {
                Button button = acceptTosChimeraActivity.f108747e;
                if (!cgwn.m147270t()) {
                    i = C0126R.string.common_more;
                } else {
                    i = C0126R.string.common_next;
                }
                button.setText(i);
                this.f90622a.f108745c = false;
            }
            return false;
        }
        this.f90622a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }
}
