package p000;

import android.hardware.fingerprint.FingerprintManager;
import android.util.Log;

/* renamed from: lw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1176lw extends FingerprintManager.AuthenticationCallback {
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (i == 5) {
            bjsr bjsr = null.f26667a;
            throw null;
        } else if (i == 7 || i == 9) {
            C1177lx lxVar = null;
            lxVar.mo15433a();
            bjsr bjsr2 = lxVar.f26667a;
            throw null;
        } else if (charSequence != null) {
            bjsr bjsr3 = null.f26667a;
            throw null;
        } else {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Got null string for error message: ");
            sb.append(i);
            Log.e("FingerprintHelperFrag", sb.toString());
            bjsr bjsr4 = null.f26667a;
            throw null;
        }
    }

    public final void onAuthenticationFailed() {
        bjsr bjsr = null.f26667a;
        throw null;
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        bjsr bjsr = null.f26667a;
        throw null;
    }

    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                cryptoObject.getCipher();
            } else if (cryptoObject.getSignature() != null) {
                cryptoObject.getSignature();
            } else if (cryptoObject.getMac() != null) {
                cryptoObject.getMac();
            }
        }
        bjsr bjsr = null.f26667a;
        throw null;
    }
}
