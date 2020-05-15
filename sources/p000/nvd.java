package p000;

import android.os.IBinder;

/* renamed from: nvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nvd implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final nsw f36585a;

    /* renamed from: b */
    private final nve f36586b;

    public nvd(nsw nsw, nve nve) {
        this.f36585a = nsw;
        this.f36586b = nve;
        nsw.f12819a.linkToDeath(this, 0);
    }

    public final void binderDied() {
        bnsn bnsn = nvk.f36599a;
        this.f36586b.mo21555b(this.f36585a);
    }
}
