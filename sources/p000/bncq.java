package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bncq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bncq extends bnmn {

    /* renamed from: a */
    final /* synthetic */ bndd f131458a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bncq(bndd bndd, Map map) {
        super(map);
        this.f131458a = bndd;
    }

    public final void clear() {
        bnjr.m109625g(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return mo68061c().keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || mo68061c().keySet().equals(obj);
    }

    public final int hashCode() {
        return mo68061c().keySet().hashCode();
    }

    public final Iterator iterator() {
        return new bncp(this, mo68061c().entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) mo68061c().remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        bndd.m109029b(this.f131458a, size);
        return size > 0;
    }
}
