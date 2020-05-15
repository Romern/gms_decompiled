package p000;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: myc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class myc extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a */
    final /* synthetic */ mye f34923a;

    public myc(mye mye) {
        this.f34923a = mye;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        mye.f34924a.mo25412b("Authentication error code %d: %s.", Integer.valueOf(i), charSequence);
        super.onAuthenticationError(i, charSequence);
        if (i != 5 && i != 10) {
            this.f34923a.f34927d.mo17270m();
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        mye.f34924a.mo25412b("Authentication succeeded.", new Object[0]);
        super.onAuthenticationSucceeded(authenticationResult);
        int authenticationType = authenticationResult.getAuthenticationType();
        if (authenticationType != 1) {
            lvn lvn = mye.f34924a;
            StringBuilder sb = new StringBuilder(43);
            sb.append("Unexpected authentication type: ");
            sb.append(authenticationType);
            lvn.mo25416d(sb.toString(), new Object[0]);
            this.f34923a.f34927d.mo17270m();
            return;
        }
        this.f34923a.f34927d.mo17269l();
    }
}
