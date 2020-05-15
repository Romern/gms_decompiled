package p000;

import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.common.api.Status;

/* renamed from: ise */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ise extends dck implements isf {

    /* renamed from: a */
    final /* synthetic */ iok f21609a;

    public ise() {
        super("com.google.android.gms.auth.cryptauth.internal.ISignCryptResultCallback");
    }

    /* renamed from: a */
    public final void mo13312a(SignCryptedBlob signCryptedBlob) {
        this.f21609a.mo13165a(signCryptedBlob);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ise(iok iok) {
        super("com.google.android.gms.auth.cryptauth.internal.ISignCryptResultCallback");
        this.f21609a = iok;
    }

    /* renamed from: a */
    public final void mo13313a(Status status) {
        this.f21609a.mo13164a(status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13312a((SignCryptedBlob) dcl.m8163a(parcel, SignCryptedBlob.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13313a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
