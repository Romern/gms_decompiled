package p000;

import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: irv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irv extends dck implements irw {

    /* renamed from: a */
    final /* synthetic */ iod f21603a;

    public irv() {
        super("com.google.android.gms.auth.cryptauth.internal.IKeyRegistrationResultCallback");
    }

    /* renamed from: a */
    public final void mo13305a(KeyRegistrationResult keyRegistrationResult) {
        this.f21603a.mo13165a(keyRegistrationResult);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public irv(iod iod) {
        super("com.google.android.gms.auth.cryptauth.internal.IKeyRegistrationResultCallback");
        this.f21603a = iod;
    }

    /* renamed from: a */
    public final void mo13306a(Status status) {
        this.f21603a.mo13164a(status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13305a((KeyRegistrationResult) dcl.m8163a(parcel, KeyRegistrationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13306a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
