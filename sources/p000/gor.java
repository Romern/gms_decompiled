package p000;

import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: gor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gor extends dck implements gos {

    /* renamed from: a */
    final /* synthetic */ aucf f18778a;

    public gor() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    /* renamed from: a */
    public final void mo12114a(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
        rpc.m34202a(status, accountChangeEventsResponse, this.f18778a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gor(aucf aucf) {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
        this.f18778a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo12114a((Status) dcl.m8163a(parcel, Status.CREATOR), (AccountChangeEventsResponse) dcl.m8163a(parcel, AccountChangeEventsResponse.CREATOR));
        return true;
    }
}
