package p000;

import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: mwy */
final /* synthetic */ class mwy implements Runnable {

    /* renamed from: a */
    private final mwz f34873a;

    /* renamed from: b */
    private final Boolean f34874b;

    public mwy(mwz mwz, Boolean bool) {
        this.f34873a = mwz;
        this.f34874b = bool;
    }

    public final void run() {
        boolean z;
        mwz mwz = this.f34873a;
        if (this.f34874b.booleanValue()) {
            if (mwz.f34875a.f29169l != null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            mye mye = mwz.f34875a.f29169l;
            mye.f34924a.mo25412b("Showing primary unlock activity.", new Object[0]);
            new BiometricPrompt.Builder(mye.f34925b).setAllowedAuthenticators(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT).setTitle(mye.f34925b.getText(C0126R.string.common_confirm_screen_lock_title)).setDescription(mye.f34925b.getText(C0126R.string.backup_now_lockscreen_description)).build().authenticate(new CancellationSignal(), mye.f34926c, new myc(mye));
            return;
        }
        mwz.f34875a.mo17264c(false);
    }
}
