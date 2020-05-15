package p000;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;

/* renamed from: awyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awyv {

    /* renamed from: a */
    public final Context f95328a;

    /* renamed from: b */
    public final bmcf f95329b;

    /* renamed from: c */
    final BiometricPrompt.CryptoObject f95330c;

    /* renamed from: d */
    awyu f95331d;

    /* renamed from: e */
    CancellationSignal f95332e;

    public awyv(Context context, BiometricPrompt.CryptoObject cryptoObject, bmcf bmcf) {
        int i = bmcf.f128665a;
        boolean z = false;
        if (!((i & 2) == 0 || (i & 16) == 0)) {
            z = true;
        }
        sdo.m34975b(z, "The title and negative button text need to bet set in biometricPromptForm.");
        this.f95328a = context;
        this.f95330c = cryptoObject;
        this.f95329b = bmcf;
    }
}
