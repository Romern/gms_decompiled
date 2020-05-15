package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: bnpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnpf {
    /* renamed from: a */
    static int m110044a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: b */
    public static bnpd m110055b(Set set, Set set2) {
        bmxy.m108582a(set, "set1");
        bmxy.m108582a(set2, "set2");
        return new bnox(set, set2);
    }

    /* renamed from: c */
    public static bnpd m110057c(Set set, Set set2) {
        bmxy.m108582a(set, "set1");
        bmxy.m108582a(set2, "set2");
        return new bnoz(set, set2);
    }

    /* renamed from: d */
    public static Set m110059d() {
        return Collections.newSetFromMap(bnmt.m109812e());
    }

    /* renamed from: e */
    public static CopyOnWriteArraySet m110060e() {
        return new CopyOnWriteArraySet();
    }

    /* renamed from: a */
    public static bnic m110045a(Enum enumR, Enum... enumArr) {
        return bngr.m109334a(EnumSet.of(enumR, enumArr));
    }

    /* renamed from: a */
    public static bnpd m110046a(Set set, Set set2) {
        bmxy.m108582a(set, "set1");
        bmxy.m108582a(set2, "set2");
        return new bnov(set, set2);
    }

    /* renamed from: b */
    public static Set m110056b() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: c */
    public static LinkedHashSet m110058c() {
        return new LinkedHashSet();
    }

    /* renamed from: a */
    public static HashSet m110047a() {
        return new HashSet();
    }

    /* renamed from: a */
    public static HashSet m110048a(int i) {
        return new HashSet(bnmt.m109801b(i));
    }

    /* renamed from: a */
    public static HashSet m110049a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        HashSet a = m110047a();
        bnjr.m109612a(a, it);
        return a;
    }

    /* renamed from: a */
    public static HashSet m110050a(Object... objArr) {
        HashSet a = m110048a(objArr.length);
        Collections.addAll(a, objArr);
        return a;
    }

    /* renamed from: a */
    public static NavigableSet m110051a(NavigableSet navigableSet) {
        return ((navigableSet instanceof bngm) || (navigableSet instanceof bnpe)) ? navigableSet : new bnpe(navigableSet);
    }

    /* renamed from: a */
    static boolean m110052a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException e) {
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m110053a(Set set, Collection collection) {
        bmxy.m108581a(collection);
        if (collection instanceof bnnn) {
            collection = ((bnnn) collection).mo67323d();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m110054a(set, collection.iterator());
        }
        return bnjr.m109615a(set.iterator(), collection);
    }

    /* renamed from: a */
    static boolean m110054a(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
