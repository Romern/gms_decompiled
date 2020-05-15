package p000;

import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;

/* renamed from: apuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apuz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f84963a;

    /* renamed from: b */
    final /* synthetic */ int f84964b;

    /* renamed from: c */
    final /* synthetic */ boolean f84965c;

    /* renamed from: d */
    final /* synthetic */ RecaptchaChimeraActivity f84966d;

    public apuz(RecaptchaChimeraActivity recaptchaChimeraActivity, int i, int i2, boolean z) {
        this.f84966d = recaptchaChimeraActivity;
        this.f84963a = i;
        this.f84964b = i2;
        this.f84965c = z;
    }

    public final void run() {
        this.f84966d.f107505f.getLayoutParams().width = this.f84963a;
        this.f84966d.f107505f.getLayoutParams().height = this.f84964b;
        this.f84966d.f107505f.requestLayout();
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84966d;
        int i = this.f84963a;
        float f = recaptchaChimeraActivity.f107503d;
        recaptchaChimeraActivity.mo58930b((int) (((float) i) / f), (int) (((float) this.f84964b) / f), this.f84965c);
    }
}
