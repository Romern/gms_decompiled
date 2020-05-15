package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: bndn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bndn extends bnmm implements NavigableMap {
    /* renamed from: a */
    public abstract Iterator mo67332a();

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Object ceilingKey(Object obj) {
        return bnmt.m109802b(ceilingEntry(obj));
    }

    public final NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public final NavigableMap descendingMap() {
        return new bnmi(this);
    }

    public final Map.Entry firstEntry() {
        return (Map.Entry) bnjr.m109618b(mo68058b(), (Object) null);
    }

    public final Object firstKey() {
        Map.Entry firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public final Object floorKey(Object obj) {
        return bnmt.m109802b(floorEntry(obj));
    }

    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Object higherKey(Object obj) {
        return bnmt.m109802b(higherEntry(obj));
    }

    public final Set keySet() {
        return navigableKeySet();
    }

    public final Map.Entry lastEntry() {
        return (Map.Entry) bnjr.m109618b(mo67332a(), (Object) null);
    }

    public final Object lastKey() {
        Map.Entry lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public final Object lowerKey(Object obj) {
        return bnmt.m109802b(lowerEntry(obj));
    }

    public final NavigableSet navigableKeySet() {
        return new bnmo(this);
    }

    public final Map.Entry pollFirstEntry() {
        return (Map.Entry) bnjr.m109624f(mo68058b());
    }

    public final Map.Entry pollLastEntry() {
        return (Map.Entry) bnjr.m109624f(mo67332a());
    }

    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
