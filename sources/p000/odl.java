package p000;

import android.os.IBinder;

/* renamed from: odl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class odl implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ odm f37274a;

    /* renamed from: b */
    public final nru f37275b;

    public odl(odm odm, nru nru) {
        this.f37274a = odm;
        this.f37275b = nru;
    }

    public final void binderDied() {
        this.f37275b.f12819a.unlinkToDeath(this, 0);
        synchronized (this.f37274a.f37277a) {
            this.f37274a.f37278b = null;
        }
    }
}
