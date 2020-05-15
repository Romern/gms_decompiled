package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hwn extends dck implements hwo {

    /* renamed from: a */
    final /* synthetic */ aucf f20481a;

    public hwn() {
        super("com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
    }

    /* renamed from: a */
    public final void mo12784a(Status status, MatchPasswordResult matchPasswordResult) {
        rpc.m34202a(status, matchPasswordResult, this.f20481a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hwn(aucf aucf) {
        super("com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
        this.f20481a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo12784a((Status) dcl.m8163a(parcel, Status.CREATOR), (MatchPasswordResult) dcl.m8163a(parcel, MatchPasswordResult.CREATOR));
        return true;
    }
}
