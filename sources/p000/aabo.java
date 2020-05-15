package p000;

import java.util.concurrent.Future;

/* renamed from: aabo */
final /* synthetic */ class aabo implements Runnable {

    /* renamed from: a */
    private final aabp f27888a;

    /* renamed from: b */
    private final bliy f27889b;

    public aabo(aabp aabp, bliy bliy) {
        this.f27888a = aabp;
        this.f27889b = bliy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return;
     */
    public final void run() {
        aabp aabp = this.f27888a;
        bliy bliy = this.f27889b;
        synchronized (aabp.f27891b) {
            bliy bliy2 = aabp.f27892c;
            if (bliy != null) {
                if (bliy != bliy2) {
                    return;
                }
            }
            aabp.f27892c = null;
            Future future = aabp.f27893d;
            if (future != null) {
                future.cancel(false);
                aabp.f27893d = null;
            }
        }
    }
}
