package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: bncn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bncn extends bnms {

    /* renamed from: a */
    final transient Map f131448a;

    /* renamed from: b */
    final /* synthetic */ bndd f131449b;

    public bncn(bndd bndd, Map map) {
        this.f131449b = bndd;
        this.f131448a = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map.Entry mo67136a(Map.Entry entry) {
        Object key = entry.getKey();
        return bnmt.m109797a(key, this.f131449b.mo67122a(key, (Collection) entry.getValue()));
    }

    public final void clear() {
        Map map = this.f131448a;
        bndd bndd = this.f131449b;
        if (map == bndd.f131477a) {
            bndd.mo67270d();
        } else {
            bnjr.m109625g(new bncm(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return bnmt.m109805b(this.f131448a, obj);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f131448a.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) bnmt.m109793a(this.f131448a, obj);
        if (collection != null) {
            return this.f131449b.mo67122a(obj, collection);
        }
        return null;
    }

    public final int hashCode() {
        return this.f131448a.hashCode();
    }

    public Set keySet() {
        return this.f131449b.mo67316o();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f131448a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a = this.f131449b.mo67121a();
        a.addAll(collection);
        bndd.m109029b(this.f131449b, collection.size());
        collection.clear();
        return a;
    }

    public final int size() {
        return this.f131448a.size();
    }

    public final String toString() {
        return this.f131448a.toString();
    }

    /* renamed from: a */
    public final Set mo67137a() {
        return new bncl(this);
    }
}
