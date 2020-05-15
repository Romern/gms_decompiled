package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: akon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akon extends dck implements akoo {

    /* renamed from: a */
    final /* synthetic */ aucf f72362a;

    public akon() {
        super("com.google.android.gms.notifications.internal.IGunsCallbacks");
    }

    /* renamed from: a */
    public final void mo39612a(Status status) {
        rpc.m34201a(status, this.f72362a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akon(aucf aucf) {
        super("com.google.android.gms.notifications.internal.IGunsCallbacks");
        this.f72362a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo39612a((Status) dcl.m8163a(parcel, Status.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
