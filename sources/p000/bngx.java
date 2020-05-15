package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bngx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bngx extends bngm implements List, RandomAccess {

    /* renamed from: a */
    private static final bnre f131612a = new bngt(bnoe.f131899a, 0);

    /* renamed from: a */
    public static bngx m109355a(Iterable iterable) {
        bmxy.m108581a(iterable);
        if (iterable instanceof Collection) {
            return m109368a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return bnoe.f131899a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m109356a(next);
        }
        bngs bngs = new bngs();
        bngs.mo67668c(next);
        bngs.mo67665a(it);
        return bngs.mo67664a();
    }

    /* renamed from: b */
    public static bngs m109371b(int i) {
        bndz.m109113a(i, "expectedSize");
        return new bngs(i);
    }

    /* renamed from: c */
    private static bngx m109375c(Object... objArr) {
        bnnw.m109885a(objArr);
        return m109373b(objArr);
    }

    /* renamed from: e */
    public static bngx m109376e() {
        return bnoe.f131899a;
    }

    /* renamed from: j */
    public static bngs m109377j() {
        return new bngs();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: d */
    public bngx mo67670d() {
        return size() > 1 ? new bngu(this) : this;
    }

    public final boolean equals(Object obj) {
        return bnkn.m109669a(this, obj);
    }

    /* renamed from: g */
    public final bngx mo67639g() {
        return this;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final bnre listIterator() {
        return listIterator(0);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bngv(toArray());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
     arg types: [java.lang.Iterable, java.lang.Comparable[]]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[] */
    /* renamed from: b */
    public static bngx m109372b(Iterable iterable) {
        Comparable[] comparableArr = (Comparable[]) bnjd.m109585a(iterable, (Object[]) new Comparable[0]);
        bnnw.m109885a((Object[]) comparableArr);
        Arrays.sort(comparableArr);
        return m109373b(comparableArr);
    }

    /* renamed from: b */
    static bngx m109373b(Object[] objArr) {
        return m109374b(objArr, objArr.length);
    }

    /* renamed from: b */
    static bngx m109374b(Object[] objArr, int i) {
        if (i != 0) {
            return new bnoe(objArr, i);
        }
        return bnoe.f131899a;
    }

    /* renamed from: a */
    public static bngx m109356a(Object obj) {
        return m109375c(obj);
    }

    /* renamed from: a */
    public static bngx m109357a(Object obj, Object obj2) {
        return m109375c(obj, obj2);
    }

    /* renamed from: a */
    public static bngx m109358a(Object obj, Object obj2, Object obj3) {
        return m109375c(obj, obj2, obj3);
    }

    /* renamed from: a */
    public static bngx m109359a(Object obj, Object obj2, Object obj3, Object obj4) {
        return m109375c(obj, obj2, obj3, obj4);
    }

    /* renamed from: a */
    public static bngx m109360a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m109375c(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: a */
    public static bngx m109361a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m109375c(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* renamed from: a */
    public static bngx m109362a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m109375c(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* renamed from: a */
    public static bngx m109363a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return m109375c(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    /* renamed from: a */
    public static bngx m109364a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return m109375c(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    /* renamed from: a */
    public static bngx m109365a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return m109375c(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    /* renamed from: a */
    public static bngx m109366a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return m109375c(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    @SafeVarargs
    /* renamed from: a */
    public static bngx m109367a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        bmxy.m108589a(true, (Object) "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[(length + 12)];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return m109375c(objArr2);
    }

    /* renamed from: a */
    public static bngx m109368a(Collection collection) {
        if (!(collection instanceof bngm)) {
            return m109375c(collection.toArray());
        }
        bngx g = ((bngm) collection).mo67639g();
        return g.mo67640h() ? m109373b(g.toArray()) : g;
    }

    /* renamed from: a */
    public static bngx m109369a(Comparator comparator, Iterable iterable) {
        bmxy.m108581a(comparator);
        Object[] c = bnjd.m109593c(iterable);
        bnnw.m109885a(c);
        Arrays.sort(c, comparator);
        return m109373b(c);
    }

    /* renamed from: a */
    public static bngx m109370a(Object[] objArr) {
        if (objArr.length != 0) {
            return m109375c((Object[]) objArr.clone());
        }
        return bnoe.f131899a;
    }

    /* renamed from: a */
    public int mo67630a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: a */
    public bngx subList(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new bngw(this, i, i3);
        }
        return bnoe.f131899a;
    }

    /* renamed from: a */
    public final bnrd mo67631a() {
        return listIterator();
    }

    /* renamed from: a */
    public final bnre listIterator(int i) {
        bmxy.m108599b(i, size());
        return !isEmpty() ? new bngt(this, i) : f131612a;
    }
}
