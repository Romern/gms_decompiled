package p000;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

/* renamed from: roq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class roq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SignInResponse f43452a;

    /* renamed from: b */
    final /* synthetic */ ror f43453b;

    public roq(ror ror, SignInResponse signInResponse) {
        this.f43453b = ror;
        this.f43452a = signInResponse;
    }

    public final void run() {
        ror ror = this.f43453b;
        SignInResponse signInResponse = this.f43452a;
        ConnectionResult connectionResult = signInResponse.f107711b;
        if (connectionResult.mo17671b()) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.f107712c;
            ConnectionResult connectionResult2 = resolveAccountResponse.f30245c;
            if (!connectionResult2.mo17671b()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                ror.f43460f.mo24943b(connectionResult2);
                ror.f43459e.mo14032j();
                return;
            }
            rnl rnl = ror.f43460f;
            scb a = resolveAccountResponse.mo17826a();
            Set set = ror.f43457c;
            if (a == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                rnl.mo24943b(new ConnectionResult(4));
            } else {
                rnl.f43387c = a;
                rnl.f43388d = set;
                rnl.mo24942a();
            }
        } else {
            ror.f43460f.mo24943b(connectionResult);
        }
        ror.f43459e.mo14032j();
    }
}
