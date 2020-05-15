package p000;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: bvby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvby implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bvch f155572a;

    public bvby(bvch bvch) {
        this.f155572a = bvch;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        r0.add(r2.f155579a);
     */
    public final void run() {
        bvcg bvcg;
        HashSet hashSet = new HashSet(this.f155572a.f155593f);
        Iterator it = this.f155572a.f155592e.iterator();
        while (it.hasNext()) {
            bvcg bvcg2 = (bvcg) it.next();
            Iterator it2 = hashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    it.remove();
                    bvcg2.run();
                    break;
                }
                bvcd bvcd = (bvcd) it2.next();
                if (bvcg2.mo73303a(bvcd)) {
                    continue;
                    break;
                }
                bvch bvch = bvcg2.f155582d;
                synchronized (bvch.f155590c) {
                    bvcg = (bvcg) bvch.f155590c.get(bvcd);
                }
                if (bvcg != null && bvcg.mo73303a(bvcd)) {
                    break;
                }
            }
            while (true) {
            }
        }
    }
}
