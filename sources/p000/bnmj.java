package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bnmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnmj extends bnpc {
    /* renamed from: a */
    public abstract Map mo67129a();

    public final void clear() {
        mo67129a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object a = bnmt.m109793a(mo67129a(), key);
        if (bmxi.m108538a(a, entry.getValue())) {
            return a != null || mo67129a().containsKey(key);
        }
        return false;
    }

    public final boolean isEmpty() {
        return mo67129a().isEmpty();
    }

    public boolean remove(Object obj) {
        if (contains(obj)) {
            return mo67129a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnpf.a(java.util.Set, java.util.Collection):boolean
     arg types: [bnmj, java.util.Collection]
     candidates:
      bnpf.a(java.lang.Enum, java.lang.Enum[]):bnic
      bnpf.a(java.util.Set, java.util.Set):bnpd
      bnpf.a(java.util.Set, java.lang.Object):boolean
      bnpf.a(java.util.Set, java.util.Iterator):boolean
      bnpf.a(java.util.Set, java.util.Collection):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnpf.a(java.util.Set, java.util.Iterator):boolean
     arg types: [bnmj, java.util.Iterator]
     candidates:
      bnpf.a(java.lang.Enum, java.lang.Enum[]):bnic
      bnpf.a(java.util.Set, java.util.Set):bnpd
      bnpf.a(java.util.Set, java.lang.Object):boolean
      bnpf.a(java.util.Set, java.util.Collection):boolean
      bnpf.a(java.util.Set, java.util.Iterator):boolean */
    public final boolean removeAll(Collection collection) {
        try {
            bmxy.m108581a(collection);
            return bnpf.m110053a((Set) this, collection);
        } catch (UnsupportedOperationException e) {
            return bnpf.m110054a((Set) this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            bmxy.m108581a(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException e) {
            HashSet a = bnpf.m110048a(collection.size());
            for (Object obj : collection) {
                if (contains(obj)) {
                    a.add(((Map.Entry) obj).getKey());
                }
            }
            return mo67129a().keySet().retainAll(a);
        }
    }

    public final int size() {
        return mo67129a().size();
    }
}
