package p000;

import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import java.util.Locale;

/* renamed from: apva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apva implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecaptchaChimeraActivity f84967a;

    public apva(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.f84967a = recaptchaChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    public final void run() {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84967a;
        float min = Math.min(400.0f, ((float) recaptchaChimeraActivity.f107501b) / recaptchaChimeraActivity.f107503d);
        RecaptchaChimeraActivity recaptchaChimeraActivity2 = this.f84967a;
        float min2 = Math.min(600.0f, ((float) recaptchaChimeraActivity2.f107502c) / recaptchaChimeraActivity2.f107503d);
        this.f84967a.f107505f.loadUrl(String.format(Locale.US, "javascript: %s.show(%d, %d);", "RecaptchaMFrame", Integer.valueOf((int) min), Integer.valueOf((int) min2)));
    }
}
