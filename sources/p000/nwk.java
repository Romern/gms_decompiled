package p000;

/* renamed from: nwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nwk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ nwp f36810a;

    public nwk(nwp nwp) {
        this.f36810a = nwp;
    }

    public final void run() {
        synchronized (nwp.class) {
            if (this.f36810a.f36824f.isEmpty()) {
                this.f36810a.f36821c.quit();
                if (nwp.f36819a == this.f36810a) {
                    nwp.f36819a = null;
                }
            }
        }
    }
}
