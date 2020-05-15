package p000;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;

/* renamed from: apvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apvi {

    /* renamed from: a */
    final /* synthetic */ RecaptchaChimeraActivity f84987a;

    public apvi(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.f84987a = recaptchaChimeraActivity;
    }

    @JavascriptInterface
    public void challengeReady() {
        String str = RecaptchaChimeraActivity.f107498j;
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84987a;
        recaptchaChimeraActivity.f107508i = true;
        recaptchaChimeraActivity.mo58924a();
        RecaptchaChimeraActivity recaptchaChimeraActivity2 = this.f84987a;
        recaptchaChimeraActivity2.runOnUiThread(new apva(recaptchaChimeraActivity2));
    }

    @JavascriptInterface
    public int getClientAPIVersion() {
        return 1;
    }

    @JavascriptInterface
    public void onChallengeExpired() {
        String str = RecaptchaChimeraActivity.f107498j;
        this.f84987a.mo58929b();
    }

    @JavascriptInterface
    public void onError(int i, boolean z) {
        String str;
        String str2 = RecaptchaChimeraActivity.f107498j;
        int i2 = 13;
        if (i == 1) {
            str = "Invalid Input Argument";
        } else if (i == 2) {
            i2 = 15;
            str = "Session Timeout";
        } else if (i == 7) {
            i2 = 12007;
            str = "Invalid Site Key";
        } else if (i == 8) {
            i2 = 12008;
            str = "Invalid Type of Site Key";
        } else if (i != 9) {
            str = "error";
        } else {
            i2 = 12013;
            str = "Invalid Package Name for App";
        }
        this.f84987a.mo58927a(str, i2);
        if (z) {
            this.f84987a.finish();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(java.lang.Runnable, long, java.util.concurrent.TimeUnit):void
      com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(java.lang.StringBuilder, java.lang.String, boolean):void
      com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(int, int, boolean):void */
    @JavascriptInterface
    public void onResize(int i, int i2) {
        String str = RecaptchaChimeraActivity.f107498j;
        this.f84987a.mo58924a();
        if (this.f84987a.f107505f.getVisibility() == 0) {
            this.f84987a.mo58925a(i, i2, true);
        } else {
            this.f84987a.mo58930b(i, i2, true);
        }
    }

    @JavascriptInterface
    public void onShow(boolean z, int i, int i2) {
        String str = RecaptchaChimeraActivity.f107498j;
        this.f84987a.mo58924a();
        if (i <= 0 && i2 <= 0) {
            this.f84987a.mo58930b(i, i2, z);
            return;
        }
        this.f84987a.mo58925a(i, i2, z);
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84987a;
        recaptchaChimeraActivity.runOnUiThread(new apvc(recaptchaChimeraActivity, z));
    }

    @JavascriptInterface
    public void requestToken(String str, boolean z) {
        this.f84987a.runOnUiThread(new apvh(this, str, z));
    }

    @JavascriptInterface
    public void verifyCallback(String str) {
        String str2 = RecaptchaChimeraActivity.f107498j;
        this.f84987a.mo58924a();
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f84987a;
        Bundle bundle = new Bundle();
        bundle.putString("token", str);
        recaptchaChimeraActivity.f107506g.send(0, bundle);
        recaptchaChimeraActivity.finish();
    }
}
