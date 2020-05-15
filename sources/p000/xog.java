package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: xog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xog extends dck implements xoh {

    /* renamed from: a */
    final /* synthetic */ aucf f52839a;

    public xog() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    /* renamed from: a */
    public final void mo29965a(Status status) {
        this.f52839a.mo50392b((Exception) new rjp(status));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xog(aucf aucf) {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
        this.f52839a = aucf;
    }

    /* renamed from: a */
    public final void mo29966a(boolean z) {
        this.f52839a.mo50391a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo29966a(dcl.m8167a(parcel));
        } else if (i != 2) {
            return false;
        } else {
            mo29965a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
