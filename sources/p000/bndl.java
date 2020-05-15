package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: bndl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bndl implements bnmu {

    /* renamed from: a */
    private transient Collection f131488a;

    /* renamed from: b */
    private transient Set f131489b;

    /* renamed from: c */
    private transient Collection f131490c;

    /* renamed from: d */
    private transient Map f131491d;

    /* renamed from: a */
    public void mo67308a(Object obj, Iterable iterable) {
        bmxy.m108581a(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || mo67127c(obj).addAll(collection)) {
            }
            return;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext() || bnjr.m109612a(mo67127c(obj), it)) {
        }
    }

    /* renamed from: a */
    public boolean mo67268a(Object obj, Object obj2) {
        throw null;
    }

    /* renamed from: b */
    public final boolean mo67309b(Object obj, Object obj2) {
        Collection collection = (Collection) mo67318q().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* renamed from: c */
    public boolean mo67310c(Object obj, Object obj2) {
        Collection collection = (Collection) mo67318q().get(obj);
        return collection != null && collection.remove(obj2);
    }

    /* renamed from: e */
    public abstract Set mo67273e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnmu)) {
            return false;
        }
        return mo67318q().equals(((bnmu) obj).mo67318q());
    }

    /* renamed from: f */
    public boolean mo67312f(Object obj) {
        for (Collection collection : mo67318q().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public abstract Collection mo67275g();

    /* renamed from: h */
    public Iterator mo67276h() {
        throw null;
    }

    public final int hashCode() {
        return mo67318q().hashCode();
    }

    /* renamed from: i */
    public abstract Collection mo67277i();

    /* renamed from: j */
    public abstract Iterator mo67278j();

    /* renamed from: k */
    public abstract Map mo67279k();

    /* renamed from: m */
    public boolean mo67314m() {
        return mo67269c() == 0;
    }

    /* renamed from: n */
    public Collection mo67315n() {
        Collection collection = this.f131488a;
        if (collection != null) {
            return collection;
        }
        Collection i = mo67277i();
        this.f131488a = i;
        return i;
    }

    /* renamed from: o */
    public Set mo67316o() {
        Set set = this.f131489b;
        if (set != null) {
            return set;
        }
        Set e = mo67273e();
        this.f131489b = e;
        return e;
    }

    /* renamed from: p */
    public Collection mo67317p() {
        Collection collection = this.f131490c;
        if (collection != null) {
            return collection;
        }
        Collection g = mo67275g();
        this.f131490c = g;
        return g;
    }

    /* renamed from: q */
    public Map mo67318q() {
        Map map = this.f131491d;
        if (map != null) {
            return map;
        }
        Map k = mo67279k();
        this.f131491d = k;
        return k;
    }

    public final String toString() {
        return mo67318q().toString();
    }
}
