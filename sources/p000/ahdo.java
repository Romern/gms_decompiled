package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ahdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahdo extends dck implements ahdp {

    /* renamed from: a */
    private final rlf f67056a;

    public ahdo() {
        super("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
    }

    /* renamed from: a */
    public static ahdo m55569a(rlf rlf) {
        return new ahdo(rlf);
    }

    /* renamed from: a */
    public final void mo36350a(Status status) {
        this.f67056a.mo9482a((Object) status);
    }

    private ahdo(rlf rlf) {
        super("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
        this.f67056a = rlf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo36350a((Status) dcl.m8163a(parcel, Status.CREATOR));
        return true;
    }
}
