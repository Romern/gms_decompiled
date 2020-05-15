package p000;

import android.content.Context;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;

/* renamed from: apvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apvd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f84974a;

    /* renamed from: b */
    final /* synthetic */ String f84975b;

    /* renamed from: c */
    final /* synthetic */ boolean f84976c;

    /* renamed from: d */
    final /* synthetic */ RecaptchaChimeraActivity f84977d;

    public apvd(RecaptchaChimeraActivity recaptchaChimeraActivity, String str, String str2, boolean z) {
        this.f84977d = recaptchaChimeraActivity;
        this.f84974a = str;
        this.f84975b = str2;
        this.f84976c = z;
    }

    public final void run() {
        Context applicationContext = this.f84977d.getApplicationContext();
        String str = this.f84974a;
        String a = vvp.m41461a(applicationContext, str.length() == 0 ? new String("recaptcha-android-") : "recaptcha-android-".concat(str), apuh.m71024a(this.f84975b.getBytes()));
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84977d;
        recaptchaChimeraActivity.runOnUiThread(new apve(recaptchaChimeraActivity, this.f84975b, this.f84976c, a));
    }
}
