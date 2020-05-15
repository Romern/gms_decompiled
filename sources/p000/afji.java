package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupResponse;

/* renamed from: afji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afji extends dck implements afjj {

    /* renamed from: a */
    final /* synthetic */ aucf f64297a;

    public afji() {
        super("com.google.android.gms.mdd.IMddFileGroupCallback");
    }

    /* renamed from: a */
    public final void mo34903a(Status status, FileGroupResponse fileGroupResponse) {
        rpc.m34202a(status, fileGroupResponse, this.f64297a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afji(aucf aucf) {
        super("com.google.android.gms.mdd.IMddFileGroupCallback");
        this.f64297a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo34903a((Status) dcl.m8163a(parcel, Status.CREATOR), (FileGroupResponse) dcl.m8163a(parcel, FileGroupResponse.CREATOR));
        return true;
    }
}
