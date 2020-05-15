package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: irm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irm extends dck implements irn {

    /* renamed from: a */
    final /* synthetic */ iob f21600a;

    public irm() {
        super("com.google.android.gms.auth.cryptauth.internal.IIncrementAndGetCounterCallback");
    }

    /* renamed from: a */
    public final void mo13299a(long j) {
        this.f21600a.mo13165a(Long.valueOf(j));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public irm(iob iob) {
        super("com.google.android.gms.auth.cryptauth.internal.IIncrementAndGetCounterCallback");
        this.f21600a = iob;
    }

    /* renamed from: a */
    public final void mo13300a(Status status) {
        this.f21600a.mo13164a(status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13299a(parcel.readLong());
        } else if (i != 2) {
            return false;
        } else {
            mo13300a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
