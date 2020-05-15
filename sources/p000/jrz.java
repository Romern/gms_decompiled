package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: jrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jrz extends dck implements jsa {

    /* renamed from: a */
    final /* synthetic */ aucf f23146a;

    public jrz() {
        super("com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback");
    }

    /* renamed from: a */
    public final void mo14029a(Status status, int i) {
        rpc.m34202a(status, Integer.valueOf(i), this.f23146a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jrz(aucf aucf) {
        super("com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback");
        this.f23146a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo14029a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readInt());
        return true;
    }
}
