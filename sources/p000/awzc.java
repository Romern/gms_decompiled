package p000;

import android.hardware.fingerprint.FingerprintManager;
import com.google.android.gms.wallet.p088ui.common.FingerprintButton;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: awzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awzc extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a */
    final /* synthetic */ FingerprintButton f95347a;

    public awzc(FingerprintButton fingerprintButton) {
        this.f95347a = fingerprintButton;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        super.onAuthenticationError(i, charSequence);
        if (i != 5) {
            FingerprintButton fingerprintButton = this.f95347a;
            fingerprintButton.f110438d = null;
            fingerprintButton.mo60061a(charSequence.toString());
            awzd awzd = this.f95347a.f110439e;
            if (awzd != null) {
                awzd.mo52773b();
            }
            if (((Boolean) awij.f94472t.mo58455c()).booleanValue()) {
                FingerprintButton fingerprintButton2 = this.f95347a;
                LogContext logContext = fingerprintButton2.f110442h;
                bmdn bmdn = fingerprintButton2.f110441g.f128701b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                bjst.m104521a(logContext, bmdn.f128835c, 4);
            }
        }
    }

    public final void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        this.f95347a.requestFocus();
        FingerprintButton fingerprintButton = this.f95347a;
        fingerprintButton.f110443i = null;
        fingerprintButton.mo60059a(2);
        awzd awzd = this.f95347a.f110439e;
        if (awzd != null) {
            awzd.mo52773b();
        }
        if (((Boolean) awij.f94472t.mo58455c()).booleanValue()) {
            FingerprintButton fingerprintButton2 = this.f95347a;
            LogContext logContext = fingerprintButton2.f110442h;
            bmdn bmdn = fingerprintButton2.f110441g.f128701b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            bjst.m104521a(logContext, bmdn.f128835c, 3);
        }
    }

    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        super.onAuthenticationSucceeded(authenticationResult);
        FingerprintButton fingerprintButton = this.f95347a;
        fingerprintButton.f110438d = null;
        fingerprintButton.requestFocus();
        FingerprintButton fingerprintButton2 = this.f95347a;
        fingerprintButton2.f110443i = null;
        fingerprintButton2.mo60059a(1);
        if (((Boolean) awij.f94472t.mo58455c()).booleanValue()) {
            FingerprintButton fingerprintButton3 = this.f95347a;
            LogContext logContext = fingerprintButton3.f110442h;
            bmdn bmdn = fingerprintButton3.f110441g.f128701b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            bjst.m104521a(logContext, bmdn.f128835c, 2);
        }
    }
}
