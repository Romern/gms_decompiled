package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: bnjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnjd {
    /* renamed from: a */
    static bmxj m109573a() {
        return new bniu();
    }

    /* renamed from: b */
    public static Iterable m109586b(Iterable iterable, bmxz bmxz) {
        bmxy.m108581a(iterable);
        bmxy.m108581a(bmxz);
        return new bniw(iterable, bmxz);
    }

    /* renamed from: c */
    public static Iterable m109590c(Iterable iterable, int i) {
        boolean z;
        bmxy.m108581a(iterable);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "number to skip cannot be negative");
        return new bniz(iterable, i);
    }

    /* renamed from: d */
    public static Iterable m109594d(Iterable iterable, int i) {
        bmxy.m108581a(iterable);
        bmxy.m108589a(i >= 0, "limit is negative");
        return new bnja(iterable, i);
    }

    /* renamed from: e */
    public static Object m109597e(Iterable iterable, bmxz bmxz) {
        Iterator it = iterable.iterator();
        bmxy.m108581a(it);
        bmxy.m108581a(bmxz);
        while (it.hasNext()) {
            Object next = it.next();
            if (bmxz.mo6527a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: f */
    public static bmxv m109599f(Iterable iterable, bmxz bmxz) {
        Iterator it = iterable.iterator();
        bmxy.m108581a(it);
        bmxy.m108581a(bmxz);
        while (it.hasNext()) {
            Object next = it.next();
            if (bmxz.mo6527a(next)) {
                return bmxv.m108566b(next);
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: g */
    public static int m109601g(Iterable iterable, bmxz bmxz) {
        return bnjr.m109619c(iterable.iterator(), bmxz);
    }

    /* renamed from: h */
    public static Object m109602h(Iterable iterable, bmxz bmxz) {
        Iterator it = iterable.iterator();
        bmxy.m108581a(it);
        bmxy.m108581a(bmxz);
        while (it.hasNext()) {
            Object next = it.next();
            if (bmxz.mo6527a(next)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Iterable m109574a(Iterable iterable, int i) {
        bmxy.m108581a(iterable);
        bmxy.m108588a(i > 0);
        return new bniv(iterable, i);
    }

    /* renamed from: b */
    public static Object m109587b(Iterable iterable) {
        return bnjr.m109620c(iterable.iterator());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    public static Object m109595d(Iterable r1) {
        if (!(r1 instanceof List)) {
            return bnjr.m109623e(r1.iterator());
        }
        if (!r1.isEmpty()) {
            return m109577a((List) r1);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public static Iterable m109575a(Iterable iterable, bmxj bmxj) {
        bmxy.m108581a(iterable);
        bmxy.m108581a(bmxj);
        return new bnix(iterable, bmxj);
    }

    /* renamed from: b */
    public static Object m109588b(Iterable iterable, int i) {
        bmxy.m108581a(iterable);
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        Iterator it = iterable.iterator();
        bnjr.m109611a(i);
        int a = bnjr.m109607a(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        StringBuilder sb = new StringBuilder(91);
        sb.append("position (");
        sb.append(i);
        sb.append(") must be less than the number of elements that remained (");
        sb.append(a);
        sb.append(")");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public static Object m109591c(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return m109577a((List) iterable);
            }
        }
        return bnjr.m109621c(iterable.iterator(), obj);
    }

    /* renamed from: f */
    private static Collection m109600f(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : bnkn.m109664a(iterable.iterator());
    }

    /* renamed from: a */
    public static Iterable m109576a(Iterable iterable, Comparator comparator) {
        bmxy.m108582a(iterable, "iterables");
        bmxy.m108582a(comparator, "comparator");
        return new bnjc(new bnjb(iterable, comparator));
    }

    /* renamed from: e */
    public static boolean m109598e(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    /* renamed from: a */
    private static Object m109577a(List list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: b */
    public static Object m109589b(Iterable iterable, Object obj) {
        return bnjr.m109618b(iterable.iterator(), obj);
    }

    /* renamed from: d */
    public static boolean m109596d(Iterable iterable, bmxz bmxz) {
        bmxy.m108581a(bmxz);
        for (Object obj : iterable) {
            if (!bmxz.mo6527a(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m109578a(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(obj);
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m109592c(Iterable iterable, bmxz bmxz) {
        return bnjr.m109619c(iterable.iterator(), bmxz) != -1;
    }

    /* renamed from: c */
    static Object[] m109593c(Iterable iterable) {
        return m109600f(iterable).toArray();
    }

    /* renamed from: a */
    private static void m109579a(List list, bmxz bmxz, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (bmxz.mo6527a(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static boolean m109580a(Iterable r1, bmxz bmxz) {
        if (!(r1 instanceof RandomAccess) || !(r1 instanceof List)) {
            return bnjr.m109613a(r1.iterator(), bmxz);
        }
        bmxy.m108581a(bmxz);
        return m109583a((List) r1, bmxz);
    }

    /* renamed from: a */
    public static boolean m109581a(Iterable iterable, Object obj) {
        return bnjr.m109614a(iterable.iterator(), obj);
    }

    /* renamed from: a */
    public static boolean m109582a(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        bmxy.m108581a(iterable);
        return bnjr.m109612a(collection, iterable.iterator());
    }

    /* renamed from: a */
    private static boolean m109583a(List list, bmxz bmxz) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!bmxz.mo6527a(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException e) {
                        m109579a(list, bmxz, i2, i);
                        return true;
                    } catch (IllegalArgumentException e2) {
                        m109579a(list, bmxz, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    /* renamed from: a */
    public static Object[] m109584a(Iterable iterable, Class cls) {
        return m109585a(iterable, bnnw.m109887a(cls, 0));
    }

    /* renamed from: a */
    static Object[] m109585a(Iterable iterable, Object[] objArr) {
        return m109600f(iterable).toArray(objArr);
    }
}
