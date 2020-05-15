package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: aoqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aoqm extends WebViewClient {

    /* renamed from: b */
    final /* synthetic */ RecaptchaChimeraActivity f78703b;

    public aoqm(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.f78703b = recaptchaChimeraActivity;
    }

    public final void onLoadResource(WebView webView, String str) {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78703b;
        String str2 = RecaptchaChimeraActivity.f83485j;
        recaptchaChimeraActivity.mo46803a();
        super.onLoadResource(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78703b;
        String str2 = RecaptchaChimeraActivity.f83485j;
        recaptchaChimeraActivity.f83495i = false;
        recaptchaChimeraActivity.mo46805a(new aoqi(recaptchaChimeraActivity), 10, TimeUnit.SECONDS);
        super.onPageStarted(webView, str, bitmap);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Toast.makeText(this.f78703b, (int) C0126R.string.recaptcha_service_inactive_text, 1).show();
        super.onReceivedError(webView, i, str, str2);
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78703b;
        String str3 = RecaptchaChimeraActivity.f83485j;
        recaptchaChimeraActivity.mo46806a("Internet Connection Unavailable", 7);
        recaptchaChimeraActivity.finish();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("https://support.google.com/recaptcha")) {
            this.f78703b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            this.f78703b.finish();
            return true;
        }
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78703b;
        String str2 = RecaptchaChimeraActivity.f83485j;
        if (!recaptchaChimeraActivity.mo46810c().mo43189a(Uri.parse(str))) {
            return true;
        }
        return false;
    }
}
