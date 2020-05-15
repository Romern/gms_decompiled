package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bqya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqya {

    /* renamed from: a */
    private final ConcurrentHashMap f141931a = new ConcurrentHashMap(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue f141932b = new ReferenceQueue();

    /* renamed from: a */
    public final List mo69465a(Throwable th, boolean z) {
        ReferenceQueue referenceQueue = this.f141932b;
        while (true) {
            Reference poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.f141931a.remove(poll);
            referenceQueue = this.f141932b;
        }
        List list = (List) this.f141931a.get(new bqxz(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.f141931a.putIfAbsent(new bqxz(th, this.f141932b), vector);
        return list2 == null ? vector : list2;
    }
}
