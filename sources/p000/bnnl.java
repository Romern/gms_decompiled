package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bnnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnnl extends bndl {

    /* renamed from: a */
    final bnmu f131864a;

    /* renamed from: b */
    final bnmk f131865b;

    public bnnl(bnmu bnmu, bnmk bnmk) {
        bmxy.m108581a(bnmu);
        this.f131864a = bnmu;
        bmxy.m108581a(bnmk);
        this.f131865b = bnmk;
    }

    /* renamed from: a */
    public final void mo67308a(Object obj, Iterable iterable) {
        throw null;
    }

    /* renamed from: b */
    public Collection mo68116b(Object obj, Collection collection) {
        bmxj a = bnmt.m109789a(this.f131865b, obj);
        if (collection instanceof List) {
            return bnkn.m109668a((List) collection, a);
        }
        return bnec.m109116a(collection, a);
    }

    /* renamed from: c */
    public final int mo67269c() {
        return this.f131864a.mo67269c();
    }

    /* renamed from: d */
    public final void mo67270d() {
        this.f131864a.mo67270d();
    }

    /* renamed from: d */
    public final boolean mo67271d(Object obj) {
        throw null;
    }

    /* renamed from: e */
    public final Set mo67273e() {
        return this.f131864a.mo67316o();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnec.a(java.util.Collection, bmxj):java.util.Collection
     arg types: [java.util.Collection, bnly]
     candidates:
      bnec.a(java.util.Collection, bmxz):java.util.Collection
      bnec.a(java.util.Collection, java.lang.Object):boolean
      bnec.a(java.util.Collection, java.util.Collection):boolean
      bnec.a(java.util.Collection, bmxj):java.util.Collection */
    /* renamed from: g */
    public final Collection mo67275g() {
        Collection n = this.f131864a.mo67315n();
        bnmk bnmk = this.f131865b;
        bmxy.m108581a(bnmk);
        return bnec.m109116a(n, (bmxj) new bnly(bnmk));
    }

    /* renamed from: i */
    public final Collection mo67277i() {
        return new bnni(this);
    }

    /* renamed from: j */
    public final Iterator mo67278j() {
        return bnjr.m109609a(this.f131864a.mo67315n().iterator(), bnmt.m109788a(this.f131865b));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnmt.a(java.util.Map, bnmk):java.util.Map
     arg types: [java.util.Map, bnnk]
     candidates:
      bnmt.a(bnmk, java.lang.Object):bmxj
      bnmt.a(java.lang.Iterable, bmxj):bnhe
      bnmt.a(java.util.Map, java.lang.Object):java.lang.Object
      bnmt.a(java.util.Set, bmxj):java.util.Iterator
      bnmt.a(java.lang.Object, java.lang.Object):java.util.Map$Entry
      bnmt.a(java.util.Map, bmxj):java.util.Map
      bnmt.a(java.util.Map, bnmk):java.util.Map */
    /* renamed from: k */
    public final Map mo67279k() {
        return bnmt.m109800a(this.f131864a.mo67318q(), (bnmk) new bnnk(this));
    }

    /* renamed from: m */
    public final boolean mo67314m() {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo67268a(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public Collection mo67127c(Object obj) {
        return mo68116b(obj, this.f131864a.mo67127c(obj));
    }

    /* renamed from: c */
    public final boolean mo67310c(Object obj, Object obj2) {
        return mo67127c(obj).remove(obj2);
    }
}
