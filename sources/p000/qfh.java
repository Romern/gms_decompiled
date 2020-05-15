package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: qfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfh extends dck implements qfi {

    /* renamed from: a */
    final /* synthetic */ aucf f41120a;

    public qfh() {
        super("com.google.android.gms.checkin.internal.ICheckinApiCallbacks");
    }

    /* renamed from: a */
    public final void mo24012a(Status status, String str) {
        rpc.m34202a(status, str, this.f41120a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qfh(aucf aucf) {
        super("com.google.android.gms.checkin.internal.ICheckinApiCallbacks");
        this.f41120a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 5) {
            return false;
        }
        mo24012a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readString());
        return true;
    }
}
