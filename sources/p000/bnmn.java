package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnmn extends bnpc {

    /* renamed from: d */
    final Map f131848d;

    public bnmn(Map map) {
        bmxy.m108581a(map);
        this.f131848d = map;
    }

    /* renamed from: c */
    public Map mo68061c() {
        return this.f131848d;
    }

    public void clear() {
        mo68061c().clear();
    }

    public final boolean contains(Object obj) {
        return mo68061c().containsKey(obj);
    }

    public final boolean isEmpty() {
        return mo68061c().isEmpty();
    }

    public Iterator iterator() {
        return new bnmb(mo68061c().entrySet().iterator());
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        mo68061c().remove(obj);
        return true;
    }

    public final int size() {
        return mo68061c().size();
    }
}
