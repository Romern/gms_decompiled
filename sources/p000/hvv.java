package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hvv extends dck implements hvw {

    /* renamed from: a */
    final /* synthetic */ aucf f20475a;

    public hvv() {
        super("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
    }

    /* renamed from: a */
    public final void mo12779a(Status status, CompleteSignInResult completeSignInResult) {
        rpc.m34202a(status, completeSignInResult, this.f20475a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hvv(aucf aucf) {
        super("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
        this.f20475a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo12779a((Status) dcl.m8163a(parcel, Status.CREATOR), (CompleteSignInResult) dcl.m8163a(parcel, CompleteSignInResult.CREATOR));
        return true;
    }
}
