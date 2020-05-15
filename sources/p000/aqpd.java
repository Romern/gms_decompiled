package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: aqpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqpd extends aqob {

    /* renamed from: a */
    final /* synthetic */ ResolveAccountResponse f86469a;

    /* renamed from: b */
    final /* synthetic */ scs f86470b;

    public aqpd(scs scs, ResolveAccountResponse resolveAccountResponse) {
        this.f86470b = scs;
        this.f86469a = resolveAccountResponse;
    }

    /* renamed from: a */
    public final void mo47990a(ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
        this.f86470b.f44049b.f86472b.mo24903a(new SignInResponse(connectionResult, this.f86469a));
    }
}
