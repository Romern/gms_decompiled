package p000;

import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;

/* renamed from: aoqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoqc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f78678a;

    /* renamed from: b */
    final /* synthetic */ int f78679b;

    /* renamed from: c */
    final /* synthetic */ boolean f78680c;

    /* renamed from: d */
    final /* synthetic */ RecaptchaChimeraActivity f78681d;

    public aoqc(RecaptchaChimeraActivity recaptchaChimeraActivity, int i, int i2, boolean z) {
        this.f78681d = recaptchaChimeraActivity;
        this.f78678a = i;
        this.f78679b = i2;
        this.f78680c = z;
    }

    public final void run() {
        this.f78681d.f83492f.getLayoutParams().width = this.f78678a;
        this.f78681d.f83492f.getLayoutParams().height = this.f78679b;
        this.f78681d.f83492f.requestLayout();
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78681d;
        int i = this.f78678a;
        float f = recaptchaChimeraActivity.f83490d;
        recaptchaChimeraActivity.mo46809b((int) (((float) i) / f), (int) (((float) this.f78679b) / f), this.f78680c);
    }
}
