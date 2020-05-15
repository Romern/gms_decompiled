package p000;

import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;

/* renamed from: apvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apvf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecaptchaChimeraActivity f84982a;

    public apvf(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.f84982a = recaptchaChimeraActivity;
    }

    public final void run() {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84982a;
        if (!recaptchaChimeraActivity.f107508i) {
            recaptchaChimeraActivity.mo58929b();
        }
    }
}
