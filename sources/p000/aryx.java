package p000;

import android.hardware.fingerprint.FingerprintManager;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aryx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aryx extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a */
    final /* synthetic */ arza f88491a;

    public aryx(arza arza) {
        this.f88491a = arza;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        arza.f88493a.mo25412b(charSequence.toString(), new Object[0]);
        if (i != 5) {
            this.f88491a.f88494b.mo48957k();
        }
    }

    public final void onAuthenticationFailed() {
        arza.f88493a.mo25412b("Fingerprint scanned, but not recognized", new Object[0]);
        arza arza = this.f88491a;
        arza.mo48959a(arza.getString(C0126R.string.smartdevice_d2d_fingerprint_not_recognized_text));
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        arza.f88493a.mo25412b(charSequence.toString(), new Object[0]);
        this.f88491a.mo48959a(charSequence.toString());
    }

    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        Logger Logger = arza.f88493a;
        String valueOf = String.valueOf(authenticationResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Fingerprint recognized! AuthenticationResult is: ");
        sb.append(valueOf);
        Logger.mo25412b(sb.toString(), new Object[0]);
        this.f88491a.f88494b.mo48956e();
    }
}
