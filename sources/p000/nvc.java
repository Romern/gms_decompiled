package p000;

import android.os.IBinder;

/* renamed from: nvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nvc implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final nrq f36583a;

    /* renamed from: b */
    private final nve f36584b;

    public nvc(nrq nrq, nve nve) {
        this.f36583a = nrq;
        this.f36584b = nve;
        nrq.f12819a.linkToDeath(this, 0);
    }

    public final void binderDied() {
        bnsn bnsn = nvk.f36599a;
        this.f36584b.mo21554b(this.f36583a);
    }
}
