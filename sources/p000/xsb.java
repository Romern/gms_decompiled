package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: xsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xsb extends dck implements xsc {

    /* renamed from: a */
    final /* synthetic */ aucf f53002a;

    public xsb() {
        super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
    }

    /* renamed from: a */
    public final void mo30097a(Status status, PendingIntent pendingIntent) {
        rpc.m34202a(status, new xrx(pendingIntent), this.f53002a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xsb(aucf aucf) {
        super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
        this.f53002a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo30097a((Status) dcl.m8163a(parcel, Status.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
        return true;
    }
}
