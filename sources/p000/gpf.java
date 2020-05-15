package p000;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: gpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gpf extends dck implements gpg {

    /* renamed from: a */
    final /* synthetic */ aucf f18786a;

    public gpf() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    /* renamed from: a */
    public final void mo12125a(Status status, Bundle bundle) {
        rpc.m34202a(status, bundle, this.f18786a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gpf(aucf aucf) {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
        this.f18786a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo12125a((Status) dcl.m8163a(parcel, Status.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        return true;
    }
}
