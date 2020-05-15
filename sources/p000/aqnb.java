package p000;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: aqnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqnb extends aqob {

    /* renamed from: a */
    final /* synthetic */ aqnc f86384a;

    public aqnb(aqnc aqnc) {
        this.f86384a = aqnc;
    }

    /* renamed from: a */
    public final void mo47987a(Status status, GoogleSignInAccount googleSignInAccount) {
        this.f86384a.mo17716a((rkk) new icj(googleSignInAccount, status));
    }
}
