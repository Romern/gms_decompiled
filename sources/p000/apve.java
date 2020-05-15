package p000;

import android.os.Build;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: apve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apve implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f84978a;

    /* renamed from: b */
    final /* synthetic */ boolean f84979b;

    /* renamed from: c */
    final /* synthetic */ String f84980c;

    /* renamed from: d */
    final /* synthetic */ RecaptchaChimeraActivity f84981d;

    public apve(RecaptchaChimeraActivity recaptchaChimeraActivity, String str, boolean z, String str2) {
        this.f84981d = recaptchaChimeraActivity;
        this.f84978a = str;
        this.f84979b = z;
        this.f84980c = str2;
    }

    public final void run() {
        String str = RecaptchaChimeraActivity.f107498j;
        this.f84981d.mo58924a();
        try {
            if (this.f84979b) {
                this.f84981d.f107505f.postUrl(RecaptchaChimeraActivity.f107498j, String.format(Locale.US, "%s=%s&%s=%s&%s=%s", "mav", 1, "dg", URLEncoder.encode(this.f84980c, "UTF-8"), "mp", URLEncoder.encode(this.f84978a, "UTF-8")).getBytes(Charset.forName("UTF-8")));
                return;
            }
            String format = String.format(Locale.US, "%s.token('%s', '%s');", "RecaptchaMFrame", URLEncoder.encode(this.f84980c, "UTF-8"), this.f84978a);
            int i = Build.VERSION.SDK_INT;
            this.f84981d.f107505f.evaluateJavascript(format, null);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 should be always supported", e);
        }
    }
}
