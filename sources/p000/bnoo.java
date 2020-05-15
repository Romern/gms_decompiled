package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: bnoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnoo extends bniq {

    /* renamed from: c */
    static final bnoo f131929c = new bnoo(bngx.m109376e(), bnnt.f131877a);

    /* renamed from: d */
    final transient bngx f131930d;

    public bnoo(bngx bngx, Comparator comparator) {
        super(comparator);
        this.f131930d = bngx;
    }

    /* renamed from: a */
    public final int mo67630a(Object[] objArr, int i) {
        return this.f131930d.mo67630a(objArr, i);
    }

    /* renamed from: b */
    public final bniq mo67806b(Object obj, boolean z, Object obj2, boolean z2) {
        return mo67810d(obj, z).mo67807c(obj2, z2);
    }

    /* renamed from: c */
    public final int mo67635c() {
        return this.f131930d.mo67635c();
    }

    public final Object ceiling(Object obj) {
        int f = mo68200f(obj, true);
        if (f != size()) {
            return this.f131930d.get(f);
        }
        return null;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f131930d, obj, this.f131676a) >= 0) {
                    return true;
                }
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof bnnn) {
            collection = ((bnnn) collection).mo67323d();
        }
        if (!bnpi.m110066a(((bniq) this).f131676a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        bnrd a = iterator();
        Iterator it = collection.iterator();
        if (a.hasNext()) {
            Object next = it.next();
            Object next2 = a.next();
            while (true) {
                try {
                    int b = mo67804b(next2, next);
                    if (b < 0) {
                        if (!a.hasNext()) {
                            return false;
                        }
                        next2 = a.next();
                    } else if (b != 0) {
                        return false;
                    } else {
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    }
                } catch (ClassCastException | NullPointerException e) {
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final bniq mo67810d(Object obj, boolean z) {
        return mo68197b(mo68200f(obj, z), size());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo68199e(Object obj, boolean z) {
        bngx bngx = this.f131930d;
        bmxy.m108581a(obj);
        int binarySearch = Collections.binarySearch(bngx, obj, ((bniq) this).f131676a);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : binarySearch ^ -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[Catch:{ ClassCastException -> 0x0044, NoSuchElementException -> 0x0042 }] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                if (!bnpi.m110066a(this.f131676a, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    bnrd a = iterator();
                    while (a.hasNext()) {
                        Object next = a.next();
                        Object next2 = it.next();
                        if (next2 == null || mo67804b(next, next2) != 0) {
                            return false;
                        }
                        while (a.hasNext()) {
                        }
                    }
                    return true;
                } catch (ClassCastException e) {
                    return false;
                } catch (NoSuchElementException e2) {
                    return false;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int mo67638f() {
        return this.f131930d.mo67638f();
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f131930d.get(0);
        }
        throw new NoSuchElementException();
    }

    public final Object floor(Object obj) {
        int e = mo68199e(obj, true) - 1;
        if (e != -1) {
            return this.f131930d.get(e);
        }
        return null;
    }

    /* renamed from: g */
    public final bngx mo67639g() {
        return this.f131930d;
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return this.f131930d.mo67640h();
    }

    public final Object higher(Object obj) {
        int f = mo68200f(obj, false);
        if (f != size()) {
            return this.f131930d.get(f);
        }
        return null;
    }

    /* renamed from: k */
    public final bniq mo67819k() {
        Comparator reverseOrder = Collections.reverseOrder(this.f131676a);
        return isEmpty() ? m109554a(reverseOrder) : new bnoo(this.f131930d.mo67670d(), reverseOrder);
    }

    /* renamed from: l */
    public final bnrd descendingIterator() {
        return this.f131930d.mo67670d().listIterator();
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f131930d.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public final Object lower(Object obj) {
        int e = mo68199e(obj, false) - 1;
        if (e != -1) {
            return this.f131930d.get(e);
        }
        return null;
    }

    public final int size() {
        return this.f131930d.size();
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return this.f131930d.listIterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bnoo mo68197b(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new bnoo(this.f131930d.subList(i, i2), this.f131676a);
        }
        return m109554a(this.f131676a);
    }

    /* renamed from: c */
    public final bniq mo67807c(Object obj, boolean z) {
        return mo68197b(0, mo68199e(obj, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo68200f(Object obj, boolean z) {
        bngx bngx = this.f131930d;
        bmxy.m108581a(obj);
        int binarySearch = Collections.binarySearch(bngx, obj, ((bniq) this).f131676a);
        if (binarySearch >= 0) {
            return !z ? binarySearch + 1 : binarySearch;
        }
        return binarySearch ^ -1;
    }

    /* renamed from: b */
    public final Object[] mo67634b() {
        return this.f131930d.mo67634b();
    }
}
