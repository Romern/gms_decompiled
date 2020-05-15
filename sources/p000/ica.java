package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: ica */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ica extends hxp {

    /* renamed from: a */
    final /* synthetic */ aucf f20719a;

    public ica(aucf aucf) {
        this.f20719a = aucf;
    }

    /* renamed from: a */
    public final void mo12789a(String str) {
        Status status;
        if (str == null) {
            status = new Status(3006);
        } else {
            status = Status.f30107a;
        }
        rpc.m34202a(status, str, this.f20719a);
    }
}
