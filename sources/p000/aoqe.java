package p000;

import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;
import java.util.Locale;

/* renamed from: aoqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoqe implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f78683a;

    /* renamed from: b */
    final /* synthetic */ int f78684b;

    /* renamed from: c */
    final /* synthetic */ boolean f78685c;

    /* renamed from: d */
    final /* synthetic */ RecaptchaChimeraActivity f78686d;

    public aoqe(RecaptchaChimeraActivity recaptchaChimeraActivity, int i, int i2, boolean z) {
        this.f78686d = recaptchaChimeraActivity;
        this.f78683a = i;
        this.f78684b = i2;
        this.f78685c = z;
    }

    public final void run() {
        this.f78686d.f83492f.loadUrl(String.format(Locale.US, "javascript: %s.shown(%d, %d, %b);", "RecaptchaMFrame", Integer.valueOf(this.f78683a), Integer.valueOf(this.f78684b), Boolean.valueOf(this.f78685c)));
    }
}
