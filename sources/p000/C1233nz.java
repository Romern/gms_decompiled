package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: nz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1233nz implements Set {

    /* renamed from: a */
    final /* synthetic */ C1238od f26788a;

    public C1233nz(C1238od odVar) {
        this.f26788a = odVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        int a = this.f26788a.mo15496a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.f26788a.mo15501a(entry.getKey(), entry.getValue());
        }
        return a != this.f26788a.mo15496a();
    }

    public final void clear() {
        this.f26788a.mo15504c();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int a = this.f26788a.mo15497a(entry.getKey());
            if (a >= 0) {
                return C1229nv.m19716a(this.f26788a.mo15498a(a, 1), entry.getValue());
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: od.a(java.util.Set, java.lang.Object):boolean
     arg types: [nz, java.lang.Object]
     candidates:
      od.a(java.util.Map, java.util.Collection):boolean
      od.a(int, int):java.lang.Object
      od.a(int, java.lang.Object):java.lang.Object
      od.a(java.lang.Object, java.lang.Object):void
      od.a(java.lang.Object[], int):java.lang.Object[]
      od.a(java.util.Set, java.lang.Object):boolean */
    public final boolean equals(Object obj) {
        return C1238od.m19744a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int a = this.f26788a.mo15496a() - 1; a >= 0; a--) {
            Object a2 = this.f26788a.mo15498a(a, 0);
            Object a3 = this.f26788a.mo15498a(a, 1);
            i += (a2 != null ? a2.hashCode() : 0) ^ (a3 != null ? a3.hashCode() : 0);
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f26788a.mo15496a() == 0;
    }

    public final Iterator iterator() {
        return new C1236ob(this.f26788a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f26788a.mo15496a();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
