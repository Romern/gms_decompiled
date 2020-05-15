package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.regex.Pattern;

/* renamed from: aqkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqkx extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ aqky f86317a;

    public aqkx(aqky aqky) {
        this.f86317a = aqky;
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!((Boolean) aqnw.f86406g.mo58455c()).booleanValue()) {
            aqky aqky = this.f86317a;
            sek sek = aqky.f86318a;
            aqky.mo47956a();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        aqky.f86318a.mo25412b("Overriding URL: [%s].", str);
        if (Pattern.compile((String) aqnw.f86402c.mo58455c()).matcher(str).find()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context context = this.f86317a.getContext();
        bmxy.m108581a(context);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            this.f86317a.startActivity(intent);
        } else {
            aqky.f86318a.mo25418e("Unable to find the browser.", new Object[0]);
        }
        return true;
    }
}
