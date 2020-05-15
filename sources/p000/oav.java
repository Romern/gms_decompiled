package p000;

/* renamed from: oav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oav implements Runnable {

    /* renamed from: a */
    final /* synthetic */ oaw f37100a;

    public oav(oaw oaw) {
        this.f37100a = oaw;
    }

    public final void run() {
        while (true) {
            try {
                oaw oaw = this.f37100a;
                bnsn bnsn = oaw.f37101a;
                if (oaw.f37103c.remainingCapacity() == 0) {
                    bnsi c = oaw.f37101a.mo68388c();
                    c.mo68432a("oav", "run", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Request buffer reaches full capacity, flush to dumpMessageBuffer");
                    synchronized (this.f37100a.f37102b) {
                        this.f37100a.f37104d.clear();
                        oaw oaw2 = this.f37100a;
                        oaw2.f37103c.drainTo(oaw2.f37104d);
                    }
                }
                oay oay = (oay) this.f37100a.f37103c.take();
                synchronized (this.f37100a.f37102b) {
                    this.f37100a.f37104d.offer(oay);
                }
            } catch (InterruptedException e) {
                bnsi c2 = oaw.f37101a.mo68388c();
                c2.mo68432a("oav", "run", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68405a("GAL Snoop worker thread has been interrupted");
                return;
            }
        }
    }
}
