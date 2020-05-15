package p000;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: bemt */
final /* synthetic */ class bemt implements Runnable {

    /* renamed from: a */
    private final bend f111841a;

    public bemt(bend bend) {
        this.f111841a = bend;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        ((android.database.sqlite.SQLiteDatabase) p000.bqga.m112780a((java.util.concurrent.Future) r2)).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r2.cancel(true) != false) goto L_0x0023;
     */
    public final void run() {
        bend bend = this.f111841a;
        synchronized (bend.f111857k) {
            bqgg bqgg = bend.f111859m;
            if (bend.f111860n == 0 && bqgg != null) {
                bend.f111859m = null;
            } else {
                return;
            }
        }
        bend.f111848b.unregisterComponentCallbacks(bend);
        Iterator it = bend.f111856j.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == null) {
                it.remove();
            }
        }
    }
}
