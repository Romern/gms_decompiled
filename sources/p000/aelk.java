package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: aelk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aelk extends rns {

    /* renamed from: a */
    final /* synthetic */ aucf f63492a;

    public aelk(aucf aucf) {
        this.f63492a = aucf;
    }

    /* renamed from: a */
    public final void mo11797a(Status status) {
        int i = status.f30115i;
        if (i == 9201) {
            this.f63492a.mo50391a((Object) true);
        } else if (i == 9202) {
            this.f63492a.mo50391a((Object) false);
        } else {
            this.f63492a.mo50390a((Exception) rzy.m34725a(status));
        }
    }
}
