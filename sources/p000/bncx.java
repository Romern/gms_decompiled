package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: bncx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bncx extends AbstractCollection {

    /* renamed from: a */
    final Object f131467a;

    /* renamed from: b */
    Collection f131468b;

    /* renamed from: c */
    final bncx f131469c;

    /* renamed from: d */
    final Collection f131470d;

    /* renamed from: e */
    final /* synthetic */ bndd f131471e;

    public bncx(bndd bndd, Object obj, Collection collection, bncx bncx) {
        this.f131471e = bndd;
        this.f131467a = obj;
        this.f131468b = collection;
        this.f131469c = bncx;
        this.f131470d = bncx != null ? bncx.f131468b : null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67214a() {
        Collection collection;
        bncx bncx = this.f131469c;
        if (bncx != null) {
            bncx.mo67214a();
            if (this.f131469c.f131468b != this.f131470d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f131468b.isEmpty() && (collection = (Collection) this.f131471e.f131477a.get(this.f131467a)) != null) {
            this.f131468b = collection;
        }
    }

    public final boolean add(Object obj) {
        mo67214a();
        boolean isEmpty = this.f131468b.isEmpty();
        boolean add = this.f131468b.add(obj);
        if (!add) {
            return add;
        }
        bndd.m109026a(this.f131471e);
        if (!isEmpty) {
            return add;
        }
        mo67218c();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f131468b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        bndd.m109027a(this.f131471e, this.f131468b.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo67218c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo67217b() {
        bncx bncx = this.f131469c;
        if (bncx != null) {
            bncx.mo67217b();
        } else if (this.f131468b.isEmpty()) {
            this.f131471e.f131477a.remove(this.f131467a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo67218c() {
        bncx bncx = this.f131469c;
        if (bncx == null) {
            this.f131471e.f131477a.put(this.f131467a, this.f131468b);
        } else {
            bncx.mo67218c();
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f131468b.clear();
            bndd.m109029b(this.f131471e, size);
            mo67217b();
        }
    }

    public final boolean contains(Object obj) {
        mo67214a();
        return this.f131468b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        mo67214a();
        return this.f131468b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        mo67214a();
        return this.f131468b.equals(obj);
    }

    public final int hashCode() {
        mo67214a();
        return this.f131468b.hashCode();
    }

    public final Iterator iterator() {
        mo67214a();
        return new bncw(this);
    }

    public final boolean remove(Object obj) {
        mo67214a();
        boolean remove = this.f131468b.remove(obj);
        if (remove) {
            bndd.m109028b(this.f131471e);
            mo67217b();
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f131468b.removeAll(collection);
        if (removeAll) {
            bndd.m109027a(this.f131471e, this.f131468b.size() - size);
            mo67217b();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        bmxy.m108581a(collection);
        int size = size();
        boolean retainAll = this.f131468b.retainAll(collection);
        if (retainAll) {
            bndd.m109027a(this.f131471e, this.f131468b.size() - size);
            mo67217b();
        }
        return retainAll;
    }

    public final int size() {
        mo67214a();
        return this.f131468b.size();
    }

    public final String toString() {
        mo67214a();
        return this.f131468b.toString();
    }
}
