package p000;

import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;

/* renamed from: aoqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoqi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecaptchaChimeraActivity f78697a;

    public aoqi(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.f78697a = recaptchaChimeraActivity;
    }

    public final void run() {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78697a;
        if (!recaptchaChimeraActivity.f83495i) {
            recaptchaChimeraActivity.mo46808b();
        }
    }
}
