package p000;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;

/* renamed from: tag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tag extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ ApiConsentChimeraActivity f45548a;

    public tag(ApiConsentChimeraActivity apiConsentChimeraActivity) {
        this.f45548a = apiConsentChimeraActivity;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ApiConsentChimeraActivity apiConsentChimeraActivity = this.f45548a;
        sek sek = ApiConsentChimeraActivity.f30509a;
        apiConsentChimeraActivity.f30514f.countDown();
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        ApiConsentChimeraActivity apiConsentChimeraActivity = this.f45548a;
        sek sek = ApiConsentChimeraActivity.f30509a;
        apiConsentChimeraActivity.f30512d = 8;
        apiConsentChimeraActivity.finish();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.f45548a.mo17974a())) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(this.f45548a.getPackageManager()) == null) {
            return false;
        }
        this.f45548a.startActivity(intent);
        return true;
    }
}
