package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: prl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class prl extends dck implements prm {

    /* renamed from: a */
    final /* synthetic */ aucf f40106a;

    public prl() {
        super("com.google.android.gms.cast.firstparty.internal.ICastRemoteControlNotificationEnabledStatusCallbacks");
    }

    /* renamed from: a */
    public final void mo23579a(Status status) {
        rpc.m34202a(status, false, this.f40106a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public prl(aucf aucf) {
        super("com.google.android.gms.cast.firstparty.internal.ICastRemoteControlNotificationEnabledStatusCallbacks");
        this.f40106a = aucf;
    }

    /* renamed from: a */
    public final void mo23580a(boolean z) {
        rpc.m34202a(Status.f30107a, Boolean.valueOf(z), this.f40106a);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo23580a(dcl.m8167a(parcel));
        } else if (i != 2) {
            return false;
        } else {
            mo23579a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
