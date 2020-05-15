package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: hwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hwa extends dck implements hwb {

    /* renamed from: a */
    final /* synthetic */ aucf f20478a;

    public hwa() {
        super("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
    }

    /* renamed from: a */
    public final void mo12780a(Status status, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        rpc.m34202a(status, saveAccountLinkingTokenRequest, this.f20478a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hwa(aucf aucf) {
        super("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
        this.f20478a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo12780a((Status) dcl.m8163a(parcel, Status.CREATOR), (SaveAccountLinkingTokenRequest) dcl.m8163a(parcel, SaveAccountLinkingTokenRequest.CREATOR));
        return true;
    }
}
