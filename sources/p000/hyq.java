package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: hyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hyq extends dck implements hyr {

    /* renamed from: a */
    final /* synthetic */ aucf f20574a;

    public hyq() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    /* renamed from: a */
    public final void mo12816a(Status status, boolean z) {
        rpc.m34202a(status, Boolean.valueOf(z), this.f20574a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hyq(aucf aucf) {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
        this.f20574a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo12816a((Status) dcl.m8163a(parcel, Status.CREATOR), dcl.m8167a(parcel));
        return true;
    }
}
