package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: moe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class moe extends dck implements mof {

    /* renamed from: a */
    final /* synthetic */ aucf f34074a;

    public moe() {
        super("com.google.android.gms.backup.internal.IBackUpNowCallbacks");
    }

    /* renamed from: a */
    public final void mo20214a(Status status) {
        rpc.m34201a(status, this.f34074a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public moe(aucf aucf) {
        super("com.google.android.gms.backup.internal.IBackUpNowCallbacks");
        this.f34074a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo20214a((Status) dcl.m8163a(parcel, Status.CREATOR));
        return true;
    }
}
