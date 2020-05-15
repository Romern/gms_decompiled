package p000;

import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;

/* renamed from: apvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apvc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f84972a;

    /* renamed from: b */
    final /* synthetic */ RecaptchaChimeraActivity f84973b;

    public apvc(RecaptchaChimeraActivity recaptchaChimeraActivity, boolean z) {
        this.f84973b = recaptchaChimeraActivity;
        this.f84972a = z;
    }

    public final void run() {
        if (this.f84972a) {
            this.f84973b.f107504e.setVisibility(8);
            this.f84973b.f107505f.setVisibility(0);
        } else {
            this.f84973b.f107504e.setVisibility(0);
            this.f84973b.f107505f.setVisibility(8);
        }
        this.f84973b.mo58924a();
    }
}
