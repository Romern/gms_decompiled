package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: cije */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cije extends cija implements cijj {
    protected cije() {
    }

    /* renamed from: a */
    public final int compareTo(List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof cijj) {
            cijk b = listIterator();
            cijk b2 = ((cijj) list).mo86183b();
            while (b.hasNext() && b2.hasNext()) {
                long a = b.mo86151a();
                long a2 = b2.mo86151a();
                int i = (a > a2 ? 1 : (a == a2 ? 0 : -1));
                if (a != a2) {
                    return i;
                }
            }
            if (!b2.hasNext()) {
                return !b.hasNext() ? 0 : 1;
            }
            return -1;
        }
        cijk b3 = listIterator();
        ListIterator listIterator = list.listIterator();
        while (b3.hasNext() && listIterator.hasNext()) {
            int compareTo = ((Comparable) b3.next()).compareTo(listIterator.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (!listIterator.hasNext()) {
            return !b3.hasNext() ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: a */
    public void mo86164a(int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public void mo86165a(int i, long j) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo86143a(long j) {
        throw null;
    }

    public boolean addAll(int i, Collection collection) {
        mo86187d(i);
        Iterator it = collection.iterator();
        boolean hasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, (Long) it.next());
            i++;
        }
        return hasNext;
    }

    /* renamed from: b */
    public long mo86168b(int i) {
        throw null;
    }

    /* renamed from: b */
    public long mo86169b(int i, long j) {
        throw null;
    }

    /* renamed from: c */
    public cijk listIterator(int i) {
        throw null;
    }

    public void clear() {
        mo86164a(0, size());
    }

    /* renamed from: d */
    public int mo86186d(long j) {
        cijk b = listIterator();
        while (b.hasNext()) {
            if (j == b.mo86151a()) {
                return b.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    public int mo86188e(long j) {
        cijk c = listIterator(size());
        while (c.hasPrevious()) {
            if (j == c.mo86154b()) {
                return c.nextIndex();
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof cijj) {
                    cijk b = listIterator();
                    cijk b2 = ((cijj) list).mo86183b();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (b.mo86151a() != b2.mo86151a()) {
                            return false;
                        }
                        size = i;
                    }
                } else {
                    cijk b3 = listIterator();
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        Object next = b3.next();
                        Object next2 = listIterator.next();
                        if (next == null) {
                            if (next2 != null) {
                                break;
                            }
                        } else if (!next.equals(next2)) {
                            break;
                        }
                        size = i2;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public final Long get(int i) {
        return Long.valueOf(mo86163a(i));
    }

    @Deprecated
    /* renamed from: g */
    public final Long remove(int i) {
        return Long.valueOf(mo86168b(i));
    }

    @Deprecated
    public final int indexOf(Object obj) {
        return mo86186d(((Long) obj).longValue());
    }

    @Deprecated
    public final int lastIndexOf(Object obj) {
        return mo86188e(((Long) obj).longValue());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        cijk b = listIterator();
        int size = size();
        sb.append("[");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(b.mo86151a()));
                z = false;
                size = i;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final int hashCode() {
        cijk b = listIterator();
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            long a = b.mo86151a();
            i = (i * 31) + ((int) (a ^ (a >>> 32)));
            size = i2;
        }
    }

    /* renamed from: b */
    public cijj subList(int i, int i2) {
        mo86187d(i);
        mo86187d(i2);
        if (i <= i2) {
            return new cijd(this, i, i2);
        }
        throw new IndexOutOfBoundsException("Start index (" + i + ") is greater than end index (" + i2 + ")");
    }

    /* renamed from: d */
    public final void mo86187d(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is negative");
        } else if (i > size()) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than list size (" + size() + ")");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo86189e(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is negative");
        } else if (i >= size()) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + size() + ")");
        }
    }

    /* renamed from: b */
    public final cijk listIterator() {
        return listIterator(0);
    }

    @Deprecated
    /* renamed from: b */
    public final Long set(int i, Long l) {
        return Long.valueOf(mo86169b(i, l.longValue()));
    }

    /* renamed from: b */
    public final boolean mo86145b(long j) {
        return mo86186d(j) >= 0;
    }

    @Deprecated
    /* renamed from: a */
    public final void add(int i, Long l) {
        mo86165a(i, l.longValue());
    }
}
