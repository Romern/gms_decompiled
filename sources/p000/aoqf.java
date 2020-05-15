package p000;

import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;

/* renamed from: aoqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoqf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f78687a;

    /* renamed from: b */
    final /* synthetic */ RecaptchaChimeraActivity f78688b;

    public aoqf(RecaptchaChimeraActivity recaptchaChimeraActivity, boolean z) {
        this.f78688b = recaptchaChimeraActivity;
        this.f78687a = z;
    }

    public final void run() {
        if (this.f78687a) {
            this.f78688b.f83491e.setVisibility(8);
            this.f78688b.f83492f.setVisibility(0);
        } else {
            this.f78688b.f83491e.setVisibility(0);
            this.f78688b.f83492f.setVisibility(8);
        }
        this.f78688b.mo46803a();
    }
}
