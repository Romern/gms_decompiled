package p000;

import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyInvalidationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: irs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irs extends dck implements irt {

    /* renamed from: a */
    final /* synthetic */ ioc f21602a;

    public irs() {
        super("com.google.android.gms.auth.cryptauth.internal.IKeyInvalidationResultCallback");
    }

    /* renamed from: a */
    public final void mo13303a(KeyInvalidationResult keyInvalidationResult) {
        this.f21602a.mo13165a(keyInvalidationResult);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public irs(ioc ioc) {
        super("com.google.android.gms.auth.cryptauth.internal.IKeyInvalidationResultCallback");
        this.f21602a = ioc;
    }

    /* renamed from: a */
    public final void mo13304a(Status status) {
        this.f21602a.mo13164a(status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13303a((KeyInvalidationResult) dcl.m8163a(parcel, KeyInvalidationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13304a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
