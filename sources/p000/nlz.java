package p000;

import android.os.IBinder;

/* renamed from: nlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nlz implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ nma f35998a;

    /* renamed from: b */
    public final nsa f35999b;

    public nlz(nma nma, nsa nsa) {
        this.f35998a = nma;
        this.f35999b = nsa;
    }

    public final void binderDied() {
        this.f35999b.f12819a.unlinkToDeath(this, 0);
        this.f35998a.mo21093a(this);
    }
}
