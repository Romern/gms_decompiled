package p000;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import java.io.ByteArrayInputStream;

/* renamed from: apvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apvg extends apvj {

    /* renamed from: a */
    final /* synthetic */ RecaptchaChimeraActivity f84983a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apvg(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        super(recaptchaChimeraActivity);
        this.f84983a = recaptchaChimeraActivity;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84983a;
        String str = RecaptchaChimeraActivity.f107498j;
        if (!recaptchaChimeraActivity.mo58931c().mo47661a(webResourceRequest.getUrl())) {
            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }
}
