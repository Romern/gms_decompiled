package p000;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import java.security.Signature;

/* renamed from: awyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awyt extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a */
    final /* synthetic */ awyv f95327a;

    public awyt(awyv awyv) {
        this.f95327a = awyv;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        Object[] objArr = {Integer.valueOf(i), charSequence};
        super.onAuthenticationError(i, charSequence);
        if (i != 1) {
            if (i != 5) {
                if (i != 7) {
                    switch (i) {
                        case 10:
                            break;
                        case 11:
                        case 12:
                            break;
                        default:
                            return;
                    }
                }
            }
            awyu awyu = this.f95327a.f95331d;
            if (awyu != null) {
                awyq awyq = (awyq) awyu;
                awyq.f95320r = false;
                awyq.mo52774b(false);
                if (awyq.f95319q) {
                    ((bkge) awyu).mo51905a(19, Bundle.EMPTY);
                    return;
                }
                return;
            }
            return;
        }
        awyu awyu2 = this.f95327a.f95331d;
        if (awyu2 != null) {
            awyu2.mo52780c();
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        Signature signature;
        super.onAuthenticationSucceeded(authenticationResult);
        awyv awyv = this.f95327a;
        awyu awyu = awyv.f95331d;
        if (awyu != null) {
            BiometricPrompt.CryptoObject cryptoObject = awyv.f95330c;
            if (cryptoObject != null) {
                signature = cryptoObject.getSignature();
            } else {
                signature = null;
            }
            ((awyq) awyu).mo52769a(4, signature);
        }
    }
}
