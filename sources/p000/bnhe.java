package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: bnhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnhe implements Map, Serializable {

    /* renamed from: a */
    static final Map.Entry[] f131618a = new Map.Entry[0];

    /* renamed from: b */
    private transient bnic f131619b;

    /* renamed from: c */
    private transient bnic f131620c;

    /* renamed from: d */
    private transient bngm f131621d;

    /* renamed from: a */
    public static bnha m109406a(int i) {
        bndz.m109113a(i, "expectedSize");
        return new bnha(i);
    }

    /* renamed from: h */
    public static bnha m109414h() {
        return new bnha();
    }

    /* renamed from: cR */
    public abstract bnic mo67697cR();

    /* renamed from: cS */
    public bnrd mo67650cS() {
        throw null;
    }

    /* renamed from: cT */
    public abstract boolean mo67651cT();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: e */
    public abstract bngm mo67622e();

    public boolean equals(Object obj) {
        return bnmt.m109811d(this, obj);
    }

    /* renamed from: f */
    public bngm values() {
        bngm bngm = this.f131621d;
        if (bngm != null) {
            return bngm;
        }
        bngm e = mo67622e();
        this.f131621d = e;
        return e;
    }

    /* renamed from: g */
    public abstract bnic mo67698g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return bnpf.m110044a((Set) entrySet());
    }

    /* renamed from: i */
    public final bnic entrySet() {
        bnic bnic = this.f131619b;
        if (bnic != null) {
            return bnic;
        }
        bnic g = mo67698g();
        this.f131619b = g;
        return g;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public bnic keySet() {
        bnic bnic = this.f131620c;
        if (bnic != null) {
            return bnic;
        }
        bnic cR = mo67697cR();
        this.f131620c = cR;
        return cR;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return bnmt.m109807c(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnhd(this);
    }

    /* renamed from: a */
    public static bnhe m109407a(Iterable iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        bnha bnha = new bnha(i);
        bnha.mo67693a(iterable);
        return bnha.mo67618b();
    }

    /* renamed from: a */
    public static bnhe m109408a(Object obj, Object obj2) {
        bndz.m109114a(obj, obj2);
        return bnoj.m109969a(1, new Object[]{obj, obj2});
    }

    /* renamed from: a */
    public static bnhe m109409a(Object obj, Object obj2, Object obj3, Object obj4) {
        bndz.m109114a(obj, obj2);
        bndz.m109114a(obj3, obj4);
        return bnoj.m109969a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    /* renamed from: a */
    public static bnhe m109410a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        bndz.m109114a(obj, obj2);
        bndz.m109114a(obj3, obj4);
        bndz.m109114a(obj5, obj6);
        return bnoj.m109969a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    /* renamed from: a */
    public static bnhe m109411a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        bndz.m109114a(obj, obj2);
        bndz.m109114a(obj3, obj4);
        bndz.m109114a(obj5, obj6);
        bndz.m109114a(obj7, obj8);
        return bnoj.m109969a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    /* renamed from: a */
    public static bnhe m109412a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        bndz.m109114a(obj, obj2);
        bndz.m109114a(obj3, obj4);
        bndz.m109114a(obj5, obj6);
        bndz.m109114a(obj7, obj8);
        bndz.m109114a(obj9, obj10);
        return bnoj.m109969a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    /* renamed from: a */
    public static bnhe m109413a(Map map) {
        if ((map instanceof bnhe) && !(map instanceof SortedMap)) {
            bnhe bnhe = (bnhe) map;
            if (!bnhe.mo67651cT()) {
                return bnhe;
            }
        }
        return m109407a(map.entrySet());
    }
}
