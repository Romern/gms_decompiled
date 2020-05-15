package p000;

import java.util.Iterator;

/* renamed from: bnqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnqn implements Iterator {

    /* renamed from: b */
    final Iterator f131993b;

    public bnqn(Iterator it) {
        bmxy.m108581a(it);
        this.f131993b = it;
    }

    /* renamed from: a */
    public abstract Object mo67847a(Object obj);

    public final boolean hasNext() {
        return this.f131993b.hasNext();
    }

    public final Object next() {
        return mo67847a(this.f131993b.next());
    }

    public final void remove() {
        this.f131993b.remove();
    }
}
