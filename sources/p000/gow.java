package p000;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: gow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gow extends dck implements gox {

    /* renamed from: a */
    final /* synthetic */ aucf f18779a;

    public gow() {
        super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
    }

    /* renamed from: a */
    public final void mo12117a(Status status, List list) {
        rpc.m34202a(status, list, this.f18779a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gow(aucf aucf) {
        super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
        this.f18779a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo12117a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(Account.CREATOR));
        return true;
    }
}
