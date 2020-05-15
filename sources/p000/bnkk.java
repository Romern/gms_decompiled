package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: bnkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnkk extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final List f131764a;

    /* renamed from: b */
    final bmxj f131765b;

    public bnkk(List list, bmxj bmxj) {
        bmxy.m108581a(list);
        this.f131764a = list;
        bmxy.m108581a(bmxj);
        this.f131765b = bmxj;
    }

    public final void clear() {
        this.f131764a.clear();
    }

    public final Object get(int i) {
        return this.f131765b.apply(this.f131764a.get(i));
    }

    public final boolean isEmpty() {
        return this.f131764a.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new bnkj(this, this.f131764a.listIterator(i));
    }

    public final Object remove(int i) {
        return this.f131765b.apply(this.f131764a.remove(i));
    }

    public final int size() {
        return this.f131764a.size();
    }
}
