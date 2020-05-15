package p000;

import android.os.SystemClock;
import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: aoqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoqn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecaptchaChimeraActivity f78704a;

    public aoqn(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.f78704a = recaptchaChimeraActivity;
    }

    public final void run() {
        long elapsedRealtime = (this.f78704a.f83494h + RecaptchaChimeraActivity.f83486k) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f78704a.mo46808b();
        } else {
            this.f78704a.mo46805a(this, elapsedRealtime, TimeUnit.MILLISECONDS);
        }
    }
}
