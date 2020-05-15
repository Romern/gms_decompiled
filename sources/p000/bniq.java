package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: bniq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bniq extends bnir implements NavigableSet, bnph {

    /* renamed from: a */
    final transient Comparator f131676a;

    /* renamed from: b */
    transient bniq f131677b;

    public bniq(Comparator comparator) {
        this.f131676a = comparator;
    }

    /* renamed from: a */
    public static bniq m109552a(Comparable comparable, Comparable comparable2) {
        return m109553a(bnnt.f131877a, 2, comparable, comparable2);
    }

    /* renamed from: b */
    public static bnio m109555b(Comparator comparator) {
        return new bnio(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: a */
    public abstract bnrd iterator();

    /* renamed from: b */
    public abstract bniq mo67806b(Object obj, boolean z, Object obj2, boolean z2);

    /* renamed from: c */
    public abstract bniq mo67807c(Object obj, boolean z);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bniq.b(java.lang.Object, boolean):bniq
     arg types: [java.lang.Object, int]
     candidates:
      bniq.b(java.lang.Object, java.lang.Object):int
      bniq.b(java.lang.Object, boolean):bniq */
    public Object ceiling(Object obj) {
        return bnjd.m109589b(tailSet(obj, true), (Object) null);
    }

    public final Comparator comparator() {
        return this.f131676a;
    }

    /* renamed from: d */
    public abstract bniq mo67810d(Object obj, boolean z);

    /* renamed from: e */
    public final bniq descendingSet() {
        bniq bniq = this.f131677b;
        if (bniq != null) {
            return bniq;
        }
        bniq k = mo67819k();
        this.f131677b = k;
        k.f131677b = this;
        return k;
    }

    public Object first() {
        return iterator().next();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bniq.a(java.lang.Object, boolean):bniq
     arg types: [java.lang.Object, int]
     candidates:
      bniq.a(java.lang.Comparable, java.lang.Comparable):bniq
      bnic.a(int, java.lang.Object[]):bnic
      bnic.a(java.lang.Object, java.lang.Object):bnic
      bnic.a(int, int):boolean
      bngm.a(java.lang.Object[], int):int
      bniq.a(java.lang.Object, boolean):bniq */
    public Object floor(Object obj) {
        return bnjr.m109618b(headSet(obj, true).descendingIterator(), (Object) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bniq.b(java.lang.Object, boolean):bniq
     arg types: [java.lang.Object, int]
     candidates:
      bniq.b(java.lang.Object, java.lang.Object):int
      bniq.b(java.lang.Object, boolean):bniq */
    public Object higher(Object obj) {
        return bnjd.m109589b(tailSet(obj, false), (Object) null);
    }

    /* renamed from: k */
    public abstract bniq mo67819k();

    /* renamed from: l */
    public abstract bnrd descendingIterator();

    public Object last() {
        return descendingIterator().next();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bniq.a(java.lang.Object, boolean):bniq
     arg types: [java.lang.Object, int]
     candidates:
      bniq.a(java.lang.Comparable, java.lang.Comparable):bniq
      bnic.a(int, java.lang.Object[]):bnic
      bnic.a(java.lang.Object, java.lang.Object):bnic
      bnic.a(int, int):boolean
      bngm.a(java.lang.Object[], int):int
      bniq.a(java.lang.Object, boolean):bniq */
    public Object lower(Object obj) {
        return bnjr.m109618b(headSet(obj, false).descendingIterator(), (Object) null);
    }

    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnip(this.f131676a, toArray());
    }

    /* renamed from: a */
    public static bniq m109553a(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return m109554a(comparator);
        }
        bnnw.m109886a(objArr, i);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < (objArr.length >> 1)) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new bnoo(bngx.m109374b(objArr, i2), comparator);
    }

    /* renamed from: b */
    public static bniq m109556b(Collection collection) {
        bnnt bnnt = bnnt.f131877a;
        bmxy.m108581a(bnnt);
        if (bnpi.m110066a(bnnt, collection) && (collection instanceof bniq)) {
            bniq bniq = (bniq) collection;
            if (!bniq.mo67640h()) {
                return bniq;
            }
        }
        Object[] c = bnjd.m109593c(collection);
        return m109553a(bnnt, c.length, c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bniq.a(java.lang.Object, boolean):bniq
     arg types: [java.lang.Object, int]
     candidates:
      bniq.a(java.lang.Comparable, java.lang.Comparable):bniq
      bnic.a(int, java.lang.Object[]):bnic
      bnic.a(java.lang.Object, java.lang.Object):bnic
      bnic.a(int, int):boolean
      bngm.a(java.lang.Object[], int):int
      bniq.a(java.lang.Object, boolean):bniq */
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bniq.a(java.lang.Object, boolean, java.lang.Object, boolean):bniq
     arg types: [java.lang.Object, int, java.lang.Object, int]
     candidates:
      bnic.a(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):bnic
      bniq.a(java.lang.Object, boolean, java.lang.Object, boolean):bniq */
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bniq.b(java.lang.Object, boolean):bniq
     arg types: [java.lang.Object, int]
     candidates:
      bniq.b(java.lang.Object, java.lang.Object):int
      bniq.b(java.lang.Object, boolean):bniq */
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo67804b(Object obj, Object obj2) {
        return this.f131676a.compare(obj, obj2);
    }

    /* renamed from: a */
    static bnoo m109554a(Comparator comparator) {
        if (bnnt.f131877a.equals(comparator)) {
            return bnoo.f131929c;
        }
        return new bnoo(bngx.m109376e(), comparator);
    }

    /* renamed from: b */
    public final bniq tailSet(Object obj, boolean z) {
        bmxy.m108581a(obj);
        return mo67810d(obj, z);
    }

    /* renamed from: a */
    public final bniq headSet(Object obj, boolean z) {
        bmxy.m108581a(obj);
        return mo67807c(obj, z);
    }

    /* renamed from: a */
    public final bniq subSet(Object obj, boolean z, Object obj2, boolean z2) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj2);
        bmxy.m108588a(this.f131676a.compare(obj, obj2) <= 0);
        return mo67806b(obj, z, obj2, z2);
    }
}
