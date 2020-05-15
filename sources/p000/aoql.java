package p000;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;

/* renamed from: aoql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoql {

    /* renamed from: a */
    final /* synthetic */ RecaptchaChimeraActivity f78702a;

    public aoql(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.f78702a = recaptchaChimeraActivity;
    }

    @JavascriptInterface
    public void challengeReady() {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78702a;
        recaptchaChimeraActivity.f83495i = true;
        recaptchaChimeraActivity.mo46803a();
        RecaptchaChimeraActivity recaptchaChimeraActivity2 = this.f78702a;
        recaptchaChimeraActivity2.runOnUiThread(new aoqd(recaptchaChimeraActivity2));
    }

    @JavascriptInterface
    public int getClientAPIVersion() {
        return 1;
    }

    @JavascriptInterface
    public void onChallengeExpired() {
        this.f78702a.mo46808b();
    }

    @JavascriptInterface
    public void onError(int i, boolean z) {
        String str;
        int i2 = 13;
        if (i == 1) {
            str = "Invalid Input Argument";
        } else if (i == 2) {
            i2 = 15;
            str = "Session Timeout";
        } else if (i == 7) {
            i2 = 36001;
            str = "Invalid Site Key";
        } else if (i == 8) {
            i2 = 36002;
            str = "Invalid Type of Site Key";
        } else if (i != 9) {
            str = "error";
        } else {
            i2 = 36003;
            str = "Invalid Package Name for App";
        }
        this.f78702a.mo46806a(str, i2);
        if (z) {
            this.f78702a.finish();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(java.lang.Runnable, long, java.util.concurrent.TimeUnit):void
      com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(java.lang.StringBuilder, java.lang.String, boolean):void
      com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(int, int, boolean):void */
    @JavascriptInterface
    public void onResize(int i, int i2) {
        this.f78702a.mo46803a();
        if (this.f78702a.f83492f.getVisibility() == 0) {
            this.f78702a.mo46804a(i, i2, true);
        } else {
            this.f78702a.mo46809b(i, i2, true);
        }
    }

    @JavascriptInterface
    public void onShow(boolean z, int i, int i2) {
        this.f78702a.mo46803a();
        if (i <= 0 && i2 <= 0) {
            this.f78702a.mo46809b(i, i2, z);
            return;
        }
        this.f78702a.mo46804a(i, i2, z);
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78702a;
        recaptchaChimeraActivity.runOnUiThread(new aoqf(recaptchaChimeraActivity, z));
    }

    @JavascriptInterface
    public void requestToken(String str, boolean z) {
        this.f78702a.runOnUiThread(new aoqk(this, str, z));
    }

    @JavascriptInterface
    public void verifyCallback(String str) {
        this.f78702a.mo46803a();
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.f78702a;
        Bundle bundle = new Bundle();
        bundle.putString("token", str);
        recaptchaChimeraActivity.f83493g.send(0, bundle);
        recaptchaChimeraActivity.finish();
    }
}
