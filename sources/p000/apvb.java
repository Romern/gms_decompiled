package p000;

import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import java.util.Locale;

/* renamed from: apvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apvb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f84968a;

    /* renamed from: b */
    final /* synthetic */ int f84969b;

    /* renamed from: c */
    final /* synthetic */ boolean f84970c;

    /* renamed from: d */
    final /* synthetic */ RecaptchaChimeraActivity f84971d;

    public apvb(RecaptchaChimeraActivity recaptchaChimeraActivity, int i, int i2, boolean z) {
        this.f84971d = recaptchaChimeraActivity;
        this.f84968a = i;
        this.f84969b = i2;
        this.f84970c = z;
    }

    public final void run() {
        String str = RecaptchaChimeraActivity.f107498j;
        this.f84971d.f107505f.loadUrl(String.format(Locale.US, "javascript: %s.shown(%d, %d, %b);", "RecaptchaMFrame", Integer.valueOf(this.f84968a), Integer.valueOf(this.f84969b), Boolean.valueOf(this.f84970c)));
    }
}
