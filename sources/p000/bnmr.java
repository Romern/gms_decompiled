package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bnmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnmr extends AbstractCollection {

    /* renamed from: a */
    final Map f131851a;

    public bnmr(Map map) {
        bmxy.m108581a(map);
        this.f131851a = map;
    }

    public final void clear() {
        this.f131851a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f131851a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f131851a.isEmpty();
    }

    public final Iterator iterator() {
        return new bnmc(this.f131851a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException e) {
            for (Map.Entry entry : this.f131851a.entrySet()) {
                if (bmxi.m108538a(obj, entry.getValue())) {
                    this.f131851a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection collection) {
        try {
            bmxy.m108581a(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException e) {
            HashSet a = bnpf.m110047a();
            for (Map.Entry entry : this.f131851a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    a.add(entry.getKey());
                }
            }
            return this.f131851a.keySet().removeAll(a);
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            bmxy.m108581a(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException e) {
            HashSet a = bnpf.m110047a();
            for (Map.Entry entry : this.f131851a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    a.add(entry.getKey());
                }
            }
            return this.f131851a.keySet().retainAll(a);
        }
    }

    public final int size() {
        return this.f131851a.size();
    }
}
