package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: qcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qcm extends rns {

    /* renamed from: a */
    private final aucf f40925a;

    public qcm(aucf aucf) {
        this.f40925a = aucf;
    }

    /* renamed from: a */
    public final void mo11797a(Status status) {
        if (rjs.m33681g(status.f30115i)) {
            this.f40925a.mo50390a((Exception) new rjp(status));
        } else {
            this.f40925a.mo50391a(Boolean.valueOf(rjs.m33680f(status.f30115i)));
        }
    }
}
