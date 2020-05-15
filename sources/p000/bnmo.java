package p000;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: bnmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnmo extends bnmp implements NavigableSet {
    public bnmo(NavigableMap navigableMap) {
        super(navigableMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final NavigableMap mo68061c() {
        return (NavigableMap) this.f131848d;
    }

    public final Object ceiling(Object obj) {
        return mo68061c().ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return mo68061c().descendingKeySet();
    }

    public final Object floor(Object obj) {
        return mo68061c().floorKey(obj);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return mo68061c().headMap(obj, z).navigableKeySet();
    }

    public final Object higher(Object obj) {
        return mo68061c().higherKey(obj);
    }

    public final Object lower(Object obj) {
        return mo68061c().lowerKey(obj);
    }

    public final Object pollFirst() {
        return bnmt.m109802b(mo68061c().pollFirstEntry());
    }

    public final Object pollLast() {
        return bnmt.m109802b(mo68061c().pollLastEntry());
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return mo68061c().subMap(obj, z, obj2, z2).navigableKeySet();
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return mo68061c().tailMap(obj, z).navigableKeySet();
    }

    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
