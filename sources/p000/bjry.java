package p000;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: bjry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjry extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a */
    final /* synthetic */ bjsc f123200a;

    public bjry(bjsc bjsc) {
        this.f123200a = bjsc;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (!bjss.m104508a()) {
            this.f123200a.f123206c.execute(new bjrv(this, charSequence, i));
            this.f123200a.mo65492b();
        }
    }

    public final void onAuthenticationFailed() {
        this.f123200a.f123206c.execute(new bjrx(this));
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        if (!(authenticationResult == null || (cryptoObject = authenticationResult.getCryptoObject()) == null)) {
            if (cryptoObject.getCipher() != null) {
                cryptoObject.getCipher();
            } else if (cryptoObject.getSignature() != null) {
                cryptoObject.getSignature();
            } else if (cryptoObject.getMac() != null) {
                cryptoObject.getMac();
            }
        }
        this.f123200a.f123206c.execute(new bjrw(this));
        this.f123200a.mo65492b();
    }
}
