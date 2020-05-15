package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupWithDownloadStatus;
import java.util.List;

/* renamed from: afjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afjl extends dck implements afjm {

    /* renamed from: a */
    final /* synthetic */ aucf f64298a;

    public afjl() {
        super("com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
    }

    /* renamed from: a */
    public final void mo34904a(Status status, List list) {
        rpc.m34202a(status, list, this.f64298a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afjl(aucf aucf) {
        super("com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
        this.f64298a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo34904a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(FileGroupWithDownloadStatus.CREATOR));
        return true;
    }
}
