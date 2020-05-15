package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: axsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axsz implements rlf {

    /* renamed from: a */
    final aucf f96310a;

    public axsz(aucf aucf) {
        this.f96310a = aucf;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
        this.f96310a.mo50390a((Exception) new rjp(status));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        Status status = (Status) obj;
        int i = status.f30115i;
        if (i == 0 || i == 4001) {
            this.f96310a.mo50391a((Object) null);
        } else {
            mo9481a(status);
        }
    }
}
