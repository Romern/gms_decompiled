package p000;

/* renamed from: aubl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aubm f91360a;

    public aubl(aubm aubm) {
        this.f91360a = aubm;
    }

    public final void run() {
        synchronized (this.f91360a.f91361a) {
            aubn aubn = this.f91360a.f91362b;
            if (aubn != null) {
                aubn.mo13386b();
            }
        }
    }
}
