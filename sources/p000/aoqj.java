package p000;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;
import java.io.ByteArrayInputStream;

/* renamed from: aoqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoqj extends aoqm {

    /* renamed from: a */
    final /* synthetic */ RecaptchaChimeraActivity f78698a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aoqj(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        super(recaptchaChimeraActivity);
        this.f78698a = recaptchaChimeraActivity;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78698a;
        String str = RecaptchaChimeraActivity.f83485j;
        if (!recaptchaChimeraActivity.mo46810c().mo43189a(webResourceRequest.getUrl())) {
            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }
}
