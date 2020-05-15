package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: apvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apvj extends WebViewClient {

    /* renamed from: b */
    final /* synthetic */ RecaptchaChimeraActivity f84988b;

    public apvj(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.f84988b = recaptchaChimeraActivity;
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = RecaptchaChimeraActivity.f107498j;
        this.f84988b.mo58924a();
        super.onLoadResource(webView, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        String str2 = RecaptchaChimeraActivity.f107498j;
        super.onPageFinished(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2 = RecaptchaChimeraActivity.f107498j;
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84988b;
        recaptchaChimeraActivity.f107508i = false;
        recaptchaChimeraActivity.mo58926a(new apvf(recaptchaChimeraActivity), 10, TimeUnit.SECONDS);
        super.onPageStarted(webView, str, bitmap);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3 = RecaptchaChimeraActivity.f107498j;
        Toast.makeText(this.f84988b, (int) C0126R.string.recaptcha_service_inactive_text, 1).show();
        super.onReceivedError(webView, i, str, str2);
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84988b;
        recaptchaChimeraActivity.mo58927a("Internet Connection Unavailable", 7);
        recaptchaChimeraActivity.finish();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("https://support.google.com/recaptcha")) {
            this.f84988b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            this.f84988b.finish();
            return true;
        }
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84988b;
        String str2 = RecaptchaChimeraActivity.f107498j;
        if (!recaptchaChimeraActivity.mo58931c().mo47661a(Uri.parse(str))) {
            return true;
        }
        return false;
    }
}
