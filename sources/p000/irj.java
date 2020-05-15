package p000;

import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.HashResult;
import com.google.android.gms.common.api.Status;

/* renamed from: irj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irj extends dck implements irk {

    /* renamed from: a */
    final /* synthetic */ ioa f21599a;

    public irj() {
        super("com.google.android.gms.auth.cryptauth.internal.IHmacResultCallback");
    }

    /* renamed from: a */
    public final void mo13297a(HashResult hashResult) {
        this.f21599a.mo13165a(hashResult);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public irj(ioa ioa) {
        super("com.google.android.gms.auth.cryptauth.internal.IHmacResultCallback");
        this.f21599a = ioa;
    }

    /* renamed from: a */
    public final void mo13298a(Status status) {
        this.f21599a.mo13164a(status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13297a((HashResult) dcl.m8163a(parcel, HashResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13298a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
