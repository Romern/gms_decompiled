package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: iry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iry extends dck implements irz {

    /* renamed from: a */
    final /* synthetic */ iog f21604a;

    public iry() {
        super("com.google.android.gms.auth.cryptauth.internal.IRetrieveDeviceSyncMetadataCallback");
    }

    /* renamed from: a */
    public final void mo13307a(Status status) {
        this.f21604a.mo13164a(status);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iry(iog iog) {
        super("com.google.android.gms.auth.cryptauth.internal.IRetrieveDeviceSyncMetadataCallback");
        this.f21604a = iog;
    }

    /* renamed from: a */
    public final void mo13308a(List list) {
        this.f21604a.mo13165a(list);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13308a(dcl.m8168b(parcel));
        } else if (i != 2) {
            return false;
        } else {
            mo13307a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
