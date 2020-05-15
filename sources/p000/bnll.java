package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: bnll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnll extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ bnlw f131810a;

    public bnll(bnlw bnlw) {
        this.f131810a = bnlw;
    }

    public final void clear() {
        this.f131810a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f131810a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f131810a.isEmpty();
    }

    public final Iterator iterator() {
        return new bnlk(this.f131810a);
    }

    public final int size() {
        return this.f131810a.size();
    }

    public final Object[] toArray() {
        return bnlw.m109764a((Collection) this).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return bnlw.m109764a((Collection) this).toArray(objArr);
    }
}
