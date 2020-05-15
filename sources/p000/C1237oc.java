package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: oc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1237oc implements Collection {

    /* renamed from: a */
    final /* synthetic */ C1238od f26794a;

    public C1237oc(C1238od odVar) {
        this.f26794a = odVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f26794a.mo15504c();
    }

    public final boolean contains(Object obj) {
        return this.f26794a.mo15502b(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f26794a.mo15496a() == 0;
    }

    public final Iterator iterator() {
        return new C1232ny(this.f26794a, 1);
    }

    public final boolean remove(Object obj) {
        int b = this.f26794a.mo15502b(obj);
        if (b < 0) {
            return false;
        }
        this.f26794a.mo15500a(b);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int a = this.f26794a.mo15496a();
        int i = 0;
        boolean z = false;
        while (i < a) {
            if (collection.contains(this.f26794a.mo15498a(i, 1))) {
                this.f26794a.mo15500a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        int a = this.f26794a.mo15496a();
        int i = 0;
        boolean z = false;
        while (i < a) {
            if (!collection.contains(this.f26794a.mo15498a(i, 1))) {
                this.f26794a.mo15500a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.f26794a.mo15496a();
    }

    public final Object[] toArray() {
        return this.f26794a.mo15611b(1);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f26794a.mo15610a(objArr, 1);
    }
}
