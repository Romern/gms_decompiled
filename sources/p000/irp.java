package p000;

import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import com.google.android.gms.common.api.Status;

/* renamed from: irp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irp extends dck implements irq {

    /* renamed from: a */
    final /* synthetic */ inx f21601a;

    public irp() {
        super("com.google.android.gms.auth.cryptauth.internal.IKeyHandleResultCallback");
    }

    /* renamed from: a */
    public final void mo13301a(KeyHandleResult keyHandleResult) {
        this.f21601a.mo13165a(keyHandleResult);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public irp(inx inx) {
        super("com.google.android.gms.auth.cryptauth.internal.IKeyHandleResultCallback");
        this.f21601a = inx;
    }

    /* renamed from: a */
    public final void mo13302a(Status status) {
        this.f21601a.mo13164a(status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13301a((KeyHandleResult) dcl.m8163a(parcel, KeyHandleResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13302a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
