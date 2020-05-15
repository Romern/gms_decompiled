package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: axsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axsy implements rlf {

    /* renamed from: a */
    final aucf f96309a;

    public axsy(aucf aucf) {
        this.f96309a = aucf;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
        this.f96309a.mo50390a((Exception) new rjp(status));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        Status status = (Status) obj;
        int i = status.f30115i;
        if (i == 0) {
            this.f96309a.mo50391a((Object) true);
        } else if (i == 4002) {
            this.f96309a.mo50391a((Object) false);
        } else {
            mo9481a(status);
        }
    }
}
