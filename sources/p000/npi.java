package p000;

import android.os.IBinder;

/* renamed from: npi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class npi implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ npj f36306a;

    /* renamed from: b */
    final nsv f36307b;

    public npi(npj npj, nsv nsv) {
        this.f36306a = npj;
        this.f36307b = nsv;
        nsv.f12819a.linkToDeath(this, 0);
    }

    public final void binderDied() {
        npj npj = this.f36306a;
        int i = npj.f36308h;
        npj.mo21410b();
        this.f36306a.mo21415d();
    }
}
