package p000;

/* renamed from: aubu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aucb f91374a;

    /* renamed from: b */
    final /* synthetic */ aubv f91375b;

    public aubu(aubv aubv, aucb aucb) {
        this.f91375b = aubv;
        this.f91374a = aucb;
    }

    public final void run() {
        synchronized (this.f91375b.f91376a) {
            aubw aubw = this.f91375b.f91377b;
            if (aubw != null) {
                aubw.mo10462a(this.f91374a.mo50386d());
            }
        }
    }
}
