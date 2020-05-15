package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bnah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnah extends AbstractSet {

    /* renamed from: a */
    final ConcurrentMap f131304a;

    public bnah(ConcurrentMap concurrentMap) {
        this.f131304a = concurrentMap;
    }

    public final void clear() {
        this.f131304a.clear();
    }

    public final boolean isEmpty() {
        return this.f131304a.isEmpty();
    }

    public final int size() {
        return this.f131304a.size();
    }

    public final Object[] toArray() {
        return bncb.m108948a((Collection) this).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return bncb.m108948a((Collection) this).toArray(objArr);
    }
}
