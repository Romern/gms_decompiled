package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hwd extends dck implements hwe {

    /* renamed from: a */
    final /* synthetic */ aucf f20479a;

    public hwd() {
        super("com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
    }

    /* renamed from: a */
    public final void mo12782a(Status status, GetDefaultAccountResult getDefaultAccountResult) {
        rpc.m34202a(status, getDefaultAccountResult, this.f20479a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hwd(aucf aucf) {
        super("com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
        this.f20479a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo12782a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetDefaultAccountResult) dcl.m8163a(parcel, GetDefaultAccountResult.CREATOR));
        return true;
    }
}
