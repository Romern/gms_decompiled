package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: rmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rmo extends rmz {

    /* renamed from: a */
    final /* synthetic */ rms f43291a;

    /* renamed from: b */
    final /* synthetic */ SignInResponse f43292b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rmo(rmy rmy, rms rms, SignInResponse signInResponse) {
        super(rmy);
        this.f43291a = rms;
        this.f43292b = signInResponse;
    }

    /* renamed from: a */
    public final void mo24891a() {
        rms rms = this.f43291a;
        SignInResponse signInResponse = this.f43292b;
        if (rms.mo24908b(0)) {
            ConnectionResult connectionResult = signInResponse.f107711b;
            if (connectionResult.mo17671b()) {
                ResolveAccountResponse resolveAccountResponse = signInResponse.f107712c;
                ConnectionResult connectionResult2 = resolveAccountResponse.f30245c;
                if (!connectionResult2.mo17671b()) {
                    String valueOf = String.valueOf(connectionResult2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GACConnecting", sb.toString(), new Exception());
                    rms.mo24906b(connectionResult2);
                    return;
                }
                rms.f43302g = true;
                rms.f43303h = resolveAccountResponse.mo17826a();
                rms.f43304i = resolveAccountResponse.f30246d;
                rms.f43305j = resolveAccountResponse.f30247e;
                rms.mo24910e();
            } else if (rms.mo24905a(connectionResult)) {
                rms.mo24911f();
                rms.mo24910e();
            } else {
                rms.mo24906b(connectionResult);
            }
        }
    }
}
