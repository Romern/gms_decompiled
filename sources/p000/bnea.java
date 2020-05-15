package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: bnea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnea extends AbstractCollection {

    /* renamed from: a */
    final Collection f131504a;

    /* renamed from: b */
    final bmxz f131505b;

    public bnea(Collection collection, bmxz bmxz) {
        this.f131504a = collection;
        this.f131505b = bmxz;
    }

    public final boolean add(Object obj) {
        bmxy.m108588a(this.f131505b.mo6527a(obj));
        return this.f131504a.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            bmxy.m108588a(this.f131505b.mo6527a(obj));
        }
        return this.f131504a.addAll(collection);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.Collection, bmxz]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxz):boolean */
    public final void clear() {
        bnjd.m109580a((Iterable) this.f131504a, this.f131505b);
    }

    public final boolean contains(Object obj) {
        if (bnec.m109118a(this.f131504a, obj)) {
            return this.f131505b.mo6527a(obj);
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnec.a(java.util.Collection, java.util.Collection):boolean
     arg types: [bnea, java.util.Collection]
     candidates:
      bnec.a(java.util.Collection, bmxj):java.util.Collection
      bnec.a(java.util.Collection, bmxz):java.util.Collection
      bnec.a(java.util.Collection, java.lang.Object):boolean
      bnec.a(java.util.Collection, java.util.Collection):boolean */
    public final boolean containsAll(Collection collection) {
        return bnec.m109119a((Collection) this, collection);
    }

    public final boolean isEmpty() {
        return !bnjd.m109592c(this.f131504a, this.f131505b);
    }

    public final Iterator iterator() {
        return bnjr.m109617b(this.f131504a.iterator(), this.f131505b);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.f131504a.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.f131504a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f131505b.mo6527a(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.f131504a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f131505b.mo6527a(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object obj : this.f131504a) {
            if (this.f131505b.mo6527a(obj)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        return bnkn.m109664a(iterator()).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return bnkn.m109664a(iterator()).toArray(objArr);
    }
}
