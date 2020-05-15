package p000;

import android.hardware.biometrics.BiometricPrompt;
import com.google.android.gms.tapandpay.p068ui.SecureDeviceChimeraActivity;

/* renamed from: atws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atws extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a */
    final /* synthetic */ SecureDeviceChimeraActivity f91059a;

    public atws(SecureDeviceChimeraActivity secureDeviceChimeraActivity) {
        this.f91059a = secureDeviceChimeraActivity;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        super.onAuthenticationError(i, charSequence);
        SecureDeviceChimeraActivity secureDeviceChimeraActivity = this.f91059a;
        int i2 = SecureDeviceChimeraActivity.f108954d;
        secureDeviceChimeraActivity.mo59497a(13, 5);
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        rjx.m33696b(this.f91059a.getApplicationContext()).mo24771y();
        super.onAuthenticationSucceeded(authenticationResult);
        SecureDeviceChimeraActivity secureDeviceChimeraActivity = this.f91059a;
        int i = SecureDeviceChimeraActivity.f108954d;
        secureDeviceChimeraActivity.mo59497a(-1, 5);
    }
}
