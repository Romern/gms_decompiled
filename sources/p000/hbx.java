package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemProperties;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.regex.Pattern;

/* renamed from: hbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hbx extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ hbz f19450a;

    public hbx(hbz hbz) {
        this.f19450a = hbz;
    }

    public final void onPageFinished(WebView webView, String str) {
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        hbz.f19451a.mo25412b("Overriding URL: [%s].", str);
        if (Pattern.compile(String.format(cccu.f178768a.mo6606a().mo75781a(), SystemProperties.get("gms.auth.sw_domain", "google.com").replace(".", "\\."))).matcher(str).find()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(this.f19450a.getContext().getPackageManager()) != null) {
            this.f19450a.startActivity(intent);
        } else {
            hbz.f19451a.mo25418e("Unable to find the browser.", new Object[0]);
        }
        return true;
    }
}
