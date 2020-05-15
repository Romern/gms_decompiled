package p000;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: bnmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnmp extends bnmn implements SortedSet {
    public bnmp(SortedMap sortedMap) {
        super(sortedMap);
    }

    /* renamed from: b */
    public SortedMap mo68061c() {
        return (SortedMap) this.f131848d;
    }

    public final Comparator comparator() {
        return mo68061c().comparator();
    }

    public final Object first() {
        return mo68061c().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new bnmp(mo68061c().headMap(obj));
    }

    public final Object last() {
        return mo68061c().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new bnmp(mo68061c().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new bnmp(mo68061c().tailMap(obj));
    }
}
