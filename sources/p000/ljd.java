package p000;

import android.app.KeyguardManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ljd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ljd extends lim {
    public ljd(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
    }

    /* renamed from: a */
    public final void mo15164a() {
        this.f26159a.setTheme(2132019640);
        lrc a = lrc.m19570a(this.f26159a);
        BiometricPrompt.Builder confirmationRequired = new BiometricPrompt.Builder(this.f26159a).setTitle(a.mo15386b(C0126R.string.autofill_authentication_required)).setConfirmationRequired(false);
        KeyguardManager keyguardManager = (KeyguardManager) this.f26159a.getSystemService(KeyguardManager.class);
        if (keyguardManager == null || !keyguardManager.isDeviceSecure()) {
            confirmationRequired.setNegativeButton(a.mo15386b(17039360), bqfb.INSTANCE, new ljb(this));
        } else {
            confirmationRequired.setDeviceCredentialAllowed(true);
        }
        confirmationRequired.build().authenticate(new CancellationSignal(), bqfb.INSTANCE, new ljc(this));
    }
}
