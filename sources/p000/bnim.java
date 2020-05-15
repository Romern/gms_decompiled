package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: bnim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnim extends bnin implements NavigableMap {

    /* renamed from: b */
    public static final bnim f131668b = new bnim(bniq.m109554a((Comparator) bnnt.f131877a), bngx.m109376e());

    /* renamed from: e */
    private static final Comparator f131669e = bnnt.f131877a;
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    public final transient bnoo f131670c;

    /* renamed from: d */
    public final transient bngx f131671d;

    /* renamed from: f */
    private transient bnim f131672f;

    public bnim(bnoo bnoo, bngx bngx) {
        this(bnoo, bngx, null);
    }

    /* renamed from: a */
    private final bnim m109532a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i != i2) {
            return new bnim(this.f131670c.mo68197b(i, i2), this.f131671d.subList(i, i2));
        }
        return m109533a(comparator());
    }

    /* renamed from: b */
    public static bnik m109535b() {
        return new bnik(bnnt.f131877a);
    }

    /* renamed from: cR */
    public final bnic mo67697cR() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: cT */
    public final boolean mo67651cT() {
        return this.f131670c.mo67640h() || this.f131671d.mo67640h();
    }

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Object ceilingKey(Object obj) {
        return bnmt.m109802b(ceilingEntry(obj));
    }

    public final Comparator comparator() {
        return ((bniq) this.f131670c).f131676a;
    }

    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.f131670c.descendingSet();
    }

    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        bnim bnim = this.f131672f;
        if (bnim != null) {
            return bnim;
        }
        if (isEmpty()) {
            return m109533a(bnny.m109908a(comparator()).mo67377a());
        }
        return new bnim((bnoo) this.f131670c.descendingSet(), this.f131671d.mo67670d(), this);
    }

    /* renamed from: e */
    public final bngm mo67622e() {
        throw new AssertionError("should never be called");
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    /* renamed from: f */
    public final bngm mo67623f() {
        return this.f131671d;
    }

    public final Map.Entry firstEntry() {
        if (!isEmpty()) {
            return (Map.Entry) entrySet().mo67639g().get(0);
        }
        return null;
    }

    public final Object firstKey() {
        return this.f131670c.first();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnim.a(java.lang.Object, boolean):bnim
     arg types: [java.lang.Object, int]
     candidates:
      bnim.a(int, int):bnim
      bnhe.a(java.lang.Object, java.lang.Object):bnhe
      bnim.a(java.lang.Object, boolean):bnim */
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public final Object floorKey(Object obj) {
        return bnmt.m109802b(floorEntry(obj));
    }

    /* renamed from: g */
    public final bnic mo67698g() {
        if (!isEmpty()) {
            return new bnij(this);
        }
        return bnon.f131923a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r4 >= 0) goto L_0x0012;
     */
    public final Object get(Object obj) {
        int i;
        bnoo bnoo = this.f131670c;
        if (obj != null) {
            try {
                i = Collections.binarySearch(bnoo.f131930d, obj, bnoo.f131676a);
            } catch (ClassCastException e) {
            }
        }
        i = -1;
        if (i != -1) {
            return this.f131671d.get(i);
        }
        return null;
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Object higherKey(Object obj) {
        return bnmt.m109802b(higherEntry(obj));
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ bnic mo67707j() {
        return this.f131670c;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return this.f131670c;
    }

    public final Map.Entry lastEntry() {
        if (!isEmpty()) {
            return (Map.Entry) entrySet().mo67639g().get(size() - 1);
        }
        return null;
    }

    public final Object lastKey() {
        return this.f131670c.last();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnim.a(java.lang.Object, boolean):bnim
     arg types: [java.lang.Object, int]
     candidates:
      bnim.a(int, int):bnim
      bnhe.a(java.lang.Object, java.lang.Object):bnhe
      bnim.a(java.lang.Object, boolean):bnim */
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public final Object lowerKey(Object obj) {
        return bnmt.m109802b(lowerEntry(obj));
    }

    public final /* bridge */ /* synthetic */ NavigableSet navigableKeySet() {
        return this.f131670c;
    }

    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f131671d.size();
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return this.f131671d;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnil(this);
    }

    public bnim(bnoo bnoo, bngx bngx, bnim bnim) {
        this.f131670c = bnoo;
        this.f131671d = bngx;
        this.f131672f = bnim;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
     arg types: [java.util.Set, java.util.Map$Entry[]]
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
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public static bnim m109536b(Map map) {
        boolean z;
        int length;
        bnim bnim;
        Comparator comparator = f131669e;
        int i = 1;
        if (map instanceof SortedMap) {
            Comparator comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                z = comparator.equals(comparator2);
            } else if (comparator == f131669e) {
                z = true;
            }
            if (z && (map instanceof bnim)) {
                bnim = (bnim) map;
                if (!bnim.mo67651cT()) {
                    return bnim;
                }
            }
            Map.Entry[] entryArr = (Map.Entry[]) bnjd.m109585a((Iterable) map.entrySet(), (Object[]) f131618a);
            length = entryArr.length;
            if (length != 0) {
                return m109533a(comparator);
            }
            if (length == 1) {
                return m109534a(comparator, entryArr[0].getKey(), entryArr[0].getValue());
            }
            Object[] objArr = new Object[length];
            Object[] objArr2 = new Object[length];
            if (!z) {
                Arrays.sort(entryArr, 0, length, new bnih(comparator));
                Object key = entryArr[0].getKey();
                objArr[0] = key;
                Object value = entryArr[0].getValue();
                objArr2[0] = value;
                bndz.m109114a(objArr[0], value);
                while (i < length) {
                    Object key2 = entryArr[i].getKey();
                    Object value2 = entryArr[i].getValue();
                    bndz.m109114a(key2, value2);
                    objArr[i] = key2;
                    objArr2[i] = value2;
                    int compare = comparator.compare(key, key2);
                    Map.Entry entry = entryArr[i - 1];
                    Map.Entry entry2 = entryArr[i];
                    if (compare != 0) {
                        i++;
                        key = key2;
                    } else {
                        String valueOf = String.valueOf(entry);
                        String valueOf2 = String.valueOf(entry2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length());
                        sb.append("Multiple entries with same key: ");
                        sb.append(valueOf);
                        sb.append(" and ");
                        sb.append(valueOf2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else {
                for (int i2 = 0; i2 < length; i2++) {
                    Object key3 = entryArr[i2].getKey();
                    Object value3 = entryArr[i2].getValue();
                    bndz.m109114a(key3, value3);
                    objArr[i2] = key3;
                    objArr2[i2] = value3;
                }
            }
            return new bnim(new bnoo(bngx.m109373b(objArr), comparator), bngx.m109373b(objArr2));
        }
        z = false;
        bnim = (bnim) map;
        if (!bnim.mo67651cT()) {
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) bnjd.m109585a((Iterable) map.entrySet(), (Object[]) f131618a);
        length = entryArr2.length;
        if (length != 0) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnim.a(java.lang.Object, boolean):bnim
     arg types: [java.lang.Object, int]
     candidates:
      bnim.a(int, int):bnim
      bnhe.a(java.lang.Object, java.lang.Object):bnhe
      bnim.a(java.lang.Object, boolean):bnim */
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnim.a(java.lang.Object, boolean, java.lang.Object, boolean):bnim
     arg types: [java.lang.Object, int, java.lang.Object, int]
     candidates:
      bnhe.a(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):bnhe
      bnim.a(java.lang.Object, boolean, java.lang.Object, boolean):bnim */
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    /* renamed from: a */
    static bnim m109533a(Comparator comparator) {
        return !bnnt.f131877a.equals(comparator) ? new bnim(bniq.m109554a(comparator), bngx.m109376e()) : f131668b;
    }

    /* renamed from: a */
    public static bnim m109534a(Comparator comparator, Object obj, Object obj2) {
        bngx a = bngx.m109356a(obj);
        bmxy.m108581a(comparator);
        return new bnim(new bnoo(a, comparator), bngx.m109356a(obj2));
    }

    /* renamed from: a */
    public final bnim headMap(Object obj, boolean z) {
        bnoo bnoo = this.f131670c;
        bmxy.m108581a(obj);
        return m109532a(0, bnoo.mo68199e(obj, z));
    }

    /* renamed from: a */
    public final bnim subMap(Object obj, boolean z, Object obj2, boolean z2) {
        boolean z3;
        bmxy.m108581a(obj);
        bmxy.m108581a(obj2);
        if (comparator().compare(obj, obj2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        bmxy.m108597a(z3, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    /* renamed from: b */
    public final bnim tailMap(Object obj, boolean z) {
        bnoo bnoo = this.f131670c;
        bmxy.m108581a(obj);
        return m109532a(bnoo.mo68200f(obj, z), size());
    }
}
