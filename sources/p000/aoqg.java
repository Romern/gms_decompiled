package p000;

import android.content.Context;
import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;

/* renamed from: aoqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoqg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f78689a;

    /* renamed from: b */
    final /* synthetic */ String f78690b;

    /* renamed from: c */
    final /* synthetic */ boolean f78691c;

    /* renamed from: d */
    final /* synthetic */ RecaptchaChimeraActivity f78692d;

    public aoqg(RecaptchaChimeraActivity recaptchaChimeraActivity, String str, String str2, boolean z) {
        this.f78692d = recaptchaChimeraActivity;
        this.f78689a = str;
        this.f78690b = str2;
        this.f78691c = z;
    }

    public final void run() {
        Context applicationContext = this.f78692d.getApplicationContext();
        String str = this.f78689a;
        String a = vvp.m41461a(applicationContext, str.length() == 0 ? new String("recaptcha-android-") : "recaptcha-android-".concat(str), aptj.m70971a(this.f78690b.getBytes()));
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78692d;
        recaptchaChimeraActivity.runOnUiThread(new aoqh(recaptchaChimeraActivity, this.f78690b, this.f78691c, a));
    }
}
