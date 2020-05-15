package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: bnjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnjr {
    /* renamed from: a */
    public static int m109607a(Iterator it, int i) {
        boolean z;
        bmxy.m108581a(it);
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* renamed from: b */
    public static int m109616b(Iterator it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return bqcn.m112585b(j);
    }

    /* renamed from: c */
    public static int m109619c(Iterator it, bmxz bmxz) {
        bmxy.m108582a(bmxz, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (bmxz.mo6527a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: d */
    public static Iterator m109622d(Iterator it) {
        return new bnjm(it);
    }

    /* renamed from: e */
    public static Object m109623e(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: f */
    static Object m109624f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: g */
    static void m109625g(Iterator it) {
        bmxy.m108581a(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: h */
    public static bnjq m109626h(Iterator it) {
        if (it instanceof bnjq) {
            return (bnjq) it;
        }
        return new bnjq(it);
    }

    /* renamed from: c */
    public static Object m109620c(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static bnrd m109608a(Iterator it) {
        bmxy.m108581a(it);
        if (it instanceof bnrd) {
            return (bnrd) it;
        }
        return new bnje(it);
    }

    /* renamed from: b */
    public static bnrd m109617b(Iterator it, bmxz bmxz) {
        bmxy.m108581a(it);
        bmxy.m108581a(bmxz);
        return new bnjh(it, bmxz);
    }

    /* renamed from: b */
    public static Object m109618b(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    /* renamed from: a */
    public static Iterator m109609a(Iterator it, bmxj bmxj) {
        bmxy.m108581a(bmxj);
        return new bnji(it, bmxj);
    }

    /* renamed from: a */
    public static Iterator m109610a(Iterator it, Iterator it2) {
        bmxy.m108581a(it);
        bmxy.m108581a(it2);
        return m109622d(new bnjf(new Iterator[]{it, it2}));
    }

    /* renamed from: c */
    public static Object m109621c(Iterator it, Object obj) {
        return it.hasNext() ? m109623e(it) : obj;
    }

    /* renamed from: a */
    public static void m109611a(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("position (");
            sb.append(i);
            sb.append(") must not be negative");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    /* renamed from: a */
    public static boolean m109612a(Collection collection, Iterator it) {
        bmxy.m108581a(collection);
        bmxy.m108581a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m109613a(Iterator it, bmxz bmxz) {
        bmxy.m108581a(bmxz);
        boolean z = false;
        while (it.hasNext()) {
            if (bmxz.mo6527a(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m109614a(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m109615a(Iterator it, Collection collection) {
        bmxy.m108581a(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
