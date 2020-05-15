package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bnbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnbo extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ bncb f131385a;

    /* renamed from: b */
    private final ConcurrentMap f131386b;

    public bnbo(bncb bncb, ConcurrentMap concurrentMap) {
        this.f131385a = bncb;
        this.f131386b = concurrentMap;
    }

    public final void clear() {
        this.f131386b.clear();
    }

    public final boolean contains(Object obj) {
        return this.f131386b.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f131386b.isEmpty();
    }

    public final Iterator iterator() {
        return new bnbm(this.f131385a);
    }

    public final int size() {
        return this.f131386b.size();
    }

    public final Object[] toArray() {
        return bncb.m108948a((Collection) this).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return bncb.m108948a((Collection) this).toArray(objArr);
    }
}
