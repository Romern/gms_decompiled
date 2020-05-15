package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.List;

/* renamed from: afmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afmw extends dck implements afmx {

    /* renamed from: a */
    final /* synthetic */ aucf f64405a;

    public afmw() {
        super("com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
    }

    /* renamed from: a */
    public final void mo34968a(Status status, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        List list;
        if (status.mo17710c()) {
            list = mdhFootprintListSafeParcelable.f80015a;
        } else {
            list = null;
        }
        rpc.m34202a(status, list, this.f64405a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afmw(aucf aucf) {
        super("com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
        this.f64405a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo34968a((Status) dcl.m8163a(parcel, Status.CREATOR), (MdhFootprintListSafeParcelable) dcl.m8163a(parcel, MdhFootprintListSafeParcelable.CREATOR));
        return true;
    }
}
