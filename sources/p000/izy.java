package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: izy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class izy extends dck implements izz {

    /* renamed from: a */
    final /* synthetic */ aucf f22013a;

    public izy() {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
    }

    /* renamed from: a */
    public final void mo13541a(Status status, boolean z) {
        rpc.m34201a(status, this.f22013a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public izy(aucf aucf) {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
        this.f22013a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo13541a((Status) dcl.m8163a(parcel, Status.CREATOR), dcl.m8167a(parcel));
        return true;
    }
}
