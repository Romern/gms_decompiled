package p000;

import java.util.concurrent.Executor;

/* renamed from: arqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arqj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arqm f88121a;

    public arqj(arqm arqm) {
        this.f88121a = arqm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        return;
     */
    public final void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        arqm arqm = this.f88121a;
        synchronized (arqm) {
            if (arqm.f88128e) {
                return;
            }
            if (System.currentTimeMillis() - arqm.f88127d > arqm.f88125b) {
                Executor executor = arqm.f88124a;
                if (executor != null) {
                    executor.execute(new arqk(arqm));
                } else {
                    arqm.f88126c.mo48368a();
                }
            } else {
                arqm.mo48753d();
            }
        }
    }
}
