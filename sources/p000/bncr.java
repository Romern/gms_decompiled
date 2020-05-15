package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* renamed from: bncr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bncr extends bncu implements NavigableMap {

    /* renamed from: c */
    final /* synthetic */ bndd f131459c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bncr(bndd bndd, NavigableMap navigableMap) {
        super(bndd, navigableMap);
        this.f131459c = bndd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map.Entry mo67159a(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection a = this.f131459c.mo67121a();
        a.addAll((Collection) entry.getValue());
        it.remove();
        return bnmt.m109797a(entry.getKey(), this.f131459c.mo67123a(a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final NavigableMap mo67172g() {
        return (NavigableMap) super.mo67172g();
    }

    /* renamed from: c */
    public final NavigableSet keySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = mo67172g().ceilingEntry(obj);
        if (ceilingEntry != null) {
            return mo67136a(ceilingEntry);
        }
        return null;
    }

    public final Object ceilingKey(Object obj) {
        return mo67172g().ceilingKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final NavigableSet mo67173h() {
        return new bncs(this.f131459c, mo67172g());
    }

    public final NavigableSet descendingKeySet() {
        return ((bncr) descendingMap()).keySet();
    }

    public final NavigableMap descendingMap() {
        return new bncr(this.f131459c, mo67172g().descendingMap());
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = mo67172g().firstEntry();
        if (firstEntry != null) {
            return mo67136a(firstEntry);
        }
        return null;
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = mo67172g().floorEntry(obj);
        if (floorEntry != null) {
            return mo67136a(floorEntry);
        }
        return null;
    }

    public final Object floorKey(Object obj) {
        return mo67172g().floorKey(obj);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new bncr(this.f131459c, mo67172g().headMap(obj, z));
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = mo67172g().higherEntry(obj);
        if (higherEntry != null) {
            return mo67136a(higherEntry);
        }
        return null;
    }

    public final Object higherKey(Object obj) {
        return mo67172g().higherKey(obj);
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = mo67172g().lastEntry();
        if (lastEntry != null) {
            return mo67136a(lastEntry);
        }
        return null;
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = mo67172g().lowerEntry(obj);
        if (lowerEntry != null) {
            return mo67136a(lowerEntry);
        }
        return null;
    }

    public final Object lowerKey(Object obj) {
        return mo67172g().lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return mo67159a(entrySet().iterator());
    }

    public final Map.Entry pollLastEntry() {
        return mo67159a(descendingMap().entrySet().iterator());
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new bncr(this.f131459c, mo67172g().subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new bncr(this.f131459c, mo67172g().tailMap(obj, z));
    }

    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
