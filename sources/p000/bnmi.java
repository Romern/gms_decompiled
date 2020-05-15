package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: bnmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnmi extends bnfm implements NavigableMap {

    /* renamed from: a */
    final /* synthetic */ bndn f131843a;

    /* renamed from: b */
    private transient Comparator f131844b;

    /* renamed from: c */
    private transient Set f131845c;

    /* renamed from: d */
    private transient NavigableSet f131846d;

    bnmi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map mo67520b() {
        return this.f131843a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo9244c() {
        return this.f131843a;
    }

    public final Map.Entry ceilingEntry(Object obj) {
        return this.f131843a.floorEntry(obj);
    }

    public final Object ceilingKey(Object obj) {
        return this.f131843a.floorKey(obj);
    }

    public final Comparator comparator() {
        Comparator comparator = this.f131844b;
        if (comparator != null) {
            return comparator;
        }
        Comparator comparator2 = this.f131843a.comparator();
        if (comparator2 == null) {
            comparator2 = bnnt.f131877a;
        }
        bnny a = bnny.m109908a(comparator2).mo67377a();
        this.f131844b = a;
        return a;
    }

    public final NavigableSet descendingKeySet() {
        return this.f131843a.navigableKeySet();
    }

    public final NavigableMap descendingMap() {
        return this.f131843a;
    }

    public final Set entrySet() {
        Set set = this.f131845c;
        if (set != null) {
            return set;
        }
        bnmh bnmh = new bnmh(this);
        this.f131845c = bnmh;
        return bnmh;
    }

    public final Map.Entry firstEntry() {
        return this.f131843a.lastEntry();
    }

    public final Object firstKey() {
        return this.f131843a.lastKey();
    }

    public final Map.Entry floorEntry(Object obj) {
        return this.f131843a.ceilingEntry(obj);
    }

    public final Object floorKey(Object obj) {
        return this.f131843a.ceilingKey(obj);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return this.f131843a.tailMap(obj, z).descendingMap();
    }

    public final Map.Entry higherEntry(Object obj) {
        return this.f131843a.lowerEntry(obj);
    }

    public final Object higherKey(Object obj) {
        return this.f131843a.lowerKey(obj);
    }

    public final Set keySet() {
        return navigableKeySet();
    }

    public final Map.Entry lastEntry() {
        return this.f131843a.firstEntry();
    }

    public final Object lastKey() {
        return this.f131843a.firstKey();
    }

    public final Map.Entry lowerEntry(Object obj) {
        return this.f131843a.higherEntry(obj);
    }

    public final Object lowerKey(Object obj) {
        return this.f131843a.higherKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        NavigableSet navigableSet = this.f131846d;
        if (navigableSet != null) {
            return navigableSet;
        }
        bnmo bnmo = new bnmo(this);
        this.f131846d = bnmo;
        return bnmo;
    }

    public final Map.Entry pollFirstEntry() {
        return this.f131843a.pollLastEntry();
    }

    public final Map.Entry pollLastEntry() {
        return this.f131843a.pollFirstEntry();
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return this.f131843a.subMap(obj2, z2, obj, z).descendingMap();
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return this.f131843a.headMap(obj, z).descendingMap();
    }

    public final Collection values() {
        return new bnmr(this);
    }

    public bnmi(bndn bndn) {
        this.f131843a = bndn;
    }

    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final String toString() {
        return bnmt.m109807c(this);
    }
}
