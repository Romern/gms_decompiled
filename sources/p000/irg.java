package p000;

import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: irg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irg extends dck implements irh {

    /* renamed from: a */
    final /* synthetic */ inz f21598a;

    public irg() {
        super("com.google.android.gms.auth.cryptauth.internal.IHkdfResultCallback");
    }

    /* renamed from: a */
    public final void mo13295a(KeyDerivationResult keyDerivationResult) {
        this.f21598a.mo13165a(keyDerivationResult);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public irg(inz inz) {
        super("com.google.android.gms.auth.cryptauth.internal.IHkdfResultCallback");
        this.f21598a = inz;
    }

    /* renamed from: a */
    public final void mo13296a(Status status) {
        this.f21598a.mo13164a(status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13295a((KeyDerivationResult) dcl.m8163a(parcel, KeyDerivationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13296a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
