package p000;

import android.os.SystemClock;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: apvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apvk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecaptchaChimeraActivity f84989a;

    public apvk(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.f84989a = recaptchaChimeraActivity;
    }

    public final void run() {
        String str = RecaptchaChimeraActivity.f107498j;
        long elapsedRealtime = (this.f84989a.f107507h + RecaptchaChimeraActivity.f107499k) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f84989a.mo58929b();
        } else {
            this.f84989a.mo58926a(this, elapsedRealtime, TimeUnit.MILLISECONDS);
        }
    }
}
