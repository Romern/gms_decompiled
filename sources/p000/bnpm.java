package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpm extends bnmm {

    /* renamed from: a */
    final Object f131964a;

    /* renamed from: b */
    Map f131965b;

    /* renamed from: c */
    final /* synthetic */ bnpr f131966c;

    public bnpm(bnpr bnpr, Object obj) {
        this.f131966c = bnpr;
        bmxy.m108581a(obj);
        this.f131964a = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map mo68248a() {
        Map map = this.f131965b;
        if (map != null && (!map.isEmpty() || !this.f131966c.f131971a.containsKey(this.f131964a))) {
            return this.f131965b;
        }
        Map map2 = (Map) this.f131966c.f131971a.get(this.f131964a);
        this.f131965b = map2;
        return map2;
    }

    /* renamed from: b */
    public final Iterator mo68058b() {
        Map a = mo68248a();
        if (a != null) {
            return new bnpk(this, a.entrySet().iterator());
        }
        return bnjn.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo68249c() {
        if (mo68248a() != null && this.f131965b.isEmpty()) {
            this.f131966c.f131971a.remove(this.f131964a);
            this.f131965b = null;
        }
    }

    public final void clear() {
        Map a = mo68248a();
        if (a != null) {
            a.clear();
        }
        mo68249c();
    }

    public final boolean containsKey(Object obj) {
        Map a = mo68248a();
        return (obj == null || a == null || !bnmt.m109805b(a, obj)) ? false : true;
    }

    public final Object get(Object obj) {
        Map a = mo68248a();
        if (obj == null || a == null) {
            return null;
        }
        return bnmt.m109793a(a, obj);
    }

    public final Object put(Object obj, Object obj2) {
        bmxy.m108581a(obj);
        bmxy.m108581a(obj2);
        Map map = this.f131965b;
        if (map == null || map.isEmpty()) {
            return this.f131966c.mo67370a(this.f131964a, obj, obj2);
        }
        return this.f131965b.put(obj, obj2);
    }

    public final Object remove(Object obj) {
        Map a = mo68248a();
        if (a == null) {
            return null;
        }
        Object c = bnmt.m109806c(a, obj);
        mo68249c();
        return c;
    }

    public final int size() {
        Map a = mo68248a();
        if (a != null) {
            return a.size();
        }
        return 0;
    }
}
