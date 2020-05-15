package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnne extends bnmj {

    /* renamed from: a */
    final /* synthetic */ bnnf f131858a;

    public bnne(bnnf bnnf) {
        this.f131858a = bnnf;
    }

    /* renamed from: a */
    public final Map mo67129a() {
        return this.f131858a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnmt.a(java.util.Set, bmxj):java.util.Iterator
     arg types: [java.util.Set, bnnd]
     candidates:
      bnmt.a(bnmk, java.lang.Object):bmxj
      bnmt.a(java.lang.Iterable, bmxj):bnhe
      bnmt.a(java.util.Map, java.lang.Object):java.lang.Object
      bnmt.a(java.lang.Object, java.lang.Object):java.util.Map$Entry
      bnmt.a(java.util.Map, bmxj):java.util.Map
      bnmt.a(java.util.Map, bnmk):java.util.Map
      bnmt.a(java.util.Set, bmxj):java.util.Iterator */
    public final Iterator iterator() {
        return bnmt.m109796a(this.f131858a.f131859a.mo67316o(), (bmxj) new bnnd(this));
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        bnnf bnnf = this.f131858a;
        bnnf.f131859a.mo67316o().remove(((Map.Entry) obj).getKey());
        return true;
    }
}
