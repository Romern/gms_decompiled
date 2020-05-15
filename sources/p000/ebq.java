package p000;

/* renamed from: ebq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ebr f14613a;

    public ebq(ebr ebr) {
        this.f14613a = ebr;
    }

    public final void run() {
        ebr ebr = this.f14613a;
        ebr.f14614a.removeGpsStatusListener(ebr);
    }
}
