package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: ajts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajts extends rns {

    /* renamed from: a */
    final /* synthetic */ aucf f71274a;

    public ajts(aucf aucf) {
        this.f71274a = aucf;
    }

    /* renamed from: a */
    public final void mo11797a(Status status) {
        if (status.mo17710c()) {
            this.f71274a.mo50391a((Object) true);
        } else {
            this.f71274a.mo50390a((Exception) new rjp(status));
        }
    }
}
