package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: bndd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bndd extends bndl implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: a */
    public transient Map f131477a;

    /* renamed from: b */
    public transient int f131478b;

    protected bndd(Map map) {
        bmxy.m108588a(map.isEmpty());
        this.f131477a = map;
    }

    /* renamed from: a */
    static /* synthetic */ void m109026a(bndd bndd) {
        bndd.f131478b++;
    }

    /* renamed from: b */
    static /* synthetic */ void m109028b(bndd bndd) {
        bndd.f131478b--;
    }

    /* renamed from: a */
    public abstract Collection mo67121a();

    /* renamed from: a */
    public Collection mo67122a(Object obj, Collection collection) {
        throw null;
    }

    /* renamed from: a */
    public Collection mo67123a(Collection collection) {
        throw null;
    }

    /* renamed from: b */
    public Collection mo67125b() {
        throw null;
    }

    /* renamed from: c */
    public final int mo67269c() {
        return this.f131478b;
    }

    /* renamed from: d */
    public final void mo67270d() {
        for (Collection collection : this.f131477a.values()) {
            collection.clear();
        }
        this.f131477a.clear();
        this.f131478b = 0;
    }

    /* renamed from: e */
    public Collection mo67272e(Object obj) {
        Collection collection = (Collection) this.f131477a.remove(obj);
        if (collection == null) {
            return mo67125b();
        }
        Collection a = mo67121a();
        a.addAll(collection);
        this.f131478b -= collection.size();
        collection.clear();
        return mo67123a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Set mo67274f() {
        Map map = this.f131477a;
        if (map instanceof NavigableMap) {
            return new bncs(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new bncv(this, (SortedMap) map);
        }
        return new bncq(this, map);
    }

    /* renamed from: g */
    public final Collection mo67275g() {
        return new bndk(this);
    }

    /* renamed from: h */
    public final Iterator mo67276h() {
        return new bncj(this);
    }

    /* renamed from: i */
    public final Collection mo67277i() {
        if (this instanceof bnot) {
            return new bndj(this);
        }
        return new bnni(this);
    }

    /* renamed from: j */
    public final Iterator mo67278j() {
        return new bnck(this);
    }

    /* renamed from: k */
    public Map mo67279k() {
        return new bncn(this, this.f131477a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Map mo67280l() {
        Map map = this.f131477a;
        if (map instanceof NavigableMap) {
            return new bncr(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new bncu(this, (SortedMap) map);
        }
        return new bncn(this, map);
    }

    /* renamed from: a */
    static /* synthetic */ void m109027a(bndd bndd, int i) {
        bndd.f131478b += i;
    }

    /* renamed from: b */
    static /* synthetic */ void m109029b(bndd bndd, int i) {
        bndd.f131478b -= i;
    }

    /* renamed from: c */
    public Collection mo67127c(Object obj) {
        Collection collection = (Collection) this.f131477a.get(obj);
        if (collection == null) {
            collection = mo67121a();
        }
        return mo67122a(obj, collection);
    }

    /* renamed from: d */
    public final boolean mo67271d(Object obj) {
        return this.f131477a.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo67266a(Object obj, List list, bncx bncx) {
        return list instanceof RandomAccess ? new bnct(this, obj, list, bncx) : new bncz(this, obj, list, bncx);
    }

    /* renamed from: e */
    public Set mo67273e() {
        return new bncq(this, this.f131477a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67267a(Map map) {
        this.f131477a = map;
        this.f131478b = 0;
        for (Collection collection : map.values()) {
            bmxy.m108588a(!collection.isEmpty());
            this.f131478b += collection.size();
        }
    }

    /* renamed from: a */
    public final boolean mo67268a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f131477a.get(obj);
        if (collection == null) {
            Collection a = mo67121a();
            if (a.add(obj2)) {
                this.f131478b++;
                this.f131477a.put(obj, a);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f131478b++;
            return true;
        }
    }
}
