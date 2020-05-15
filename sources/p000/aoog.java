package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: aoog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoog extends dck implements aooh {

    /* renamed from: a */
    private final aucf f78605a;

    public aoog() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    /* renamed from: a */
    public final void mo43122a(Status status) {
        rpc.m34201a(status, this.f78605a);
    }

    /* renamed from: a */
    public final void mo43123a(Status status, long j) {
        rpc.m34202a(status, Long.valueOf(j), this.f78605a);
    }

    public aoog(aucf aucf) {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
        this.f78605a = aucf;
    }

    /* renamed from: a */
    public final void mo43124a(Status status, PseudonymousIdToken pseudonymousIdToken) {
        rpc.m34202a(status, pseudonymousIdToken, this.f78605a);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo43124a((Status) dcl.m8163a(parcel, Status.CREATOR), (PseudonymousIdToken) dcl.m8163a(parcel, PseudonymousIdToken.CREATOR));
        } else if (i == 2) {
            mo43122a((Status) dcl.m8163a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo43123a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readLong());
        }
        return true;
    }
}
