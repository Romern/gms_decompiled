package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpo extends bnpq {

    /* renamed from: a */
    final /* synthetic */ bnpp f131968a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnpo(bnpp bnpp) {
        super(bnpp.f131969a);
        this.f131968a = bnpp;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return entry.getKey() != null && (entry.getValue() instanceof Map) && bnec.m109118a(this.f131968a.f131969a.f131971a.entrySet(), entry);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnmt.a(java.util.Set, bmxj):java.util.Iterator
     arg types: [java.util.Set, bnpn]
     candidates:
      bnmt.a(bnmk, java.lang.Object):bmxj
      bnmt.a(java.lang.Iterable, bmxj):bnhe
      bnmt.a(java.util.Map, java.lang.Object):java.lang.Object
      bnmt.a(java.lang.Object, java.lang.Object):java.util.Map$Entry
      bnmt.a(java.util.Map, bmxj):java.util.Map
      bnmt.a(java.util.Map, bnmk):java.util.Map
      bnmt.a(java.util.Set, bmxj):java.util.Iterator */
    public final Iterator iterator() {
        return bnmt.m109796a(this.f131968a.f131969a.f131971a.keySet(), (bmxj) new bnpn(this));
    }

    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return entry.getKey() != null && (entry.getValue() instanceof Map) && this.f131968a.f131969a.f131971a.entrySet().remove(entry);
        }
    }

    public final int size() {
        return this.f131968a.f131969a.f131971a.size();
    }
}
