package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: xsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xsj extends dck implements xsk {

    /* renamed from: a */
    final /* synthetic */ aucf f53003a;

    public xsj() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    /* renamed from: a */
    public final void mo30101a(Status status, PendingIntent pendingIntent) {
        rpc.m34202a(status, pendingIntent, this.f53003a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xsj(aucf aucf) {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
        this.f53003a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo30101a((Status) dcl.m8163a(parcel, Status.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
        return true;
    }
}
