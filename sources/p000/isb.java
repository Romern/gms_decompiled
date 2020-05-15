package p000;

import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.common.api.Status;

/* renamed from: isb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class isb extends dck implements isc {

    /* renamed from: a */
    final /* synthetic */ ioj f21608a;

    public isb() {
        super("com.google.android.gms.auth.cryptauth.internal.IRetrievePublicKeyCallback");
    }

    /* renamed from: a */
    public final void mo13310a(CryptauthPublicKey cryptauthPublicKey) {
        this.f21608a.mo13165a(cryptauthPublicKey);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public isb(ioj ioj) {
        super("com.google.android.gms.auth.cryptauth.internal.IRetrievePublicKeyCallback");
        this.f21608a = ioj;
    }

    /* renamed from: a */
    public final void mo13311a(Status status) {
        this.f21608a.mo13164a(status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13310a((CryptauthPublicKey) dcl.m8163a(parcel, CryptauthPublicKey.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13311a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
