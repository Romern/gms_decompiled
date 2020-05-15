package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/* renamed from: bnjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjp extends bnrd {

    /* renamed from: a */
    final Queue f131716a;

    public bnjp(Iterable iterable, Comparator comparator) {
        this.f131716a = new PriorityQueue(2, new bnjo(comparator));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Iterator it2 = (Iterator) it.next();
            if (it2.hasNext()) {
                this.f131716a.add(bnjr.m109626h(it2));
            }
        }
    }

    public final boolean hasNext() {
        return !this.f131716a.isEmpty();
    }

    public final Object next() {
        bnjq bnjq = (bnjq) this.f131716a.remove();
        Object next = bnjq.next();
        if (bnjq.hasNext()) {
            this.f131716a.add(bnjq);
        }
        return next;
    }
}
