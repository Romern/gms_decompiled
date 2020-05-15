package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: xnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xnb extends dck implements xnc {

    /* renamed from: a */
    final /* synthetic */ aucf f52780a;

    public xnb() {
        super("com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks");
    }

    /* renamed from: a */
    public final void mo29957a(Status status, long j) {
        rpc.m34202a(status, Long.valueOf(j), this.f52780a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xnb(aucf aucf) {
        super("com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks");
        this.f52780a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo29957a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readLong());
        return true;
    }
}
