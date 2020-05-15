package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: qcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qcn extends rns {

    /* renamed from: a */
    private final aucf f40926a;

    public qcn(aucf aucf) {
        this.f40926a = aucf;
    }

    /* renamed from: a */
    public final void mo11797a(Status status) {
        if (rjs.m33681g(status.f30115i)) {
            this.f40926a.mo50390a((Exception) new rjp(status));
        } else {
            this.f40926a.mo50391a(Integer.valueOf(status.f30115i));
        }
    }
}
