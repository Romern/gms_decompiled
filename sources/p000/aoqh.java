package p000;

import android.os.Build;
import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: aoqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoqh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f78693a;

    /* renamed from: b */
    final /* synthetic */ boolean f78694b;

    /* renamed from: c */
    final /* synthetic */ String f78695c;

    /* renamed from: d */
    final /* synthetic */ RecaptchaChimeraActivity f78696d;

    public aoqh(RecaptchaChimeraActivity recaptchaChimeraActivity, String str, boolean z, String str2) {
        this.f78696d = recaptchaChimeraActivity;
        this.f78693a = str;
        this.f78694b = z;
        this.f78695c = str2;
    }

    public final void run() {
        this.f78696d.mo46803a();
        try {
            if (this.f78694b) {
                this.f78696d.f83492f.postUrl(RecaptchaChimeraActivity.f83485j, String.format(Locale.US, "%s=%s&%s=%s&%s=%s", "mav", 1, "dg", URLEncoder.encode(this.f78695c, "UTF-8"), "mp", URLEncoder.encode(this.f78693a, "UTF-8")).getBytes(Charset.forName("UTF-8")));
                return;
            }
            String format = String.format(Locale.US, "%s.token('%s', '%s');", "RecaptchaMFrame", URLEncoder.encode(this.f78695c, "UTF-8"), this.f78693a);
            int i = Build.VERSION.SDK_INT;
            this.f78696d.f83492f.evaluateJavascript(format, null);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 should be always supported", e);
        }
    }
}
