package p000;

import android.os.IBinder;

/* renamed from: nmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nmf implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ nmg f36020a;

    /* renamed from: b */
    public final nsj f36021b;

    public nmf(nmg nmg, nsj nsj) {
        this.f36020a = nmg;
        this.f36021b = nsj;
    }

    public final void binderDied() {
        int i = nmg.f36022f;
        synchronized (this.f36020a.f36025b) {
            this.f36020a.f36025b.remove(this);
        }
        this.f36021b.f12819a.unlinkToDeath(this, 0);
    }
}
