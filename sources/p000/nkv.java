package p000;

import android.os.IBinder;

/* renamed from: nkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nkv implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ nkw f35920a;

    /* renamed from: b */
    public final nrj f35921b;

    public nkv(nkw nkw, nrj nrj) {
        this.f35920a = nkw;
        this.f35921b = nrj;
    }

    public final void binderDied() {
        bnsi d = nkw.f35922a.mo68390d();
        d.mo68432a("nkv", "binderDied", 863, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("binderDied");
        synchronized (this.f35920a.f35923b) {
            this.f35920a.mo21000a(this);
        }
    }
}
