package p000;

import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.common.api.Status;

/* renamed from: isk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class isk extends dck implements isl {

    /* renamed from: a */
    final /* synthetic */ ior f21610a;

    public isk() {
        super("com.google.android.gms.auth.cryptauth.internal.IVerifyDecryptCallback");
    }

    /* renamed from: a */
    public final void mo13314a(PlainText plainText) {
        this.f21610a.mo13165a(plainText);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public isk(ior ior) {
        super("com.google.android.gms.auth.cryptauth.internal.IVerifyDecryptCallback");
        this.f21610a = ior;
    }

    /* renamed from: a */
    public final void mo13315a(Status status) {
        this.f21610a.mo13164a(status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13314a((PlainText) dcl.m8163a(parcel, PlainText.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13315a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
