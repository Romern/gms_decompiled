package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: jae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jae extends dck implements jaf {

    /* renamed from: a */
    final /* synthetic */ aucf f22019a;

    public jae() {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
    }

    /* renamed from: a */
    public final void mo13555a(Status status, int i) {
        rpc.m34202a(status, Integer.valueOf(i), this.f22019a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jae(aucf aucf) {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
        this.f22019a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo13555a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readInt());
        return true;
    }
}
