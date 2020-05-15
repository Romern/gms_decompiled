package p000;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: pro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pro extends dck implements prp {

    /* renamed from: a */
    final /* synthetic */ aucf f40107a;

    public pro() {
        super("com.google.android.gms.cast.firstparty.internal.ICastSettingsCallback");
    }

    /* renamed from: a */
    public final void mo23581a(Bundle bundle) {
        rpc.m34202a(Status.f30107a, bundle, this.f40107a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pro(aucf aucf) {
        super("com.google.android.gms.cast.firstparty.internal.ICastSettingsCallback");
        this.f40107a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo23581a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        return true;
    }
}
