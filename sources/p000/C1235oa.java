package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: oa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1235oa implements Set {

    /* renamed from: a */
    final /* synthetic */ C1238od f26789a;

    public C1235oa(C1238od odVar) {
        this.f26789a = odVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f26789a.mo15504c();
    }

    public final boolean contains(Object obj) {
        return this.f26789a.mo15497a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        Map b = this.f26789a.mo15503b();
        for (Object obj : collection) {
            if (!b.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: od.a(java.util.Set, java.lang.Object):boolean
     arg types: [oa, java.lang.Object]
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
        for (int a = this.f26789a.mo15496a() - 1; a >= 0; a--) {
            Object a2 = this.f26789a.mo15498a(a, 0);
            i += a2 != null ? a2.hashCode() : 0;
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f26789a.mo15496a() == 0;
    }

    public final Iterator iterator() {
        return new C1232ny(this.f26789a, 0);
    }

    public final boolean remove(Object obj) {
        int a = this.f26789a.mo15497a(obj);
        if (a < 0) {
            return false;
        }
        this.f26789a.mo15500a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        return C1238od.m19743a(this.f26789a.mo15503b(), collection);
    }

    public final boolean retainAll(Collection collection) {
        return C1238od.m19745b(this.f26789a.mo15503b(), collection);
    }

    public final int size() {
        return this.f26789a.mo15496a();
    }

    public final Object[] toArray() {
        return this.f26789a.mo15611b(0);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f26789a.mo15610a(objArr, 0);
    }
}
