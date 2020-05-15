package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: hzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hzd extends rns {

    /* renamed from: a */
    final /* synthetic */ aucf f20579a;

    public hzd(aucf aucf) {
        this.f20579a = aucf;
    }

    /* renamed from: a */
    public final void mo11797a(Status status) {
        if (status.f30115i == 6) {
            this.f20579a.mo50392b((Exception) rzy.m34725a(status));
        } else {
            rpc.m34201a(status, this.f20579a);
        }
    }
}
