package p000;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: xdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xdq extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a */
    final /* synthetic */ xwn f52009a;

    /* renamed from: b */
    final /* synthetic */ xwj f52010b;

    /* renamed from: c */
    final /* synthetic */ xeg f52011c;

    public xdq(xwn xwn, xwj xwj, xeg xeg) {
        this.f52009a = xwn;
        this.f52010b = xwj;
        this.f52011c = xeg;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.f52009a.mo30186a(this.f52010b, xag.TYPE_FINGERPRINT_NOT_RECOGNIZED);
        this.f52011c.mo29667a(new xma("User authentication failed"));
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f52009a.mo30186a(this.f52010b, xag.TYPE_FINGERPRINT_RECOGNIZED);
        this.f52011c.mo29668a(xpj.FINGERPRINT);
    }
}
