package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: bnki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnki extends AbstractList {

    /* renamed from: a */
    public final List f131762a;

    public bnki(List list) {
        bmxy.m108581a(list);
        this.f131762a = list;
    }

    /* renamed from: b */
    private final int m109657b(int i) {
        int size = size();
        bmxy.m108584a(i, size);
        return (size - 1) - i;
    }

    /* renamed from: a */
    public final int mo67916a(int i) {
        int size = size();
        bmxy.m108599b(i, size);
        return size - i;
    }

    public final void add(int i, Object obj) {
        this.f131762a.add(mo67916a(i), obj);
    }

    public final void clear() {
        this.f131762a.clear();
    }

    public final Object get(int i) {
        return this.f131762a.get(m109657b(i));
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new bnkh(this, this.f131762a.listIterator(mo67916a(i)));
    }

    public final Object remove(int i) {
        return this.f131762a.remove(m109657b(i));
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    public final Object set(int i, Object obj) {
        return this.f131762a.set(m109657b(i), obj);
    }

    public final int size() {
        return this.f131762a.size();
    }

    public final List subList(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        return bnkn.m109666a(this.f131762a.subList(mo67916a(i2), mo67916a(i)));
    }
}
