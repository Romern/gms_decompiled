package p000;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: bncs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bncs extends bncv implements NavigableSet {

    /* renamed from: b */
    final /* synthetic */ bndd f131460b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bncs(bndd bndd, NavigableMap navigableMap) {
        super(bndd, navigableMap);
        this.f131460b = bndd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final NavigableMap mo67189b() {
        return (NavigableMap) super.mo67189b();
    }

    public final Object ceiling(Object obj) {
        return mo67189b().ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new bncs(this.f131460b, mo67189b().descendingMap());
    }

    public final Object floor(Object obj) {
        return mo67189b().floorKey(obj);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new bncs(this.f131460b, mo67189b().headMap(obj, z));
    }

    public final Object higher(Object obj) {
        return mo67189b().higherKey(obj);
    }

    public final Object lower(Object obj) {
        return mo67189b().lowerKey(obj);
    }

    public final Object pollFirst() {
        return bnjr.m109624f(iterator());
    }

    public final Object pollLast() {
        return bnjr.m109624f(descendingIterator());
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new bncs(this.f131460b, mo67189b().subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new bncs(this.f131460b, mo67189b().tailMap(obj, z));
    }

    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
