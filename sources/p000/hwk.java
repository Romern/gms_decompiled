package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.ListSignInCredentialsResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hwk extends dck implements hwl {

    /* renamed from: a */
    final /* synthetic */ aucf f20480a;

    public hwk() {
        super("com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback");
    }

    /* renamed from: a */
    public final void mo12783a(Status status, ListSignInCredentialsResult listSignInCredentialsResult) {
        rpc.m34202a(status, listSignInCredentialsResult, this.f20480a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hwk(aucf aucf) {
        super("com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback");
        this.f20480a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo12783a((Status) dcl.m8163a(parcel, Status.CREATOR), (ListSignInCredentialsResult) dcl.m8163a(parcel, ListSignInCredentialsResult.CREATOR));
        return true;
    }
}
