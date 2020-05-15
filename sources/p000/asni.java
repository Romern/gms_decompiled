package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetFelicaTosAcceptanceResponse;

/* renamed from: asni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asni extends aswl {

    /* renamed from: a */
    final /* synthetic */ aucf f89274a;

    public asni(aucf aucf) {
        this.f89274a = aucf;
    }

    /* renamed from: a */
    public final void mo49247a(Status status, GetFelicaTosAcceptanceResponse getFelicaTosAcceptanceResponse) {
        Boolean bool;
        if (getFelicaTosAcceptanceResponse != null) {
            bool = Boolean.valueOf(getFelicaTosAcceptanceResponse.f108375a);
        } else {
            bool = null;
        }
        rpc.m34202a(status, bool, this.f89274a);
    }
}
