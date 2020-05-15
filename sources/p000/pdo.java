package p000;

/* renamed from: pdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pdo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ pdz f38879a;

    public pdo(pdz pdz) {
        this.f38879a = pdz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        return;
     */
    public final void run() {
        pdz pdz = this.f38879a;
        bnsn bnsn = pdz.f38896a;
        pdz.f38912P.mo22596a();
        synchronized (this.f38879a.f38925b) {
            if (!dcm.SHUTDOWN.equals(this.f38879a.f38927d)) {
                this.f38879a.f38927d = dcm.CONNECTED_BT;
                pdz pdz2 = this.f38879a;
                pdz2.mo22948a(pdz2.f38927d);
                pdz pdz3 = this.f38879a;
                if (!pdz3.f38930g) {
                    if (!pdz3.f38939p) {
                        pdz3.mo22957d();
                    }
                }
                bnsi b = pdz.f38896a.mo68387b();
                b.mo68432a("pdo", "run", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Failed to connect with provided wifi credentials");
                this.f38879a.mo22944a(9);
                pdz pdz4 = this.f38879a;
                if (pdz4.f38939p) {
                    pdz4.mo22959f();
                }
            }
        }
    }
}
