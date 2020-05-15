package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprintsReadResult;

/* renamed from: afmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afmz extends dck implements afna {

    /* renamed from: a */
    final /* synthetic */ aucf f64406a;

    public afmz() {
        super("com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
    }

    /* renamed from: a */
    public final void mo34969a(Status status, MdhFootprintsReadResult mdhFootprintsReadResult) {
        rpc.m34202a(status, mdhFootprintsReadResult, this.f64406a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afmz(aucf aucf) {
        super("com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
        this.f64406a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo34969a((Status) dcl.m8163a(parcel, Status.CREATOR), (MdhFootprintsReadResult) dcl.m8163a(parcel, MdhFootprintsReadResult.CREATOR));
        return true;
    }
}
