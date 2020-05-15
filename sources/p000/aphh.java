package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: aphh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aphh extends dck implements aphi {

    /* renamed from: a */
    final /* synthetic */ aucf f84377a;

    public aphh() {
        super("com.google.android.gms.scheduler.ISchedulerCallbacks");
    }

    /* renamed from: a */
    public final void mo47215a(Status status) {
        rpc.m34202a(status, null, this.f84377a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aphh(aucf aucf) {
        super("com.google.android.gms.scheduler.ISchedulerCallbacks");
        this.f84377a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo47215a((Status) dcl.m8163a(parcel, Status.CREATOR));
        return true;
    }
}
