package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: hyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hyn extends dck implements hyo {

    /* renamed from: a */
    final /* synthetic */ aucf f20573a;

    public hyn() {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
    }

    /* renamed from: a */
    public final void mo12815a(Status status, int i) {
        rpc.m34202a(status, Integer.valueOf(i), this.f20573a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hyn(aucf aucf) {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
        this.f20573a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo12815a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readInt());
        return true;
    }
}
