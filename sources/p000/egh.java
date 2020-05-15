package p000;

import java.util.Set;

/* renamed from: egh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class egh implements Runnable {

    /* renamed from: a */
    private final Set f14858a;

    /* renamed from: b */
    private final egg f14859b;

    public egh(Set set, egg egg) {
        this.f14858a = set;
        this.f14859b = egg;
    }

    public final void run() {
        for (Object obj : this.f14858a) {
            this.f14859b.mo9567a(obj);
        }
    }
}
