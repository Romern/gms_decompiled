package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: ahec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahec implements rlf {

    /* renamed from: a */
    final /* synthetic */ aucf f67072a;

    public ahec(aucf aucf) {
        this.f67072a = aucf;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
        mo9482a(status);
    }

    /* renamed from: b */
    public final void mo9482a(Status status) {
        if (status.mo17710c()) {
            this.f67072a.mo50391a((Object) true);
        } else {
            this.f67072a.mo50390a((Exception) new rjp(status));
        }
    }
}
