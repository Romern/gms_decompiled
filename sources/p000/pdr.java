package p000;

/* renamed from: pdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pdr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ pdz f38882a;

    public pdr(pdz pdz) {
        this.f38882a = pdz;
    }

    public final void run() {
        pdz pdz = this.f38882a;
        bnsn bnsn = pdz.f38896a;
        pdz.f38912P.mo22596a();
        synchronized (this.f38882a.f38925b) {
            if (!dcm.CONNECTED_BT.equals(this.f38882a.f38927d)) {
                bnsi b = pdz.f38896a.mo68387b();
                b.mo68432a("pdr", "run", 253, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Service already destroyed");
                return;
            }
            this.f38882a.f38948y.post(new pdq(this));
        }
    }
}
