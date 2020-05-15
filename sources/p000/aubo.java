package p000;

/* renamed from: aubo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aucb f91364a;

    /* renamed from: b */
    final /* synthetic */ aubp f91365b;

    public aubo(aubp aubp, aucb aucb) {
        this.f91365b = aubp;
        this.f91364a = aucb;
    }

    public final void run() {
        synchronized (this.f91365b.f91366a) {
            aubq aubq = this.f91365b.f91367b;
            if (aubq != null) {
                aubq.mo6378a(this.f91364a);
            }
        }
    }
}
