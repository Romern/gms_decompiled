package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bxyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxyc extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ bxyd f165080a;

    public bxyc(bxyd bxyd) {
        this.f165080a = bxyd;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f165080a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f165080a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f165080a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator iterator() {
        return new bxyb(this.f165080a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f165080a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f165080a.size();
    }
}
