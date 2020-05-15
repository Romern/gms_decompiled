package p000;

import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.service.autofill.Dataset;

/* renamed from: ljc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ljc extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a */
    final /* synthetic */ ljd f26184a;

    public ljc(ljd ljd) {
        this.f26184a = ljd;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        super.onAuthenticationError(i, charSequence);
        this.f26184a.mo15165a(0);
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        ljd ljd = this.f26184a;
        Intent intent = new Intent();
        intent.putExtra("android.view.autofill.extra.AUTHENTICATION_RESULT", (Dataset) ljd.f26160b.getParcelable("com.google.android.gms.autofill.extra.DATASET"));
        ljd.mo15167a(-1, intent);
    }
}
