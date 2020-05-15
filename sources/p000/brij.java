package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: brij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brij extends rns {

    /* renamed from: a */
    final /* synthetic */ aucf f142868a;

    /* renamed from: b */
    final /* synthetic */ brik f142869b;

    public brij(brik brik, aucf aucf) {
        this.f142869b = brik;
        this.f142868a = aucf;
    }

    /* renamed from: a */
    public final void mo11797a(Status status) {
        if (!this.f142868a.mo50393b((Object) null)) {
            return;
        }
        if (status.mo17710c()) {
            this.f142869b.f142870a.f142872b.mo50391a((Object) null);
        } else {
            this.f142869b.f142870a.f142872b.mo50390a((Exception) brjg.m114101a(status, "Indexing error, please try again."));
        }
    }
}
